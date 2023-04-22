/**
 */
package es.um.uschema.xtext.skiql.util;

import es.um.uschema.xtext.skiql.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.um.uschema.xtext.skiql.SkiQLPackage
 * @generated
 */
public class SkiQLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SkiQLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkiQLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SkiQLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkiQLSwitch<Adapter> modelSwitch =
		new SkiQLSwitch<Adapter>() {
			@Override
			public Adapter caseSkiQLModel(SkiQLModel object) {
				return createSkiQLModelAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseRelationshipQuery(RelationshipQuery object) {
				return createRelationshipQueryAdapter();
			}
			@Override
			public Adapter caseSchemaQuery(SchemaQuery object) {
				return createSchemaQueryAdapter();
			}
			@Override
			public Adapter caseEntitySpec(EntitySpec object) {
				return createEntitySpecAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseVersionHistoryOperation(VersionHistoryOperation object) {
				return createVersionHistoryOperationAdapter();
			}
			@Override
			public Adapter caseBefore(Before object) {
				return createBeforeAdapter();
			}
			@Override
			public Adapter caseAfter(After object) {
				return createAfterAdapter();
			}
			@Override
			public Adapter caseBetween(Between object) {
				return createBetweenAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseAll(All object) {
				return createAllAdapter();
			}
			@Override
			public Adapter caseVariationFilter(VariationFilter object) {
				return createVariationFilterAdapter();
			}
			@Override
			public Adapter casePropertySpec(PropertySpec object) {
				return createPropertySpecAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseRelationshipSpec(RelationshipSpec object) {
				return createRelationshipSpecAdapter();
			}
			@Override
			public Adapter caseAggregationSpec(AggregationSpec object) {
				return createAggregationSpecAdapter();
			}
			@Override
			public Adapter caseReferenceSpec(ReferenceSpec object) {
				return createReferenceSpecAdapter();
			}
			@Override
			public Adapter caseTargetExpression(TargetExpression object) {
				return createTargetExpressionAdapter();
			}
			@Override
			public Adapter caseRelationshipExpression(RelationshipExpression object) {
				return createRelationshipExpressionAdapter();
			}
			@Override
			public Adapter caseEntityExpression(EntityExpression object) {
				return createEntityExpressionAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipType(RelationshipType object) {
				return createRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseRelationSpec(RelationSpec object) {
				return createRelationSpecAdapter();
			}
			@Override
			public Adapter caseKeysSpec(KeysSpec object) {
				return createKeysSpecAdapter();
			}
			@Override
			public Adapter caseSchemaSpec(SchemaSpec object) {
				return createSchemaSpecAdapter();
			}
			@Override
			public Adapter caseRelationshipTypeSpec(RelationshipTypeSpec object) {
				return createRelationshipTypeSpecAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.SkiQLModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.SkiQLModel
	 * @generated
	 */
	public Adapter createSkiQLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.RelationshipQuery <em>Relationship Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.RelationshipQuery
	 * @generated
	 */
	public Adapter createRelationshipQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.SchemaQuery <em>Schema Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.SchemaQuery
	 * @generated
	 */
	public Adapter createSchemaQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.EntitySpec <em>Entity Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.EntitySpec
	 * @generated
	 */
	public Adapter createEntitySpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.VersionHistoryOperation <em>Version History Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.VersionHistoryOperation
	 * @generated
	 */
	public Adapter createVersionHistoryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.Before
	 * @generated
	 */
	public Adapter createBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.After
	 * @generated
	 */
	public Adapter createAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.Between <em>Between</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.Between
	 * @generated
	 */
	public Adapter createBetweenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.All
	 * @generated
	 */
	public Adapter createAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.VariationFilter <em>Variation Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.VariationFilter
	 * @generated
	 */
	public Adapter createVariationFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.PropertySpec <em>Property Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.PropertySpec
	 * @generated
	 */
	public Adapter createPropertySpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.RelationshipSpec <em>Relationship Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.RelationshipSpec
	 * @generated
	 */
	public Adapter createRelationshipSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.AggregationSpec <em>Aggregation Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.AggregationSpec
	 * @generated
	 */
	public Adapter createAggregationSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.ReferenceSpec <em>Reference Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.ReferenceSpec
	 * @generated
	 */
	public Adapter createReferenceSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.TargetExpression <em>Target Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.TargetExpression
	 * @generated
	 */
	public Adapter createTargetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.RelationshipExpression <em>Relationship Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.RelationshipExpression
	 * @generated
	 */
	public Adapter createRelationshipExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.EntityExpression <em>Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.EntityExpression
	 * @generated
	 */
	public Adapter createEntityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.RelationshipType
	 * @generated
	 */
	public Adapter createRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.RelationSpec <em>Relation Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.RelationSpec
	 * @generated
	 */
	public Adapter createRelationSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.KeysSpec <em>Keys Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.KeysSpec
	 * @generated
	 */
	public Adapter createKeysSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.SchemaSpec <em>Schema Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.SchemaSpec
	 * @generated
	 */
	public Adapter createSchemaSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.uschema.xtext.skiql.RelationshipTypeSpec <em>Relationship Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.uschema.xtext.skiql.RelationshipTypeSpec
	 * @generated
	 */
	public Adapter createRelationshipTypeSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SkiQLAdapterFactory
