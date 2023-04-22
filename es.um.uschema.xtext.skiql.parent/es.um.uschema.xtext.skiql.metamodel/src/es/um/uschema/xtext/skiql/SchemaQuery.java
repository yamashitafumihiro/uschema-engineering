/**
 */
package es.um.uschema.xtext.skiql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.SchemaQuery#getSchemaSpec <em>Schema Spec</em>}</li>
 *   <li>{@link es.um.uschema.xtext.skiql.SchemaQuery#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getSchemaQuery()
 * @model
 * @generated
 */
public interface SchemaQuery extends Query {
	/**
	 * Returns the value of the '<em><b>Schema Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Spec</em>' containment reference.
	 * @see #setSchemaSpec(SchemaSpec)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getSchemaQuery_SchemaSpec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SchemaSpec getSchemaSpec();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.SchemaQuery#getSchemaSpec <em>Schema Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Spec</em>' containment reference.
	 * @see #getSchemaSpec()
	 * @generated
	 */
	void setSchemaSpec(SchemaSpec value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getSchemaQuery_Operation()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.SchemaQuery#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // SchemaQuery
