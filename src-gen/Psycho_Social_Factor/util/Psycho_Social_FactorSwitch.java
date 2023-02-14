/**
 */
package Psycho_Social_Factor.util;

import Psycho_Social_Factor.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage
 * @generated
 */
public class Psycho_Social_FactorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Psycho_Social_FactorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psycho_Social_FactorSwitch() {
		if (modelPackage == null) {
			modelPackage = Psycho_Social_FactorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Psycho_Social_FactorPackage.ABS_SOCIAL_FACTORS: {
			AbsSocialFactors absSocialFactors = (AbsSocialFactors) theEObject;
			T result = caseAbsSocialFactors(absSocialFactors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Psycho_Social_FactorPackage.ABS_CONNECTION: {
			AbsConnection absConnection = (AbsConnection) theEObject;
			T result = caseAbsConnection(absConnection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Psycho_Social_FactorPackage.FACTOR: {
			Factor factor = (Factor) theEObject;
			T result = caseFactor(factor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Psycho_Social_FactorPackage.ABS_PSYCHOLOGICAL_FACTORS: {
			AbsPsychologicalFactors absPsychologicalFactors = (AbsPsychologicalFactors) theEObject;
			T result = caseAbsPsychologicalFactors(absPsychologicalFactors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS: {
			AffectedFactors affectedFactors = (AffectedFactors) theEObject;
			T result = caseAffectedFactors(affectedFactors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Social Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Social Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsSocialFactors(AbsSocialFactors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsConnection(AbsConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactor(Factor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Psychological Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Psychological Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsPsychologicalFactors(AbsPsychologicalFactors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affected Factors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affected Factors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffectedFactors(AffectedFactors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Psycho_Social_FactorSwitch
