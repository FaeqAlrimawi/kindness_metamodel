/**
 */
package kindness_metamodel.impl;

import java.util.Collection;

import kindness_metamodel.Condition;
import kindness_metamodel.KindnessEntity;
import kindness_metamodel.KindnessPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.impl.ConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ConditionImpl#getRefKindnessEntities <em>Ref Kindness Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefKindnessEntities() <em>Ref Kindness Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefKindnessEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<KindnessEntity> refKindnessEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.CONDITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KindnessEntity> getRefKindnessEntities() {
		if (refKindnessEntities == null) {
			refKindnessEntities = new EObjectResolvingEList<KindnessEntity>(KindnessEntity.class, this,
					KindnessPackage.CONDITION__REF_KINDNESS_ENTITIES);
		}
		return refKindnessEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KindnessPackage.CONDITION__NAME:
			return getName();
		case KindnessPackage.CONDITION__REF_KINDNESS_ENTITIES:
			return getRefKindnessEntities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case KindnessPackage.CONDITION__NAME:
			setName((String) newValue);
			return;
		case KindnessPackage.CONDITION__REF_KINDNESS_ENTITIES:
			getRefKindnessEntities().clear();
			getRefKindnessEntities().addAll((Collection<? extends KindnessEntity>) newValue);
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
		case KindnessPackage.CONDITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case KindnessPackage.CONDITION__REF_KINDNESS_ENTITIES:
			getRefKindnessEntities().clear();
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
		case KindnessPackage.CONDITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case KindnessPackage.CONDITION__REF_KINDNESS_ENTITIES:
			return refKindnessEntities != null && !refKindnessEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
