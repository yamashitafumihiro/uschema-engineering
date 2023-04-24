module es_um_uschema_USchema_AggregateOps
open USchema

pred Operation_AddAggregate [schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregate: Aggregate]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  aggregate not in entityI.variations.features

  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features + aggregate
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_AddAggregate for 3 but 0 RelationshipType

Check_Operation_AddAggregate: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregate: Aggregate |
    Operation_AddAggregate[schemaI, schemaO, entityI, entityO, aggregate] =>
      // Postcondition
      aggregate in entityO.variations.features
      // Check invariant
      and CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships]
      and CheckEntityEquality[entityI.variations.features - aggregate, entityO.variations.features - aggregate]
} for 10

// IF aggregate is a set, then take only head member. If aggregate is not a set, then...do nothing?
pred Operation_MultiplicityAggregate [schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregateI, aggregateO: Aggregate]
{
  // Postcondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  aggregateI in entityI.variations.features and aggregateO not in entityI.variations.features
  (one aggregateI.aggregates and some (aggregateO.aggregates - aggregateI.aggregates)) or (some (aggregateI.aggregates - aggregateO.aggregates) and one aggregateO.aggregates)

  aggregateO.name = aggregateI.name
  (aggregateI.aggregates in aggregateO.aggregates) or (aggregateO.aggregates in aggregateI.aggregates)
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - aggregateI + aggregateO
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_MultiplicityAggregate for 4 but exactly 2 USchema, 3 EntityType, 0 RelationshipType, 2 Aggregate

Check_Operation_MultiplicityAggregate: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregateI, aggregateO: Aggregate |
    Operation_MultiplicityAggregate[schemaI, schemaO, entityI, entityO, aggregateI, aggregateO] =>
      // Postcondition
      (one aggregateI.aggregates and some (aggregateO.aggregates - aggregateI.aggregates)) or (some (aggregateI.aggregates - aggregateO.aggregates) and one aggregateO.aggregates) and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - aggregateI, entityO.variations.features - aggregateO]
} for 10

pred Operation_MorphAggregate [schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregate: Aggregate, reference: Reference]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  aggregate in entityI.variations.features and reference not in entityI.variations.features

  reference.name = aggregate.name
  (some aggregate.aggregates and reference.refAttr.type in PList) or (one aggregate.aggregates and reference.refAttr.type in PrimitiveType)
  reference.refsTo.variations = aggregate.aggregates
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - aggregate + reference
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_MorphAggregate for 3 but exactly 2 USchema, 0 RelationshipType

Check_Operation_MorphAggregate: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, aggregate: Aggregate, reference: Reference |
    Operation_MorphAggregate[schemaI, schemaO, entityI, entityO, aggregate, reference] =>
      // Postcondition
      aggregate not in entityO.variations.features and
      reference in entityO.variations.features and
      reference.name = aggregate.name and
      reference.refsTo.variations = aggregate.aggregates and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - aggregate, entityO.variations.features - reference]
} for 10
