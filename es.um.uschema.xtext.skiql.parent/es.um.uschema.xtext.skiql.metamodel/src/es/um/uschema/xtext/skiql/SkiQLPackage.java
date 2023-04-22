/**
 */
package es.um.uschema.xtext.skiql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.um.uschema.xtext.skiql.SkiQLFactory
 * @model kind="package"
 * @generated
 */
public interface SkiQLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "skiql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.um.es/uschema/xtext/SkiQL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "skiql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkiQLPackage eINSTANCE = es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.SkiQLModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLModelImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getSkiQLModel()
	 * @generated
	 */
	int SKI_QL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKI_QL_MODEL__QUERY = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKI_QL_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKI_QL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.QueryImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipQueryImpl <em>Relationship Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.RelationshipQueryImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipQuery()
	 * @generated
	 */
	int RELATIONSHIP_QUERY = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_QUERY__FROM = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_QUERY__TO = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.SchemaQueryImpl <em>Schema Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.SchemaQueryImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getSchemaQuery()
	 * @generated
	 */
	int SCHEMA_QUERY = 3;

	/**
	 * The feature id for the '<em><b>Schema Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_QUERY__SCHEMA_SPEC = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_QUERY__OPERATION = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schema Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schema Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.SchemaSpecImpl <em>Schema Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.SchemaSpecImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getSchemaSpec()
	 * @generated
	 */
	int SCHEMA_SPEC = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_SPEC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variation Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_SPEC__VARIATION_FILTER = 1;

	/**
	 * The number of structural features of the '<em>Schema Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_SPEC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.EntitySpecImpl <em>Entity Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.EntitySpecImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getEntitySpec()
	 * @generated
	 */
	int ENTITY_SPEC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SPEC__NAME = SCHEMA_SPEC__NAME;

	/**
	 * The feature id for the '<em><b>Variation Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SPEC__VARIATION_FILTER = SCHEMA_SPEC__VARIATION_FILTER;

	/**
	 * The number of structural features of the '<em>Entity Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SPEC_FEATURE_COUNT = SCHEMA_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SPEC_OPERATION_COUNT = SCHEMA_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.TypeImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.OperationImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 14;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.VersionHistoryOperationImpl <em>Version History Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.VersionHistoryOperationImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getVersionHistoryOperation()
	 * @generated
	 */
	int VERSION_HISTORY_OPERATION = 6;

	/**
	 * The number of structural features of the '<em>Version History Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_HISTORY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Version History Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_HISTORY_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.BeforeImpl <em>Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.BeforeImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getBefore()
	 * @generated
	 */
	int BEFORE = 7;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__DATE_TIME = VERSION_HISTORY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_FEATURE_COUNT = VERSION_HISTORY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_OPERATION_COUNT = VERSION_HISTORY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.AfterImpl <em>After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.AfterImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getAfter()
	 * @generated
	 */
	int AFTER = 8;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__DATE_TIME = VERSION_HISTORY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_FEATURE_COUNT = VERSION_HISTORY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_OPERATION_COUNT = VERSION_HISTORY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.BetweenImpl <em>Between</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.BetweenImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getBetween()
	 * @generated
	 */
	int BETWEEN = 9;

	/**
	 * The feature id for the '<em><b>After Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN__AFTER_DATE_TIME = VERSION_HISTORY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Before Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN__BEFORE_DATE_TIME = VERSION_HISTORY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN_FEATURE_COUNT = VERSION_HISTORY_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN_OPERATION_COUNT = VERSION_HISTORY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.DateTimeImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 10;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__DAY = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MONTH = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__YEAR = 2;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__HOUR = 3;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MINUTES = 4;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__SECONDS = 5;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.AllImpl <em>All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.AllImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getAll()
	 * @generated
	 */
	int ALL = 11;

	/**
	 * The number of structural features of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FEATURE_COUNT = VERSION_HISTORY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OPERATION_COUNT = VERSION_HISTORY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.VariationFilterImpl <em>Variation Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.VariationFilterImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getVariationFilter()
	 * @generated
	 */
	int VARIATION_FILTER = 12;

	/**
	 * The feature id for the '<em><b>Property Specs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_FILTER__PROPERTY_SPECS = 0;

	/**
	 * The feature id for the '<em><b>Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_FILTER__ONLY = 1;

	/**
	 * The number of structural features of the '<em>Variation Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variation Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.PropertySpecImpl <em>Property Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.PropertySpecImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getPropertySpec()
	 * @generated
	 */
	int PROPERTY_SPEC = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPEC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPEC__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Property Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPEC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipSpecImpl <em>Relationship Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.RelationshipSpecImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipSpec()
	 * @generated
	 */
	int RELATIONSHIP_SPEC = 15;

	/**
	 * The feature id for the '<em><b>Target Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_SPEC__TARGET_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Indirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_SPEC__INDIRECT = 1;

	/**
	 * The feature id for the '<em><b>Relation Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_SPEC__RELATION_SPEC = 2;

	/**
	 * The number of structural features of the '<em>Relationship Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_SPEC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.RelationSpecImpl <em>Relation Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.RelationSpecImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationSpec()
	 * @generated
	 */
	int RELATION_SPEC = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SPEC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Relation Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SPEC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relation Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.AggregationSpecImpl <em>Aggregation Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.AggregationSpecImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getAggregationSpec()
	 * @generated
	 */
	int AGGREGATION_SPEC = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_SPEC__NAME = RELATION_SPEC__NAME;

	/**
	 * The number of structural features of the '<em>Aggregation Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_SPEC_FEATURE_COUNT = RELATION_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregation Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_SPEC_OPERATION_COUNT = RELATION_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.ReferenceSpecImpl <em>Reference Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.ReferenceSpecImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getReferenceSpec()
	 * @generated
	 */
	int REFERENCE_SPEC = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SPEC__NAME = RELATION_SPEC__NAME;

	/**
	 * The feature id for the '<em><b>Variation Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SPEC__VARIATION_FILTER = RELATION_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SPEC_FEATURE_COUNT = RELATION_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SPEC_OPERATION_COUNT = RELATION_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.TargetExpressionImpl <em>Target Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.TargetExpressionImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getTargetExpression()
	 * @generated
	 */
	int TARGET_EXPRESSION = 18;

	/**
	 * The number of structural features of the '<em>Target Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Target Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipExpressionImpl <em>Relationship Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.RelationshipExpressionImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipExpression()
	 * @generated
	 */
	int RELATIONSHIP_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Relationship Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXPRESSION__RELATIONSHIP_QUERY = TARGET_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXPRESSION_FEATURE_COUNT = TARGET_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relationship Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXPRESSION_OPERATION_COUNT = TARGET_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.EntityExpressionImpl <em>Entity Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.EntityExpressionImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getEntityExpression()
	 * @generated
	 */
	int ENTITY_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Entity Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXPRESSION__ENTITY_SPEC = TARGET_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXPRESSION_FEATURE_COUNT = TARGET_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXPRESSION_OPERATION_COUNT = TARGET_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.PrimitiveTypeImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ARRAY = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.RelationshipTypeImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Target Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__TARGET_ENTITY_NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__RELATION_TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.KeysSpecImpl <em>Keys Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.KeysSpecImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getKeysSpec()
	 * @generated
	 */
	int KEYS_SPEC = 24;

	/**
	 * The number of structural features of the '<em>Keys Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_SPEC_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Keys Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_SPEC_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipTypeSpecImpl <em>Relationship Type Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.impl.RelationshipTypeSpecImpl
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipTypeSpec()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_SPEC = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_SPEC__NAME = SCHEMA_SPEC__NAME;

	/**
	 * The feature id for the '<em><b>Variation Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_SPEC__VARIATION_FILTER = SCHEMA_SPEC__VARIATION_FILTER;

	/**
	 * The number of structural features of the '<em>Relationship Type Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_SPEC_FEATURE_COUNT = SCHEMA_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship Type Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_SPEC_OPERATION_COUNT = SCHEMA_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.RelationshipTypeEnum <em>Relationship Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.RelationshipTypeEnum
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipTypeEnum()
	 * @generated
	 */
	int RELATIONSHIP_TYPE_ENUM = 27;

	/**
	 * The meta object id for the '{@link es.um.uschema.xtext.skiql.TypeEnum <em>Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.xtext.skiql.TypeEnum
	 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getTypeEnum()
	 * @generated
	 */
	int TYPE_ENUM = 28;


	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.SkiQLModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see es.um.uschema.xtext.skiql.SkiQLModel
	 * @generated
	 */
	EClass getSkiQLModel();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.SkiQLModel#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see es.um.uschema.xtext.skiql.SkiQLModel#getQuery()
	 * @see #getSkiQLModel()
	 * @generated
	 */
	EReference getSkiQLModel_Query();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see es.um.uschema.xtext.skiql.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.RelationshipQuery <em>Relationship Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Query</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipQuery
	 * @generated
	 */
	EClass getRelationshipQuery();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.RelationshipQuery#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipQuery#getFrom()
	 * @see #getRelationshipQuery()
	 * @generated
	 */
	EReference getRelationshipQuery_From();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.xtext.skiql.RelationshipQuery#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipQuery#getTo()
	 * @see #getRelationshipQuery()
	 * @generated
	 */
	EReference getRelationshipQuery_To();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.SchemaQuery <em>Schema Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Query</em>'.
	 * @see es.um.uschema.xtext.skiql.SchemaQuery
	 * @generated
	 */
	EClass getSchemaQuery();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.SchemaQuery#getSchemaSpec <em>Schema Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.SchemaQuery#getSchemaSpec()
	 * @see #getSchemaQuery()
	 * @generated
	 */
	EReference getSchemaQuery_SchemaSpec();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.SchemaQuery#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see es.um.uschema.xtext.skiql.SchemaQuery#getOperation()
	 * @see #getSchemaQuery()
	 * @generated
	 */
	EReference getSchemaQuery_Operation();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.EntitySpec <em>Entity Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.EntitySpec
	 * @generated
	 */
	EClass getEntitySpec();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see es.um.uschema.xtext.skiql.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.VersionHistoryOperation <em>Version History Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version History Operation</em>'.
	 * @see es.um.uschema.xtext.skiql.VersionHistoryOperation
	 * @generated
	 */
	EClass getVersionHistoryOperation();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before</em>'.
	 * @see es.um.uschema.xtext.skiql.Before
	 * @generated
	 */
	EClass getBefore();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.Before#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time</em>'.
	 * @see es.um.uschema.xtext.skiql.Before#getDateTime()
	 * @see #getBefore()
	 * @generated
	 */
	EReference getBefore_DateTime();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After</em>'.
	 * @see es.um.uschema.xtext.skiql.After
	 * @generated
	 */
	EClass getAfter();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.After#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time</em>'.
	 * @see es.um.uschema.xtext.skiql.After#getDateTime()
	 * @see #getAfter()
	 * @generated
	 */
	EReference getAfter_DateTime();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.Between <em>Between</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Between</em>'.
	 * @see es.um.uschema.xtext.skiql.Between
	 * @generated
	 */
	EClass getBetween();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.Between#getAfterDateTime <em>After Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After Date Time</em>'.
	 * @see es.um.uschema.xtext.skiql.Between#getAfterDateTime()
	 * @see #getBetween()
	 * @generated
	 */
	EReference getBetween_AfterDateTime();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.Between#getBeforeDateTime <em>Before Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before Date Time</em>'.
	 * @see es.um.uschema.xtext.skiql.Between#getBeforeDateTime()
	 * @see #getBetween()
	 * @generated
	 */
	EReference getBetween_BeforeDateTime();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see es.um.uschema.xtext.skiql.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.DateTime#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see es.um.uschema.xtext.skiql.DateTime#getDay()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Day();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.DateTime#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see es.um.uschema.xtext.skiql.DateTime#getMonth()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Month();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.DateTime#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see es.um.uschema.xtext.skiql.DateTime#getYear()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Year();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.DateTime#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see es.um.uschema.xtext.skiql.DateTime#getHour()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Hour();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.DateTime#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see es.um.uschema.xtext.skiql.DateTime#getMinutes()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Minutes();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.DateTime#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see es.um.uschema.xtext.skiql.DateTime#getSeconds()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Seconds();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All</em>'.
	 * @see es.um.uschema.xtext.skiql.All
	 * @generated
	 */
	EClass getAll();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.VariationFilter <em>Variation Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variation Filter</em>'.
	 * @see es.um.uschema.xtext.skiql.VariationFilter
	 * @generated
	 */
	EClass getVariationFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.xtext.skiql.VariationFilter#getPropertySpecs <em>Property Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Specs</em>'.
	 * @see es.um.uschema.xtext.skiql.VariationFilter#getPropertySpecs()
	 * @see #getVariationFilter()
	 * @generated
	 */
	EReference getVariationFilter_PropertySpecs();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.VariationFilter#isOnly <em>Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only</em>'.
	 * @see es.um.uschema.xtext.skiql.VariationFilter#isOnly()
	 * @see #getVariationFilter()
	 * @generated
	 */
	EAttribute getVariationFilter_Only();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.PropertySpec <em>Property Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.PropertySpec
	 * @generated
	 */
	EClass getPropertySpec();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.PropertySpec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.xtext.skiql.PropertySpec#getName()
	 * @see #getPropertySpec()
	 * @generated
	 */
	EAttribute getPropertySpec_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.PropertySpec#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see es.um.uschema.xtext.skiql.PropertySpec#getType()
	 * @see #getPropertySpec()
	 * @generated
	 */
	EReference getPropertySpec_Type();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see es.um.uschema.xtext.skiql.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.RelationshipSpec <em>Relationship Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipSpec
	 * @generated
	 */
	EClass getRelationshipSpec();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.RelationshipSpec#getTargetExpression <em>Target Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Expression</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipSpec#getTargetExpression()
	 * @see #getRelationshipSpec()
	 * @generated
	 */
	EReference getRelationshipSpec_TargetExpression();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.RelationshipSpec#isIndirect <em>Indirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indirect</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipSpec#isIndirect()
	 * @see #getRelationshipSpec()
	 * @generated
	 */
	EAttribute getRelationshipSpec_Indirect();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.RelationshipSpec#getRelationSpec <em>Relation Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipSpec#getRelationSpec()
	 * @see #getRelationshipSpec()
	 * @generated
	 */
	EReference getRelationshipSpec_RelationSpec();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.AggregationSpec <em>Aggregation Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.AggregationSpec
	 * @generated
	 */
	EClass getAggregationSpec();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.ReferenceSpec <em>Reference Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.ReferenceSpec
	 * @generated
	 */
	EClass getReferenceSpec();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.ReferenceSpec#getVariationFilter <em>Variation Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variation Filter</em>'.
	 * @see es.um.uschema.xtext.skiql.ReferenceSpec#getVariationFilter()
	 * @see #getReferenceSpec()
	 * @generated
	 */
	EReference getReferenceSpec_VariationFilter();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.TargetExpression <em>Target Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Expression</em>'.
	 * @see es.um.uschema.xtext.skiql.TargetExpression
	 * @generated
	 */
	EClass getTargetExpression();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.RelationshipExpression <em>Relationship Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Expression</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipExpression
	 * @generated
	 */
	EClass getRelationshipExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.RelationshipExpression#getRelationshipQuery <em>Relationship Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Query</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipExpression#getRelationshipQuery()
	 * @see #getRelationshipExpression()
	 * @generated
	 */
	EReference getRelationshipExpression_RelationshipQuery();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.EntityExpression <em>Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Expression</em>'.
	 * @see es.um.uschema.xtext.skiql.EntityExpression
	 * @generated
	 */
	EClass getEntityExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.EntityExpression#getEntitySpec <em>Entity Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.EntityExpression#getEntitySpec()
	 * @see #getEntityExpression()
	 * @generated
	 */
	EReference getEntityExpression_EntitySpec();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see es.um.uschema.xtext.skiql.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.PrimitiveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.xtext.skiql.PrimitiveType#getType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.PrimitiveType#isArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see es.um.uschema.xtext.skiql.PrimitiveType#isArray()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Array();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.RelationshipType#getTargetEntityName <em>Target Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity Name</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipType#getTargetEntityName()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_TargetEntityName();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.RelationshipType#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Type</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipType#getRelationType()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_RelationType();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.RelationSpec <em>Relation Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationSpec
	 * @generated
	 */
	EClass getRelationSpec();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.RelationSpec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationSpec#getName()
	 * @see #getRelationSpec()
	 * @generated
	 */
	EAttribute getRelationSpec_Name();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.KeysSpec <em>Keys Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keys Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.KeysSpec
	 * @generated
	 */
	EClass getKeysSpec();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.SchemaSpec <em>Schema Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.SchemaSpec
	 * @generated
	 */
	EClass getSchemaSpec();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.xtext.skiql.SchemaSpec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.xtext.skiql.SchemaSpec#getName()
	 * @see #getSchemaSpec()
	 * @generated
	 */
	EAttribute getSchemaSpec_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.xtext.skiql.SchemaSpec#getVariationFilter <em>Variation Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variation Filter</em>'.
	 * @see es.um.uschema.xtext.skiql.SchemaSpec#getVariationFilter()
	 * @see #getSchemaSpec()
	 * @generated
	 */
	EReference getSchemaSpec_VariationFilter();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.xtext.skiql.RelationshipTypeSpec <em>Relationship Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type Spec</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipTypeSpec
	 * @generated
	 */
	EClass getRelationshipTypeSpec();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.xtext.skiql.RelationshipTypeEnum <em>Relationship Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type Enum</em>'.
	 * @see es.um.uschema.xtext.skiql.RelationshipTypeEnum
	 * @generated
	 */
	EEnum getRelationshipTypeEnum();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.xtext.skiql.TypeEnum <em>Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Enum</em>'.
	 * @see es.um.uschema.xtext.skiql.TypeEnum
	 * @generated
	 */
	EEnum getTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SkiQLFactory getSkiQLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.SkiQLModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLModelImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getSkiQLModel()
		 * @generated
		 */
		EClass SKI_QL_MODEL = eINSTANCE.getSkiQLModel();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKI_QL_MODEL__QUERY = eINSTANCE.getSkiQLModel_Query();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.QueryImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipQueryImpl <em>Relationship Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.RelationshipQueryImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipQuery()
		 * @generated
		 */
		EClass RELATIONSHIP_QUERY = eINSTANCE.getRelationshipQuery();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_QUERY__FROM = eINSTANCE.getRelationshipQuery_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_QUERY__TO = eINSTANCE.getRelationshipQuery_To();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.SchemaQueryImpl <em>Schema Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.SchemaQueryImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getSchemaQuery()
		 * @generated
		 */
		EClass SCHEMA_QUERY = eINSTANCE.getSchemaQuery();

		/**
		 * The meta object literal for the '<em><b>Schema Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_QUERY__SCHEMA_SPEC = eINSTANCE.getSchemaQuery_SchemaSpec();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_QUERY__OPERATION = eINSTANCE.getSchemaQuery_Operation();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.EntitySpecImpl <em>Entity Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.EntitySpecImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getEntitySpec()
		 * @generated
		 */
		EClass ENTITY_SPEC = eINSTANCE.getEntitySpec();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.TypeImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.VersionHistoryOperationImpl <em>Version History Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.VersionHistoryOperationImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getVersionHistoryOperation()
		 * @generated
		 */
		EClass VERSION_HISTORY_OPERATION = eINSTANCE.getVersionHistoryOperation();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.BeforeImpl <em>Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.BeforeImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getBefore()
		 * @generated
		 */
		EClass BEFORE = eINSTANCE.getBefore();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEFORE__DATE_TIME = eINSTANCE.getBefore_DateTime();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.AfterImpl <em>After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.AfterImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getAfter()
		 * @generated
		 */
		EClass AFTER = eINSTANCE.getAfter();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER__DATE_TIME = eINSTANCE.getAfter_DateTime();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.BetweenImpl <em>Between</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.BetweenImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getBetween()
		 * @generated
		 */
		EClass BETWEEN = eINSTANCE.getBetween();

		/**
		 * The meta object literal for the '<em><b>After Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETWEEN__AFTER_DATE_TIME = eINSTANCE.getBetween_AfterDateTime();

		/**
		 * The meta object literal for the '<em><b>Before Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETWEEN__BEFORE_DATE_TIME = eINSTANCE.getBetween_BeforeDateTime();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.DateTimeImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__DAY = eINSTANCE.getDateTime_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__MONTH = eINSTANCE.getDateTime_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__YEAR = eINSTANCE.getDateTime_Year();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__HOUR = eINSTANCE.getDateTime_Hour();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__MINUTES = eINSTANCE.getDateTime_Minutes();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__SECONDS = eINSTANCE.getDateTime_Seconds();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.AllImpl <em>All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.AllImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getAll()
		 * @generated
		 */
		EClass ALL = eINSTANCE.getAll();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.VariationFilterImpl <em>Variation Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.VariationFilterImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getVariationFilter()
		 * @generated
		 */
		EClass VARIATION_FILTER = eINSTANCE.getVariationFilter();

		/**
		 * The meta object literal for the '<em><b>Property Specs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION_FILTER__PROPERTY_SPECS = eINSTANCE.getVariationFilter_PropertySpecs();

		/**
		 * The meta object literal for the '<em><b>Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIATION_FILTER__ONLY = eINSTANCE.getVariationFilter_Only();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.PropertySpecImpl <em>Property Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.PropertySpecImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getPropertySpec()
		 * @generated
		 */
		EClass PROPERTY_SPEC = eINSTANCE.getPropertySpec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_SPEC__NAME = eINSTANCE.getPropertySpec_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SPEC__TYPE = eINSTANCE.getPropertySpec_Type();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.OperationImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipSpecImpl <em>Relationship Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.RelationshipSpecImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipSpec()
		 * @generated
		 */
		EClass RELATIONSHIP_SPEC = eINSTANCE.getRelationshipSpec();

		/**
		 * The meta object literal for the '<em><b>Target Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_SPEC__TARGET_EXPRESSION = eINSTANCE.getRelationshipSpec_TargetExpression();

		/**
		 * The meta object literal for the '<em><b>Indirect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_SPEC__INDIRECT = eINSTANCE.getRelationshipSpec_Indirect();

		/**
		 * The meta object literal for the '<em><b>Relation Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_SPEC__RELATION_SPEC = eINSTANCE.getRelationshipSpec_RelationSpec();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.AggregationSpecImpl <em>Aggregation Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.AggregationSpecImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getAggregationSpec()
		 * @generated
		 */
		EClass AGGREGATION_SPEC = eINSTANCE.getAggregationSpec();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.ReferenceSpecImpl <em>Reference Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.ReferenceSpecImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getReferenceSpec()
		 * @generated
		 */
		EClass REFERENCE_SPEC = eINSTANCE.getReferenceSpec();

		/**
		 * The meta object literal for the '<em><b>Variation Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SPEC__VARIATION_FILTER = eINSTANCE.getReferenceSpec_VariationFilter();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.TargetExpressionImpl <em>Target Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.TargetExpressionImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getTargetExpression()
		 * @generated
		 */
		EClass TARGET_EXPRESSION = eINSTANCE.getTargetExpression();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipExpressionImpl <em>Relationship Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.RelationshipExpressionImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipExpression()
		 * @generated
		 */
		EClass RELATIONSHIP_EXPRESSION = eINSTANCE.getRelationshipExpression();

		/**
		 * The meta object literal for the '<em><b>Relationship Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_EXPRESSION__RELATIONSHIP_QUERY = eINSTANCE.getRelationshipExpression_RelationshipQuery();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.EntityExpressionImpl <em>Entity Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.EntityExpressionImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getEntityExpression()
		 * @generated
		 */
		EClass ENTITY_EXPRESSION = eINSTANCE.getEntityExpression();

		/**
		 * The meta object literal for the '<em><b>Entity Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_EXPRESSION__ENTITY_SPEC = eINSTANCE.getEntityExpression_EntitySpec();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.PrimitiveTypeImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE = eINSTANCE.getPrimitiveType_Type();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__ARRAY = eINSTANCE.getPrimitiveType_Array();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.RelationshipTypeImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Target Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__TARGET_ENTITY_NAME = eINSTANCE.getRelationshipType_TargetEntityName();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__RELATION_TYPE = eINSTANCE.getRelationshipType_RelationType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.RelationSpecImpl <em>Relation Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.RelationSpecImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationSpec()
		 * @generated
		 */
		EClass RELATION_SPEC = eINSTANCE.getRelationSpec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_SPEC__NAME = eINSTANCE.getRelationSpec_Name();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.KeysSpecImpl <em>Keys Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.KeysSpecImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getKeysSpec()
		 * @generated
		 */
		EClass KEYS_SPEC = eINSTANCE.getKeysSpec();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.SchemaSpecImpl <em>Schema Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.SchemaSpecImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getSchemaSpec()
		 * @generated
		 */
		EClass SCHEMA_SPEC = eINSTANCE.getSchemaSpec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_SPEC__NAME = eINSTANCE.getSchemaSpec_Name();

		/**
		 * The meta object literal for the '<em><b>Variation Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_SPEC__VARIATION_FILTER = eINSTANCE.getSchemaSpec_VariationFilter();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.impl.RelationshipTypeSpecImpl <em>Relationship Type Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.impl.RelationshipTypeSpecImpl
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipTypeSpec()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE_SPEC = eINSTANCE.getRelationshipTypeSpec();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.RelationshipTypeEnum <em>Relationship Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.RelationshipTypeEnum
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getRelationshipTypeEnum()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE_ENUM = eINSTANCE.getRelationshipTypeEnum();

		/**
		 * The meta object literal for the '{@link es.um.uschema.xtext.skiql.TypeEnum <em>Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.xtext.skiql.TypeEnum
		 * @see es.um.uschema.xtext.skiql.impl.SkiQLPackageImpl#getTypeEnum()
		 * @generated
		 */
		EEnum TYPE_ENUM = eINSTANCE.getTypeEnum();

	}

} //SkiQLPackage
