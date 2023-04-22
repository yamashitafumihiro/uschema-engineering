/**
 */
package es.um.uschema.xtext.skiql.impl;

import es.um.uschema.xtext.skiql.Operation;
import es.um.uschema.xtext.skiql.SchemaQuery;
import es.um.uschema.xtext.skiql.SchemaSpec;
import es.um.uschema.xtext.skiql.SkiQLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.xtext.skiql.impl.SchemaQueryImpl#getSchemaSpec <em>Schema Spec</em>}</li>
 *   <li>{@link es.um.uschema.xtext.skiql.impl.SchemaQueryImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaQueryImpl extends QueryImpl implements SchemaQuery {
	/**
	 * The cached value of the '{@link #getSchemaSpec() <em>Schema Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaSpec()
	 * @generated
	 * @ordered
	 */
	protected SchemaSpec schemaSpec;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkiQLPackage.Literals.SCHEMA_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaSpec getSchemaSpec() {
		return schemaSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaSpec(SchemaSpec newSchemaSpec, NotificationChain msgs) {
		SchemaSpec oldSchemaSpec = schemaSpec;
		schemaSpec = newSchemaSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SkiQLPackage.SCHEMA_QUERY__SCHEMA_SPEC, oldSchemaSpec, newSchemaSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaSpec(SchemaSpec newSchemaSpec) {
		if (newSchemaSpec != schemaSpec) {
			NotificationChain msgs = null;
			if (schemaSpec != null)
				msgs = ((InternalEObject)schemaSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SkiQLPackage.SCHEMA_QUERY__SCHEMA_SPEC, null, msgs);
			if (newSchemaSpec != null)
				msgs = ((InternalEObject)newSchemaSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SkiQLPackage.SCHEMA_QUERY__SCHEMA_SPEC, null, msgs);
			msgs = basicSetSchemaSpec(newSchemaSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkiQLPackage.SCHEMA_QUERY__SCHEMA_SPEC, newSchemaSpec, newSchemaSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SkiQLPackage.SCHEMA_QUERY__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(Operation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SkiQLPackage.SCHEMA_QUERY__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SkiQLPackage.SCHEMA_QUERY__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkiQLPackage.SCHEMA_QUERY__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SkiQLPackage.SCHEMA_QUERY__SCHEMA_SPEC:
				return basicSetSchemaSpec(null, msgs);
			case SkiQLPackage.SCHEMA_QUERY__OPERATION:
				return basicSetOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SkiQLPackage.SCHEMA_QUERY__SCHEMA_SPEC:
				return getSchemaSpec();
			case SkiQLPackage.SCHEMA_QUERY__OPERATION:
				return getOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SkiQLPackage.SCHEMA_QUERY__SCHEMA_SPEC:
				setSchemaSpec((SchemaSpec)newValue);
				return;
			case SkiQLPackage.SCHEMA_QUERY__OPERATION:
				setOperation((Operation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SkiQLPackage.SCHEMA_QUERY__SCHEMA_SPEC:
				setSchemaSpec((SchemaSpec)null);
				return;
			case SkiQLPackage.SCHEMA_QUERY__OPERATION:
				setOperation((Operation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SkiQLPackage.SCHEMA_QUERY__SCHEMA_SPEC:
				return schemaSpec != null;
			case SkiQLPackage.SCHEMA_QUERY__OPERATION:
				return operation != null;
		}
		return super.eIsSet(featureID);
	}

} //SchemaQueryImpl
