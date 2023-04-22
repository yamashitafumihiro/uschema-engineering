/**
 */
package es.um.uschema.xtext.skiql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.RelationshipType#getTargetEntityName <em>Target Entity Name</em>}</li>
 *   <li>{@link es.um.uschema.xtext.skiql.RelationshipType#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getRelationshipType()
 * @model
 * @generated
 */
public interface RelationshipType extends Type {
	/**
	 * Returns the value of the '<em><b>Target Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity Name</em>' attribute.
	 * @see #setTargetEntityName(String)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getRelationshipType_TargetEntityName()
	 * @model
	 * @generated
	 */
	String getTargetEntityName();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.RelationshipType#getTargetEntityName <em>Target Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity Name</em>' attribute.
	 * @see #getTargetEntityName()
	 * @generated
	 */
	void setTargetEntityName(String value);

	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.uschema.xtext.skiql.RelationshipTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' attribute.
	 * @see es.um.uschema.xtext.skiql.RelationshipTypeEnum
	 * @see #setRelationType(RelationshipTypeEnum)
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#getRelationshipType_RelationType()
	 * @model
	 * @generated
	 */
	RelationshipTypeEnum getRelationType();

	/**
	 * Sets the value of the '{@link es.um.uschema.xtext.skiql.RelationshipType#getRelationType <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' attribute.
	 * @see es.um.uschema.xtext.skiql.RelationshipTypeEnum
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(RelationshipTypeEnum value);

} // RelationshipType
