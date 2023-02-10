/**
 */
package kindness_metamodel.impl;

import factors.impl.AbsConnectionImpl;

import kindness_metamodel.Connection;
import kindness_metamodel.KindnessEntity;
import kindness_metamodel.KindnessPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ConnectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ConnectionImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ConnectionImpl#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ConnectionImpl#getEntity2 <em>Entity2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends AbsConnectionImpl implements Connection {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity1() <em>Entity1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity1()
	 * @generated
	 * @ordered
	 */
	protected KindnessEntity entity1;

	/**
	 * The cached value of the '{@link #getEntity2() <em>Entity2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity2()
	 * @generated
	 * @ordered
	 */
	protected KindnessEntity entity2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.CONNECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.CONNECTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(boolean newBidirectional) {
		boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.CONNECTION__BIDIRECTIONAL,
					oldBidirectional, bidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessEntity getEntity1() {
		if (entity1 != null && entity1.eIsProxy()) {
			InternalEObject oldEntity1 = (InternalEObject) entity1;
			entity1 = (KindnessEntity) eResolveProxy(oldEntity1);
			if (entity1 != oldEntity1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KindnessPackage.CONNECTION__ENTITY1,
							oldEntity1, entity1));
			}
		}
		return entity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessEntity basicGetEntity1() {
		return entity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity1(KindnessEntity newEntity1) {
		KindnessEntity oldEntity1 = entity1;
		entity1 = newEntity1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.CONNECTION__ENTITY1, oldEntity1,
					entity1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessEntity getEntity2() {
		if (entity2 != null && entity2.eIsProxy()) {
			InternalEObject oldEntity2 = (InternalEObject) entity2;
			entity2 = (KindnessEntity) eResolveProxy(oldEntity2);
			if (entity2 != oldEntity2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KindnessPackage.CONNECTION__ENTITY2,
							oldEntity2, entity2));
			}
		}
		return entity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessEntity basicGetEntity2() {
		return entity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity2(KindnessEntity newEntity2) {
		KindnessEntity oldEntity2 = entity2;
		entity2 = newEntity2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.CONNECTION__ENTITY2, oldEntity2,
					entity2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KindnessPackage.CONNECTION__NAME:
			return getName();
		case KindnessPackage.CONNECTION__TYPE:
			return getType();
		case KindnessPackage.CONNECTION__BIDIRECTIONAL:
			return isBidirectional();
		case KindnessPackage.CONNECTION__ENTITY1:
			if (resolve)
				return getEntity1();
			return basicGetEntity1();
		case KindnessPackage.CONNECTION__ENTITY2:
			if (resolve)
				return getEntity2();
			return basicGetEntity2();
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
		case KindnessPackage.CONNECTION__NAME:
			setName((String) newValue);
			return;
		case KindnessPackage.CONNECTION__TYPE:
			setType((String) newValue);
			return;
		case KindnessPackage.CONNECTION__BIDIRECTIONAL:
			setBidirectional((Boolean) newValue);
			return;
		case KindnessPackage.CONNECTION__ENTITY1:
			setEntity1((KindnessEntity) newValue);
			return;
		case KindnessPackage.CONNECTION__ENTITY2:
			setEntity2((KindnessEntity) newValue);
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
		case KindnessPackage.CONNECTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case KindnessPackage.CONNECTION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case KindnessPackage.CONNECTION__BIDIRECTIONAL:
			setBidirectional(BIDIRECTIONAL_EDEFAULT);
			return;
		case KindnessPackage.CONNECTION__ENTITY1:
			setEntity1((KindnessEntity) null);
			return;
		case KindnessPackage.CONNECTION__ENTITY2:
			setEntity2((KindnessEntity) null);
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
		case KindnessPackage.CONNECTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case KindnessPackage.CONNECTION__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case KindnessPackage.CONNECTION__BIDIRECTIONAL:
			return bidirectional != BIDIRECTIONAL_EDEFAULT;
		case KindnessPackage.CONNECTION__ENTITY1:
			return entity1 != null;
		case KindnessPackage.CONNECTION__ENTITY2:
			return entity2 != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
