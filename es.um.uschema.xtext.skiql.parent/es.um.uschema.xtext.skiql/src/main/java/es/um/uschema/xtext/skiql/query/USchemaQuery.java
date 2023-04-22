package es.um.uschema.xtext.skiql.query;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import es.um.uschema.USchema.Aggregate;
import es.um.uschema.USchema.Attribute;
import es.um.uschema.USchema.EntityType;
import es.um.uschema.USchema.Feature;
import es.um.uschema.USchema.PrimitiveType;
import es.um.uschema.USchema.Reference;
import es.um.uschema.USchema.RelationshipType;
import es.um.uschema.USchema.SchemaType;
import es.um.uschema.USchema.StructuralFeature;
import es.um.uschema.USchema.StructuralVariation;
import es.um.uschema.USchema.USchema;

public class USchemaQuery {

	public List<EntityType> entityTypeByRegex(USchema uSchema, String regexText) {
		final String regex = regexTextToRegex(regexText);
		
		return uSchema.getEntities().stream()
			.filter(e -> e.getName().toLowerCase().matches(regex))
			.collect(Collectors.toList());
	}

	public List<RelationshipType> relationshipTypeSpecByRegex(USchema uSchema, String regexText) {
		final String regex = regexTextToRegex(regexText);
		
		return uSchema.getRelationships().stream()
			.filter(e -> e.getName().toLowerCase().matches(regex))
			.collect(Collectors.toList());
	}

	public String regexTextToRegex(String regexText) {
		String regex = regexText;
		if (regexText == null)
			return "";
		
		if (regexText.contains("*")) 
			regex = regex.replace("*", ".*");
		
		return regex.toLowerCase();
	}

	public List<StructuralVariation> variationsWithProperty(SchemaType schemaType, String featureName, String featureType) {
		List<StructuralVariation> variationsList = new LinkedList<>();
		
		for (StructuralVariation structuralVariation : schemaType.getVariations()) {
			for(Feature feature : structuralVariation.getFeatures()) {
				if (feature instanceof Attribute) {
					Attribute attribute = (Attribute) feature;
					if (featureName.toLowerCase().matches(regexTextToRegex(attribute.getName().toLowerCase()))) {
						if (attribute.getType() instanceof PrimitiveType) {
							PrimitiveType primitiveType = (PrimitiveType) attribute.getType();
							if (featureType == null || featureType.toLowerCase().equals(getTypeName(primitiveType)))
								variationsList.add(structuralVariation);
						}
					}
				}
			}
		}
		
		return variationsList;
	}

	public List<StructuralVariation> variationsWithProperty(SchemaType schemaType, String featureName) {
		List<StructuralVariation> variationsList = new LinkedList<>();
		
		for (StructuralVariation structuralVariation : schemaType.getVariations()) {
			for(StructuralFeature feature : structuralVariation.getStructuralFeatures()) {
				if (feature instanceof Attribute) {
					Attribute attribute = (Attribute) feature;
					if (featureName.toLowerCase().matches(regexTextToRegex((attribute.getName().toLowerCase())))) {
						variationsList.add(structuralVariation);
					}
				}
			}
		}
		
		return variationsList;
	}

	public List<StructuralVariation> variationsWithRelationship(SchemaType schemaType, String featureName, String relationshipType, String targetEntityName) {
		List<StructuralVariation> variationsList = new LinkedList<>();
		
		for (StructuralVariation structuralVariation : schemaType.getVariations()) {
			for(Feature feature : structuralVariation.getFeatures()) {
				if (relationshipType.toLowerCase().equals("relationship")) {
					filterByReference(featureName, targetEntityName, variationsList, structuralVariation, feature);
					filterByAggregate(featureName, targetEntityName, variationsList, structuralVariation, feature);
				} else if (relationshipType.toLowerCase().equals("reference")) {
					filterByReference(featureName, targetEntityName, variationsList, structuralVariation, feature);
				} else if (relationshipType.toLowerCase().equals("aggregation")) {
					filterByAggregate(featureName, targetEntityName, variationsList, structuralVariation, feature);
				}
			}
		}
		
		return variationsList;
	}

	private void filterByReference(String featureName, String targetEntityName,	List<StructuralVariation> variationsList, StructuralVariation structuralVariation, Feature feature) {
		if (feature instanceof Reference) {
			Reference reference = (Reference) feature;
			if (reference.getName().toLowerCase().matches(regexTextToRegex(featureName)) && reference.getRefsTo().getName().toLowerCase().matches(regexTextToRegex(targetEntityName))) {
					variationsList.add(structuralVariation);
			}
		}
	}
	

