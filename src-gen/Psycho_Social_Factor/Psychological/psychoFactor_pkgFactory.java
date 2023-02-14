/**
 */
package Psycho_Social_Factor.Psychological;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage
 * @generated
 */
public interface psychoFactor_pkgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	psychoFactor_pkgFactory eINSTANCE = Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Emotion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emotion</em>'.
	 * @generated
	 */
	Emotion createEmotion();

	/**
	 * Returns a new object of class '<em>Self Efficacy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Efficacy</em>'.
	 * @generated
	 */
	SelfEfficacy createSelfEfficacy();

	/**
	 * Returns a new object of class '<em>Character Trait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Trait</em>'.
	 * @generated
	 */
	CharacterTrait createCharacterTrait();

	/**
	 * Returns a new object of class '<em>Human Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Value</em>'.
	 * @generated
	 */
	HumanValue createHumanValue();

	/**
	 * Returns a new object of class '<em>Other Psychological Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Psychological Factor</em>'.
	 * @generated
	 */
	OtherPsychologicalFactor createOtherPsychologicalFactor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	psychoFactor_pkgPackage getpsychoFactor_pkgPackage();

} //psychoFactor_pkgFactory
