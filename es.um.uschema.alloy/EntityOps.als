module es_um_uschema_USchema_EntityOps
open USchema

pred Operation_AddEntity [schemaI, schemaO: USchema, entity: EntityType]
{
  // Precondition
  entity not in schemaI.entities

  schemaO.entities = schemaI.entities + entity
  schemaO.relationships = schemaI.relationships
}

run Operation_AddEntity for 2 but 0 RelationshipType, 0 StructuralVariation

Check_Operation_AddEntity: check
{
  all schemaI, schemaO: USchema, entity: EntityType |
    Operation_AddEntity[schemaI, schemaO, entity] =>
      // Postcondition
      entity in schemaO.entities
      // Check invariant
      and CheckSchemaEquality[schemaI.entities - entity, schemaO.entities - entity, schemaI.relationships, schemaO.relationships]
} for 10

pred Operation_DeleteEntity [schemaI, schemaO: USchema, entity: EntityType]
{
  // Precondition
  entity in schemaI.entities

  schemaO.entities = schemaI.entities - entity
  schemaO.relationships = schemaI.relationships
}

run Operation_DeleteEntity for 2 but 0 RelationshipType, 0 StructuralVariation

Check_Operation_DeleteEntity: check
{
  all schemaI, schemaO: USchema, entity: EntityType |
    Operation_DeleteEntity[schemaI, schemaO, entity] =>
			// Postcondition
      entity not in schemaO.entities
      // Check invariant
      and CheckSchemaEquality[schemaI.entities - entity, schemaO.entities - entity, schemaI.relationships, schemaO.relationships]
} for 10

pred Operation_RenameEntity [schemaI, schemaO: USchema, entityI, entityO: EntityType, newName: SchemaTypeName]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  newName not in schemaI.entities.name

  entityO.name = newName
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations = entityI.variations
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_RenameEntity for 2 but 0 RelationshipType, 0 StructuralVariation

Check_Operation_RenameEntity: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, newName: SchemaTypeName |
    Operation_RenameEntity[schemaI, schemaO, entityI, entityO, newName] =>
      // Postcondition
      entityO.name = newName
      // Check invariant
      and CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships]
} for 10

pred Operation_ExtractEntity [schemaI, schemaO: USchema, entityI, entityO: EntityType, featureGroup: some Feature, newName: SchemaTypeName]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  featureGroup in entityI.variations.features
  newName not in schemaI.entities.name

  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.name = newName
  entityO.variations.features = featureGroup
  schemaO.entities = schemaI.entities + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_ExtractEntity for 2 but 0 RelationshipType

Check_Operation_ExtractEntity: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, featureGroup: some Feature, newName: SchemaTypeName |
    Operation_ExtractEntity[schemaI, schemaO, entityI, entityO, featureGroup, newName] =>
      // Postcondition
      entityI in schemaO.entities and entityO in schemaO.entities and
      entityO.name = newName and entityO.variations.features = featureGroup
      // Check invariant
      and CheckSchemaEquality[schemaI.entities, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships]
} for 10

pred Operation_SplitEntity [schemaI, schemaO: USchema, entityI, entityO1, entityO2: EntityType, featureGroup1, featureGroup2: some Feature, newName1, newName2: SchemaTypeName]
{
  // Precondition
  entityI in schemaI.entities and entityO1 not in schemaI.entities and entityO2 not in schemaI.entities
  entityO1 != entityO2
  newName1 not in schemaI.entities.name and newName2 not in schemaI.entities.name
  featureGroup1 in entityI.variations.features and featureGroup2 in entityI.variations.features

  entityO1.root = entityI.root
  entityO1.parents = entityI.parents
  entityO1.name = newName1
  entityO1.variations.features = featureGroup1
  entityO2.root = entityI.root
  entityO2.parents = entityI.parents
  entityO2.name = newName2
  entityO2.variations.features = featureGroup2
  schemaO.entities = schemaI.entities - entityI + entityO1 + entityO2
  schemaO.relationships = schemaI.relationships
}

run Operation_SplitEntity for 3 but exactly 2 USchema, 0 RelationshipType, exactly 3 Attribute

