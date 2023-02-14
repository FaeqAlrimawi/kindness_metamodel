/**
 */
package Psycho_Social_Factor.Social.impl;

import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl;

import Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage;

import Psycho_Social_Factor.Social.LevelOfNeed;
import Psycho_Social_Factor.Social.OpportunityToConnect;
import Psycho_Social_Factor.Social.OtherSocialFactor;
import Psycho_Social_Factor.Social.Reciprocity;
import Psycho_Social_Factor.Social.Relatedness;
import Psycho_Social_Factor.Social.SocialFactor;
import Psycho_Social_Factor.Social.SocialFactor_pkgFactory;
import Psycho_Social_Factor.Social.SocialFactor_pkgPackage;
import Psycho_Social_Factor.Social.Trust;

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
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialFactor_pkgPackageImpl extends EPackageImpl implements SocialFactor_pkgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelOfNeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatednessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reciprocityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opportunityToConnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherSocialFactorEClass = null;

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
	 * @see Psycho_Social_Factor.Social.SocialFactor_pkgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SocialFactor_pkgPackageImpl() {
		super(eNS_URI, SocialFactor_pkgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SocialFactor_pkgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SocialFactor_pkgPackage init() {
		if (isInited)
			return (SocialFactor_pkgPackage) EPackage.Registry.INSTANCE.getEPackage(SocialFactor_pkgPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSocialFactor_pkgPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SocialFactor_pkgPackageImpl theSocialFactor_pkgPackage = registeredSocialFactor_pkgPackage instanceof SocialFactor_pkgPackageImpl
				? (SocialFactor_pkgPackageImpl) registeredSocialFactor_pkgPackage
				: new SocialFactor_pkgPackageImpl();

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
		theSocialFactor_pkgPackage.createPackageContents();
		theKindnessPackage.createPackageContents();
		thePsycho_Social_FactorPackage.createPackageContents();
		thepsychoFactor_pkgPackage.createPackageContents();
		theKtypesPackage.createPackageContents();
		theKindnessDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theSocialFactor_pkgPackage.initializePackageContents();
		theKindnessPackage.initializePackageContents();
		thePsycho_Social_FactorPackage.initializePackageContents();
		thepsychoFactor_pkgPackage.initializePackageContents();
		theKtypesPackage.initializePackageContents();
		theKindnessDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSocialFactor_pkgPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SocialFactor_pkgPackage.eNS_URI, theSocialFactor_pkgPackage);
		return theSocialFactor_pkgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelOfNeed() {
		return levelOfNeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevelOfNeed_Need() {
		return (EAttribute) levelOfNeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedness() {
		return relatednessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatedness_Degree() {
		return (EAttribute) relatednessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReciprocity() {
		return reciprocityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReciprocity_IsReciprocal() {
		return (EAttribute) reciprocityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialFactor() {
		return socialFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocialFactor_Connection() {
		return (EReference) socialFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpportunityToConnect() {
		return opportunityToConnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpportunityToConnect_Opportunity() {
		return (EAttribute) opportunityToConnectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrust() {
		return trustEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherSocialFactor() {
		return otherSocialFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialFactor_pkgFactory getSocialFactor_pkgFactory() {
		return (SocialFactor_pkgFactory) getEFactoryInstance();
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
		levelOfNeedEClass = createEClass(LEVEL_OF_NEED);
		createEAttribute(levelOfNeedEClass, LEVEL_OF_NEED__NEED);

		relatednessEClass = createEClass(RELATEDNESS);
		createEAttribute(relatednessEClass, RELATEDNESS__DEGREE);

		reciprocityEClass = createEClass(RECIPROCITY);
		createEAttribute(reciprocityEClass, RECIPROCITY__IS_RECIPROCAL);

		socialFactorEClass = createEClass(SOCIAL_FACTOR);
		createEReference(socialFactorEClass, SOCIAL_FACTOR__CONNECTION);

		opportunityToConnectEClass = createEClass(OPPORTUNITY_TO_CONNECT);
		createEAttribute(opportunityToConnectEClass, OPPORTUNITY_TO_CONNECT__OPPORTUNITY);

		trustEClass = createEClass(TRUST);

		otherSocialFactorEClass = createEClass(OTHER_SOCIAL_FACTOR);
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
		levelOfNeedEClass.getESuperTypes().add(this.getSocialFactor());
		relatednessEClass.getESuperTypes().add(this.getSocialFactor());
		reciprocityEClass.getESuperTypes().add(this.getSocialFactor());
		socialFactorEClass.getESuperTypes().add(thePsycho_Social_FactorPackage.getFactor());
		opportunityToConnectEClass.getESuperTypes().add(this.getSocialFactor());
		trustEClass.getESuperTypes().add(this.getSocialFactor());
		otherSocialFactorEClass.getESuperTypes().add(this.getSocialFactor());

		// Initialize classes, features, and operations; add parameters
		initEClass(levelOfNeedEClass, LevelOfNeed.class, "LevelOfNeed", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevelOfNeed_Need(), thePsycho_Social_FactorPackage.getNeed(), "need", "EMOTIONAL", 0, 1,
				LevelOfNeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(relatednessEClass, Relatedness.class, "Relatedness", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelatedness_Degree(), thePsycho_Social_FactorPackage.getDegreeOfRelatedness(), "degree", null,
				0, 1, Relatedness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(reciprocityEClass, Reciprocity.class, "Reciprocity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReciprocity_IsReciprocal(), ecorePackage.getEBoolean(), "isReciprocal", null, 0, 1,
				Reciprocity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(socialFactorEClass, SocialFactor.class, "SocialFactor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSocialFactor_Connection(), thePsycho_Social_FactorPackage.getAbsConnection(), null,
				"connection", null, 0, 1, SocialFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opportunityToConnectEClass, OpportunityToConnect.class, "OpportunityToConnect", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpportunityToConnect_Opportunity(), thePsycho_Social_FactorPackage.getOpportunity(),
				"opportunity", null, 0, 1, OpportunityToConnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trustEClass, Trust.class, "Trust", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherSocialFactorEClass, OtherSocialFactor.class, "OtherSocialFactor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //SocialFactor_pkgPackageImpl
