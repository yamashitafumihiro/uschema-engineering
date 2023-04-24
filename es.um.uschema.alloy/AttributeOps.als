module es_um_uschema_USchema_AttributeOps
open USchema

pred Operation_AddAttribute [schemaI, schemaO: USchema, entityI, entityO: EntityType, attribute: Attribute]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  attribute not in entityI.variations.features

  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features + attribute
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_AddAttribute for 2 but 0 RelationshipType

Check_Operation_AddAttribute: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, attribute: Attribute |
    Operation_AddAttribute[schemaI, schemaO, entityI, entityO, attribute] =>
      // Postcondition
      attribute in entityO.variations.features and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - attribute, entityO.variations.features - attribute]
} for 10

pred Operation_CastAttribute [schemaI, schemaO: USchema, entityI, entityO: EntityType, attributeI, attributeO: Attribute, newType: DataType]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  attributeI in entityI.variations.features and attributeO not in entityI.variations.features
	attributeI.type != newType

  attributeO.name = attributeI.name
  attributeO.type = newType
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - attributeI + attributeO
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_CastAttribute for 2 but 0 RelationshipType

Check_Operation_CastAttribute: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, attributeI, attributeO: Attribute, newType: DataType |
    Operation_CastAttribute[schemaI, schemaO, entityI, entityO, attributeI, attributeO, newType] =>
      // Postcondition
      attributeO.type = newType and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - attributeI, entityO.variations.features - attributeO]
} for 10


pred Operation_PromoteAttribute [schemaI, schemaO: USchema, entityI, entityO: EntityType, attribute: Attribute, key: Key]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  key not in entityI.variations.features
  attribute not in entityI.variations.features.keyAttr

  key.keyAttr = attribute
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features + key
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_PromoteAttribute for 2 but 0 RelationshipType, 1 Key

Check_Operation_PromoteAttribute: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, attribute: Attribute, key: Key |
    Operation_PromoteAttribute[schemaI, schemaO, entityI, entityO, attribute, key] =>
      // Postcondition
      key.keyAttr = attribute and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - key, entityO.variations.features - key]
} for 10

pred Operation_DemoteAttribute [schemaI, schemaO: USchema, entityI, entityO: EntityType, attribute: Attribute, key: Key]
{
  // Precondition
  entityI in schemaI.entities and entityO not in schemaI.entities
  key in entityI.variations.features
  key.keyAttr = attribute

  attribute not in entityO.variations.features.keyAttr
  entityO.name = entityI.name
  entityO.root = entityI.root
  entityO.parents = entityI.parents
  entityO.variations.features = entityI.variations.features - key
  schemaO.entities = schemaI.entities - entityI + entityO
  schemaO.relationships = schemaI.relationships
}

run Operation_DemoteAttribute for 2 but 0 RelationshipType, 1 Key

Check_Operation_DemoteAttribute: check
{
  all schemaI, schemaO: USchema, entityI, entityO: EntityType, attribute: Attribute, key: Key |
    Operation_DemoteAttribute[schemaI, schemaO, entityI, entityO, attribute, key] =>
      // Postcondition
      key.keyAttr = attribute and
      // Check invariant
      CheckSchemaEquality[schemaI.entities - entityI, schemaO.entities - entityO, schemaI.relationships, schemaO.relationships] and
      CheckEntityEquality[entityI.variations.features - key, entityO.variations.features - key]
} for 10
