module es_um_unosql_SkiQL
open util/boolean

some sig SkiQLModel {
	query: disj Query
}

abstract sig Query { } 
{
	all q: Query | some sql:SkiQLModel | q in sql.query
}

////////////////////////////////////////////////////
/////// SchemaQuery
////////////////////////////////////////////////////
sig SchemaQuery extends Query {
	schemaSpec: disj SchemaSpec,
	operation: disj lone Operation
}

abstract sig SchemaSpec  extends NamedElement  {
	variationFilter: disj some VariationFilter
}

sig EntitySpec extends SchemaSpec { }
{
	EntitySpec in RelationshipQuery.from or EntitySpec in EntityExpression.entitySpec or EntitySpec in SchemaQuery.schemaSpec 
}

sig RelationshipTypeSpec extends SchemaSpec { }
{
	all  rts: RelationshipTypeSpec | some sq:SchemaQuery | rts in sq.schemaSpec
}

////////////////////////////////////////////////////
/////// VariationFilter
////////////////////////////////////////////////////
sig VariationFilter {
	only: Bool,
	propertySpecs: some PropertySpec
}
{
	VariationFilter in SchemaSpec.variationFilter or VariationFilter in ReferenceSpec.variationFilter
}

sig PropertySpec {
	name: StringName,
	type: lone Type
}
{
	all  ps:PropertySpec | some vf:VariationFilter | ps in vf. propertySpecs
}

/////// Types
abstract sig Type { }
{
	all t:Type | some ps: PropertySpec | t in ps.type  
}

sig PrimitiveType extends Type {
	type: types,
	array: Bool
}

sig RelationshipType extends Type {
	targetEntityName: StringName,
	relationType: relationshipTypes
}

enum types { StringType, NumberType, BooleanType }
enum relationshipTypes { Relationship, Reference, Aggregation }

/////// Operations
abstract sig Operation { }
{
	all  o: Operation | some sq:SchemaQuery | o in sq. operation
}

abstract sig VersionHistroyOperation extends Operation { }

sig All extends VersionHistroyOperation { }

sig After extends VersionHistroyOperation { dateTime: DateTime }

sig Before extends VersionHistroyOperation { dateTime: DateTime }

sig Between extends VersionHistroyOperation { afterDateTime: DateTime,  beforeDateTime: DateTime }

sig DateTime { day: Int, month: Int, year: Int, hour: Int, minutes: Int, seconds: Int }
{
	DateTime in After.dateTime or DateTime in Before.dateTime or DateTime in Between.afterDateTime or DateTime in Between.beforeDateTime 
}


////////////////////////////////////////////////////
/////// RelationshipQuery
////////////////////////////////////////////////////
sig RelationshipQuery extends Query {
	to: disj RelationshipSpec,
	from: disj some EntitySpec
}
{
	no rq: RelationshipQuery | rq in rq.@to.targetExpression.relationshipQuery
}

abstract sig RelationshipSpec {
	indirect: Bool,
	targetExpression: TargetExpression,
	relationSpec: lone RelationSpec
}
{
	all rs: RelationshipSpec | some rq:RelationshipQuery | rs in rq.to
}

sig RelationSpec extends NamedElement { }
{
	AggregationSpec + ReferenceSpec = RelationSpec
	all rs:RelationSpec | some rts:RelationshipSpec | rs in rts.relationSpec
}

sig AggregationSpec extends RelationSpec { }

sig ReferenceSpec  extends RelationSpec  {
	variationFilter: some VariationFilter
}

/////// TargetExpression
abstract sig TargetExpression { }
{
	all te: TargetExpression | some rs:RelationshipSpec | te in rs.targetExpression
}

sig RelationshipExpression extends TargetExpression {
	relationshipQuery: RelationshipQuery
}

sig EntityExpression extends TargetExpression {
	entitySpec: disj EntitySpec
}

abstract sig NamedElement {
	name: disj StringName
}

sig StringName { }
{
	all q:StringName | some t:NamedElement | q in t.name
}

run {} for 10 but 1 RelationshipQuery, 1 SchemaQuery
