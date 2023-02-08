/**
 */
package factors.impl;

import factors.Factor;
import factors.FactorImpact;
import factors.FactorsPackage;
import factors.ImpactedFactor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impacted Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factors.impl.ImpactedFactorImpl#getName <em>Name</em>}</li>
 *   <li>{@link factors.impl.ImpactedFactorImpl#getImpactedfactors <em>Impactedfactors</em>}</li>
 *   <li>{@link factors.impl.ImpactedFactorImpl#getImpact <em>Impact</em>}</li>
 *   <li>{@link factors.impl.ImpactedFactorImpl#getFactors <em>Factors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpactedFactorImpl extends MinimalEObjectImpl.Container implements ImpactedFactor {
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
	 * The cached value of the '{@link #getImpactedfactors() <em>Impactedfactors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactedfactors()
	 * @generated
	 * @ordered
	 */
	protected EList<ImpactedFactor> impactedfactors;

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
	 * The cached value of the '{@link #getFactors() <em>Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<Factor> factors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpactedFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactorsPackage.Literals.IMPACTED_FACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FactorsPackage.IMPACTED_FACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImpactedFactor> getImpactedfactors() {
		if (impactedfactors == null) {
			impactedfactors = new EObjectResolvingEList<ImpactedFactor>(ImpactedFactor.class, this,
					FactorsPackage.IMPACTED_FACTOR__IMPACTEDFACTORS);
		}
		return impactedfactors;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FactorsPackage.IMPACTED_FACTOR__IMPACT, oldImpact,
					impact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factor> getFactors() {
		if (factors == null) {
			factors = new EObjectResolvingEList<Factor>(Factor.class, this, FactorsPackage.IMPACTED_FACTOR__FACTORS);
		}
		return factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FactorsPackage.IMPACTED_FACTOR__NAME:
			return getName();
		case FactorsPackage.IMPACTED_FACTOR__IMPACTEDFACTORS:
			return getImpactedfactors();
		case FactorsPackage.IMPACTED_FACTOR__IMPACT:
			return getImpact();
		case FactorsPackage.IMPACTED_FACTOR__FACTORS:
			return getFactors();
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
		case FactorsPackage.IMPACTED_FACTOR__NAME:
			setName((String) newValue);
			return;
		case FactorsPackage.IMPACTED_FACTOR__IMPACTEDFACTORS:
			getImpactedfactors().clear();
			getImpactedfactors().addAll((Collection<? extends ImpactedFactor>) newValue);
			return;
		case FactorsPackage.IMPACTED_FACTOR__IMPACT:
			setImpact((FactorImpact) newValue);
			return;
		case FactorsPackage.IMPACTED_FACTOR__FACTORS:
			getFactors().clear();
			getFactors().addAll((Collection<? extends Factor>) newValue);
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
		case FactorsPackage.IMPACTED_FACTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FactorsPackage.IMPACTED_FACTOR__IMPACTEDFACTORS:
			getImpactedfactors().clear();
			return;
		case FactorsPackage.IMPACTED_FACTOR__IMPACT:
			setImpact(IMPACT_EDEFAULT);
			return;
		case FactorsPackage.IMPACTED_FACTOR__FACTORS:
			getFactors().clear();
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
		case FactorsPackage.IMPACTED_FACTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FactorsPackage.IMPACTED_FACTOR__IMPACTEDFACTORS:
			return impactedfactors != null && !impactedfactors.isEmpty();
		case FactorsPackage.IMPACTED_FACTOR__IMPACT:
			return impact != IMPACT_EDEFAULT;
		case FactorsPackage.IMPACTED_FACTOR__FACTORS:
			return factors != null && !factors.isEmpty();
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
		result.append(", impact: ");
		result.append(impact);
		result.append(')');
		return result.toString();
	}

} //ImpactedFactorImpl
