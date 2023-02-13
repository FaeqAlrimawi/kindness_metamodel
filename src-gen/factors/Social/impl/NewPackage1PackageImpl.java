/**
 */
package factors.Social.impl;

import factors.FactorsPackage;

import factors.Psychological.NewPackage2Package;

import factors.Psychological.impl.NewPackage2PackageImpl;

import factors.Social.LevelOfNeed;
import factors.Social.NewPackage1Factory;
import factors.Social.NewPackage1Package;
import factors.Social.OpportunityToConnect;
import factors.Social.OtherSocialFactor;
import factors.Social.Reciprocity;
import factors.Social.Relatedness;
import factors.Social.SocialFactor;
import factors.Social.Trust;

import factors.impl.FactorsPackageImpl;

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
public class NewPackage1PackageImpl extends EPackageImpl implements NewPackage1Package {
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
	 * @see factors.Social.NewPackage1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NewPackage1PackageImpl() {
		super(eNS_URI, NewPackage1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NewPackage1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NewPackage1Package init() {
		if (isInited)
			return (NewPackage1Package) EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredNewPackage1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		NewPackage1PackageImpl theNewPackage1Package = registeredNewPackage1Package instanceof NewPackage1PackageImpl
				? (NewPackage1PackageImpl) registeredNewPackage1Package
				: new NewPackage1PackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI);
		NewPackage2PackageImpl theNewPackage2Package = (NewPackage2PackageImpl) (registeredPackage instanceof NewPackage2PackageImpl
				? registeredPackage
				: NewPackage2Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KtypesPackage.eNS_URI);
		KtypesPackageImpl theKtypesPackage = (KtypesPackageImpl) (registeredPackage instanceof KtypesPackageImpl
				? registeredPackage
				: KtypesPackage.eINSTANCE);

		// Create package meta-data objects
		theNewPackage1Package.createPackageContents();
		theKindnessPackage.createPackageContents();
		theFactorsPackage.createPackageContents();
		theNewPackage2Package.createPackageContents();
		theKtypesPackage.createPackageContents();

		// Initialize created meta-data
		theNewPackage1Package.initializePackageContents();
		theKindnessPackage.initializePackageContents();
		theFactorsPackage.initializePackageContents();
		theNewPackage2Package.initializePackageContents();
		theKtypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNewPackage1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NewPackage1Package.eNS_URI, theNewPackage1Package);
		return theNewPackage1Package;
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
	public NewPackage1Factory getNewPackage1Factory() {
		return (NewPackage1Factory) getEFactoryInstance();
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
		FactorsPackage theFactorsPackage = (FactorsPackage) EPackage.Registry.INSTANCE
				.getEPackage(FactorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		levelOfNeedEClass.getESuperTypes().add(this.getSocialFactor());
		relatednessEClass.getESuperTypes().add(this.getSocialFactor());
		reciprocityEClass.getESuperTypes().add(this.getSocialFactor());
		socialFactorEClass.getESuperTypes().add(theFactorsPackage.getFactor());
		opportunityToConnectEClass.getESuperTypes().add(this.getSocialFactor());
		trustEClass.getESuperTypes().add(this.getSocialFactor());
		otherSocialFactorEClass.getESuperTypes().add(this.getSocialFactor());

		// Initialize classes, features, and operations; add parameters
		initEClass(levelOfNeedEClass, LevelOfNeed.class, "LevelOfNeed", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevelOfNeed_Need(), theFactorsPackage.getNeed(), "need", "EMOTIONAL", 0, 1, LevelOfNeed.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatednessEClass, Relatedness.class, "Relatedness", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelatedness_Degree(), theFactorsPackage.getDegreeOfRelatedness(), "degree", null, 0, 1,
				Relatedness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(reciprocityEClass, Reciprocity.class, "Reciprocity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReciprocity_IsReciprocal(), ecorePackage.getEBoolean(), "isReciprocal", null, 0, 1,
				Reciprocity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(socialFactorEClass, SocialFactor.class, "SocialFactor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSocialFactor_Connection(), theFactorsPackage.getAbsConnection(), null, "connection", null, 0,
				1, SocialFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opportunityToConnectEClass, OpportunityToConnect.class, "OpportunityToConnect", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpportunityToConnect_Opportunity(), theFactorsPackage.getOpportunity(), "opportunity", null,
				0, 1, OpportunityToConnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trustEClass, Trust.class, "Trust", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherSocialFactorEClass, OtherSocialFactor.class, "OtherSocialFactor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //NewPackage1PackageImpl
