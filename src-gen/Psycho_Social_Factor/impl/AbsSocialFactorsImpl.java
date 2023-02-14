/**
 */
package Psycho_Social_Factor.impl;

import Psycho_Social_Factor.AbsConnection;
import Psycho_Social_Factor.AbsSocialFactors;
import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import Psycho_Social_Factor.Social.SocialFactor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abs Social Factors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.impl.AbsSocialFactorsImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link Psycho_Social_Factor.impl.AbsSocialFactorsImpl#getSocialfactor <em>Socialfactor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbsSocialFactorsImpl extends MinimalEObjectImpl.Container implements AbsSocialFactors {
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected AbsConnection connection;

	/**
	 * The cached value of the '{@link #getSocialfactor() <em>Socialfactor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialfactor()
	 * @generated
	 * @ordered
	 */
	protected EList<SocialFactor> socialfactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsSocialFactorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Psycho_Social_FactorPackage.Literals.ABS_SOCIAL_FACTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsConnection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject) connection;
			connection = (AbsConnection) eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsConnection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(AbsConnection newConnection) {
		AbsConnection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SocialFactor> getSocialfactor() {
		if (socialfactor == null) {
			socialfactor = new EObjectContainmentEList<SocialFactor>(SocialFactor.class, this,
					Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR);
		}
		return socialfactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
			return ((InternalEList<?>) getSocialfactor()).basicRemove(otherEnd, msgs);
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
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__CONNECTION:
			if (resolve)
				return getConnection();
			return basicGetConnection();
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
			return getSocialfactor();
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
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__CONNECTION:
			setConnection((AbsConnection) newValue);
			return;
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
			getSocialfactor().clear();
			getSocialfactor().addAll((Collection<? extends SocialFactor>) newValue);
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
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__CONNECTION:
			setConnection((AbsConnection) null);
			return;
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
			getSocialfactor().clear();
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
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__CONNECTION:
			return connection != null;
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
			return socialfactor != null && !socialfactor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbsSocialFactorsImpl
