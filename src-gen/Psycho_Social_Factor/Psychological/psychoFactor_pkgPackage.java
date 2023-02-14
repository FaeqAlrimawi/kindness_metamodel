/**
 */
package Psycho_Social_Factor.Psychological;

import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psychological.psychoFactor_pkgFactory
 * @model kind="package"
 * @generated
 */
public interface psychoFactor_pkgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Psychological";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kindness_metamodel_factors_psychological";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "package_psychologicalfactors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	psychoFactor_pkgPackage eINSTANCE = Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl.init();

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Psychological.impl.PsychologicalFactorImpl <em>Psychological Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Psychological.impl.PsychologicalFactorImpl
	 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getPsychologicalFactor()
	 * @generated
	 */
	int PSYCHOLOGICAL_FACTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTOR__NAME = Psycho_Social_FactorPackage.FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR = Psycho_Social_FactorPackage.FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTOR__OTHER = Psycho_Social_FactorPackage.FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTOR__LEVEL = Psycho_Social_FactorPackage.FACTOR__LEVEL;

	/**
	 * The number of structural features of the '<em>Psychological Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTOR_FEATURE_COUNT = Psycho_Social_FactorPackage.FACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT = Psycho_Social_FactorPackage.FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Psychological Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTOR_OPERATION_COUNT = Psycho_Social_FactorPackage.FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Psychological.impl.EmotionImpl <em>Emotion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Psychological.impl.EmotionImpl
	 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getEmotion()
	 * @generated
	 */
	int EMOTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION__NAME = PSYCHOLOGICAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION__AFFECTEDFACTOR = PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION__OTHER = PSYCHOLOGICAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION__LEVEL = PSYCHOLOGICAL_FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION__TYPE = PSYCHOLOGICAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_FEATURE_COUNT = PSYCHOLOGICAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION___COMPUTE_IMPACT__FACTORIMPACT = PSYCHOLOGICAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Emotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_OPERATION_COUNT = PSYCHOLOGICAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Psychological.impl.SelfEfficacyImpl <em>Self Efficacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Psychological.impl.SelfEfficacyImpl
	 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getSelfEfficacy()
	 * @generated
	 */
	int SELF_EFFICACY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EFFICACY__NAME = PSYCHOLOGICAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EFFICACY__AFFECTEDFACTOR = PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EFFICACY__OTHER = PSYCHOLOGICAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EFFICACY__LEVEL = PSYCHOLOGICAL_FACTOR__LEVEL;

	/**
	 * The number of structural features of the '<em>Self Efficacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EFFICACY_FEATURE_COUNT = PSYCHOLOGICAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EFFICACY___COMPUTE_IMPACT__FACTORIMPACT = PSYCHOLOGICAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Self Efficacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EFFICACY_OPERATION_COUNT = PSYCHOLOGICAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Psychological.impl.CharacterTraitImpl <em>Character Trait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Psychological.impl.CharacterTraitImpl
	 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getCharacterTrait()
	 * @generated
	 */
	int CHARACTER_TRAIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TRAIT__NAME = PSYCHOLOGICAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TRAIT__AFFECTEDFACTOR = PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TRAIT__OTHER = PSYCHOLOGICAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TRAIT__LEVEL = PSYCHOLOGICAL_FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TRAIT__TRAIT = PSYCHOLOGICAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character Trait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TRAIT_FEATURE_COUNT = PSYCHOLOGICAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TRAIT___COMPUTE_IMPACT__FACTORIMPACT = PSYCHOLOGICAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Character Trait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TRAIT_OPERATION_COUNT = PSYCHOLOGICAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Psychological.impl.HumanValueImpl <em>Human Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Psychological.impl.HumanValueImpl
	 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getHumanValue()
	 * @generated
	 */
	int HUMAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_VALUE__NAME = PSYCHOLOGICAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_VALUE__AFFECTEDFACTOR = PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_VALUE__OTHER = PSYCHOLOGICAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_VALUE__LEVEL = PSYCHOLOGICAL_FACTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_VALUE__VALUE = PSYCHOLOGICAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Human Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_VALUE_FEATURE_COUNT = PSYCHOLOGICAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_VALUE___COMPUTE_IMPACT__FACTORIMPACT = PSYCHOLOGICAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Human Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_VALUE_OPERATION_COUNT = PSYCHOLOGICAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Psycho_Social_Factor.Psychological.impl.OtherPsychologicalFactorImpl <em>Other Psychological Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Psycho_Social_Factor.Psychological.impl.OtherPsychologicalFactorImpl
	 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getOtherPsychologicalFactor()
	 * @generated
	 */
	int OTHER_PSYCHOLOGICAL_FACTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PSYCHOLOGICAL_FACTOR__NAME = PSYCHOLOGICAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR = PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PSYCHOLOGICAL_FACTOR__OTHER = PSYCHOLOGICAL_FACTOR__OTHER;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PSYCHOLOGICAL_FACTOR__LEVEL = PSYCHOLOGICAL_FACTOR__LEVEL;

	/**
	 * The number of structural features of the '<em>Other Psychological Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PSYCHOLOGICAL_FACTOR_FEATURE_COUNT = PSYCHOLOGICAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PSYCHOLOGICAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT = PSYCHOLOGICAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT;

	/**
	 * The number of operations of the '<em>Other Psychological Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PSYCHOLOGICAL_FACTOR_OPERATION_COUNT = PSYCHOLOGICAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Psychological.Emotion <em>Emotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotion</em>'.
	 * @see Psycho_Social_Factor.Psychological.Emotion
	 * @generated
	 */
	EClass getEmotion();

	/**
	 * Returns the meta object for the attribute '{@link Psycho_Social_Factor.Psychological.Emotion#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Psycho_Social_Factor.Psychological.Emotion#getType()
	 * @see #getEmotion()
	 * @generated
	 */
	EAttribute getEmotion_Type();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Psychological.SelfEfficacy <em>Self Efficacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Efficacy</em>'.
	 * @see Psycho_Social_Factor.Psychological.SelfEfficacy
	 * @generated
	 */
	EClass getSelfEfficacy();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Psychological.CharacterTrait <em>Character Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Trait</em>'.
	 * @see Psycho_Social_Factor.Psychological.CharacterTrait
	 * @generated
	 */
	EClass getCharacterTrait();

	/**
	 * Returns the meta object for the attribute '{@link Psycho_Social_Factor.Psychological.CharacterTrait#getTrait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trait</em>'.
	 * @see Psycho_Social_Factor.Psychological.CharacterTrait#getTrait()
	 * @see #getCharacterTrait()
	 * @generated
	 */
	EAttribute getCharacterTrait_Trait();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Psychological.HumanValue <em>Human Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Value</em>'.
	 * @see Psycho_Social_Factor.Psychological.HumanValue
	 * @generated
	 */
	EClass getHumanValue();

	/**
	 * Returns the meta object for the attribute '{@link Psycho_Social_Factor.Psychological.HumanValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Psycho_Social_Factor.Psychological.HumanValue#getValue()
	 * @see #getHumanValue()
	 * @generated
	 */
	EAttribute getHumanValue_Value();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Psychological.PsychologicalFactor <em>Psychological Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Psychological Factor</em>'.
	 * @see Psycho_Social_Factor.Psychological.PsychologicalFactor
	 * @generated
	 */
	EClass getPsychologicalFactor();

	/**
	 * Returns the meta object for class '{@link Psycho_Social_Factor.Psychological.OtherPsychologicalFactor <em>Other Psychological Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Psychological Factor</em>'.
	 * @see Psycho_Social_Factor.Psychological.OtherPsychologicalFactor
	 * @generated
	 */
	EClass getOtherPsychologicalFactor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	psychoFactor_pkgFactory getpsychoFactor_pkgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Psychological.impl.EmotionImpl <em>Emotion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Psychological.impl.EmotionImpl
		 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getEmotion()
		 * @generated
		 */
		EClass EMOTION = eINSTANCE.getEmotion();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION__TYPE = eINSTANCE.getEmotion_Type();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Psychological.impl.SelfEfficacyImpl <em>Self Efficacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Psychological.impl.SelfEfficacyImpl
		 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getSelfEfficacy()
		 * @generated
		 */
		EClass SELF_EFFICACY = eINSTANCE.getSelfEfficacy();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Psychological.impl.CharacterTraitImpl <em>Character Trait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Psychological.impl.CharacterTraitImpl
		 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getCharacterTrait()
		 * @generated
		 */
		EClass CHARACTER_TRAIT = eINSTANCE.getCharacterTrait();

		/**
		 * The meta object literal for the '<em><b>Trait</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_TRAIT__TRAIT = eINSTANCE.getCharacterTrait_Trait();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Psychological.impl.HumanValueImpl <em>Human Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Psychological.impl.HumanValueImpl
		 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getHumanValue()
		 * @generated
		 */
		EClass HUMAN_VALUE = eINSTANCE.getHumanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_VALUE__VALUE = eINSTANCE.getHumanValue_Value();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Psychological.impl.PsychologicalFactorImpl <em>Psychological Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Psychological.impl.PsychologicalFactorImpl
		 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getPsychologicalFactor()
		 * @generated
		 */
		EClass PSYCHOLOGICAL_FACTOR = eINSTANCE.getPsychologicalFactor();

		/**
		 * The meta object literal for the '{@link Psycho_Social_Factor.Psychological.impl.OtherPsychologicalFactorImpl <em>Other Psychological Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Psycho_Social_Factor.Psychological.impl.OtherPsychologicalFactorImpl
		 * @see Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl#getOtherPsychologicalFactor()
		 * @generated
		 */
		EClass OTHER_PSYCHOLOGICAL_FACTOR = eINSTANCE.getOtherPsychologicalFactor();

	}

} //psychoFactor_pkgPackage
