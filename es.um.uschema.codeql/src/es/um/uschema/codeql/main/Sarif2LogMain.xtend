package es.um.uschema.codeql.main

import com.fasterxml.jackson.databind.ObjectMapper
import es.um.uschema.codeql.utils.config.Sarif2LogConfig
import com.fasterxml.jackson.databind.node.ObjectNode
import es.um.uschema.codeql.sarif.Sarif2Log

class Sarif2LogMain
{
  def static void main(String[] args) 
  {
    val customArgs = newArrayList("-i", "../../../../code-scan/comonos2023/results.sarif", "-o", "../../../../code-scan/comonos2023/")

    val config = new Sarif2LogConfig(customArgs)

    runSarif2Log(config)
  }

  private static def void runSarif2Log(Sarif2LogConfig config)
  {
    val inputFile = config.inputFile
    val inputPath = config.inputPath
    val outputPath = config.outputPath

    val transformer = new Sarif2Log()
    val oMapper = new ObjectMapper()

    println("SARIF2LOG> Generating Log code...")

    outputPath.toFile.mkdirs

    val iterateFiles = inputFile === null ? inputPath.toFile.listFiles[f | f.name.endsWith(".sarif")].toSet : #{ inputFile.toFile }

    for (file : iterateFiles)
    {
      println("SARIF2LOG>> File: " + file.name)
      val sarifContent = oMapper.readValue(file, ObjectNode)

      val metrics = transformer.getCodeLineMetrics(sarifContent)
      println(transformer.serializeCodeLineMetrics(metrics))

      val result = transformer.transform(sarifContent)
      println(transformer.serializeLog(result))
    }

    println("SARIF2LOG> Log generation finished!")
  }
}
