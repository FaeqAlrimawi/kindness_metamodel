/**
 */
package factors.Psychological.impl;

import factors.FactorsPackage;

import factors.Psychological.CharacterTrait;
import factors.Psychological.Emotion;
import factors.Psychological.HumanValue;
import factors.Psychological.NewPackage2Factory;
import factors.Psychological.NewPackage2Package;
import factors.Psychological.OtherPsychologicalFactor;
import factors.Psychological.PsychologicalFactor;
import factors.Psychological.SelfEfficacy;

import factors.Social.NewPackage1Package;

import factors.Social.impl.NewPackage1PackageImpl;

import factors.impl.FactorsPackageImpl;

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
public class NewPackage2PackageImpl extends EPackageImpl implements NewPackage2Package {
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
	 * @see factors.Psychological.NewPackage2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NewPackage2PackageImpl() {
		super(eNS_URI, NewPackage2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NewPackage2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NewPackage2Package init() {
		if (isInited)
			return (NewPackage2Package) EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredNewPackage2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		NewPackage2PackageImpl theNewPackage2Package = registeredNewPackage2Package instanceof NewPackage2PackageImpl
				? (NewPackage2PackageImpl) registeredNewPackage2Package
				: new NewPackage2PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KindnessPackage.eNS_URI);
		KindnessPackageImpl theKindnessPackage = (KindnessPackageImpl) (registeredPackage instanceof KindnessPackageImpl
				? registeredPackage
				: KindnessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FactorsPackage.eNS_URI);
		FactorsPackageImpl theFactorsPackage = (FactorsPackageImpl) (registeredPackage instanceof FactorsPackageImpl
				? registeredPackage
				: FactorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI);
		NewPackage1PackageImpl theNewPackage1Package = (NewPackage1PackageImpl) (registeredPackage instanceof NewPackage1PackageImpl
				? registeredPackage
				: NewPackage1Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KtypesPackage.eNS_URI);
		KtypesPackageImpl theKtypesPackage = (KtypesPackageImpl) (registeredPackage instanceof KtypesPackageImpl
				? registeredPackage
				: KtypesPackage.eINSTANCE);

		// Create package meta-data objects
		theNewPackage2Package.createPackageContents();
		theKindnessPackage.createPackageContents();
		theFactorsPackage.createPackageContents();
		theNewPackage1Package.createPackageContents();
		theKtypesPackage.createPackageContents();

		// Initialize created meta-data
		theNewPackage2Package.initializePackageContents();
		theKindnessPackage.initializePackageContents();
		theFactorsPackage.initializePackageContents();
		theNewPackage1Package.initializePackageContents();
		theKtypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNewPackage2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NewPackage2Package.eNS_URI, theNewPackage2Package);
		return theNewPackage2Package;
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
	public NewPackage2Factory getNewPackage2Factory() {
		return (NewPackage2Factory) getEFactoryInstance();
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
		FactorsPackage theFactorsPackage = (FactorsPackage) EPackage.Registry.INSTANCE
				.getEPackage(FactorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emotionEClass.getESuperTypes().add(this.getPsychologicalFactor());
		selfEfficacyEClass.getESuperTypes().add(this.getPsychologicalFactor());
		characterTraitEClass.getESuperTypes().add(this.getPsychologicalFactor());
		humanValueEClass.getESuperTypes().add(this.getPsychologicalFactor());
		psychologicalFactorEClass.getESuperTypes().add(theFactorsPackage.getFactor());
		otherPsychologicalFactorEClass.getESuperTypes().add(this.getPsychologicalFactor());

		// Initialize classes, features, and operations; add parameters
		initEClass(emotionEClass, Emotion.class, "Emotion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmotion_Type(), theFactorsPackage.getEmotionType(), "type", null, 0, 1, Emotion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfEfficacyEClass, SelfEfficacy.class, "SelfEfficacy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterTraitEClass, CharacterTrait.class, "CharacterTrait", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterTrait_Trait(), theFactorsPackage.getTraitType(), "trait", null, 0, 1,
				CharacterTrait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(humanValueEClass, HumanValue.class, "HumanValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHumanValue_Value(), theFactorsPackage.getHumanValueType(), "value", null, 0, 1,
				HumanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(psychologicalFactorEClass, PsychologicalFactor.class, "PsychologicalFactor", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherPsychologicalFactorEClass, OtherPsychologicalFactor.class, "OtherPsychologicalFactor",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //NewPackage2PackageImpl
