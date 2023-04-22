/**
 */
package es.um.uschema.xtext.skiql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.SkiQLModel#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getSkiQLModel()
 * @model
 * @generated
 */
public interface SkiQLModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getSkiQLModel_Query()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.SkiQLModel#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

} // SkiQLModel
