package es.um.uschema.codeql.main

import es.um.uschema.xtext.orion.utils.io.OrionIO
import es.um.uschema.xtext.athena.utils.io.CodeWriter
import es.um.uschema.codeql.m2t.Orion2CodeUpdate
import es.um.uschema.codeql.utils.config.Orion2CodeUpdateConfig
import es.um.uschema.codeql.m2t.CodeUtilsGen

class Orion2CodeUpdateMain
{
  def static void main(String[] args)
  {
    val customArgs = newArrayList("-i", "../../../../code-scan/test/SoftwareDev_ops.orion", "-o", "../../../../code-scan/test/queries/", "-a", "ALL")

    val config = new Orion2CodeUpdateConfig(customArgs)

    runOrion2CodeUpdate(config)
  }

  private static def void runOrion2CodeUpdate(Orion2CodeUpdateConfig config)
  {
    val inputModel = config.inputModel
    val outputPath = config.outputPath
    val alertLevel = config.alertLevel

    val orionIO = new OrionIO()
    val baseGenerator = new CodeUtilsGen()
    val transformer = new Orion2CodeUpdate(alertLevel)
    val writer = new CodeWriter()

    println("CODEQL> Generating update code...")

    outputPath.toFile.mkdirs

    println("CODEQL>> Model: " + inputModel.toFile.name)

    val oModel = orionIO.load(inputModel)

    writer.write(baseGenerator.generateQLPack(oModel), outputPath.resolve("qlpack.yml"))
    // writer.write(baseGenerator.generateQLSuite(oModel), outputPath.resolve("suite.qls"))
    writer.write(baseGenerator.generateQLUtils(), outputPath.resolve("utils.qll"))

    val result = transformer.m2t(oModel)

    for (pair : result)
      writer.write(pair.value, outputPath.resolve(pair.key + ".ql"))

    println("CODEQL> Update code generation finished!")
  }
}
