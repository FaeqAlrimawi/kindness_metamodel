/**
 */
package kindness_metamodel.impl;

import kindness_metamodel.Actor;
import kindness_metamodel.KindnessPackage;
import kindness_metamodel.Psychological_Factors;
import kindness_metamodel.Social_Factors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.impl.ActorImpl#getSocial_factors <em>Social factors</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActorImpl#getPsychological_factors <em>Psychological factors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends KindnessEntityImpl implements Actor {
	/**
	 * The cached value of the '{@link #getSocial_factors() <em>Social factors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocial_factors()
	 * @generated
	 * @ordered
	 */
	protected Social_Factors social_factors;

	/**
	 * The cached value of the '{@link #getPsychological_factors() <em>Psychological factors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsychological_factors()
	 * @generated
	 * @ordered
	 */
	protected Psychological_Factors psychological_factors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Social_Factors getSocial_factors() {
		return social_factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSocial_factors(Social_Factors newSocial_factors, NotificationChain msgs) {
		Social_Factors oldSocial_factors = social_factors;
		social_factors = newSocial_factors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					KindnessPackage.ACTOR__SOCIAL_FACTORS, oldSocial_factors, newSocial_factors);
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
	public void setSocial_factors(Social_Factors newSocial_factors) {
		if (newSocial_factors != social_factors) {
			NotificationChain msgs = null;
			if (social_factors != null)
				msgs = ((InternalEObject) social_factors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACTOR__SOCIAL_FACTORS, null, msgs);
			if (newSocial_factors != null)
				msgs = ((InternalEObject) newSocial_factors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACTOR__SOCIAL_FACTORS, null, msgs);
			msgs = basicSetSocial_factors(newSocial_factors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACTOR__SOCIAL_FACTORS,
					newSocial_factors, newSocial_factors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psychological_Factors getPsychological_factors() {
		return psychological_factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPsychological_factors(Psychological_Factors newPsychological_factors,
			NotificationChain msgs) {
		Psychological_Factors oldPsychological_factors = psychological_factors;
		psychological_factors = newPsychological_factors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					KindnessPackage.ACTOR__PSYCHOLOGICAL_FACTORS, oldPsychological_factors, newPsychological_factors);
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
	public void setPsychological_factors(Psychological_Factors newPsychological_factors) {
		if (newPsychological_factors != psychological_factors) {
			NotificationChain msgs = null;
			if (psychological_factors != null)
				msgs = ((InternalEObject) psychological_factors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACTOR__PSYCHOLOGICAL_FACTORS, null, msgs);
			if (newPsychological_factors != null)
				msgs = ((InternalEObject) newPsychological_factors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACTOR__PSYCHOLOGICAL_FACTORS, null, msgs);
			msgs = basicSetPsychological_factors(newPsychological_factors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACTOR__PSYCHOLOGICAL_FACTORS,
					newPsychological_factors, newPsychological_factors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KindnessPackage.ACTOR__SOCIAL_FACTORS:
			return basicSetSocial_factors(null, msgs);
		case KindnessPackage.ACTOR__PSYCHOLOGICAL_FACTORS:
			return basicSetPsychological_factors(null, msgs);
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
		case KindnessPackage.ACTOR__SOCIAL_FACTORS:
			return getSocial_factors();
		case KindnessPackage.ACTOR__PSYCHOLOGICAL_FACTORS:
			return getPsychological_factors();
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
		case KindnessPackage.ACTOR__SOCIAL_FACTORS:
			setSocial_factors((Social_Factors) newValue);
			return;
		case KindnessPackage.ACTOR__PSYCHOLOGICAL_FACTORS:
			setPsychological_factors((Psychological_Factors) newValue);
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
		case KindnessPackage.ACTOR__SOCIAL_FACTORS:
			setSocial_factors((Social_Factors) null);
			return;
		case KindnessPackage.ACTOR__PSYCHOLOGICAL_FACTORS:
			setPsychological_factors((Psychological_Factors) null);
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
		case KindnessPackage.ACTOR__SOCIAL_FACTORS:
			return social_factors != null;
		case KindnessPackage.ACTOR__PSYCHOLOGICAL_FACTORS:
			return psychological_factors != null;
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
