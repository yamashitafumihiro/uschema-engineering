package es.um.uschema.subtypes.util.types.changes;

import es.um.uschema.USchema.Feature;
import es.um.uschema.USchema.StructuralVariation;

public class SchemaAdd extends AbstractSchemaChange
{
  private Feature featAdd;

  private StructuralVariation variation;

  private long timestamp;

  public SchemaAdd(Feature featAdd, StructuralVariation variation)
  {
    this.featAdd = featAdd;
    this.variation = variation;
    this.timestamp = variation.getFirstTimestamp();
  }

  public Feature getAddedFeature()
  {
    return featAdd;
  }

  public StructuralVariation getFirstVariation()
  {
    return variation;
  }

  public long getFirstTimestamp()
  {
    return timestamp;
  }
}
