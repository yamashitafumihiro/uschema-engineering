package es.um.uschema.subtypes.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

import es.um.uschema.USchema.SchemaType;
import es.um.uschema.USchema.USchema;
import es.um.uschema.subtypes.discovery.DependencyAnalyzer;
import es.um.uschema.subtypes.discovery.discriminator.DBDiscriminatorSeeker;
import es.um.uschema.subtypes.m2m.USchema2SubtypeUSchema;
import es.um.uschema.subtypes.outliers.OutlierDetector;
import es.um.uschema.subtypes.util.SubtypeSerializer;
import es.um.uschema.subtypes.util.configuration.SubtypeDiscoveryConfig;
import es.um.uschema.utils.EcoreModelIO;

public class SubtypeDiscoveryMain
{
    /**
     * This main function is used to discover subtypes in a given USchema model file.
     *usage: <Subtype discovery>
       -cov,--coverage <value>                         Apply coverage outlier
                                                       detection
       -d,--discriminator <mongodb|neo4j ip db_name>   Discriminator seeker
       -e,--entity <string>                            Entity type to analyze
       -ep,--epsilon <value>                           Apply epsilon outlier
                                                       detection
       -h,--help                                       Prints help
       -i,--input <model>                              Path to the input
                                                       U-Schema model
       -o,--output <folder>                            Path to an output folder
     */
    public static void main(String[] args)
    {
/*
        String[] args_solar_system =
        {
            "-i", "../es.um.uschema.models/solar_system/solar_system.xmi",
            "-e", "Bodies",
            "-d", "mongodb", "localhost", "solar_system",
            "-o", "solar_system_output/"
        };

        String[] args_athletes =
        {
            "-i", "../es.um.uschema.models/athletes/athletes.xmi",
            "-e", "Athletes",
            "-d", "mongodb", "localhost", "athletes",
            "-o", "athletes_output/"
        };

        String[] args_movieontology =
        {
            "-i", "../es.um.uschema.models/movieontology/movieontology.xmi",
            "-e", "Resource"
        };

        String[] args_stackoverflow =
        {
            "-i", "../es.um.uschema.models/stackoverflow/stackoverflow.xmi",
            "-e", "Posts",
            "-cov", "99",
            "-d", "mongodb", "localhost", "stackoverflow",
            "-o", "stackoverflow_output/"
        };
*/
      SubtypeDiscoveryConfig config = new SubtypeDiscoveryConfig(args);

      runSubtypeDiscovery(config);
    }

    private static void runSubtypeDiscovery(SubtypeDiscoveryConfig config)
    {
        Path inputPath = config.getInputPath();
        String entityName = config.getEntityName();
        OutlierDetector oDetector = config.getOutlierDetector();
        DBDiscriminatorSeeker dSeeker = config.getDiscriminatorSeeker();
        Path outputPath = config.getOutputPath();
    
        EcoreModelIO modelIO = new EcoreModelIO();
        USchema schema = modelIO.load(USchema.class, inputPath);
        SubtypeSerializer serializer = new SubtypeSerializer();
    
        System.out.println("> Subtype discovery process for " + inputPath + ": " + entityName);
        long initialT = System.currentTimeMillis();
    
        if (oDetector != null)
            oDetector.removeOutliers(schema);
    
        Optional<SchemaType> optSchemaType = Stream
            .concat(schema.getEntities().stream(), schema.getRelationships().stream())
            .filter(sType -> sType.getName().equals(entityName)).findAny();
    
        if (!optSchemaType.isPresent())
            throw new IllegalArgumentException("> Could not find " + entityName + " in " + inputPath.toString());
    
        DependencyAnalyzer depDetector = new DependencyAnalyzer(optSchemaType.get(), dSeeker);
        depDetector.doDependencyAnalysis();
    
        long finalT = System.currentTimeMillis();
    
        StringBuilder result = new StringBuilder();
        result.append(serializer.printPretty(depDetector));
        result.append(serializer.printPretty(depDetector.getSubtypes()));
        result.append(serializer.printPretty(depDetector.getDiscriminatorSeeker()));
    
        System.out.println(result.toString());
    
        if (outputPath != null)
        {
            System.out.println("> Writing results on " + outputPath);
            outputPath.toFile().mkdirs();
            Path outputFilePath = outputPath.resolve(schema.getName() + "_" + entityName + "_subtypes.txt");
      
            try
            {
                PrintWriter writer = new PrintWriter(outputFilePath.toString(), "UTF-8");
                writer.print(result.toString());
                writer.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
      
            if (dSeeker != null)
            {
                Path outputModelPath = outputPath.resolve(schema.getName() + "_hierarchy.xmi");
                USchema newSchema = new USchema2SubtypeUSchema().m2m(schema, depDetector);
                modelIO.write(newSchema, outputModelPath);
            }
        }
    
        System.out.println("> Subtype discovery process finished in: " + (finalT - initialT) + " ms");
    }
}
