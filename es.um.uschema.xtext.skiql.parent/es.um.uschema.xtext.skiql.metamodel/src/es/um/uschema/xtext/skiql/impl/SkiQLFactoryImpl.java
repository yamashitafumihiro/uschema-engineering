/**
 */
package es.um.uschema.xtext.skiql.impl;

import es.um.uschema.xtext.skiql.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkiQLFactoryImpl extends EFactoryImpl implements SkiQLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SkiQLFactory init() {
		try {
			SkiQLFactory theSkiQLFactory = (SkiQLFactory)EPackage.Registry.INSTANCE.getEFactory(SkiQLPackage.eNS_URI);
			if (theSkiQLFactory != null) {
				return theSkiQLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SkiQLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkiQLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SkiQLPackage.SKI_QL_MODEL: return createSkiQLModel();
			case SkiQLPackage.RELATIONSHIP_QUERY: return createRelationshipQuery();
			case SkiQLPackage.SCHEMA_QUERY: return createSchemaQuery();
			case SkiQLPackage.ENTITY_SPEC: return createEntitySpec();
			case SkiQLPackage.BEFORE: return createBefore();
			case SkiQLPackage.AFTER: return createAfter();
			case SkiQLPackage.BETWEEN: return createBetween();
			case SkiQLPackage.DATE_TIME: return createDateTime();
			case SkiQLPackage.ALL: return createAll();
			case SkiQLPackage.VARIATION_FILTER: return createVariationFilter();
			case SkiQLPackage.PROPERTY_SPEC: return createPropertySpec();
			case SkiQLPackage.RELATIONSHIP_SPEC: return createRelationshipSpec();
			case SkiQLPackage.AGGREGATION_SPEC: return createAggregationSpec();
			case SkiQLPackage.REFERENCE_SPEC: return createReferenceSpec();
			case SkiQLPackage.RELATIONSHIP_EXPRESSION: return createRelationshipExpression();
			case SkiQLPackage.ENTITY_EXPRESSION: return createEntityExpression();
			case SkiQLPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case SkiQLPackage.RELATIONSHIP_TYPE: return createRelationshipType();
			case SkiQLPackage.RELATION_SPEC: return createRelationSpec();
			case SkiQLPackage.KEYS_SPEC: return createKeysSpec();
			case SkiQLPackage.SCHEMA_SPEC: return createSchemaSpec();
			case SkiQLPackage.RELATIONSHIP_TYPE_SPEC: return createRelationshipTypeSpec();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SkiQLPackage.RELATIONSHIP_TYPE_ENUM:
				return createRelationshipTypeEnumFromString(eDataType, initialValue);
			case SkiQLPackage.TYPE_ENUM:
				return createTypeEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SkiQLPackage.RELATIONSHIP_TYPE_ENUM:
				return convertRelationshipTypeEnumToString(eDataType, instanceValue);
			case SkiQLPackage.TYPE_ENUM:
				return convertTypeEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkiQLModel createSkiQLModel() {
		SkiQLModelImpl skiQLModel = new SkiQLModelImpl();
		return skiQLModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipQuery createRelationshipQuery() {
		RelationshipQueryImpl relationshipQuery = new RelationshipQueryImpl();
		return relationshipQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaQuery createSchemaQuery() {
		SchemaQueryImpl schemaQuery = new SchemaQueryImpl();
		return schemaQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitySpec createEntitySpec() {
		EntitySpecImpl entitySpec = new EntitySpecImpl();
		return entitySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Before createBefore() {
		BeforeImpl before = new BeforeImpl();
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public After createAfter() {
		AfterImpl after = new AfterImpl();
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Between createBetween() {
		BetweenImpl between = new BetweenImpl();
		return between;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public All createAll() {
		AllImpl all = new AllImpl();
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariationFilter createVariationFilter() {
		VariationFilterImpl variationFilter = new VariationFilterImpl();
		return variationFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertySpec createPropertySpec() {
		PropertySpecImpl propertySpec = new PropertySpecImpl();
		return propertySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipSpec createRelationshipSpec() {
		RelationshipSpecImpl relationshipSpec = new RelationshipSpecImpl();
		return relationshipSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregationSpec createAggregationSpec() {
		AggregationSpecImpl aggregationSpec = new AggregationSpecImpl();
		return aggregationSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceSpec createReferenceSpec() {
		ReferenceSpecImpl referenceSpec = new ReferenceSpecImpl();
		return referenceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipExpression createRelationshipExpression() {
		RelationshipExpressionImpl relationshipExpression = new RelationshipExpressionImpl();
		return relationshipExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityExpression createEntityExpression() {
		EntityExpressionImpl entityExpression = new EntityExpressionImpl();
		return entityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationSpec createRelationSpec() {
		RelationSpecImpl relationSpec = new RelationSpecImpl();
		return relationSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeysSpec createKeysSpec() {
		KeysSpecImpl keysSpec = new KeysSpecImpl();
		return keysSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaSpec createSchemaSpec() {
		SchemaSpecImpl schemaSpec = new SchemaSpecImpl();
		return schemaSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipTypeSpec createRelationshipTypeSpec() {
		RelationshipTypeSpecImpl relationshipTypeSpec = new RelationshipTypeSpecImpl();
		return relationshipTypeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTypeEnum createRelationshipTypeEnumFromString(EDataType eDataType, String initialValue) {
		RelationshipTypeEnum result = RelationshipTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEnum createTypeEnumFromString(EDataType eDataType, String initialValue) {
		TypeEnum result = TypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkiQLPackage getSkiQLPackage() {
		return (SkiQLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SkiQLPackage getPackage() {
		return SkiQLPackage.eINSTANCE;
	}

} //SkiQLFactoryImpl
