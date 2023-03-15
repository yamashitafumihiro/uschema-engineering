package es.um.uschema.xtext.athena.main

import es.um.uschema.xtext.athena.m2m.Athena2USchema
import es.um.uschema.xtext.athena.utils.config.Athena2USchemaConfig
import es.um.uschema.xtext.athena.utils.io.AthenaIO
import es.um.uschema.utils.EcoreModelIO

class Athena2USchemaMain
{
  def static void main(String[] args)
  {
    // val customArgs = newArrayList("-i", "../../es.um.uschema.xtext.models/thesis/athena/SoftwareDev.athena", "-o", "../../es.um.uschema.xtext.models/thesis/athena/")

    val config = new Athena2USchemaConfig(args)

    runAthena2USchema(config)
  }

  private static def runAthena2USchema(Athena2USchemaConfig config)
  {
    val inputModel = config.inputModel
    val inputPath = config.inputPath
    val outputPath = config.outputPath

    val athenaIO = new AthenaIO()
    val transformer = new Athena2USchema()
    val uSchemaWriter = new EcoreModelIO()

    println("ATHENA> Generating USchema models from Athena...")

    outputPath.toFile.mkdirs

    val iterateModels = inputModel === null ? inputPath.toFile.listFiles[f | f.name.endsWith(".athena")].toSet : #{ inputModel.toFile }

    for (model : iterateModels)
    {
      println("ATHENA>> Model: " + model.name)
      val schema = transformer.m2m(athenaIO.load(model.toPath))
      uSchemaWriter.write(schema, outputPath.resolve(model.name.replace(".athena", ".xmi")))
    }

    println("ATHENA> USchema generation finished!")
  }
}
