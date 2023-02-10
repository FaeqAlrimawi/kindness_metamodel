/**
 */
package kindness_metamodel.impl;

import factors.Psychological.PsychologicalFactor;

import java.util.Collection;

import kindness_metamodel.KindnessPackage;
import kindness_metamodel.Psychological_Factors;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Psychological Factors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.impl.Psychological_FactorsImpl#getPsychologicalfactor <em>Psychologicalfactor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Psychological_FactorsImpl extends MinimalEObjectImpl.Container implements Psychological_Factors {
	/**
	 * The cached value of the '{@link #getPsychologicalfactor() <em>Psychologicalfactor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsychologicalfactor()
	 * @generated
	 * @ordered
	 */
	protected EList<PsychologicalFactor> psychologicalfactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Psychological_FactorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.PSYCHOLOGICAL_FACTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PsychologicalFactor> getPsychologicalfactor() {
		if (psychologicalfactor == null) {
			psychologicalfactor = new EObjectContainmentEList<PsychologicalFactor>(PsychologicalFactor.class, this,
					KindnessPackage.PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR);
		}
		return psychologicalfactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KindnessPackage.PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR:
			return ((InternalEList<?>) getPsychologicalfactor()).basicRemove(otherEnd, msgs);
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
		case KindnessPackage.PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR:
			return getPsychologicalfactor();
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
		case KindnessPackage.PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR:
			getPsychologicalfactor().clear();
			getPsychologicalfactor().addAll((Collection<? extends PsychologicalFactor>) newValue);
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
		case KindnessPackage.PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR:
			getPsychologicalfactor().clear();
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
		case KindnessPackage.PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR:
			return psychologicalfactor != null && !psychologicalfactor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Psychological_FactorsImpl
