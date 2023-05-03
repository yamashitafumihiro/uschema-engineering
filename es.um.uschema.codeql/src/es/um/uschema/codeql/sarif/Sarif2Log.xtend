package es.um.uschema.codeql.sarif

import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.JsonNode
import java.util.Map
import java.util.HashMap

class Sarif2Log
{
  val oMapper = new ObjectMapper()

  new() {}

  def Map<String, Integer> getCodeLineMetrics(ObjectNode node)
  {
    val result = new HashMap<String, Integer>()
    val theRun = (node.get("runs") as ArrayNode).head

    if (theRun.get("artifacts") !== null)
      for (file : theRun.get("artifacts"))
        result.put(file.get("location").get("uri").asText, 0)

    if (theRun.get("results") !== null)
      for (item : theRun.get("results"))
      {
        val uri = item.get("locations").head.get("physicalLocation").get("artifactLocation").get("uri").asText
        result.put(uri, result.get(uri) + 1)
      }

    return result
  }

  def ObjectNode transform(ObjectNode node)
  {
    val theRun = (node.get("runs") as ArrayNode).head
    val result = oMapper.createObjectNode

    result.set("queries", getQueries(theRun))
    result.set("files", getFiles(theRun))
    result.set("results", getResults(theRun))

    return result
  }

  private def getQueries(JsonNode node)
  {
    val result = oMapper.createArrayNode

    for (rule : node.get("tool").get("driver").get("rules") as ArrayNode)
      result.add(rule.get("properties"))

    return result
  }

  private def getFiles(JsonNode node)
  {
    val result = oMapper.createArrayNode

    if (node.get("artifacts") !== null)
      for (file : node.get("artifacts"))
        result.add(file.get("location"))

    return result
  }

  private def getResults(JsonNode node)
  {
    val result = oMapper.createArrayNode

    if (node.get("results") !== null)
      for (item : node.get("results"))
      {
        val singleResult = oMapper.createObjectNode
        singleResult.set("ruleId", item.get("ruleId"))
        singleResult.set("message", item.get("message").get("text"))
  
        val locations = oMapper.createArrayNode
        for (loc : item.get("locations"))
        {
          val location = oMapper.createObjectNode
          location.set("file", loc.get("physicalLocation").get("artifactLocation").get("uri"))
          location.set("startLine", loc.get("physicalLocation").get("region").get("startLine"))
          location.set("endColumn", loc.get("physicalLocation").get("region").get("endColumn"))
  
          locations.add(location)
        }

      singleResult.set("locations", locations)

      result.add(singleResult)
    }

    return result
  }

  def serializeLog(JsonNode node)
  '''
    > Queries:
      «FOR query : node.get("queries") SEPARATOR ", "»«query.get("id")»«ENDFOR»
    > Files:
      «FOR file : node.get("files") SEPARATOR ", "»«file.get("uri")»«ENDFOR»
    > Results:
      «FOR result : node.get("results")»
        «result.get("ruleId")» : «result.get("message")» : «FOR location : result.get("locations")»«location.get("file")»(«location.get("startLine")»)«ENDFOR»
      «ENDFOR»
  '''

  def serializeCodeLineMetrics(Map<String, Integer> map)
  '''
    «FOR key: map.keySet»
      «key»«FOR i : 0 .. map.keySet.map[k | k.length].max - key.length» «ENDFOR»: «map.get(key)»
    «ENDFOR»
  '''
}
