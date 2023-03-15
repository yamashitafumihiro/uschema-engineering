package es.um.uschema.subtypes.outliers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Streams;

import es.um.uschema.USchema.EntityType;
import es.um.uschema.USchema.Feature;
import es.um.uschema.USchema.RelationshipType;
import es.um.uschema.USchema.SchemaType;
import es.um.uschema.USchema.StructuralVariation;
import es.um.uschema.USchema.USchemaFactory;
import es.um.uschema.USchema.USchema;
import es.um.uschema.utils.compare.CompareFeature;

public class OutlierTransformer
{
  private USchema filteredSchema;

  private USchema outlierSchema;

  private Map<SchemaType, Map<StructuralVariation, List<StructuralVariation>>> outliersAlternatives;

  public OutlierTransformer(USchema schema, Map<SchemaType, List<StructuralVariation>> outliers)
  {
    this(schema, outliers, schema.getName() + "_outliers");
  }

  public OutlierTransformer(USchema schema, Map<SchemaType, List<StructuralVariation>> outliers, String outlierSchemaName)
  {
    this.filteredSchema = schema;
    this.outlierSchema = createUSchemaFromOutliers(outlierSchemaName, outliers);
    outliersAlternatives = new HashMap<SchemaType, Map<StructuralVariation, List<StructuralVariation>>>();
  }

  public USchema getFilteredSchema()
  {
    return filteredSchema;
  }

  public USchema getOutlierSchema()
  {
    return outlierSchema;
  }

  public Map<SchemaType, Map<StructuralVariation, List<StructuralVariation>>> getOutliersAlternatives()
  {
    return outliersAlternatives;
  }

  private USchema createUSchemaFromOutliers(String newName, Map<SchemaType, List<StructuralVariation>> outliers)
  {
    USchema newSchema = USchemaFactory.eINSTANCE.createUSchema();
    newSchema.setName(newName);

    for (SchemaType entity : outliers.keySet())
    {
      SchemaType newType = null;

      if (entity instanceof EntityType)
      {
        newType = USchemaFactory.eINSTANCE.createEntityType();
        ((EntityType)newType).setRoot(((EntityType)entity).isRoot());
        newSchema.getEntities().add((EntityType)newType);
      }
      else if (entity instanceof RelationshipType)
      {
        newType = USchemaFactory.eINSTANCE.createRelationshipType();
        newSchema.getRelationships().add((RelationshipType)newType);
      }

      newType.setName(entity.getName());
      newType.getParents().addAll(entity.getParents());
      newType.getVariations().addAll(outliers.get(entity));
    }

    return newSchema;
  }

  public void analyzeAlternativeVariations(int numAlternatives)
  {
    Stream<SchemaType> schTypeStream = Streams.concat(outlierSchema.getEntities().stream(), outlierSchema.getRelationships().stream());

    for (SchemaType schType : schTypeStream.collect(Collectors.toList()))
    {
      if (schType.getVariations().isEmpty())
        continue;

      Map<StructuralVariation, List<StructuralVariation>> varCandidates = new HashMap<StructuralVariation, List<StructuralVariation>>();
      outliersAlternatives.put(schType, varCandidates);
      SchemaType altSchType = Streams.concat(filteredSchema.getEntities().stream(), filteredSchema.getRelationships().stream())
        .filter(schemaType -> schType.getName().equals(schemaType.getName())).findAny().get();

      for (StructuralVariation outlierVar : schType.getVariations())
        varCandidates.put(outlierVar, getClosestVariations(outlierVar, altSchType.getVariations(), numAlternatives));
    }
  }

  private List<StructuralVariation> getClosestVariations(StructuralVariation variation, List<StructuralVariation> candidates, int alternatives)
  {
    List<StructuralVariation> result = new ArrayList<StructuralVariation>();
    List<StructuralVariation> auxCandidates = new ArrayList<StructuralVariation>(candidates);
    // Option 1
    // Sort candidates by initialTimestamp: Most old variations will be the preferred ones.
    // Option 2
    // Sort candidates by count: Most popular variations will be the preferred ones.
    // auxCandidates.sort((var1, var2) -> var1.getCount() > var2.getCount() ? -1 : 1);
    // Option 3
    // Sort candidates by features number: Less new features variations will be the preferred ones.
    auxCandidates.sort((var1, var2) -> Integer.compare(var1.getFeatures().size(), var2.getFeatures().size()));

    if (alternatives == 0)
      return result;

    if (alternatives > auxCandidates.size())
    {
      result.addAll(candidates);
      return result;
    }

    for (int i = 0; i < alternatives; i++)
      result.add(getClosestVariation(variation, auxCandidates));

    return result;
  }

  private StructuralVariation getClosestVariation(StructuralVariation variation, List<StructuralVariation> candidates)
  {
    int factor = -1;
    StructuralVariation bestCandidate = null;

    for (StructuralVariation candidate : candidates)
    {
      int newFactor = getDifferenceFactor(variation, candidate);
      if (newFactor > factor)
      {
        factor = newFactor;
        bestCandidate = candidate;
      }
    }

    candidates.remove(bestCandidate);

    return bestCandidate;
  }

  // Just an idea. This can be refined further
  private int getDifferenceFactor(StructuralVariation var1, StructuralVariation var2)
  {
    CompareFeature comparer = new CompareFeature();
    int factor = 0;

    for (Feature feat1 : var1.getFeatures())
      if (var2.getFeatures().stream().anyMatch(feat2 -> comparer.compare(feat1, feat2)))
        factor++;

    return factor;// / var1.getFeatures().size();
  }
}
