/**
 */
package factors.Social.util;

import factors.Factor;

import factors.Social.*;

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
 * @see factors.Social.NewPackage1Package
 * @generated
 */
public class NewPackage1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage1Switch() {
		if (modelPackage == null) {
			modelPackage = NewPackage1Package.eINSTANCE;
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
		case NewPackage1Package.LEVEL_OF_NEED: {
			LevelOfNeed levelOfNeed = (LevelOfNeed) theEObject;
			T result = caseLevelOfNeed(levelOfNeed);
			if (result == null)
				result = caseSocialFactor(levelOfNeed);
			if (result == null)
				result = caseFactor(levelOfNeed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NewPackage1Package.RELATEDNESS: {
			Relatedness relatedness = (Relatedness) theEObject;
			T result = caseRelatedness(relatedness);
			if (result == null)
				result = caseSocialFactor(relatedness);
			if (result == null)
				result = caseFactor(relatedness);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NewPackage1Package.RECIPROCITY: {
			Reciprocity reciprocity = (Reciprocity) theEObject;
			T result = caseReciprocity(reciprocity);
			if (result == null)
				result = caseSocialFactor(reciprocity);
			if (result == null)
				result = caseFactor(reciprocity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NewPackage1Package.SOCIAL_FACTOR: {
			SocialFactor socialFactor = (SocialFactor) theEObject;
			T result = caseSocialFactor(socialFactor);
			if (result == null)
				result = caseFactor(socialFactor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NewPackage1Package.OPPORTUNITY_TO_CONNECT: {
			OpportunityToConnect opportunityToConnect = (OpportunityToConnect) theEObject;
			T result = caseOpportunityToConnect(opportunityToConnect);
			if (result == null)
				result = caseSocialFactor(opportunityToConnect);
			if (result == null)
				result = caseFactor(opportunityToConnect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NewPackage1Package.TRUST: {
			Trust trust = (Trust) theEObject;
			T result = caseTrust(trust);
			if (result == null)
				result = caseSocialFactor(trust);
			if (result == null)
				result = caseFactor(trust);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NewPackage1Package.OTHER_SOCIAL_FACTOR: {
			OtherSocialFactor otherSocialFactor = (OtherSocialFactor) theEObject;
			T result = caseOtherSocialFactor(otherSocialFactor);
			if (result == null)
				result = caseSocialFactor(otherSocialFactor);
			if (result == null)
				result = caseFactor(otherSocialFactor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Of Need</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Of Need</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelOfNeed(LevelOfNeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relatedness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relatedness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedness(Relatedness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reciprocity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reciprocity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReciprocity(Reciprocity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialFactor(SocialFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opportunity To Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opportunity To Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpportunityToConnect(OpportunityToConnect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trust</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trust</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrust(Trust object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Social Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Social Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherSocialFactor(OtherSocialFactor object) {
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

} //NewPackage1Switch
