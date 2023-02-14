/**
 */
package diagram.impl;

import Psycho_Social_Factor.Psycho_Social_FactorPackage;

import Psycho_Social_Factor.Psychological.impl.psychoFactor_pkgPackageImpl;

import Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage;

import Psycho_Social_Factor.Social.SocialFactor_pkgPackage;

import Psycho_Social_Factor.Social.impl.SocialFactor_pkgPackageImpl;

import Psycho_Social_Factor.impl.Psycho_Social_FactorPackageImpl;

import diagram.AbsKindnessEntity;
import diagram.AbsKindnessOpportunity;
import diagram.KDiagram;
import diagram.KindnessDiagramFactory;
import diagram.KindnessDiagramPackage;

import kindness_metamodel.KindnessPackage;

import kindness_metamodel.impl.KindnessPackageImpl;

import ktypes.KtypesPackage;

import ktypes.impl.KtypesPackageImpl;

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
public class KindnessDiagramPackageImpl extends EPackageImpl implements KindnessDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absKindnessOpportunityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absKindnessEntityEClass = null;

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
	 * @see diagram.KindnessDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KindnessDiagramPackageImpl() {
		super(eNS_URI, KindnessDiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KindnessDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KindnessDiagramPackage init() {
		if (isInited)
			return (KindnessDiagramPackage) EPackage.Registry.INSTANCE.getEPackage(KindnessDiagramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKindnessDiagramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KindnessDiagramPackageImpl theKindnessDiagramPackage = registeredKindnessDiagramPackage instanceof KindnessDiagramPackageImpl
				? (KindnessDiagramPackageImpl) registeredKindnessDiagramPackage
				: new KindnessDiagramPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KtypesPackage.eNS_URI);
		KtypesPackageImpl theKtypesPackage = (KtypesPackageImpl) (registeredPackage instanceof KtypesPackageImpl
				? registeredPackage
				: KtypesPackage.eINSTANCE);

		// Create package meta-data objects
		theKindnessDiagramPackage.createPackageContents();
		theKindnessPackage.createPackageContents();
		thePsycho_Social_FactorPackage.createPackageContents();
		theSocialFactor_pkgPackage.createPackageContents();
		thepsychoFactor_pkgPackage.createPackageContents();
		theKtypesPackage.createPackageContents();

		// Initialize created meta-data
		theKindnessDiagramPackage.initializePackageContents();
		theKindnessPackage.initializePackageContents();
		thePsycho_Social_FactorPackage.initializePackageContents();
		theSocialFactor_pkgPackage.initializePackageContents();
		thepsychoFactor_pkgPackage.initializePackageContents();
		theKtypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKindnessDiagramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KindnessDiagramPackage.eNS_URI, theKindnessDiagramPackage);
		return theKindnessDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKDiagram() {
		return kDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKDiagram_Abskindnessopportunity() {
		return (EReference) kDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKDiagram_Abskindnessentity() {
		return (EReference) kDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsKindnessOpportunity() {
		return absKindnessOpportunityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsKindnessEntity() {
		return absKindnessEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessDiagramFactory getKindnessDiagramFactory() {
		return (KindnessDiagramFactory) getEFactoryInstance();
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
		kDiagramEClass = createEClass(KDIAGRAM);
		createEReference(kDiagramEClass, KDIAGRAM__ABSKINDNESSOPPORTUNITY);
		createEReference(kDiagramEClass, KDIAGRAM__ABSKINDNESSENTITY);

		absKindnessOpportunityEClass = createEClass(ABS_KINDNESS_OPPORTUNITY);

		absKindnessEntityEClass = createEClass(ABS_KINDNESS_ENTITY);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(kDiagramEClass, KDiagram.class, "KDiagram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKDiagram_Abskindnessopportunity(), this.getAbsKindnessOpportunity(), null,
				"abskindnessopportunity", null, 0, -1, KDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKDiagram_Abskindnessentity(), this.getAbsKindnessEntity(), null, "abskindnessentity", null, 0,
				-1, KDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absKindnessOpportunityEClass, AbsKindnessOpportunity.class, "AbsKindnessOpportunity", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(absKindnessEntityEClass, AbsKindnessEntity.class, "AbsKindnessEntity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KindnessDiagramPackageImpl
