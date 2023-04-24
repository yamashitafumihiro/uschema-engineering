module es_um_uschema_Athena
open util/boolean

some sig AthenaSchema { entities: set EntityType, relationships: set RelationshipType }
{
  some entities or some relationships    // There must be entities OR relationships at least
  entities.parents in entities           // Parents of an EntityType must belong to the same schema.
  relationships.parents in relationships // Parents of a RelationshipType must belong to the same schema.

  //some e: entities | e.root = True
  all e1, e2: entities | e1.name = e2.name => e1 = e2
  all r1, r2: relationships | r1.name = r2.name => r1 = r2
  all ref: entities.features + relationships.features | ref.refsTo in entities
  all aggr: entities.features + relationships.features | aggr.aggregates in entities.variations
}

/////////// SchemaType, EntityType, RelationshipType
//////////////////////
abstract sig SchemaType { name: SchemaTypeName, parents: set SchemaType, variations: set StructuralVariation, features: set Feature}
{
  EntityType + RelationshipType = SchemaType // Might be unnecesary due to ABSTRACT keyword on SchemaType.
  features = variations.features
}
fact SchemaTypeNotCyclicParent { no st: SchemaType | st in st.^parents } // There cannot be any cycle in parent relationships

sig EntityType extends SchemaType { root: Bool }
{
  parents in EntityType // All parents in EntityType must also be EntityTypes
  all e: EntityType | some s: USchema | e in s.entities // All EntityTypes must be contained in some USchemas
  all f: variations.features | Key in f => root = True
}

sig RelationshipType extends SchemaType {}
{
  parents in RelationshipType // All parents in RelationshipType must also be RelationshipTypes
  all r: RelationshipType | some s: USchema | r in s.relationships // All RelationshipTypes must be contained in some USchemas
}

/////////// Variations
//////////////////////

sig StructuralVariation { features: set Feature }
{
  all v: StructuralVariation | some s: SchemaType | v in s.variations
	all f1, f2: features | f1.name = f2.name => f1 = f2
  all ref: features | ref.refAttr in features
  all key: features | key.keyAttr in features
}

/////////// Features
//////////////////////
abstract sig Feature { name: FeatureName }
{
  all f: Feature | some v: StructuralVariation | f in v.features
}
abstract sig LogicalFeature extends Feature {}
abstract sig StructuralFeature extends Feature {} //optional: Bool
sig Attribute extends StructuralFeature { type: DataType }
sig Key extends LogicalFeature { keyAttr: Attribute }
{
  keyAttr.type in PrimitiveType
}
sig Reference extends LogicalFeature { refAttr: Attribute, refsTo: EntityType }
{
  refAttr.type in PrimitiveType or refAttr.type in PList
}

// TODO: Need to model that an Aggregate can only aggregate variations of the same SchemaType.
// TODO: And that that aggregated variation belongs to a non-root EntityType.
// some a: Aggregate | a.aggregates in variations => root = False
// all a: features | a.aggregates not in variations
sig Aggregate extends StructuralFeature { aggregates: some StructuralVariation }
{
  this not in aggregates.features
}

/////////// DataTypes
//////////////////////
abstract sig DataType {}
{
  all t: DataType | ( one a: Attribute | a.type = t ) or ( one l: PList | l.elementType = t )
}
sig Null extends DataType {}
sig PrimitiveType extends DataType {}
sig PList extends DataType { elementType: PrimitiveType }

sig SchemaTypeName {}{ all n: SchemaTypeName | some st: SchemaType | st.name = n}
sig FeatureName    {}{ all n: FeatureName | some f: Feature | f.name = n}

run {} for 3 but exactly 1 USchema, 0 RelationshipType
//run {} for 10 but exactly 1 USchema, exactly 3 EntityType, 0 RelationshipType, exactly 4 Aggregate

// Obsolete facts with comments
// EntityType {...} {} fact entitiesNotAlone { all e: EntityType | some s: USchema | e in s.entities } equivalent to some s: USchema | this in s.entities
// RelationshipType {...}{ parents in RelationshipType} is equivalent to: fact { all r: RelationshipType, p: r.parents | p in RelationshipType }
// We should model that, if entities exist, there must be at least one ROOT entity.
