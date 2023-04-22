/**
 */
package es.um.uschema.xtext.skiql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Between</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.Between#getAfterDateTime <em>After Date Time</em>}</li>
 *   <li>{@link es.um.uschema.xtext.skiql.Between#getBeforeDateTime <em>Before Date Time</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getBetween()
 * @model
 * @generated
 */
public interface Between extends VersionHistoryOperation {
	/**
	 * Returns the value of the '<em><b>After Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Date Time</em>' containment reference.
	 * @see #setAfterDateTime(DateTime)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getBetween_AfterDateTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getAfterDateTime();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.Between#getAfterDateTime <em>After Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Date Time</em>' containment reference.
	 * @see #getAfterDateTime()
	 * @generated
	 */
	void setAfterDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Before Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Date Time</em>' containment reference.
	 * @see #setBeforeDateTime(DateTime)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getBetween_BeforeDateTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getBeforeDateTime();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.Between#getBeforeDateTime <em>Before Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Date Time</em>' containment reference.
	 * @see #getBeforeDateTime()
	 * @generated
	 */
	void setBeforeDateTime(DateTime value);

} // Between
