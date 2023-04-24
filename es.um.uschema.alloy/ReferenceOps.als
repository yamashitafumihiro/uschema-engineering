module es_um_uschema_USchema_ReferenceOps
open USchema

pred Operation_AddReference [schemaI, schemaO: USchema, entityI, entityO: EntityType, reference: Reference]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  reference not in entityI.variations.features

  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features + reference
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_AddReference for 2 but 0 RelationshipType

Check_Operation_AddReference: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, reference: Reference |
    Operation_AddReference[schemaI, schemaO, entityI, entityO, reference] =>
      // Postcondition
      reference in entityO.variations.features and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - reference, entityO.variations.features - reference]
} for 10

pred Operation_CastReference [schemaI, schemaO: USchema, entityI, entityO: EntityType, referenceI, referenceO: Reference, newType: PrimitiveType]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  referenceI in entityI.variations.features and referenceO not in entityI.variations.features
  referenceI.refAttr.type != newType

  referenceO.name = referenceI.name
  referenceO.refsTo = referenceI.refsTo
  referenceO.refAttr.name = referenceI.refAttr.name
  referenceO.refAttr.type = newType
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - referenceI - referenceI.refAttr + referenceO + referenceO.refAttr
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_CastReference for 4 but exactly 2 USchema, 3 EntityType, 0 RelationshipType, 2 Reference, 2 Attribute

Check_Operation_CastReference: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, referenceI, referenceO: Reference, newType: PrimitiveType |
    Operation_CastReference[schemaI, schemaO, entityI, entityO, referenceI, referenceO, newType] =>
      // Postcondition
      referenceO.refAttr.type = newType and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - referenceI - referenceI.refAttr, entityO.variations.features - referenceO - referenceO.refAttr]
} for 10

pred Operation_MultiplicityReference [schemaI, schemaO: USchema, entityI, entityO: EntityType, referenceI, referenceO: Reference, newType: DataType]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  referenceI in entityI.variations.features and referenceO not in entityI.variations.features
  (referenceI.refAttr.type in PrimitiveType and newType in PList) or (referenceI.refAttr.type in PList and newType in PrimitiveType)

  referenceO.name = referenceI.name
  referenceO.refsTo = referenceI.refsTo
  referenceO.refAttr.name = referenceI.refAttr.name
  referenceO.refAttr.type = newType
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - referenceI - referenceI.refAttr + referenceO + referenceO.refAttr
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_MultiplicityReference for 4 but exactly 2 USchema, 3 EntityType, 0 RelationshipType, 2 Reference, 2 Attribute

Check_Operation_MultiplicityReference: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, referenceI, referenceO: Reference, newType: DataType |
    Operation_MultiplicityReference[schemaI, schemaO, entityI, entityO, referenceI, referenceO, newType] =>
      // Postcondition
      referenceO.refAttr.type = newType and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - referenceI - referenceI.refAttr, entityO.variations.features - referenceO - referenceO.refAttr]
} for 10

pred Operation_MorphReference [schemaI, schemaO: USchema, entityI, entityO: EntityType, reference: Reference, aggregate: Aggregate]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  reference in entityI.variations.features and aggregate not in entityI.variations.features

  aggregate.name = reference.name
  aggregate.aggregates = reference.refsTo.variations
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - reference + aggregate
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_MorphReference for 3 but exactly 2 USchema, 0 RelationshipType

Check_Operation_MorphReference: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, reference: Reference, aggregate: Aggregate |
    Operation_MorphReference[schemaI, schemaO, entityI, entityO, reference, aggregate] =>
      // Postcondition
      reference not in entityO.variations.features and
      aggregate in entityO.variations.features and
      aggregate.name = reference.name and
      aggregate.aggregates = reference.refsTo.variations and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - reference, entityO.variations.features - aggregate]
} for 10
