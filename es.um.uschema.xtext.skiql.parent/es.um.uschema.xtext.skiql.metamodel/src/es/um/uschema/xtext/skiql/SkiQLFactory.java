/**
 */
package es.um.uschema.xtext.skiql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.um.uschema.xtext.skiql.SkiQLPackage
 * @generated
 */
public interface SkiQLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkiQLFactory eINSTANCE = es.um.uschema.xtext.skiql.impl.SkiQLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	SkiQLModel createSkiQLModel();

	/**
	 * Returns a new object of class '<em>Relationship Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Query</em>'.
	 * @generated
	 */
	RelationshipQuery createRelationshipQuery();

	/**
	 * Returns a new object of class '<em>Schema Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Query</em>'.
	 * @generated
	 */
	SchemaQuery createSchemaQuery();

	/**
	 * Returns a new object of class '<em>Entity Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Spec</em>'.
	 * @generated
	 */
	EntitySpec createEntitySpec();

	/**
	 * Returns a new object of class '<em>Before</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Before</em>'.
	 * @generated
	 */
	Before createBefore();

	/**
	 * Returns a new object of class '<em>After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After</em>'.
	 * @generated
	 */
	After createAfter();

	/**
	 * Returns a new object of class '<em>Between</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Between</em>'.
	 * @generated
	 */
	Between createBetween();

	/**
	 * Returns a new object of class '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time</em>'.
	 * @generated
	 */
	DateTime createDateTime();

	/**
	 * Returns a new object of class '<em>All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All</em>'.
	 * @generated
	 */
	All createAll();

	/**
	 * Returns a new object of class '<em>Variation Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variation Filter</em>'.
	 * @generated
	 */
	VariationFilter createVariationFilter();

	/**
	 * Returns a new object of class '<em>Property Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Spec</em>'.
	 * @generated
	 */
	PropertySpec createPropertySpec();

	/**
	 * Returns a new object of class '<em>Relationship Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Spec</em>'.
	 * @generated
	 */
	RelationshipSpec createRelationshipSpec();

	/**
	 * Returns a new object of class '<em>Aggregation Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Spec</em>'.
	 * @generated
	 */
	AggregationSpec createAggregationSpec();

	/**
	 * Returns a new object of class '<em>Reference Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Spec</em>'.
	 * @generated
	 */
	ReferenceSpec createReferenceSpec();

	/**
	 * Returns a new object of class '<em>Relationship Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Expression</em>'.
	 * @generated
	 */
	RelationshipExpression createRelationshipExpression();

	/**
	 * Returns a new object of class '<em>Entity Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Expression</em>'.
	 * @generated
	 */
	EntityExpression createEntityExpression();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Type</em>'.
	 * @generated
	 */
	RelationshipType createRelationshipType();

	/**
	 * Returns a new object of class '<em>Relation Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Spec</em>'.
	 * @generated
	 */
	RelationSpec createRelationSpec();

	/**
	 * Returns a new object of class '<em>Keys Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keys Spec</em>'.
	 * @generated
	 */
	KeysSpec createKeysSpec();

	/**
	 * Returns a new object of class '<em>Schema Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Spec</em>'.
	 * @generated
	 */
	SchemaSpec createSchemaSpec();

	/**
	 * Returns a new object of class '<em>Relationship Type Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Type Spec</em>'.
	 * @generated
	 */
	RelationshipTypeSpec createRelationshipTypeSpec();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SkiQLPackage getSkiQLPackage();

} //SkiQLFactory
