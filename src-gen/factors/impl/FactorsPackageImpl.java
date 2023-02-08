/**
 */
package factors.impl;

import factors.AbsKindnessEntity;
import factors.AbsPsychologicalFactors;
import factors.AbsSocialFactors;
import factors.DegreeOfRelatedness;
import factors.Factor;
import factors.FactorsFactory;
import factors.FactorsPackage;
import factors.Level;
import factors.Need;
import factors.Opportunity;

import factors.Social.NewPackage1Package;

import factors.Social.impl.NewPackage1PackageImpl;

import kindness_metamodel.KindnessPackage;

import kindness_metamodel.impl.KindnessPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactorsPackageImpl extends EPackageImpl implements FactorsPackage {
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
	private EClass absKindnessEntityEClass = null;

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
	 * @see factors.FactorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FactorsPackageImpl() {
		super(eNS_URI, FactorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FactorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FactorsPackage init() {
		if (isInited)
			return (FactorsPackage) EPackage.Registry.INSTANCE.getEPackage(FactorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFactorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FactorsPackageImpl theFactorsPackage = registeredFactorsPackage instanceof FactorsPackageImpl
				? (FactorsPackageImpl) registeredFactorsPackage
				: new FactorsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KindnessPackage.eNS_URI);
		KindnessPackageImpl theKindnessPackage = (KindnessPackageImpl) (registeredPackage instanceof KindnessPackageImpl
				? registeredPackage
				: KindnessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI);
		NewPackage1PackageImpl theNewPackage1Package = (NewPackage1PackageImpl) (registeredPackage instanceof NewPackage1PackageImpl
				? registeredPackage
				: NewPackage1Package.eINSTANCE);

		// Create package meta-data objects
		theFactorsPackage.createPackageContents();
		theKindnessPackage.createPackageContents();
		theNewPackage1Package.createPackageContents();

		// Initialize created meta-data
		theFactorsPackage.initializePackageContents();
		theKindnessPackage.initializePackageContents();
		theNewPackage1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFactorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FactorsPackage.eNS_URI, theFactorsPackage);
		return theFactorsPackage;
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
	public EReference getAbsSocialFactors_Actor() {
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
	public EClass getAbsKindnessEntity() {
		return absKindnessEntityEClass;
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
	public EClass getAbsPsychologicalFactors() {
		return absPsychologicalFactorsEClass;
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
	public FactorsFactory getFactorsFactory() {
		return (FactorsFactory) getEFactoryInstance();
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
		createEReference(absSocialFactorsEClass, ABS_SOCIAL_FACTORS__ACTOR);
		createEReference(absSocialFactorsEClass, ABS_SOCIAL_FACTORS__SOCIALFACTOR);

		absKindnessEntityEClass = createEClass(ABS_KINDNESS_ENTITY);

		factorEClass = createEClass(FACTOR);
		createEAttribute(factorEClass, FACTOR__NAME);

		absPsychologicalFactorsEClass = createEClass(ABS_PSYCHOLOGICAL_FACTORS);

		// Create enums
		degreeOfRelatednessEEnum = createEEnum(DEGREE_OF_RELATEDNESS);
		needEEnum = createEEnum(NEED);
		opportunityEEnum = createEEnum(OPPORTUNITY);
		levelEEnum = createEEnum(LEVEL);
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
		NewPackage1Package theNewPackage1Package = (NewPackage1Package) EPackage.Registry.INSTANCE
				.getEPackage(NewPackage1Package.eNS_URI);

		// Add subpackages
		getESubpackages().add(theNewPackage1Package);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(absSocialFactorsEClass, AbsSocialFactors.class, "AbsSocialFactors", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsSocialFactors_Actor(), this.getAbsKindnessEntity(), null, "actor", null, 0, 1,
				AbsSocialFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbsSocialFactors_Socialfactor(), theNewPackage1Package.getSocialFactor(), null,
				"socialfactor", null, 0, -1, AbsSocialFactors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absKindnessEntityEClass, AbsKindnessEntity.class, "AbsKindnessEntity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(factorEClass, Factor.class, "Factor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Factor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absPsychologicalFactorsEClass, AbsPsychologicalFactors.class, "AbsPsychologicalFactors", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(degreeOfRelatednessEEnum, DegreeOfRelatedness.class, "DegreeOfRelatedness");
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.FAMILY);
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.FRIEND);
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.COLLEAGUE);
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.ACQUAINTANCE);
		addEEnumLiteral(degreeOfRelatednessEEnum, DegreeOfRelatedness.STRANGER);

		initEEnum(needEEnum, Need.class, "Need");
		addEEnumLiteral(needEEnum, Need.EMOTIONAL);
		addEEnumLiteral(needEEnum, Need.INSTRUMENTAL);
		addEEnumLiteral(needEEnum, Need.HEALTH_RELATED);

		initEEnum(opportunityEEnum, Opportunity.class, "Opportunity");
		addEEnumLiteral(opportunityEEnum, Opportunity.MAKE_NEW_FRIEND);
		addEEnumLiteral(opportunityEEnum, Opportunity.KEEP_OLD_FRIEND);
		addEEnumLiteral(opportunityEEnum, Opportunity.STRENGTHEN_FAMILY_TIES);

		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.HIGH);
		addEEnumLiteral(levelEEnum, Level.MEDIUM);
		addEEnumLiteral(levelEEnum, Level.LOW);

		// Create resource
		createResource(eNS_URI);
	}

} //FactorsPackageImpl
