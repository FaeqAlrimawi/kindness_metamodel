/**
 */
package factors.impl;

import factors.AbsKindnessEntity;
import factors.AbsSocialFactors;
import factors.FactorsPackage;

import factors.Social.SocialFactor;

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
 *   <li>{@link factors.impl.AbsSocialFactorsImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link factors.impl.AbsSocialFactorsImpl#getSocialfactor <em>Socialfactor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbsSocialFactorsImpl extends MinimalEObjectImpl.Container implements AbsSocialFactors {
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected AbsKindnessEntity actor;

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
		return FactorsPackage.Literals.ABS_SOCIAL_FACTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsKindnessEntity getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject) actor;
			actor = (AbsKindnessEntity) eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR,
							oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsKindnessEntity basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(AbsKindnessEntity newActor) {
		AbsKindnessEntity oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR, oldActor,
					actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SocialFactor> getSocialfactor() {
		if (socialfactor == null) {
			socialfactor = new EObjectContainmentEList<SocialFactor>(SocialFactor.class, this,
					FactorsPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR);
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
		case FactorsPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
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
		case FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR:
			if (resolve)
				return getActor();
			return basicGetActor();
		case FactorsPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
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
		case FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR:
			setActor((AbsKindnessEntity) newValue);
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
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
		case FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR:
			setActor((AbsKindnessEntity) null);
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
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
		case FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR:
			return actor != null;
		case FactorsPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR:
			return socialfactor != null && !socialfactor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbsSocialFactorsImpl
