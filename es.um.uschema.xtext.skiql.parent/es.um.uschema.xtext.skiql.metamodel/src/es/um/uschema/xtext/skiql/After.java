/**
 */
package es.um.uschema.xtext.skiql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.After#getDateTime <em>Date Time</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getAfter()
 * @model
 * @generated
 */
public interface After extends VersionHistoryOperation {
	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getAfter_DateTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.After#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

} // After
