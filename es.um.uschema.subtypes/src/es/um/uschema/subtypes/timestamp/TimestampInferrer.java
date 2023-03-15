package es.um.uschema.subtypes.timestamp;

import java.nio.file.Path;

import com.google.gson.JsonArray;

import es.um.uschema.doc2uschema.main.BuildUSchema;
import es.um.uschema.doc2uschema.main.DefaultBuildUSchema;
import es.um.uschema.documents.extractors.db.mongodb.MongoDBImport;
import es.um.uschema.USchema.USchema;
import es.um.uschema.subtypes.timestamp.templates.TimestampAnalyzer;
import es.um.uschema.subtypes.util.MapReduceTimestampSources;

public class TimestampInferrer
{
  public USchema infer(String ip, String dbName, TimestampAnalyzer analyzer, Path mapReduceFolder)
  {
    long startTime = System.currentTimeMillis();

    System.out.println(dbName + " > Connecting to the database...");

    MongoDBImport inferrer = new MongoDBImport(ip, dbName);
    MapReduceTimestampSources mrtSources = new MapReduceTimestampSources(mapReduceFolder, analyzer);

    System.out.println(dbName + " > Starting inference...");

    JsonArray jArray = inferrer.mapRed2Array(mrtSources);

    System.out.println(dbName + " > Inference finished.");
    System.out.println(dbName + " > Starting BuildUSchema...");

    BuildUSchema builder = DefaultBuildUSchema.getInjectedInstance();

    builder.buildFromGsonArray(dbName, jArray);
    USchema result = builder.getUSchema();

    System.out.println(dbName + " > BuildUSchema created in " + (System.currentTimeMillis() - startTime) + " ms");

    return result;
  }
}
