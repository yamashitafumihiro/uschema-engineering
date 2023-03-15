package es.um.uschema.subtypes.outliers;

import java.util.List;
import java.util.Map;

import es.um.uschema.USchema.SchemaType;
import es.um.uschema.USchema.StructuralVariation;
import es.um.uschema.USchema.USchema;

public interface OutlierDetector
{
  public void setFactor(double factor);

  public double getFactor();

  public List<StructuralVariation> removeOutliers(SchemaType schemaType);

  public Map<SchemaType, List<StructuralVariation>> getOutliers();

  public void removeOutliers(USchema schema);
}