Check_Operation_SplitEntity: check
{
  all schemaI, schemaO: USchema, entityI, entityO1, entityO2: EntityType, featureGroup1, featureGroup2: some Feature, newName1, newName2: SchemaTypeName |
    Operation_SplitEntity[schemaI, schemaO, entityI, entityO1, entityO2, featureGroup1, featureGroup2, newName1, newName2] =>
      // Postcondition
      entityI not in schemaO.entities and entityO1 in schemaO.entities and entityO2 in schemaO.entities and
      entityO1.name = newName1 and entityO1.variations.features = featureGroup1 and
      entityO2.name = newName2 and entityO2.variations.features = featureGroup2
      // Check invariant
      and CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO1 - entityO2, schemaI.relationships, schemaO.relationships]
} for 10

pred Operation_MergeEntity [schemaI, schemaO: USchema, entityI1, entityI2, entityO: EntityType, newName: SchemaTypeName]
{
  // Precondition
  entityI1 in schemaI.entities and entityI2 in schemaI.entities and entityO not in schemaI.entities
  entityI1 != entityI2
  newName not in schemaI.entities.name

  entityO.root = entityI1.root.Or[entityI2.root]
  entityO.parents = entityI1.parents + entityI2.parents
	entityO.name = newName
  entityO.variations.features = entityI1.variations.features + entityI2.variations.features
  schemaO.entities = schemaI.entities - entityI1 - entityI2 + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_MergeEntity for 3 but exactly 2 USchema, 0 RelationshipType, exactly 3 Attribute

Check_Operation_MergeEntity: check
{
  all schemaI, schemaO: USchema, entityI1, entityI2, entityO: EntityType, newName: SchemaTypeName |
    Operation_MergeEntity[schemaI, schemaO, entityI1, entityI2, entityO, newName] =>
      // Postcondition
			entityI1 not in schemaO.entities and entityI2 not in schemaO.entities and entityO in schemaO.entities and
      entityO.name = newName and entityO.variations.features = entityI1.variations.features + entityI2.variations.features
      // Check invariant
      and CheckSchemaEquality[schemaI.entities - entityI1 - entityI2, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships]
} for 10

pred Operation_DelVarEntity [schemaI, schemaO: USchema, entityI, entityO: EntityType, variation: StructuralVariation]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  variation in entityI.variations

  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations = entityI.variations - variation
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_DelVarEntity for 2 but 0 RelationshipType, exactly 2 StructuralVariation, 0 Feature

Check_Operation_DelVarEntity: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, variation: StructuralVariation |
    Operation_DelVarEntity[schemaI, schemaO, entityI, entityO, variation] =>
      // Postcondition
      variation not in entityO.variations
      // Check invariant
      and CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships]
} for 10

pred Operation_AdaptEntity [schemaI, schemaO: USchema, entityI, entityO: EntityType, variationI1, variationI2, variationO: StructuralVariation]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  variationI1 != variationI2
  variationI1 in entityI.variations and variationI2 in entityI.variations and variationO not in entityI.variations

  variationO.features = variationI1.features + variationI2.features
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations = entityI.variations - variationI1 - variationI2 + variationO
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_AdaptEntity for 3 but 0 RelationshipType, exactly 3 StructuralVariation, exactly 3 Attribute

Check_Operation_AdaptEntity: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, variationI1, variationI2, variationO: StructuralVariation |
    Operation_AdaptEntity[schemaI, schemaO, entityI, entityO, variationI1, variationI2, variationO] =>
      // Postcondition
      variationI1 not in entityO.variations and variationI2 not in entityO.variations and variationO in entityO.variations and
      variationO.features = variationI1.features + variationI2.features
      // Check invariant
      and CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships]
} for 10

pred Operation_UnionEntity [schemaI, schemaO: USchema, entityI, entityO: EntityType]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  some entityI.variations

  one entityO.variations
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_UnionEntity for 4 but exactly 2 USchema, exactly 2 EntityType, 0 RelationshipType, exactly 4 StructuralVariation, exactly 4 Attribute

Check_Operation_UnionEntity: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType |
    Operation_UnionEntity[schemaI, schemaO, entityI, entityO] =>
      // Postcondition
      one entityO.variations and entityO.variations.features = entityI.variations.features
      // Check invariant
      and CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships]
} for 10