	private void filterByAggregate(String featureName, String targetEntityName, List<StructuralVariation> variationsList, StructuralVariation structuralVariation, Feature feature) {
		if (feature instanceof Aggregate) {
			Aggregate aggregate = (Aggregate) feature;
			if (aggregate.getAggregates().size() > 0 && featureName.toLowerCase().matches(regexTextToRegex(aggregate.getName().toLowerCase())) &&
				aggregate.getAggregates().get(0).getContainer().getName().toLowerCase().matches(regexTextToRegex(targetEntityName))) 
			{
				variationsList.add(structuralVariation);
			}
		}
	}
	public List<StructuralVariation> variationsWithRelationship(SchemaType schemaType, String featureName, String relationshipType) {
		List<StructuralVariation> variationsList = new LinkedList<>();
		
		for (StructuralVariation structuralVariation : schemaType.getVariations()) {
			for(Feature feature : structuralVariation.getFeatures()) {
				if (relationshipType.toLowerCase().equals("relationship")) {
					filterByReference(featureName, variationsList, structuralVariation, feature);
					filterByAggregate(featureName, variationsList, structuralVariation, feature);
				} else if (relationshipType.toLowerCase().equals("reference")) {
					filterByReference(featureName, variationsList, structuralVariation, feature);
				} else if (relationshipType.toLowerCase().equals("aggregation")) {
					filterByAggregate(featureName, variationsList, structuralVariation, feature);
				}
			}
		}
		
		return variationsList;
	}

	private void filterByReference(String featureName, List<StructuralVariation> variationsList, StructuralVariation structuralVariation, Feature feature) {
		if (feature instanceof Reference) {
			Reference reference = (Reference) feature;
			if (reference.getName().toLowerCase().matches(regexTextToRegex(featureName)))
				variationsList.add(structuralVariation);
		}
	}

	private void filterByAggregate(String featureName, List<StructuralVariation> variationsList, StructuralVariation structuralVariation, Feature feature) {
		if (feature instanceof Aggregate) {
			Aggregate aggregate = (Aggregate) feature;
			if (aggregate.getName().toLowerCase().matches(regexTextToRegex(featureName)))
				variationsList.add(structuralVariation);
		}
	}
	
	private String getTypeName(PrimitiveType dataType) {
		String dataTypeString = dataType.getName().toLowerCase();
		
		if (dataTypeString.equals("String"))
			dataTypeString = "string";
		else if (dataTypeString.equals("long") || dataTypeString.equals("integer") || dataTypeString.equals("int"))
			dataTypeString = "number";
		else if (dataTypeString.equals("float") || dataTypeString.equals("double"))
			dataTypeString = "number";
		else if (dataTypeString.equals("bool"))
			dataTypeString = "boolean";
		
		return dataTypeString;
	}

	public List<StructuralVariation> variationsRefsTo(EntityType e, List<EntityType> toEntities) {
		List<String> toEntitiesNames = toEntities.stream().map(toE -> toE.getName().toLowerCase()).collect(Collectors.toList());
		
		return e.getVariations().stream().filter(v -> 
			v.getLogicalFeatures().stream()
				.filter(Reference.class::isInstance).map(Reference.class::cast)
				.filter(r ->  toEntitiesNames.contains(r.getRefsTo().getName().toLowerCase())) 
				.findAny().isPresent()
		).collect(Collectors.toList());
	}

	public List<StructuralVariation> variationsAggregatesTo(EntityType e, List<EntityType> toEntities) {
		List<String> toEntitiesNames = toEntities.stream().map(toE -> toE.getName().toLowerCase()).collect(Collectors.toList());
		
		return e.getVariations().stream().filter(v -> 
			v.getStructuralFeatures().stream()
				.filter(Aggregate.class::isInstance).map(Aggregate.class::cast)
				.filter(r ->  {
					List<String> aggregatesEntitiesNames = r.getAggregates().stream().map(sv -> sv.getContainer().getName().toLowerCase()).collect(Collectors.toList());
					return toEntitiesNames.stream().anyMatch(aggregatesEntitiesNames::contains);
				}) 
				.findAny().isPresent()
		).collect(Collectors.toList());
	}
	
}
