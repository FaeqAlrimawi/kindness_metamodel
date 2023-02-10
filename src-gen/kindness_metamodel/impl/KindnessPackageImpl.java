/**
 */
package kindness_metamodel.impl;

import factors.FactorsPackage;

import factors.Psychological.NewPackage2Package;

import factors.Psychological.impl.NewPackage2PackageImpl;

import factors.Social.NewPackage1Package;

import factors.Social.impl.NewPackage1PackageImpl;

import factors.impl.FactorsPackageImpl;

import kindness_metamodel.Act;
import kindness_metamodel.ActType;
import kindness_metamodel.Actor;
import kindness_metamodel.Condition;
import kindness_metamodel.Connection;
import kindness_metamodel.Giver;
import kindness_metamodel.Item;
import kindness_metamodel.KindnessEntity;
import kindness_metamodel.KindnessFactory;
import kindness_metamodel.KindnessOpportunity;
import kindness_metamodel.KindnessPackage;
import kindness_metamodel.Location;
import kindness_metamodel.Mediator;
import kindness_metamodel.Motivation;
import kindness_metamodel.MotivationType;
import kindness_metamodel.Observant;
import kindness_metamodel.Property;
import kindness_metamodel.Psychological_Factors;
import kindness_metamodel.Receiver;
import kindness_metamodel.Social_Factors;
import kindness_metamodel.Time;

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
public class KindnessPackageImpl extends EPackageImpl implements KindnessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindnessOpportunityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindnessEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass giverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass social_FactorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psychological_FactorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motivationTypeEEnum = null;

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
	 * @see kindness_metamodel.KindnessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KindnessPackageImpl() {
		super(eNS_URI, KindnessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KindnessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KindnessPackage init() {
		if (isInited)
			return (KindnessPackage) EPackage.Registry.INSTANCE.getEPackage(KindnessPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKindnessPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KindnessPackageImpl theKindnessPackage = registeredKindnessPackage instanceof KindnessPackageImpl
				? (KindnessPackageImpl) registeredKindnessPackage
				: new KindnessPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FactorsPackage.eNS_URI);
		FactorsPackageImpl theFactorsPackage = (FactorsPackageImpl) (registeredPackage instanceof FactorsPackageImpl
				? registeredPackage
				: FactorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI);
		NewPackage1PackageImpl theNewPackage1Package = (NewPackage1PackageImpl) (registeredPackage instanceof NewPackage1PackageImpl
				? registeredPackage
				: NewPackage1Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI);
		NewPackage2PackageImpl theNewPackage2Package = (NewPackage2PackageImpl) (registeredPackage instanceof NewPackage2PackageImpl
				? registeredPackage
				: NewPackage2Package.eINSTANCE);

		// Create package meta-data objects
		theKindnessPackage.createPackageContents();
		theFactorsPackage.createPackageContents();
		theNewPackage1Package.createPackageContents();
		theNewPackage2Package.createPackageContents();

		// Initialize created meta-data
		theKindnessPackage.initializePackageContents();
		theFactorsPackage.initializePackageContents();
		theNewPackage1Package.initializePackageContents();
		theNewPackage2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKindnessPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KindnessPackage.eNS_URI, theKindnessPackage);
		return theKindnessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKindnessOpportunity() {
		return kindnessOpportunityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKindnessOpportunity_Name() {
		return (EAttribute) kindnessOpportunityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessOpportunity_Properties() {
		return (EReference) kindnessOpportunityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessOpportunity_Act() {
		return (EReference) kindnessOpportunityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAct() {
		return actEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAct_Name() {
		return (EAttribute) actEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAct_Type() {
		return (EAttribute) actEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Precondition() {
		return (EReference) actEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Postcondition() {
		return (EReference) actEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Giver() {
		return (EReference) actEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Receiver() {
		return (EReference) actEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Observant() {
		return (EReference) actEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Mediator() {
		return (EReference) actEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Next() {
		return (EReference) actEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_Items() {
		return (EReference) actEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Name() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_RefKindnessEntities() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKindnessEntity() {
		return kindnessEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKindnessEntity_Name() {
		return (EAttribute) kindnessEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKindnessEntity_Type() {
		return (EAttribute) kindnessEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessEntity_Connections() {
		return (EReference) kindnessEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessEntity_ContainerEntity() {
		return (EReference) kindnessEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessEntity_ContainedEntities() {
		return (EReference) kindnessEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindnessEntity_Properties() {
		return (EReference) kindnessEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Name() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Type() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Bidirectional() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Entity1() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Entity2() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Social_factors() {
		return (EReference) actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Psychological_factors() {
		return (EReference) actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGiver() {
		return giverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGiver_Motivations() {
		return (EReference) giverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiver() {
		return receiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservant() {
		return observantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediator() {
		return mediatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotivation() {
		return motivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotivation_Type() {
		return (EAttribute) motivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotivation_Level() {
		return (EAttribute) motivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotivation_Towards() {
		return (EReference) motivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocial_Factors() {
		return social_FactorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPsychological_Factors() {
		return psychological_FactorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActType() {
		return actTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotivationType() {
		return motivationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessFactory getKindnessFactory() {
		return (KindnessFactory) getEFactoryInstance();
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
		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		kindnessOpportunityEClass = createEClass(KINDNESS_OPPORTUNITY);
		createEAttribute(kindnessOpportunityEClass, KINDNESS_OPPORTUNITY__NAME);
		createEReference(kindnessOpportunityEClass, KINDNESS_OPPORTUNITY__PROPERTIES);
		createEReference(kindnessOpportunityEClass, KINDNESS_OPPORTUNITY__ACT);

		actEClass = createEClass(ACT);
		createEAttribute(actEClass, ACT__NAME);
		createEAttribute(actEClass, ACT__TYPE);
		createEReference(actEClass, ACT__PRECONDITION);
		createEReference(actEClass, ACT__POSTCONDITION);
		createEReference(actEClass, ACT__GIVER);
		createEReference(actEClass, ACT__RECEIVER);
		createEReference(actEClass, ACT__OBSERVANT);
		createEReference(actEClass, ACT__MEDIATOR);
		createEReference(actEClass, ACT__NEXT);
		createEReference(actEClass, ACT__ITEMS);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);
		createEReference(conditionEClass, CONDITION__REF_KINDNESS_ENTITIES);

		kindnessEntityEClass = createEClass(KINDNESS_ENTITY);
		createEAttribute(kindnessEntityEClass, KINDNESS_ENTITY__NAME);
		createEAttribute(kindnessEntityEClass, KINDNESS_ENTITY__TYPE);
		createEReference(kindnessEntityEClass, KINDNESS_ENTITY__CONNECTIONS);
		createEReference(kindnessEntityEClass, KINDNESS_ENTITY__CONTAINER_ENTITY);
		createEReference(kindnessEntityEClass, KINDNESS_ENTITY__CONTAINED_ENTITIES);
		createEReference(kindnessEntityEClass, KINDNESS_ENTITY__PROPERTIES);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__NAME);
		createEAttribute(connectionEClass, CONNECTION__TYPE);
		createEAttribute(connectionEClass, CONNECTION__BIDIRECTIONAL);
		createEReference(connectionEClass, CONNECTION__ENTITY1);
		createEReference(connectionEClass, CONNECTION__ENTITY2);

		locationEClass = createEClass(LOCATION);

		timeEClass = createEClass(TIME);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__SOCIAL_FACTORS);
		createEReference(actorEClass, ACTOR__PSYCHOLOGICAL_FACTORS);

		giverEClass = createEClass(GIVER);
		createEReference(giverEClass, GIVER__MOTIVATIONS);

		receiverEClass = createEClass(RECEIVER);

		observantEClass = createEClass(OBSERVANT);

		mediatorEClass = createEClass(MEDIATOR);

		motivationEClass = createEClass(MOTIVATION);
		createEAttribute(motivationEClass, MOTIVATION__TYPE);
		createEAttribute(motivationEClass, MOTIVATION__LEVEL);
		createEReference(motivationEClass, MOTIVATION__TOWARDS);

		social_FactorsEClass = createEClass(SOCIAL_FACTORS);

		psychological_FactorsEClass = createEClass(PSYCHOLOGICAL_FACTORS);

		itemEClass = createEClass(ITEM);

		// Create enums
		actTypeEEnum = createEEnum(ACT_TYPE);
		motivationTypeEEnum = createEEnum(MOTIVATION_TYPE);
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
		connectionEClass.getESuperTypes().add(theFactorsPackage.getAbsConnection());
		locationEClass.getESuperTypes().add(this.getKindnessEntity());
		timeEClass.getESuperTypes().add(this.getKindnessEntity());
		actorEClass.getESuperTypes().add(this.getKindnessEntity());
		giverEClass.getESuperTypes().add(this.getActor());
		receiverEClass.getESuperTypes().add(this.getActor());
		observantEClass.getESuperTypes().add(this.getActor());
		mediatorEClass.getESuperTypes().add(this.getActor());
		social_FactorsEClass.getESuperTypes().add(theFactorsPackage.getAbsSocialFactors());
		psychological_FactorsEClass.getESuperTypes().add(theFactorsPackage.getAbsPsychologicalFactors());
		itemEClass.getESuperTypes().add(this.getKindnessEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kindnessOpportunityEClass, KindnessOpportunity.class, "KindnessOpportunity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKindnessOpportunity_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				KindnessOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessOpportunity_Properties(), this.getProperty(), null, "properties", null, 0, -1,
				KindnessOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessOpportunity_Act(), this.getAct(), null, "act", null, 1, -1, KindnessOpportunity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actEClass, Act.class, "Act", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Act.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAct_Type(), this.getActType(), "type", "KINDNESS", 0, 1, Act.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAct_Precondition(), this.getCondition(), null, "precondition", null, 1, 1, Act.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAct_Postcondition(), this.getCondition(), null, "postcondition", null, 1, 1, Act.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAct_Giver(), this.getGiver(), null, "giver", null, 1, 1, Act.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAct_Receiver(), this.getReceiver(), null, "receiver", null, 1, 1, Act.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAct_Observant(), this.getObservant(), null, "observant", null, 0, -1, Act.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAct_Mediator(), this.getMediator(), null, "mediator", null, 0, 1, Act.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAct_Next(), this.getAct(), null, "next", null, 0, 1, Act.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAct_Items(), this.getItem(), null, "items", null, 0, -1, Act.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_RefKindnessEntities(), this.getKindnessEntity(), null, "refKindnessEntities", null,
				1, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kindnessEntityEClass, KindnessEntity.class, "KindnessEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKindnessEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, KindnessEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKindnessEntity_Type(), ecorePackage.getEString(), "type", null, 0, 1, KindnessEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessEntity_Connections(), this.getConnection(), null, "connections", null, 0, -1,
				KindnessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessEntity_ContainerEntity(), this.getKindnessEntity(), null, "containerEntity", null, 0,
				1, KindnessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessEntity_ContainedEntities(), this.getKindnessEntity(), null, "containedEntities", null,
				0, -1, KindnessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindnessEntity_Properties(), this.getProperty(), null, "properties", null, 0, -1,
				KindnessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Type(), ecorePackage.getEString(), "type", null, 0, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", "True", 0, 1,
				Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Entity1(), this.getKindnessEntity(), null, "entity1", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Entity2(), this.getKindnessEntity(), null, "entity2", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Social_factors(), this.getSocial_Factors(), null, "social_factors", null, 0, 1,
				Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Psychological_factors(), this.getPsychological_Factors(), null, "psychological_factors",
				null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(giverEClass, Giver.class, "Giver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGiver_Motivations(), this.getMotivation(), null, "motivations", null, 0, -1, Giver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiverEClass, Receiver.class, "Receiver", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(observantEClass, Observant.class, "Observant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mediatorEClass, Mediator.class, "Mediator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(motivationEClass, Motivation.class, "Motivation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotivation_Type(), this.getMotivationType(), "type", null, 0, 1, Motivation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotivation_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, Motivation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotivation_Towards(), this.getReceiver(), null, "towards", null, 0, 1, Motivation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(social_FactorsEClass, Social_Factors.class, "Social_Factors", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(psychological_FactorsEClass, Psychological_Factors.class, "Psychological_Factors", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(actTypeEEnum, ActType.class, "ActType");
		addEEnumLiteral(actTypeEEnum, ActType.MOTIVATION);
		addEEnumLiteral(actTypeEEnum, ActType.ABILITY);
		addEEnumLiteral(actTypeEEnum, ActType.PROMPT);
		addEEnumLiteral(actTypeEEnum, ActType.KINDNESS);

		initEEnum(motivationTypeEEnum, MotivationType.class, "MotivationType");
		addEEnumLiteral(motivationTypeEEnum, MotivationType.OTHER_BETTERMENT);
		addEEnumLiteral(motivationTypeEEnum, MotivationType.SELF_BETTERMENT);

		// Create resource
		createResource(eNS_URI);
	}

} //KindnessPackageImpl
