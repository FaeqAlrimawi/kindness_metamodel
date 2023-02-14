/**
 */
package Psycho_Social_Factor.impl;

import Psycho_Social_Factor.AbsConnection;
import Psycho_Social_Factor.AbsPsychologicalFactors;
import Psycho_Social_Factor.AbsSocialFactors;
import Psycho_Social_Factor.AffectedFactors;
import Psycho_Social_Factor.DegreeOfRelatedness;
import Psycho_Social_Factor.EmotionType;
import Psycho_Social_Factor.Factor;
import Psycho_Social_Factor.FactorImpact;
import Psycho_Social_Factor.HumanValueType;
import Psycho_Social_Factor.Level;
import Psycho_Social_Factor.Need;
import Psycho_Social_Factor.Opportunity;
import Psycho_Social_Factor.Psycho_Social_FactorFactory;
import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl;

import Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage;

import Psycho_Social_Factor.Social.SocialFactor_pkgPackage;

import Psycho_Social_Factor.Social.impl.SocialFactor_pkgPackageImpl;

import Psycho_Social_Factor.TraitType;

import diagram.KindnessDiagramPackage;

import diagram.impl.KindnessDiagramPackageImpl;

import kindness_metamodel.KindnessPackage;

import kindness_metamodel.impl.KindnessPackageImpl;

import ktypes.KtypesPackage;

