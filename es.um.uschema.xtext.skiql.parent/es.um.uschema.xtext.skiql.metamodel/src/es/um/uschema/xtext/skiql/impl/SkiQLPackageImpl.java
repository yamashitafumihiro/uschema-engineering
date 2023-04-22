/**
 */
package es.um.uschema.xtext.skiql.impl;

import es.um.uschema.xtext.skiql.After;
import es.um.uschema.xtext.skiql.AggregationSpec;
import es.um.uschema.xtext.skiql.All;
import es.um.uschema.xtext.skiql.Before;
import es.um.uschema.xtext.skiql.Between;
import es.um.uschema.xtext.skiql.DateTime;
import es.um.uschema.xtext.skiql.EntityExpression;
import es.um.uschema.xtext.skiql.EntitySpec;
import es.um.uschema.xtext.skiql.KeysSpec;
import es.um.uschema.xtext.skiql.Operation;
import es.um.uschema.xtext.skiql.PrimitiveType;
import es.um.uschema.xtext.skiql.PropertySpec;
import es.um.uschema.xtext.skiql.Query;
import es.um.uschema.xtext.skiql.ReferenceSpec;
import es.um.uschema.xtext.skiql.RelationSpec;
import es.um.uschema.xtext.skiql.RelationshipExpression;
import es.um.uschema.xtext.skiql.RelationshipQuery;
import es.um.uschema.xtext.skiql.RelationshipSpec;
import es.um.uschema.xtext.skiql.RelationshipType;
import es.um.uschema.xtext.skiql.RelationshipTypeEnum;
import es.um.uschema.xtext.skiql.RelationshipTypeSpec;
import es.um.uschema.xtext.skiql.SchemaQuery;
import es.um.uschema.xtext.skiql.SchemaSpec;
import es.um.uschema.xtext.skiql.SkiQLFactory;
import es.um.uschema.xtext.skiql.SkiQLModel;
import es.um.uschema.xtext.skiql.SkiQLPackage;
import es.um.uschema.xtext.skiql.TargetExpression;
import es.um.uschema.xtext.skiql.Type;
import es.um.uschema.xtext.skiql.TypeEnum;
import es.um.uschema.xtext.skiql.VariationFilter;
import es.um.uschema.xtext.skiql.VersionHistoryOperation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkiQLPackageImpl extends EPackageImpl implements SkiQLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skiQLModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entitySpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionHistoryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betweenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variationFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertySpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keysSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.um.uschema.xtext.skiql.SkiQLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SkiQLPackageImpl() {
		super(eNS_URI, SkiQLFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SkiQLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SkiQLPackage init() {
		if (isInited) return (SkiQLPackage)EPackage.Registry.INSTANCE.getEPackage(SkiQLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSkiQLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SkiQLPackageImpl theSkiQLPackage = registeredSkiQLPackage instanceof SkiQLPackageImpl ? (SkiQLPackageImpl)registeredSkiQLPackage : new SkiQLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSkiQLPackage.createPackageContents();

		// Initialize created meta-data
		theSkiQLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSkiQLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SkiQLPackage.eNS_URI, theSkiQLPackage);
		return theSkiQLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkiQLModel() {
		return skiQLModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkiQLModel_Query() {
		return (EReference)skiQLModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipQuery() {
		return relationshipQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipQuery_From() {
		return (EReference)relationshipQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipQuery_To() {
		return (EReference)relationshipQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaQuery() {
		return schemaQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaQuery_SchemaSpec() {
		return (EReference)schemaQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaQuery_Operation() {
		return (EReference)schemaQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntitySpec() {
		return entitySpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionHistoryOperation() {
		return versionHistoryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBefore() {
		return beforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBefore_DateTime() {
		return (EReference)beforeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAfter() {
		return afterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAfter_DateTime() {
		return (EReference)afterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBetween() {
		return betweenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBetween_AfterDateTime() {
		return (EReference)betweenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBetween_BeforeDateTime() {
		return (EReference)betweenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Day() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Month() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Year() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Hour() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Minutes() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Seconds() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAll() {
		return allEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariationFilter() {
		return variationFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariationFilter_PropertySpecs() {
		return (EReference)variationFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariationFilter_Only() {
		return (EAttribute)variationFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertySpec() {
		return propertySpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertySpec_Name() {
		return (EAttribute)propertySpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertySpec_Type() {
		return (EReference)propertySpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipSpec() {
		return relationshipSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipSpec_TargetExpression() {
		return (EReference)relationshipSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationshipSpec_Indirect() {
		return (EAttribute)relationshipSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipSpec_RelationSpec() {
		return (EReference)relationshipSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggregationSpec() {
		return aggregationSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceSpec() {
		return referenceSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceSpec_VariationFilter() {
		return (EReference)referenceSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetExpression() {
		return targetExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipExpression() {
		return relationshipExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipExpression_RelationshipQuery() {
		return (EReference)relationshipExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityExpression() {
		return entityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityExpression_EntitySpec() {
		return (EReference)entityExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveType_Type() {
		return (EAttribute)primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveType_Array() {
		return (EAttribute)primitiveTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationshipType_TargetEntityName() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationshipType_RelationType() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationSpec() {
		return relationSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationSpec_Name() {
		return (EAttribute)relationSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeysSpec() {
		return keysSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaSpec() {
		return schemaSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaSpec_Name() {
		return (EAttribute)schemaSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaSpec_VariationFilter() {
		return (EReference)schemaSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipTypeSpec() {
		return relationshipTypeSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationshipTypeEnum() {
		return relationshipTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeEnum() {
		return typeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkiQLFactory getSkiQLFactory() {
		return (SkiQLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		skiQLModelEClass = createEClass(SKI_QL_MODEL);
		createEReference(skiQLModelEClass, SKI_QL_MODEL__QUERY);

		queryEClass = createEClass(QUERY);

		relationshipQueryEClass = createEClass(RELATIONSHIP_QUERY);
		createEReference(relationshipQueryEClass, RELATIONSHIP_QUERY__FROM);
		createEReference(relationshipQueryEClass, RELATIONSHIP_QUERY__TO);

		schemaQueryEClass = createEClass(SCHEMA_QUERY);
		createEReference(schemaQueryEClass, SCHEMA_QUERY__SCHEMA_SPEC);
		createEReference(schemaQueryEClass, SCHEMA_QUERY__OPERATION);

		entitySpecEClass = createEClass(ENTITY_SPEC);

		typeEClass = createEClass(TYPE);

		versionHistoryOperationEClass = createEClass(VERSION_HISTORY_OPERATION);

		beforeEClass = createEClass(BEFORE);
		createEReference(beforeEClass, BEFORE__DATE_TIME);

		afterEClass = createEClass(AFTER);
		createEReference(afterEClass, AFTER__DATE_TIME);

		betweenEClass = createEClass(BETWEEN);
		createEReference(betweenEClass, BETWEEN__AFTER_DATE_TIME);
		createEReference(betweenEClass, BETWEEN__BEFORE_DATE_TIME);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__DAY);
		createEAttribute(dateTimeEClass, DATE_TIME__MONTH);
		createEAttribute(dateTimeEClass, DATE_TIME__YEAR);
		createEAttribute(dateTimeEClass, DATE_TIME__HOUR);
		createEAttribute(dateTimeEClass, DATE_TIME__MINUTES);
		createEAttribute(dateTimeEClass, DATE_TIME__SECONDS);

		allEClass = createEClass(ALL);

		variationFilterEClass = createEClass(VARIATION_FILTER);
		createEReference(variationFilterEClass, VARIATION_FILTER__PROPERTY_SPECS);
		createEAttribute(variationFilterEClass, VARIATION_FILTER__ONLY);

		propertySpecEClass = createEClass(PROPERTY_SPEC);
		createEAttribute(propertySpecEClass, PROPERTY_SPEC__NAME);
		createEReference(propertySpecEClass, PROPERTY_SPEC__TYPE);

		operationEClass = createEClass(OPERATION);

		relationshipSpecEClass = createEClass(RELATIONSHIP_SPEC);
		createEReference(relationshipSpecEClass, RELATIONSHIP_SPEC__TARGET_EXPRESSION);
		createEAttribute(relationshipSpecEClass, RELATIONSHIP_SPEC__INDIRECT);
		createEReference(relationshipSpecEClass, RELATIONSHIP_SPEC__RELATION_SPEC);

		aggregationSpecEClass = createEClass(AGGREGATION_SPEC);

		referenceSpecEClass = createEClass(REFERENCE_SPEC);
		createEReference(referenceSpecEClass, REFERENCE_SPEC__VARIATION_FILTER);

		targetExpressionEClass = createEClass(TARGET_EXPRESSION);

		relationshipExpressionEClass = createEClass(RELATIONSHIP_EXPRESSION);
		createEReference(relationshipExpressionEClass, RELATIONSHIP_EXPRESSION__RELATIONSHIP_QUERY);

		entityExpressionEClass = createEClass(ENTITY_EXPRESSION);
		createEReference(entityExpressionEClass, ENTITY_EXPRESSION__ENTITY_SPEC);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__ARRAY);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__TARGET_ENTITY_NAME);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__RELATION_TYPE);

		relationSpecEClass = createEClass(RELATION_SPEC);
		createEAttribute(relationSpecEClass, RELATION_SPEC__NAME);

		keysSpecEClass = createEClass(KEYS_SPEC);

		schemaSpecEClass = createEClass(SCHEMA_SPEC);
		createEAttribute(schemaSpecEClass, SCHEMA_SPEC__NAME);
		createEReference(schemaSpecEClass, SCHEMA_SPEC__VARIATION_FILTER);

		relationshipTypeSpecEClass = createEClass(RELATIONSHIP_TYPE_SPEC);

		// Create enums
		relationshipTypeEnumEEnum = createEEnum(RELATIONSHIP_TYPE_ENUM);
		typeEnumEEnum = createEEnum(TYPE_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationshipQueryEClass.getESuperTypes().add(this.getQuery());
		schemaQueryEClass.getESuperTypes().add(this.getQuery());
		entitySpecEClass.getESuperTypes().add(this.getSchemaSpec());
		versionHistoryOperationEClass.getESuperTypes().add(this.getOperation());
		beforeEClass.getESuperTypes().add(this.getVersionHistoryOperation());
		afterEClass.getESuperTypes().add(this.getVersionHistoryOperation());
		betweenEClass.getESuperTypes().add(this.getVersionHistoryOperation());
		allEClass.getESuperTypes().add(this.getVersionHistoryOperation());
		aggregationSpecEClass.getESuperTypes().add(this.getRelationSpec());
		referenceSpecEClass.getESuperTypes().add(this.getRelationSpec());
		relationshipExpressionEClass.getESuperTypes().add(this.getTargetExpression());
		entityExpressionEClass.getESuperTypes().add(this.getTargetExpression());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		relationshipTypeEClass.getESuperTypes().add(this.getType());
		keysSpecEClass.getESuperTypes().add(this.getOperation());
		relationshipTypeSpecEClass.getESuperTypes().add(this.getSchemaSpec());

		// Initialize classes, features, and operations; add parameters
		initEClass(skiQLModelEClass, SkiQLModel.class, "SkiQLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkiQLModel_Query(), this.getQuery(), null, "query", null, 1, 1, SkiQLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipQueryEClass, RelationshipQuery.class, "RelationshipQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipQuery_From(), this.getEntitySpec(), null, "from", null, 1, 1, RelationshipQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipQuery_To(), this.getRelationshipSpec(), null, "to", null, 1, -1, RelationshipQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaQueryEClass, SchemaQuery.class, "SchemaQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaQuery_SchemaSpec(), this.getSchemaSpec(), null, "schemaSpec", null, 1, 1, SchemaQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaQuery_Operation(), this.getOperation(), null, "operation", null, 0, 1, SchemaQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entitySpecEClass, EntitySpec.class, "EntitySpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionHistoryOperationEClass, VersionHistoryOperation.class, "VersionHistoryOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beforeEClass, Before.class, "Before", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBefore_DateTime(), this.getDateTime(), null, "dateTime", null, 1, 1, Before.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afterEClass, After.class, "After", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAfter_DateTime(), this.getDateTime(), null, "dateTime", null, 1, 1, After.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betweenEClass, Between.class, "Between", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBetween_AfterDateTime(), this.getDateTime(), null, "afterDateTime", null, 1, 1, Between.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBetween_BeforeDateTime(), this.getDateTime(), null, "beforeDateTime", null, 1, 1, Between.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Day(), theXMLTypePackage.getInt(), "day", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Month(), theXMLTypePackage.getInt(), "month", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Year(), theXMLTypePackage.getInt(), "year", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Hour(), theXMLTypePackage.getInt(), "hour", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Minutes(), theXMLTypePackage.getInt(), "minutes", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Seconds(), theXMLTypePackage.getInt(), "seconds", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allEClass, All.class, "All", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variationFilterEClass, VariationFilter.class, "VariationFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariationFilter_PropertySpecs(), this.getPropertySpec(), null, "propertySpecs", null, 1, -1, VariationFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariationFilter_Only(), theXMLTypePackage.getBoolean(), "only", null, 0, 1, VariationFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertySpecEClass, PropertySpec.class, "PropertySpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertySpec_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertySpec_Type(), this.getType(), null, "type", null, 0, 1, PropertySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipSpecEClass, RelationshipSpec.class, "RelationshipSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipSpec_TargetExpression(), this.getTargetExpression(), null, "targetExpression", null, 1, 1, RelationshipSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipSpec_Indirect(), theXMLTypePackage.getBoolean(), "indirect", null, 0, 1, RelationshipSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipSpec_RelationSpec(), this.getRelationSpec(), null, "relationSpec", null, 0, 1, RelationshipSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationSpecEClass, AggregationSpec.class, "AggregationSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceSpecEClass, ReferenceSpec.class, "ReferenceSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceSpec_VariationFilter(), this.getVariationFilter(), null, "variationFilter", null, 0, 1, ReferenceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetExpressionEClass, TargetExpression.class, "TargetExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipExpressionEClass, RelationshipExpression.class, "RelationshipExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipExpression_RelationshipQuery(), this.getRelationshipQuery(), null, "relationshipQuery", null, 1, 1, RelationshipExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityExpressionEClass, EntityExpression.class, "EntityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityExpression_EntitySpec(), this.getEntitySpec(), null, "entitySpec", null, 1, 1, EntityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_Type(), this.getTypeEnum(), "type", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimitiveType_Array(), theXMLTypePackage.getBoolean(), "array", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipType_TargetEntityName(), ecorePackage.getEString(), "targetEntityName", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipType_RelationType(), this.getRelationshipTypeEnum(), "relationType", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationSpecEClass, RelationSpec.class, "RelationSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationSpec_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keysSpecEClass, KeysSpec.class, "KeysSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schemaSpecEClass, SchemaSpec.class, "SchemaSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaSpec_Name(), ecorePackage.getEString(), "name", null, 0, 1, SchemaSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaSpec_VariationFilter(), this.getVariationFilter(), null, "variationFilter", null, 0, 1, SchemaSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTypeSpecEClass, RelationshipTypeSpec.class, "RelationshipTypeSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(relationshipTypeEnumEEnum, RelationshipTypeEnum.class, "RelationshipTypeEnum");
		addEEnumLiteral(relationshipTypeEnumEEnum, RelationshipTypeEnum.RELATIONSHIP);
		addEEnumLiteral(relationshipTypeEnumEEnum, RelationshipTypeEnum.REFERENCE);
		addEEnumLiteral(relationshipTypeEnumEEnum, RelationshipTypeEnum.AGGREGATION);

		initEEnum(typeEnumEEnum, TypeEnum.class, "TypeEnum");
		addEEnumLiteral(typeEnumEEnum, TypeEnum.STRING);
		addEEnumLiteral(typeEnumEEnum, TypeEnum.NUMBER);
		addEEnumLiteral(typeEnumEEnum, TypeEnum.BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //SkiQLPackageImpl
