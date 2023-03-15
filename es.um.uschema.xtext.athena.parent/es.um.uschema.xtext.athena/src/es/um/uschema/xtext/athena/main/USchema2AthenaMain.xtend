package es.um.uschema.xtext.athena.main

import es.um.uschema.USchema.USchema
import es.um.uschema.xtext.athena.m2m.USchema2Athena
import es.um.uschema.xtext.athena.utils.config.USchema2AthenaConfig
import es.um.uschema.xtext.athena.utils.io.AthenaIO
import es.um.uschema.utils.EcoreModelIO

class USchema2AthenaMain
{
  def static void main(String[] args)
  {
    // val custom_args = newArrayList("-i", "../../es.um.uschema.models/reddit/reddit.xmi", "-o", "models/uschema2athena/")

    val config = new USchema2AthenaConfig(args)

    runUSchema2Athena(config)
  }

  private static def runUSchema2Athena(USchema2AthenaConfig config)
  {
    val inputModel = config.inputModel
    val inputPath = config.inputPath
    val outputPath = config.outputPath

    val loader = new EcoreModelIO()
    val transformer = new USchema2Athena()
    val athenaIO = new AthenaIO()

    println("ATHENA> Generating Athena models from USchema...")

    outputPath.toFile.mkdirs

    val iterateModels = inputModel === null ? inputPath.toFile.listFiles[f | f.name.endsWith(".xmi")].map[f | f.toPath].toSet : #{ inputModel }

    for (model : iterateModels)
    {
      println("ATHENA>> Model: " + model.toString)
      val schema = transformer.m2m(loader.load(USchema, model))
      athenaIO.write(schema, outputPath.resolve(schema.id.name + ".athena"))
    }

    println("ATHENA> Athena generation finished!")
  }
}
