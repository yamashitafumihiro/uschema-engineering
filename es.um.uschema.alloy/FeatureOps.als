module es_um_uschema_USchema_FeatureOps
open USchema

pred Operation_DeleteFeature [schemaI, schemaO: USchema, entityI, entityO: EntityType, feature: Feature]
{
  entityI in schemaI.entities and entityO not in schemaI.entities
  // Precondition
  feature in entityI.variations.features

  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - feature
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_DeleteFeature for 2 but 0 RelationshipType, exactly 2 Attribute

Check_Operation_DeleteFeature: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, feature: Feature |
    Operation_DeleteFeature[schemaI, schemaO, entityI, entityO, feature] =>
      // Postcondition
		  feature not in entityO.variations.features and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - feature, entityO.variations.features - feature]
} for 10

pred Operation_RenameFeature [schemaI, schemaO: USchema, entityI, entityO: EntityType, featureI, featureO: Feature, newName: FeatureName]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  featureI in entityI.variations.features and featureO not in entityI.variations.features
  newName not in entityI.variations.features.name

  featureO.name = newName
  featureO.type = featureI.type
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - featureI + featureO
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_RenameFeature for 2 but 0 RelationshipType, exactly 2 Attribute

Check_Operation_RenameFeature: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, featureI, featureO: Feature, newName: FeatureName |
    Operation_RenameFeature [schemaI, schemaO, entityI, entityO, featureI, featureO, newName] =>
      // Postcondition
      featureO.name = newName and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - featureI, entityO.variations.features - featureO]
} for 10

// Actually one of these three entities is not necessary, since we could say:
// feature not in entity.features and feature in schema.entities.features, thus forcing it to be three entities.
pred Operation_CopyFeature [schemaI, schemaO: USchema, entityI1, entityI2, entityO: EntityType, feature: Feature]
{
  // Precondition
  entityI1 in schemaI.entities and entityI2 in schemaI.entities and entityO not in schemaI.entities
  feature in entityI1.variations.features and feature not in entityI2.variations.features

  entityO.name = entityI2.name
  entityO.root = entityI2.root
  entityO.parents = entityI2.parents
  entityO.variations.features = entityI2.variations.features + feature
  schemaO.entities = schemaI.entities - entityI2 + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_CopyFeature for 3 but exactly 2 USchema, 0 RelationshipType

Check_Operation_CopyFeature: check
{
  all schemaI, schemaO: USchema, entityI1, entityI2, entityO: EntityType, feature: Feature |
    Operation_CopyFeature[schemaI, schemaO, entityI1, entityI2, entityO, feature] =>
      // Postcondition
      feature in entityI1.variations.features and feature in entityO.variations.features and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI2, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI2.variations.features - feature, entityO.variations.features - feature]
} for 10

pred Operation_MoveFeature [schemaI, schemaO: USchema, entityI1, entityI2, entityO1, entityO2: EntityType, feature: Feature]
{
  // Precondition
  entityI1 in schemaI.entities and entityI2 in schemaI.entities
  entityO1 not in schemaI.entities and entityO2 not in schemaI.entities
  feature in entityI1.variations.features and feature not in entityI2.variations.features

  entityO1.name = entityI1.name
  entityO1.root = entityI1.root
  entityO1.parents = entityI1.parents
  entityO1.variations.features = entityI1.variations.features - feature
  entityO2.name = entityI2.name
  entityO2.root = entityI2.root
  entityO2.parents = entityI2.parents
  entityO2.variations.features = entityI2.variations.features + feature
  schemaO.entities = schemaI.entities - entityI1 - entityI2 + entityO1 + entityO2
  schemaO.relationships = schemaI.relationships
}

run Operation_MoveFeature for 4 but exactly 2 USchema, 0 RelationshipType, 0 Reference, 0 Aggregate

Check_Operation_MoveFeature: check
{
  all schemaI, schemaO: USchema, entityI1, entityI2, entityO1, entityO2: EntityType, feature: Feature |
    Operation_MoveFeature[schemaI, schemaO, entityI1, entityI2, entityO1, entityO2, feature] =>
      // Postcondition
      feature in entityI1.variations.features and feature not in entityI2.variations.features and
      feature not in entityO1.variations.features and feature in entityO2.variations.features and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI1 - entityI2, schemaO.entities - entityO1 - entityO2, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI1.variations.features - feature, entityO1.variations.features - feature] and
      CheckEntityEquality[entityI2.variations.features - feature, entityO2.variations.features - feature]
} for 10

pred Operation_NestFeature [schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregateI, aggregateO: Aggregate, feature: Feature]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  aggregateI in entityI.variations.features and aggregateO not in entityI.variations.features
  feature in entityI.variations.features and feature not in aggregateI.aggregates.features
  feature != aggregateI and feature != aggregateO

  aggregateO.name = aggregateI.name
  aggregateO.aggregates.features = aggregateI.aggregates.features + feature
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - feature - aggregateI + aggregateO
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_NestFeature for 4 but exactly 2 USchema, 0 RelationshipType, 0 Reference, 2 Aggregate

Check_Operation_NestFeature: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregateI, aggregateO: Aggregate, feature: Feature |
    Operation_NestFeature[schemaI, schemaO, entityI, entityO, aggregateI, aggregateO, feature] =>
      // Postcondition
      feature not in aggregateI.aggregates.features and feature in aggregateO.aggregates.features and
      feature in entityI.variations.features and feature not in entityO.variations.features and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - aggregateI - feature, entityO.variations.features - aggregateO - feature]
} for 10

pred Operation_UnnestFeature [schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregateI, aggregateO: Aggregate, feature: Feature]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  aggregateI in entityI.variations.features and aggregateO not in entityI.variations.features
  feature not in entityI.variations.features and feature in aggregateI.aggregates.features
  feature != aggregateI and feature != aggregateO

  aggregateO.name = aggregateI.name
  aggregateO.aggregates.features = aggregateI.aggregates.features - feature
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features + feature - aggregateI + aggregateO
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_UnnestFeature for 4 but exactly 2 USchema, 0 RelationshipType, 0 Reference, 2 Aggregate

Check_Operation_UnnestFeature: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregateI, aggregateO: Aggregate, feature: Feature |
    Operation_UnnestFeature[schemaI, schemaO, entityI, entityO, aggregateI, aggregateO, feature] =>
      // Postcondition
      feature in aggregateI.aggregates.features and feature not in aggregateO.aggregates.features and
      feature not in entityI.variations.features and feature in entityO.variations.features and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - aggregateI - feature, entityO.variations.features - aggregateO - feature]
} for 10
