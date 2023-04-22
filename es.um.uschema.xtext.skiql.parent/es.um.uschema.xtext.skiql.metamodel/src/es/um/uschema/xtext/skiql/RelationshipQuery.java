/**
 */
package es.um.uschema.xtext.skiql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.RelationshipQuery#getFrom <em>From</em>}</li>
 *   <li>{@link es.um.uschema.xtext.skiql.RelationshipQuery#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getRelationshipQuery()
 * @model
 * @generated
 */
public interface RelationshipQuery extends Query {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(EntitySpec)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getRelationshipQuery_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntitySpec getFrom();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.RelationshipQuery#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EntitySpec value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.xtext.skiql.RelationshipSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference list.
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getRelationshipQuery_To()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelationshipSpec> getTo();

} // RelationshipQuery
