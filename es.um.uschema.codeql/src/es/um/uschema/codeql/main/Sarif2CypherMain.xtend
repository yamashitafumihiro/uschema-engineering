package es.um.uschema.codeql.main

import es.um.uschema.codeql.utils.config.Sarif2CypherConfig
import com.fasterxml.jackson.databind.ObjectMapper
import es.um.uschema.codeql.sarif.Sarif2Cypher
import com.fasterxml.jackson.databind.node.ObjectNode
import es.um.uschema.utils.EcoreModelIO
import es.um.uschema.USchema.USchema
import es.um.uschema.xtext.athena.utils.io.CodeWriter

class Sarif2CypherMain
{
  def static void main(String[] args) 
  {
    val customArgs = newArrayList("-i", "models/results.sarif", "-m", "models/SoftwareDev.xmi", "-o", "models/")

    val config = new Sarif2CypherConfig(customArgs)

    runSarif2Cypher(config)
  }

  private static def void runSarif2Cypher(Sarif2CypherConfig config)
  {
    val inputFile = config.inputFile
    val inputModel = config.inputModel
    val inputPath = config.inputPath
    val outputPath = config.outputPath

    val transformer = new Sarif2Cypher()
    val modelLoader = new EcoreModelIO()
    val oMapper = new ObjectMapper()
    val writer = new CodeWriter()

    println("SARIF2CYPHER> Generating Cypher code...")

    outputPath.toFile.mkdirs

    val iterateFiles = inputFile === null ? inputPath.toFile.listFiles[f | f.name.endsWith(".sarif")].toSet : #{ inputFile.toFile }
    val schema = modelLoader.load(USchema, inputModel)

    for (file : iterateFiles)
    {
      println("SARIF2CYPHER>> File: " + file.name)
      val sarifContent = oMapper.readValue(file, ObjectNode)

      val result = transformer.m2t(schema, sarifContent)
      writer.write(result, outputPath.resolve(file.name.replace(".sarif", ".cypher")))
      // println(result)
    }

    println("SARIF2CYPHER> Cypher generation finished!")
  }
}
