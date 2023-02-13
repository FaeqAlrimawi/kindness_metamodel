/**
 */
package ktypes.impl;

import ktypes.KObject;
import ktypes.KType;
import ktypes.KtypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ktypes.impl.KObjectImpl#getKtype <em>Ktype</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class KObjectImpl extends MinimalEObjectImpl.Container implements KObject {
	/**
	 * The cached value of the '{@link #getKtype() <em>Ktype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKtype()
	 * @generated
	 * @ordered
	 */
	protected KType ktype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KtypesPackage.Literals.KOBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KType getKtype() {
		return ktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKtype(KType newKtype, NotificationChain msgs) {
		KType oldKtype = ktype;
		ktype = newKtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KtypesPackage.KOBJECT__KTYPE,
					oldKtype, newKtype);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKtype(KType newKtype) {
		if (newKtype != ktype) {
			NotificationChain msgs = null;
			if (ktype != null)
				msgs = ((InternalEObject) ktype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KtypesPackage.KOBJECT__KTYPE, null, msgs);
			if (newKtype != null)
				msgs = ((InternalEObject) newKtype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KtypesPackage.KOBJECT__KTYPE, null, msgs);
			msgs = basicSetKtype(newKtype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtypesPackage.KOBJECT__KTYPE, newKtype, newKtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KtypesPackage.KOBJECT__KTYPE:
			return basicSetKtype(null, msgs);
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
		case KtypesPackage.KOBJECT__KTYPE:
			return getKtype();
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
		case KtypesPackage.KOBJECT__KTYPE:
			setKtype((KType) newValue);
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
		case KtypesPackage.KOBJECT__KTYPE:
			setKtype((KType) null);
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
		case KtypesPackage.KOBJECT__KTYPE:
			return ktype != null;
		}
		return super.eIsSet(featureID);
	}

} //KObjectImpl