import ktypes.impl.KtypesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Psycho_Social_FactorPackageImpl extends EPackageImpl implements Psycho_Social_FactorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absSocialFactorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absPsychologicalFactorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectedFactorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum degreeOfRelatednessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum needEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum opportunityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum factorImpactEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum emotionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum traitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum humanValueTypeEEnum = null;

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
	 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Psycho_Social_FactorPackageImpl() {
		super(eNS_URI, Psycho_Social_FactorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Psycho_Social_FactorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Psycho_Social_FactorPackage init() {
		if (isInited)
			return (Psycho_Social_FactorPackage) EPackage.Registry.INSTANCE
					.getEPackage(Psycho_Social_FactorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPsycho_Social_FactorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Psycho_Social_FactorPackageImpl thePsycho_Social_FactorPackage = registeredPsycho_Social_FactorPackage instanceof Psycho_Social_FactorPackageImpl
				? (Psycho_Social_FactorPackageImpl) registeredPsycho_Social_FactorPackage
				: new Psycho_Social_FactorPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KindnessPackage.eNS_URI);
		KindnessPackageImpl theKindnessPackage = (KindnessPackageImpl) (registeredPackage instanceof KindnessPackageImpl
				? registeredPackage
				: KindnessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SocialFactor_pkgPackage.eNS_URI);
		SocialFactor_pkgPackageImpl theSocialFactor_pkgPackage = (SocialFactor_pkgPackageImpl) (registeredPackage instanceof SocialFactor_pkgPackageImpl
				? registeredPackage
				: SocialFactor_pkgPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(psychoFactor_pkgPackage.eNS_URI);
		psychoFactor_pkgPackageImpl thepsychoFactor_pkgPackage = (psychoFactor_pkgPackageImpl) (registeredPackage instanceof psychoFactor_pkgPackageImpl
				? registeredPackage
				: psychoFactor_pkgPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KtypesPackage.eNS_URI);
		KtypesPackageImpl theKtypesPackage = (KtypesPackageImpl) (registeredPackage instanceof KtypesPackageImpl
				? registeredPackage
				: KtypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KindnessDiagramPackage.eNS_URI);
		KindnessDiagramPackageImpl theKindnessDiagramPackage = (KindnessDiagramPackageImpl) (registeredPackage instanceof KindnessDiagramPackageImpl
				? registeredPackage
				: KindnessDiagramPackage.eINSTANCE);

		// Create package meta-data objects
		thePsycho_Social_FactorPackage.createPackageContents();
		theKindnessPackage.createPackageContents();
		theSocialFactor_pkgPackage.createPackageContents();
		thepsychoFactor_pkgPackage.createPackageContents();
		theKtypesPackage.createPackageContents();
		theKindnessDiagramPackage.createPackageContents();

		// Initialize created meta-data
		thePsycho_Social_FactorPackage.initializePackageContents();
		theKindnessPackage.initializePackageContents();
		theSocialFactor_pkgPackage.initializePackageContents();
		thepsychoFactor_pkgPackage.initializePackageContents();
		theKtypesPackage.initializePackageContents();
		theKindnessDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePsycho_Social_FactorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Psycho_Social_FactorPackage.eNS_URI, thePsycho_Social_FactorPackage);
		return thePsycho_Social_FactorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsSocialFactors() {
		return absSocialFactorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsSocialFactors_Connection() {
		return (EReference) absSocialFactorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsSocialFactors_Socialfactor() {
		return (EReference) absSocialFactorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsConnection() {
		return absConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactor() {
		return factorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_Name() {
		return (EAttribute) factorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactor_Affectedfactor() {
		return (EReference) factorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_Other() {
		return (EAttribute) factorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactor_Level() {
		return (EAttribute) factorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFactor__ComputeImpact__FactorImpact() {
		return factorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsPsychologicalFactors() {
		return absPsychologicalFactorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsPsychologicalFactors_Psychologicalfactor() {
		return (EReference) absPsychologicalFactorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffectedFactors() {
		return affectedFactorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffectedFactors_Factor() {
		return (EReference) affectedFactorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffectedFactors_Impact() {
		return (EAttribute) affectedFactorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDegreeOfRelatedness() {
		return degreeOfRelatednessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNeed() {
		return needEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOpportunity() {
		return opportunityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFactorImpact() {
		return factorImpactEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEmotionType() {
		return emotionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTraitType() {
		return traitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHumanValueType() {
		return humanValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psycho_Social_FactorFactory getPsycho_Social_FactorFactory() {
		return (Psycho_Social_FactorFactory) getEFactoryInstance();
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
		absSocialFactorsEClass = createEClass(ABS_SOCIAL_FACTORS);
		createEReference(absSocialFactorsEClass, ABS_SOCIAL_FACTORS__CONNECTION);
		createEReference(absSocialFactorsEClass, ABS_SOCIAL_FACTORS__SOCIALFACTOR);

		absConnectionEClass = createEClass(ABS_CONNECTION);

		factorEClass = createEClass(FACTOR);
		createEAttribute(factorEClass, FACTOR__NAME);
		createEReference(factorEClass, FACTOR__AFFECTEDFACTOR);
		createEAttribute(factorEClass, FACTOR__OTHER);
		createEAttribute(factorEClass, FACTOR__LEVEL);
		createEOperation(factorEClass, FACTOR___COMPUTE_IMPACT__FACTORIMPACT);

		absPsychologicalFactorsEClass = createEClass(ABS_PSYCHOLOGICAL_FACTORS);
		createEReference(absPsychologicalFactorsEClass, ABS_PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR);

		affectedFactorsEClass = createEClass(AFFECTED_FACTORS);
		createEReference(affectedFactorsEClass, AFFECTED_FACTORS__FACTOR);
		createEAttribute(affectedFactorsEClass, AFFECTED_FACTORS__IMPACT);

		// Create enums
		degreeOfRelatednessEEnum = createEEnum(DEGREE_OF_RELATEDNESS);
		needEEnum = createEEnum(NEED);
		opportunityEEnum = createEEnum(OPPORTUNITY);
		levelEEnum = createEEnum(LEVEL);
		factorImpactEEnum = createEEnum(FACTOR_IMPACT);
		emotionTypeEEnum = createEEnum(EMOTION_TYPE);
		traitTypeEEnum = createEEnum(TRAIT_TYPE);
		humanValueTypeEEnum = createEEnum(HUMAN_VALUE_TYPE);
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
		SocialFactor_pkgPackage theSocialFactor_pkgPackage = (SocialFactor_pkgPackage) EPackage.Registry.INSTANCE
				.getEPackage(SocialFactor_pkgPackage.eNS_URI);
		psychoFactor_pkgPackage thepsychoFactor_pkgPackage = (psychoFactor_pkgPackage) EPackage.Registry.INSTANCE
				.getEPackage(psychoFactor_pkgPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSocialFactor_pkgPackage);
		getESubpackages().add(thepsychoFactor_pkgPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(absSocialFactorsEClass, AbsSocialFactors.class, "AbsSocialFactors", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsSocialFactors_Connection(), this.getAbsConnection(), null, "connection", null, 0, 1,
				AbsSocialFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbsSocialFactors_Socialfactor(), theSocialFactor_pkgPackage.getSocialFactor(), null,
				"socialfactor", null, 0, -1, AbsSocialFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absConnectionEClass, AbsConnection.class, "AbsConnection", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(factorEClass, Factor.class, "Factor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Factor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactor_Affectedfactor(), this.getAffectedFactors(), null, "affectedfactor", null, 0, -1,
				Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_Other(), ecorePackage.getEString(), "other", null, 0, 1, Factor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactor_Level(), this.getLevel(), "level", "MEDIUM", 0, 1, Factor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getFactor__ComputeImpact__FactorImpact(), null, "computeImpact", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getFactorImpact(), "impact", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(absPsychologicalFactorsEClass, AbsPsychologicalFactors.class, "AbsPsychologicalFactors", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsPsychologicalFactors_Psychologicalfactor(),
				thepsychoFactor_pkgPackage.getPsychologicalFactor(), null, "psychologicalfactor", null, 0, -1,
				AbsPsychologicalFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affectedFactorsEClass, AffectedFactors.class, "AffectedFactors", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAffectedFactors_Factor(), this.getFactor(), null, "factor", null, 0, 1, AffectedFactors.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffectedFactors_Impact(), this.getFactorImpact(), "impact", "POSITIVE", 0, 1,
				AffectedFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(degreeOfRelatednessEEnum, DegreeOfRelatedness.class, "DegreeOfRelatedness");
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.FAMILY);
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.FRIEND);
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.COLLEAGUE);
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.ACQUAINTANCE);
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.STRANGER);
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.OTHER);

		initEEnum(needEEnum, Need.class, "Need");
		addEEnumLiteral(needEEnum, Need.EMOTIONAL);
		addEEnumLiteral(needEEnum, Need.INSTRUMENTAL);
		addEEnumLiteral(needEEnum, Need.HEALTH_RELATED);
		addEEnumLiteral(needEEnum, Need.OTHER);

		initEEnum(opportunityEEnum, Opportunity.class, "Opportunity");
		addEEnumLiteral(opportunityEEnum, Opportunity.MAKE_NEW_FRIEND);
		addEEnumLiteral(opportunityEEnum, Opportunity.KEEP_OLD_FRIEND);
		addEEnumLiteral(opportunityEEnum, Opportunity.STRENGTHEN_FAMILY_TIES);
		addEEnumLiteral(opportunityEEnum, Opportunity.OTHER);

		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.HIGH);
		addEEnumLiteral(levelEEnum, Level.MEDIUM);
		addEEnumLiteral(levelEEnum, Level.LOW);
		addEEnumLiteral(levelEEnum, Level.IGNORE);
		addEEnumLiteral(levelEEnum, Level.UNSPECIFIED);
		addEEnumLiteral(levelEEnum, Level.EXTREME);
		addEEnumLiteral(levelEEnum, Level.NONE);

		initEEnum(factorImpactEEnum, FactorImpact.class, "FactorImpact");
		addEEnumLiteral(factorImpactEEnum, FactorImpact.POSITIVE);
		addEEnumLiteral(factorImpactEEnum, FactorImpact.NEGATIVE);
		addEEnumLiteral(factorImpactEEnum, FactorImpact.NONE);
		addEEnumLiteral(factorImpactEEnum, FactorImpact.UNKNOWN);

		initEEnum(emotionTypeEEnum, EmotionType.class, "EmotionType");
		addEEnumLiteral(emotionTypeEEnum, EmotionType.HAPPINESS);
		addEEnumLiteral(emotionTypeEEnum, EmotionType.SADNESS);
		addEEnumLiteral(emotionTypeEEnum, EmotionType.GUILT);
		addEEnumLiteral(emotionTypeEEnum, EmotionType.OTHER);

		initEEnum(traitTypeEEnum, TraitType.class, "TraitType");
		addEEnumLiteral(traitTypeEEnum, TraitType.OPENNESS);
		addEEnumLiteral(traitTypeEEnum, TraitType.AGREEABLENESS);
		addEEnumLiteral(traitTypeEEnum, TraitType.EXTRAVERSION);
		addEEnumLiteral(traitTypeEEnum, TraitType.OTHER);

		initEEnum(humanValueTypeEEnum, HumanValueType.class, "HumanValueType");
		addEEnumLiteral(humanValueTypeEEnum, HumanValueType.BENEVOLENCE);
		addEEnumLiteral(humanValueTypeEEnum, HumanValueType.UNIVERSALISM);
		addEEnumLiteral(humanValueTypeEEnum, HumanValueType.TRADITION);
		addEEnumLiteral(humanValueTypeEEnum, HumanValueType.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //Psycho_Social_FactorPackageImpl
