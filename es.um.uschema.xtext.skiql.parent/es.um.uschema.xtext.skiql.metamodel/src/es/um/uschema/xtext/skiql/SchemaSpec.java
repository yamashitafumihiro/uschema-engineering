/**
 */
package es.um.uschema.xtext.skiql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.SchemaSpec#getName <em>Name</em>}</li>
 *   <li>{@link es.um.uschema.xtext.skiql.SchemaSpec#getVariationFilter <em>Variation Filter</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getSchemaSpec()
 * @model
 * @generated
 */
public interface SchemaSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getSchemaSpec_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.SchemaSpec#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variation Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variation Filter</em>' containment reference.
	 * @see #setVariationFilter(VariationFilter)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getSchemaSpec_VariationFilter()
	 * @model containment="true"
	 * @generated
	 */
	VariationFilter getVariationFilter();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.SchemaSpec#getVariationFilter <em>Variation Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variation Filter</em>' containment reference.
	 * @see #getVariationFilter()
	 * @generated
	 */
	void setVariationFilter(VariationFilter value);

} // SchemaSpec
