/**
 */
package ktypes.impl;

import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl;

import Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage;

import Psycho_Social_Factor.Social.SocialFactor_pkgPackage;

import Psycho_Social_Factor.Social.impl.SocialFactor_pkgPackageImpl;

import Psycho_Social_Factor.impl.Psycho_Social_FactorPackageImpl;

import diagram.KindnessDiagramPackage;

import diagram.impl.KindnessDiagramPackageImpl;

import kindness_metamodel.KindnessPackage;

import kindness_metamodel.impl.KindnessPackageImpl;

import ktypes.KDigital;
import ktypes.KHuman;
import ktypes.KObject;
import ktypes.KPhysical;
import ktypes.KSocial;
import ktypes.KType;
import ktypes.KtypesFactory;
import ktypes.KtypesPackage;

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
public class KtypesPackageImpl extends EPackageImpl implements KtypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kHumanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kDigitalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kPhysicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kSocialEClass = null;

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
	 * @see ktypes.KtypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KtypesPackageImpl() {
		super(eNS_URI, KtypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KtypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KtypesPackage init() {
		if (isInited)
			return (KtypesPackage) EPackage.Registry.INSTANCE.getEPackage(KtypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKtypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KtypesPackageImpl theKtypesPackage = registeredKtypesPackage instanceof KtypesPackageImpl
				? (KtypesPackageImpl) registeredKtypesPackage
				: new KtypesPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(psychoFactor_pkgPackage.eNS_URI);
		psychoFactor_pkgPackageImpl thepsychoFactor_pkgPackage = (psychoFactor_pkgPackageImpl) (registeredPackage instanceof psychoFactor_pkgPackageImpl
				? registeredPackage
				: psychoFactor_pkgPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KindnessDiagramPackage.eNS_URI);
		KindnessDiagramPackageImpl theKindnessDiagramPackage = (KindnessDiagramPackageImpl) (registeredPackage instanceof KindnessDiagramPackageImpl
				? registeredPackage
				: KindnessDiagramPackage.eINSTANCE);

		// Create package meta-data objects
		theKtypesPackage.createPackageContents();
		theKindnessPackage.createPackageContents();
		thePsycho_Social_FactorPackage.createPackageContents();
		theSocialFactor_pkgPackage.createPackageContents();
		thepsychoFactor_pkgPackage.createPackageContents();
		theKindnessDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theKtypesPackage.initializePackageContents();
		theKindnessPackage.initializePackageContents();
		thePsycho_Social_FactorPackage.initializePackageContents();
		theSocialFactor_pkgPackage.initializePackageContents();
		thepsychoFactor_pkgPackage.initializePackageContents();
		theKindnessDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKtypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KtypesPackage.eNS_URI, theKtypesPackage);
		return theKtypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKObject() {
		return kObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKObject_Ktype() {
		return (EReference) kObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKType() {
		return kTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKHuman() {
		return kHumanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKDigital() {
		return kDigitalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKPhysical() {
		return kPhysicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKSocial() {
		return kSocialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KtypesFactory getKtypesFactory() {
		return (KtypesFactory) getEFactoryInstance();
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
		kObjectEClass = createEClass(KOBJECT);
		createEReference(kObjectEClass, KOBJECT__KTYPE);

		kTypeEClass = createEClass(KTYPE);

		kHumanEClass = createEClass(KHUMAN);

		kDigitalEClass = createEClass(KDIGITAL);

		kPhysicalEClass = createEClass(KPHYSICAL);

		kSocialEClass = createEClass(KSOCIAL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kHumanEClass.getESuperTypes().add(this.getKPhysical());
		kDigitalEClass.getESuperTypes().add(this.getKType());
		kPhysicalEClass.getESuperTypes().add(this.getKType());
		kSocialEClass.getESuperTypes().add(this.getKType());

		// Initialize classes, features, and operations; add parameters
		initEClass(kObjectEClass, KObject.class, "KObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKObject_Ktype(), this.getKType(), null, "ktype", null, 1, 1, KObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(kTypeEClass, KType.class, "KType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kHumanEClass, KHuman.class, "KHuman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kDigitalEClass, KDigital.class, "KDigital", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(kPhysicalEClass, KPhysical.class, "KPhysical", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(kSocialEClass, KSocial.class, "KSocial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KtypesPackageImpl
