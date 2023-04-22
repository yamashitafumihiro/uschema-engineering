/**
 */
package es.um.uschema.xtext.skiql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.EntityExpression#getEntitySpec <em>Entity Spec</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getEntityExpression()
 * @model
 * @generated
 */
public interface EntityExpression extends TargetExpression {
	/**
	 * Returns the value of the '<em><b>Entity Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Spec</em>' containment reference.
	 * @see #setEntitySpec(EntitySpec)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getEntityExpression_EntitySpec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntitySpec getEntitySpec();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.EntityExpression#getEntitySpec <em>Entity Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Spec</em>' containment reference.
	 * @see #getEntitySpec()
	 * @generated
	 */
	void setEntitySpec(EntitySpec value);

} // EntityExpression
