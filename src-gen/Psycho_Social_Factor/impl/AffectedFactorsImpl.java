/**
 */
package Psycho_Social_Factor.impl;

import Psycho_Social_Factor.AffectedFactors;
import Psycho_Social_Factor.Factor;
import Psycho_Social_Factor.FactorImpact;
import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affected Factors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.impl.AffectedFactorsImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link Psycho_Social_Factor.impl.AffectedFactorsImpl#getImpact <em>Impact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffectedFactorsImpl extends MinimalEObjectImpl.Container implements AffectedFactors {
	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Factor factor;

	/**
	 * The default value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected static final FactorImpact IMPACT_EDEFAULT = FactorImpact.POSITIVE;

	/**
	 * The cached value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected FactorImpact impact = IMPACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectedFactorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Psycho_Social_FactorPackage.Literals.AFFECTED_FACTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor getFactor() {
		if (factor != null && factor.eIsProxy()) {
			InternalEObject oldFactor = (InternalEObject) factor;
			factor = (Factor) eResolveProxy(oldFactor);
			if (factor != oldFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Psycho_Social_FactorPackage.AFFECTED_FACTORS__FACTOR, oldFactor, factor));
			}
		}
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor basicGetFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Factor newFactor) {
		Factor oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Psycho_Social_FactorPackage.AFFECTED_FACTORS__FACTOR,
					oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorImpact getImpact() {
		return impact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpact(FactorImpact newImpact) {
		FactorImpact oldImpact = impact;
		impact = newImpact == null ? IMPACT_EDEFAULT : newImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Psycho_Social_FactorPackage.AFFECTED_FACTORS__IMPACT,
					oldImpact, impact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS__FACTOR:
			if (resolve)
				return getFactor();
			return basicGetFactor();
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS__IMPACT:
			return getImpact();
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
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS__FACTOR:
			setFactor((Factor) newValue);
			return;
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS__IMPACT:
			setImpact((FactorImpact) newValue);
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
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS__FACTOR:
			setFactor((Factor) null);
			return;
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS__IMPACT:
			setImpact(IMPACT_EDEFAULT);
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
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS__FACTOR:
			return factor != null;
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS__IMPACT:
			return impact != IMPACT_EDEFAULT;
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
		result.append(" (impact: ");
		result.append(impact);
		result.append(')');
		return result.toString();
	}

} //AffectedFactorsImpl
