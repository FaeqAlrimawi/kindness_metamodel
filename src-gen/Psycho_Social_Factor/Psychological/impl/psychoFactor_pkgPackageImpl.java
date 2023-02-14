/**
 */
package Psycho_Social_Factor.Psychological.impl;

import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import Psycho_Social_Factor.Psychological.CharacterTrait;
import Psycho_Social_Factor.Psychological.Emotion;
import Psycho_Social_Factor.Psychological.HumanValue;
import Psycho_Social_Factor.Psychological.OtherPsychologicalFactor;
import Psycho_Social_Factor.Psychological.PsychologicalFactor;
import Psycho_Social_Factor.Psychological.SelfEfficacy;
import Psycho_Social_Factor.Psychological.psychoFactor_pkgFactory;
import Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage;

import Psycho_Social_Factor.Social.SocialFactor_pkgPackage;

import Psycho_Social_Factor.Social.impl.SocialFactor_pkgPackageImpl;

import Psycho_Social_Factor.impl.Psycho_Social_FactorPackageImpl;

import diagram.KindnessDiagramPackage;

import diagram.impl.KindnessDiagramPackageImpl;

import kindness_metamodel.KindnessPackage;

import kindness_metamodel.impl.KindnessPackageImpl;

import ktypes.KtypesPackage;

import ktypes.impl.KtypesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class psychoFactor_pkgPackageImpl extends EPackageImpl implements psychoFactor_pkgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emotionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfEfficacyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterTraitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psychologicalFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherPsychologicalFactorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private psychoFactor_pkgPackageImpl() {
		super(eNS_URI, psychoFactor_pkgFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link psychoFactor_pkgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static psychoFactor_pkgPackage init() {
		if (isInited)
			return (psychoFactor_pkgPackage) EPackage.Registry.INSTANCE.getEPackage(psychoFactor_pkgPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredpsychoFactor_pkgPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		psychoFactor_pkgPackageImpl thepsychoFactor_pkgPackage = registeredpsychoFactor_pkgPackage instanceof psychoFactor_pkgPackageImpl
				? (psychoFactor_pkgPackageImpl) registeredpsychoFactor_pkgPackage
				: new psychoFactor_pkgPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KindnessPackage.eNS_URI);
		KindnessPackageImpl theKindnessPackage = (KindnessPackageImpl) (registeredPackage instanceof KindnessPackageImpl
				? registeredPackage
				: KindnessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Psycho_Social_FactorPackage.eNS_URI);
		Psycho_Social_FactorPackageImpl thePsycho_Social_FactorPackage = (Psycho_Social_FactorPackageImpl) (registeredPackage instanceof Psycho_Social_FactorPackageImpl
				? registeredPackage
				: Psycho_Social_FactorPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SocialFactor_pkgPackage.eNS_URI);
		SocialFactor_pkgPackageImpl theSocialFactor_pkgPackage = (SocialFactor_pkgPackageImpl) (registeredPackage instanceof SocialFactor_pkgPackageImpl
				? registeredPackage
				: SocialFactor_pkgPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KtypesPackage.eNS_URI);
		KtypesPackageImpl theKtypesPackage = (KtypesPackageImpl) (registeredPackage instanceof KtypesPackageImpl
				? registeredPackage
				: KtypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KindnessDiagramPackage.eNS_URI);
		KindnessDiagramPackageImpl theKindnessDiagramPackage = (KindnessDiagramPackageImpl) (registeredPackage instanceof KindnessDiagramPackageImpl
				? registeredPackage
				: KindnessDiagramPackage.eINSTANCE);

		// Create package meta-data objects
		thepsychoFactor_pkgPackage.createPackageContents();
		theKindnessPackage.createPackageContents();
		thePsycho_Social_FactorPackage.createPackageContents();
		theSocialFactor_pkgPackage.createPackageContents();
		theKtypesPackage.createPackageContents();
		theKindnessDiagramPackage.createPackageContents();

		// Initialize created meta-data
		thepsychoFactor_pkgPackage.initializePackageContents();
		theKindnessPackage.initializePackageContents();
		thePsycho_Social_FactorPackage.initializePackageContents();
		theSocialFactor_pkgPackage.initializePackageContents();
		theKtypesPackage.initializePackageContents();
		theKindnessDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thepsychoFactor_pkgPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(psychoFactor_pkgPackage.eNS_URI, thepsychoFactor_pkgPackage);
		return thepsychoFactor_pkgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmotion() {
		return emotionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmotion_Type() {
		return (EAttribute) emotionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfEfficacy() {
		return selfEfficacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterTrait() {
		return characterTraitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterTrait_Trait() {
		return (EAttribute) characterTraitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanValue() {
		return humanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHumanValue_Value() {
		return (EAttribute) humanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPsychologicalFactor() {
		return psychologicalFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherPsychologicalFactor() {
		return otherPsychologicalFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public psychoFactor_pkgFactory getpsychoFactor_pkgFactory() {
		return (psychoFactor_pkgFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		emotionEClass = createEClass(EMOTION);
		createEAttribute(emotionEClass, EMOTION__TYPE);

		selfEfficacyEClass = createEClass(SELF_EFFICACY);

		characterTraitEClass = createEClass(CHARACTER_TRAIT);
		createEAttribute(characterTraitEClass, CHARACTER_TRAIT__TRAIT);

		humanValueEClass = createEClass(HUMAN_VALUE);
		createEAttribute(humanValueEClass, HUMAN_VALUE__VALUE);

		psychologicalFactorEClass = createEClass(PSYCHOLOGICAL_FACTOR);

		otherPsychologicalFactorEClass = createEClass(OTHER_PSYCHOLOGICAL_FACTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Psycho_Social_FactorPackage thePsycho_Social_FactorPackage = (Psycho_Social_FactorPackage) EPackage.Registry.INSTANCE
				.getEPackage(Psycho_Social_FactorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emotionEClass.getESuperTypes().add(this.getPsychologicalFactor());
		selfEfficacyEClass.getESuperTypes().add(this.getPsychologicalFactor());
		characterTraitEClass.getESuperTypes().add(this.getPsychologicalFactor());
		humanValueEClass.getESuperTypes().add(this.getPsychologicalFactor());
		psychologicalFactorEClass.getESuperTypes().add(thePsycho_Social_FactorPackage.getFactor());
		otherPsychologicalFactorEClass.getESuperTypes().add(this.getPsychologicalFactor());

		// Initialize classes, features, and operations; add parameters
		initEClass(emotionEClass, Emotion.class, "Emotion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmotion_Type(), thePsycho_Social_FactorPackage.getEmotionType(), "type", null, 0, 1,
				Emotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(selfEfficacyEClass, SelfEfficacy.class, "SelfEfficacy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterTraitEClass, CharacterTrait.class, "CharacterTrait", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterTrait_Trait(), thePsycho_Social_FactorPackage.getTraitType(), "trait", null, 0, 1,
				CharacterTrait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(humanValueEClass, HumanValue.class, "HumanValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHumanValue_Value(), thePsycho_Social_FactorPackage.getHumanValueType(), "value", null, 0, 1,
				HumanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(psychologicalFactorEClass, PsychologicalFactor.class, "PsychologicalFactor", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherPsychologicalFactorEClass, OtherPsychologicalFactor.class, "OtherPsychologicalFactor",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //psychoFactor_pkgPackageImpl
