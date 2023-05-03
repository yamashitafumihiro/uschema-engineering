package es.um.uschema.codeql.sarif

import com.fasterxml.jackson.databind.node.ObjectNode
import es.um.uschema.USchema.USchema
import es.um.uschema.USchema.EntityType
import java.util.List
import es.um.uschema.utils.USchemaHandler
import es.um.uschema.USchema.PrimitiveType
import es.um.uschema.USchema.PSet
import es.um.uschema.USchema.PList
import es.um.uschema.USchema.PMap
import es.um.uschema.USchema.PTuple
import es.um.uschema.USchema.DataType
import es.um.uschema.USchema.Attribute
import com.fasterxml.jackson.databind.JsonNode

class Sarif2Cypher
{
  USchemaHandler handler

  new()
  {
    handler = new USchemaHandler()
  }

  def m2t(USchema schema, ObjectNode node)
  {
    val result = new StringBuilder()

    result.append(generateEntityNodes(schema.entities))
    result.append(generateCodeProfileNodes(node))

    return result.toString
  }

  private def generateEntityNodes(List<EntityType> entities)
  '''
  CREATE (x: UnrecognizedEntityType);
  «FOR e : entities»
    CREATE (x: «e.name» { «FOR attr: handler.getUnionFeaturesInSchemaType(e).filter[f | f instanceof Attribute].map[f | f as Attribute] SEPARATOR ", "»«attr.name»: «generateType(attr.type)»«ENDFOR»});
  «ENDFOR»

  '''

  private def dispatch CharSequence generateType(PrimitiveType type)
  {
    switch (type.name.toLowerCase)
    {
      case "integer", case "int", case "number": "0"
      case "float", case "double":               "0.0"
      case "bool", case "boolean":               "true"
      default:                                   "\"\""
    }
  }

  private def dispatch CharSequence generateType(PList type)
  '''[]'''

  private def dispatch CharSequence generateType(PSet type)
  '''[]'''

  private def dispatch CharSequence generateType(PMap type)
  '''[]'''

  private def dispatch CharSequence generateType(PTuple type)
  '''[]'''

  private def dispatch CharSequence generateType(DataType type)
  '''null'''

  private def CharSequence generateCodeProfileNodes(ObjectNode node)
  '''
  «FOR run: node.get("runs")»
    «FOR result: run.get("properties").get("metricResults")»
        CREATE (x: «IF isMongooseNode(result)»MongooseSchema«ELSE»Access«ENDIF» { entity: "«getEntityNameFromResult(result).toFirstUpper»", file: "«getResultFile(result)»", line: «getResultLine(result)», message: "«result.get("message").get("text").asText»"});
        MATCH (x: «IF isMongooseNode(result)»MongooseSchema«ELSE»Access«ENDIF»), (y: «getEntityNameFromResult(result).toFirstUpper»)
        WHERE x.entity = "«getEntityNameFromResult(result).toFirstUpper»"
        CREATE (x)-[r:«IF isMongooseNode(result)»MongooseModel«ELSE»«getAccessMethod(result)»«ENDIF»]->(y);

    «ENDFOR»
  «ENDFOR»
  '''

  private def boolean isMongooseNode(JsonNode resultNode)
  {
    return resultNode.get("ruleId").asText.endsWith("-mongoose")
  }

  private def String getResultFile(JsonNode resultNode)
  {
    return resultNode.get("location").get("physicalLocation").get("artifactLocation").get("uri").asText
  }

  private def Integer getResultLine(JsonNode resultNode)
  {
    return resultNode.get("location").get("physicalLocation").get("region").get("startLine").asInt
  }

  private def String getEntityNameFromResult(JsonNode resultNode)
  {
    val ruleId = resultNode.get("ruleId").asText

    return ruleId.substring(ruleId.indexOf("-") + 1, ruleId.lastIndexOf("-"))
  }

  private def String getAccessMethod(JsonNode resultNode)
  {
    val message = resultNode.get("message").get("text").asText

    return message.substring(0, message.indexOf(": "))
  }
}
