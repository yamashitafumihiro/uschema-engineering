package es.um.uschema.subtypes.discovery.discriminator;

import java.util.List;
import java.util.Map;

import es.um.uschema.USchema.Feature;
import es.um.uschema.subtypes.util.types.EntitySubtype;

public interface DBDiscriminatorSeeker
{
  public List<EntitySubtype> getSubtypes();

  public List<Feature> getCandidates();

  public Feature getDiscriminator();

  public Map<EntitySubtype, Object> getDiscriminatorValues();

  public void doSeek(String collectionName, List<EntitySubtype> subtypes, List<Feature> candidates);
}
