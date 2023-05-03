package es.um.uschema.codeql.main

import es.um.uschema.codeql.utils.config.USchema2CodeProfileConfig
import es.um.uschema.utils.EcoreModelIO
import es.um.uschema.codeql.m2t.USchema2CodeProfile
import es.um.uschema.xtext.athena.utils.io.CodeWriter
import es.um.uschema.USchema.USchema
import es.um.uschema.codeql.m2t.CodeUtilsGen

class USchema2CodeProfileMain
{
  def static void main(String[] args)
  {
    val customArgs = newArrayList("-i", "models/SoftwareDev.xmi", "-o", "models/gen/")

    val config = new USchema2CodeProfileConfig(customArgs)

    runUSchema2CodeProfile(config)
  }

  private static def void runUSchema2CodeProfile(USchema2CodeProfileConfig config)
  {
    val inputModel = config.inputModel
    val outputPath = config.outputPath

    val modelLoader = new EcoreModelIO()
    val baseGenerator = new CodeUtilsGen()
    val transformer = new USchema2CodeProfile()
    val writer = new CodeWriter()

    println("CODEQL> Generating profiling code...")

    outputPath.toFile.mkdirs

    println("CODEQL>> Model: " + inputModel.toFile.name)

    val schema = modelLoader.load(USchema, inputModel)
    val result = transformer.m2t(schema)

    for (pair : result)
      writer.write(pair.value, outputPath.resolve(pair.key + ".ql"))

    writer.write(baseGenerator.generateQLPack(schema), outputPath.resolve("qlpack.yml"))
    writer.write(baseGenerator.generateQLSuite(schema), outputPath.resolve("suite.qls"))
    writer.write(baseGenerator.generateQLUtils(), outputPath.resolve("utils.qll"))

    println("CODEQL> Profile code generation finished!")
  }
}
