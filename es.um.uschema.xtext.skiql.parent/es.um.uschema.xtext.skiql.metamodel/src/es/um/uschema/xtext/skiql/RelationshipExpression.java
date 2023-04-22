/**
 */
package es.um.uschema.xtext.skiql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.RelationshipExpression#getRelationshipQuery <em>Relationship Query</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getRelationshipExpression()
 * @model
 * @generated
 */
public interface RelationshipExpression extends TargetExpression {
	/**
	 * Returns the value of the '<em><b>Relationship Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Query</em>' containment reference.
	 * @see #setRelationshipQuery(RelationshipQuery)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getRelationshipExpression_RelationshipQuery()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelationshipQuery getRelationshipQuery();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.RelationshipExpression#getRelationshipQuery <em>Relationship Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Query</em>' containment reference.
	 * @see #getRelationshipQuery()
	 * @generated
	 */
	void setRelationshipQuery(RelationshipQuery value);

} // RelationshipExpression
