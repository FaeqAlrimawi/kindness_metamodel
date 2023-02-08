/**
 */
package kindness_metamodel;

import factors.FactorsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see kindness_metamodel.KindnessFactory
 * @model kind="package"
 * @generated
 */
public interface KindnessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kindness_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kindness_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kindness_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KindnessPackage eINSTANCE = kindness_metamodel.impl.KindnessPackageImpl.init();

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.PropertyImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.KindnessOpportunityImpl <em>Opportunity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.KindnessOpportunityImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getKindnessOpportunity()
	 * @generated
	 */
	int KINDNESS_OPPORTUNITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY__PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Act</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY__ACT = 2;

	/**
	 * The number of structural features of the '<em>Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_OPPORTUNITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.ActImpl <em>Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.ActImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getAct()
	 * @generated
	 */
	int ACT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__PRECONDITION = 2;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__POSTCONDITION = 3;

	/**
	 * The feature id for the '<em><b>Giver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__GIVER = 4;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__RECEIVER = 5;

	/**
	 * The feature id for the '<em><b>Observant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__OBSERVANT = 6;

	/**
	 * The feature id for the '<em><b>Mediator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__MEDIATOR = 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__NEXT = 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__ITEMS = 9;

	/**
	 * The number of structural features of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.ConditionImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref Kindness Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REF_KINDNESS_ENTITIES = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.KindnessEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.KindnessEntityImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getKindnessEntity()
	 * @generated
	 */
	int KINDNESS_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY__NAME = FactorsPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY__TYPE = FactorsPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY__CONNECTIONS = FactorsPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY__CONTAINER_ENTITY = FactorsPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY__CONTAINED_ENTITIES = FactorsPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY__PROPERTIES = FactorsPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY_FEATURE_COUNT = FactorsPackage.ABS_KINDNESS_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDNESS_ENTITY_OPERATION_COUNT = FactorsPackage.ABS_KINDNESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.ConnectionImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BIDIRECTIONAL = 2;

	/**
	 * The feature id for the '<em><b>Entity1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ENTITY1 = 3;

	/**
	 * The feature id for the '<em><b>Entity2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ENTITY2 = 4;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.LocationImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = KINDNESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TYPE = KINDNESS_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONNECTIONS = KINDNESS_ENTITY__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINER_ENTITY = KINDNESS_ENTITY__CONTAINER_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINED_ENTITIES = KINDNESS_ENTITY__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROPERTIES = KINDNESS_ENTITY__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = KINDNESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = KINDNESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.TimeImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__NAME = KINDNESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TYPE = KINDNESS_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__CONNECTIONS = KINDNESS_ENTITY__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__CONTAINER_ENTITY = KINDNESS_ENTITY__CONTAINER_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__CONTAINED_ENTITIES = KINDNESS_ENTITY__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__PROPERTIES = KINDNESS_ENTITY__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = KINDNESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = KINDNESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.ActorImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = KINDNESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TYPE = KINDNESS_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONNECTIONS = KINDNESS_ENTITY__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINER_ENTITY = KINDNESS_ENTITY__CONTAINER_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_ENTITIES = KINDNESS_ENTITY__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PROPERTIES = KINDNESS_ENTITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SOCIAL_FACTORS = KINDNESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PSYCHOLOGICAL_FACTORS = KINDNESS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = KINDNESS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = KINDNESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.GiverImpl <em>Giver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.GiverImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getGiver()
	 * @generated
	 */
	int GIVER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__TYPE = ACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__CONNECTIONS = ACTOR__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__CONTAINER_ENTITY = ACTOR__CONTAINER_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__CONTAINED_ENTITIES = ACTOR__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__PROPERTIES = ACTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__SOCIAL_FACTORS = ACTOR__SOCIAL_FACTORS;

	/**
	 * The feature id for the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__PSYCHOLOGICAL_FACTORS = ACTOR__PSYCHOLOGICAL_FACTORS;

	/**
	 * The feature id for the '<em><b>Motivations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER__MOTIVATIONS = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Giver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Giver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVER_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.ReceiverImpl <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.ReceiverImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__TYPE = ACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__CONNECTIONS = ACTOR__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__CONTAINER_ENTITY = ACTOR__CONTAINER_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__CONTAINED_ENTITIES = ACTOR__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__PROPERTIES = ACTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__SOCIAL_FACTORS = ACTOR__SOCIAL_FACTORS;

	/**
	 * The feature id for the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__PSYCHOLOGICAL_FACTORS = ACTOR__PSYCHOLOGICAL_FACTORS;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.ObservantImpl <em>Observant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.ObservantImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getObservant()
	 * @generated
	 */
	int OBSERVANT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT__TYPE = ACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT__CONNECTIONS = ACTOR__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT__CONTAINER_ENTITY = ACTOR__CONTAINER_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT__CONTAINED_ENTITIES = ACTOR__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT__PROPERTIES = ACTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT__SOCIAL_FACTORS = ACTOR__SOCIAL_FACTORS;

	/**
	 * The feature id for the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT__PSYCHOLOGICAL_FACTORS = ACTOR__PSYCHOLOGICAL_FACTORS;

	/**
	 * The number of structural features of the '<em>Observant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Observant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVANT_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.MediatorImpl <em>Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.MediatorImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getMediator()
	 * @generated
	 */
	int MEDIATOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__TYPE = ACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__CONNECTIONS = ACTOR__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__CONTAINER_ENTITY = ACTOR__CONTAINER_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__CONTAINED_ENTITIES = ACTOR__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__PROPERTIES = ACTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__SOCIAL_FACTORS = ACTOR__SOCIAL_FACTORS;

	/**
	 * The feature id for the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__PSYCHOLOGICAL_FACTORS = ACTOR__PSYCHOLOGICAL_FACTORS;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.MotivationImpl <em>Motivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.MotivationImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getMotivation()
	 * @generated
	 */
	int MOTIVATION = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Towards</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION__TOWARDS = 2;

	/**
	 * The number of structural features of the '<em>Motivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Motivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.Social_FactorsImpl <em>Social Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.Social_FactorsImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getSocial_Factors()
	 * @generated
	 */
	int SOCIAL_FACTORS = 14;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTORS__ACTOR = FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR;

	/**
	 * The feature id for the '<em><b>Socialfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTORS__SOCIALFACTOR = FactorsPackage.ABS_SOCIAL_FACTORS__SOCIALFACTOR;

	/**
	 * The number of structural features of the '<em>Social Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTORS_FEATURE_COUNT = FactorsPackage.ABS_SOCIAL_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Social Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTORS_OPERATION_COUNT = FactorsPackage.ABS_SOCIAL_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.Psychological_FactorsImpl <em>Psychological Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.Psychological_FactorsImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getPsychological_Factors()
	 * @generated
	 */
	int PSYCHOLOGICAL_FACTORS = 15;

	/**
	 * The number of structural features of the '<em>Psychological Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTORS_FEATURE_COUNT = FactorsPackage.ABS_PSYCHOLOGICAL_FACTORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Psychological Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSYCHOLOGICAL_FACTORS_OPERATION_COUNT = FactorsPackage.ABS_PSYCHOLOGICAL_FACTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.impl.ItemImpl
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = KINDNESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TYPE = KINDNESS_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CONNECTIONS = KINDNESS_ENTITY__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CONTAINER_ENTITY = KINDNESS_ENTITY__CONTAINER_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CONTAINED_ENTITIES = KINDNESS_ENTITY__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PROPERTIES = KINDNESS_ENTITY__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = KINDNESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = KINDNESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kindness_metamodel.ActType <em>Act Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.ActType
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getActType()
	 * @generated
	 */
	int ACT_TYPE = 17;

	/**
	 * The meta object id for the '{@link kindness_metamodel.MotivationType <em>Motivation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kindness_metamodel.MotivationType
	 * @see kindness_metamodel.impl.KindnessPackageImpl#getMotivationType()
	 * @generated
	 */
	int MOTIVATION_TYPE = 18;

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see kindness_metamodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness_metamodel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kindness_metamodel.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.KindnessOpportunity <em>Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opportunity</em>'.
	 * @see kindness_metamodel.KindnessOpportunity
	 * @generated
	 */
	EClass getKindnessOpportunity();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.KindnessOpportunity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness_metamodel.KindnessOpportunity#getName()
	 * @see #getKindnessOpportunity()
	 * @generated
	 */
	EAttribute getKindnessOpportunity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness_metamodel.KindnessOpportunity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see kindness_metamodel.KindnessOpportunity#getProperties()
	 * @see #getKindnessOpportunity()
	 * @generated
	 */
	EReference getKindnessOpportunity_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness_metamodel.KindnessOpportunity#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Act</em>'.
	 * @see kindness_metamodel.KindnessOpportunity#getAct()
	 * @see #getKindnessOpportunity()
	 * @generated
	 */
	EReference getKindnessOpportunity_Act();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act</em>'.
	 * @see kindness_metamodel.Act
	 * @generated
	 */
	EClass getAct();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Act#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness_metamodel.Act#getName()
	 * @see #getAct()
	 * @generated
	 */
	EAttribute getAct_Name();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Act#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kindness_metamodel.Act#getType()
	 * @see #getAct()
	 * @generated
	 */
	EAttribute getAct_Type();

	/**
	 * Returns the meta object for the containment reference '{@link kindness_metamodel.Act#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see kindness_metamodel.Act#getPrecondition()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link kindness_metamodel.Act#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcondition</em>'.
	 * @see kindness_metamodel.Act#getPostcondition()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Postcondition();

	/**
	 * Returns the meta object for the containment reference '{@link kindness_metamodel.Act#getGiver <em>Giver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Giver</em>'.
	 * @see kindness_metamodel.Act#getGiver()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Giver();

	/**
	 * Returns the meta object for the containment reference '{@link kindness_metamodel.Act#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver</em>'.
	 * @see kindness_metamodel.Act#getReceiver()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Receiver();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness_metamodel.Act#getObservant <em>Observant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observant</em>'.
	 * @see kindness_metamodel.Act#getObservant()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Observant();

	/**
	 * Returns the meta object for the containment reference '{@link kindness_metamodel.Act#getMediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mediator</em>'.
	 * @see kindness_metamodel.Act#getMediator()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Mediator();

	/**
	 * Returns the meta object for the reference '{@link kindness_metamodel.Act#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see kindness_metamodel.Act#getNext()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness_metamodel.Act#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see kindness_metamodel.Act#getItems()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_Items();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see kindness_metamodel.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness_metamodel.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the reference list '{@link kindness_metamodel.Condition#getRefKindnessEntities <em>Ref Kindness Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Kindness Entities</em>'.
	 * @see kindness_metamodel.Condition#getRefKindnessEntities()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_RefKindnessEntities();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.KindnessEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see kindness_metamodel.KindnessEntity
	 * @generated
	 */
	EClass getKindnessEntity();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.KindnessEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness_metamodel.KindnessEntity#getName()
	 * @see #getKindnessEntity()
	 * @generated
	 */
	EAttribute getKindnessEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.KindnessEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kindness_metamodel.KindnessEntity#getType()
	 * @see #getKindnessEntity()
	 * @generated
	 */
	EAttribute getKindnessEntity_Type();

	/**
	 * Returns the meta object for the reference list '{@link kindness_metamodel.KindnessEntity#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see kindness_metamodel.KindnessEntity#getConnections()
	 * @see #getKindnessEntity()
	 * @generated
	 */
	EReference getKindnessEntity_Connections();

	/**
	 * Returns the meta object for the reference '{@link kindness_metamodel.KindnessEntity#getContainerEntity <em>Container Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Entity</em>'.
	 * @see kindness_metamodel.KindnessEntity#getContainerEntity()
	 * @see #getKindnessEntity()
	 * @generated
	 */
	EReference getKindnessEntity_ContainerEntity();

	/**
	 * Returns the meta object for the reference list '{@link kindness_metamodel.KindnessEntity#getContainedEntities <em>Contained Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Entities</em>'.
	 * @see kindness_metamodel.KindnessEntity#getContainedEntities()
	 * @see #getKindnessEntity()
	 * @generated
	 */
	EReference getKindnessEntity_ContainedEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link kindness_metamodel.KindnessEntity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see kindness_metamodel.KindnessEntity#getProperties()
	 * @see #getKindnessEntity()
	 * @generated
	 */
	EReference getKindnessEntity_Properties();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see kindness_metamodel.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kindness_metamodel.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Connection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kindness_metamodel.Connection#getType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Type();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Connection#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see kindness_metamodel.Connection#isBidirectional()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Bidirectional();

	/**
	 * Returns the meta object for the reference '{@link kindness_metamodel.Connection#getEntity1 <em>Entity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity1</em>'.
	 * @see kindness_metamodel.Connection#getEntity1()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Entity1();

	/**
	 * Returns the meta object for the reference '{@link kindness_metamodel.Connection#getEntity2 <em>Entity2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity2</em>'.
	 * @see kindness_metamodel.Connection#getEntity2()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Entity2();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see kindness_metamodel.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see kindness_metamodel.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see kindness_metamodel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the containment reference '{@link kindness_metamodel.Actor#getSocial_factors <em>Social factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Social factors</em>'.
	 * @see kindness_metamodel.Actor#getSocial_factors()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Social_factors();

	/**
	 * Returns the meta object for the containment reference '{@link kindness_metamodel.Actor#getPsychological_factors <em>Psychological factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Psychological factors</em>'.
	 * @see kindness_metamodel.Actor#getPsychological_factors()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Psychological_factors();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Giver <em>Giver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Giver</em>'.
	 * @see kindness_metamodel.Giver
	 * @generated
	 */
	EClass getGiver();

	/**
	 * Returns the meta object for the reference list '{@link kindness_metamodel.Giver#getMotivations <em>Motivations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Motivations</em>'.
	 * @see kindness_metamodel.Giver#getMotivations()
	 * @see #getGiver()
	 * @generated
	 */
	EReference getGiver_Motivations();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see kindness_metamodel.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Observant <em>Observant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observant</em>'.
	 * @see kindness_metamodel.Observant
	 * @generated
	 */
	EClass getObservant();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Mediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator</em>'.
	 * @see kindness_metamodel.Mediator
	 * @generated
	 */
	EClass getMediator();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Motivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motivation</em>'.
	 * @see kindness_metamodel.Motivation
	 * @generated
	 */
	EClass getMotivation();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Motivation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kindness_metamodel.Motivation#getType()
	 * @see #getMotivation()
	 * @generated
	 */
	EAttribute getMotivation_Type();

	/**
	 * Returns the meta object for the attribute '{@link kindness_metamodel.Motivation#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see kindness_metamodel.Motivation#getLevel()
	 * @see #getMotivation()
	 * @generated
	 */
	EAttribute getMotivation_Level();

	/**
	 * Returns the meta object for the reference '{@link kindness_metamodel.Motivation#getTowards <em>Towards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Towards</em>'.
	 * @see kindness_metamodel.Motivation#getTowards()
	 * @see #getMotivation()
	 * @generated
	 */
	EReference getMotivation_Towards();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Social_Factors <em>Social Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Factors</em>'.
	 * @see kindness_metamodel.Social_Factors
	 * @generated
	 */
	EClass getSocial_Factors();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Psychological_Factors <em>Psychological Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Psychological Factors</em>'.
	 * @see kindness_metamodel.Psychological_Factors
	 * @generated
	 */
	EClass getPsychological_Factors();

	/**
	 * Returns the meta object for class '{@link kindness_metamodel.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see kindness_metamodel.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for enum '{@link kindness_metamodel.ActType <em>Act Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Type</em>'.
	 * @see kindness_metamodel.ActType
	 * @generated
	 */
	EEnum getActType();

	/**
	 * Returns the meta object for enum '{@link kindness_metamodel.MotivationType <em>Motivation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Motivation Type</em>'.
	 * @see kindness_metamodel.MotivationType
	 * @generated
	 */
	EEnum getMotivationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KindnessFactory getKindnessFactory();

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
		 * The meta object literal for the '{@link kindness_metamodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.PropertyImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.KindnessOpportunityImpl <em>Opportunity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.KindnessOpportunityImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getKindnessOpportunity()
		 * @generated
		 */
		EClass KINDNESS_OPPORTUNITY = eINSTANCE.getKindnessOpportunity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINDNESS_OPPORTUNITY__NAME = eINSTANCE.getKindnessOpportunity_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_OPPORTUNITY__PROPERTIES = eINSTANCE.getKindnessOpportunity_Properties();

		/**
		 * The meta object literal for the '<em><b>Act</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_OPPORTUNITY__ACT = eINSTANCE.getKindnessOpportunity_Act();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.ActImpl <em>Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.ActImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getAct()
		 * @generated
		 */
		EClass ACT = eINSTANCE.getAct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT__NAME = eINSTANCE.getAct_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT__TYPE = eINSTANCE.getAct_Type();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__PRECONDITION = eINSTANCE.getAct_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__POSTCONDITION = eINSTANCE.getAct_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Giver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__GIVER = eINSTANCE.getAct_Giver();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__RECEIVER = eINSTANCE.getAct_Receiver();

		/**
		 * The meta object literal for the '<em><b>Observant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__OBSERVANT = eINSTANCE.getAct_Observant();

		/**
		 * The meta object literal for the '<em><b>Mediator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__MEDIATOR = eINSTANCE.getAct_Mediator();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__NEXT = eINSTANCE.getAct_Next();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__ITEMS = eINSTANCE.getAct_Items();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.ConditionImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Ref Kindness Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__REF_KINDNESS_ENTITIES = eINSTANCE.getCondition_RefKindnessEntities();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.KindnessEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.KindnessEntityImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getKindnessEntity()
		 * @generated
		 */
		EClass KINDNESS_ENTITY = eINSTANCE.getKindnessEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINDNESS_ENTITY__NAME = eINSTANCE.getKindnessEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINDNESS_ENTITY__TYPE = eINSTANCE.getKindnessEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_ENTITY__CONNECTIONS = eINSTANCE.getKindnessEntity_Connections();

		/**
		 * The meta object literal for the '<em><b>Container Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_ENTITY__CONTAINER_ENTITY = eINSTANCE.getKindnessEntity_ContainerEntity();

		/**
		 * The meta object literal for the '<em><b>Contained Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_ENTITY__CONTAINED_ENTITIES = eINSTANCE.getKindnessEntity_ContainedEntities();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDNESS_ENTITY__PROPERTIES = eINSTANCE.getKindnessEntity_Properties();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.ConnectionImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TYPE = eINSTANCE.getConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__BIDIRECTIONAL = eINSTANCE.getConnection_Bidirectional();

		/**
		 * The meta object literal for the '<em><b>Entity1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ENTITY1 = eINSTANCE.getConnection_Entity1();

		/**
		 * The meta object literal for the '<em><b>Entity2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ENTITY2 = eINSTANCE.getConnection_Entity2();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.LocationImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.TimeImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.ActorImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Social factors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SOCIAL_FACTORS = eINSTANCE.getActor_Social_factors();

		/**
		 * The meta object literal for the '<em><b>Psychological factors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PSYCHOLOGICAL_FACTORS = eINSTANCE.getActor_Psychological_factors();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.GiverImpl <em>Giver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.GiverImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getGiver()
		 * @generated
		 */
		EClass GIVER = eINSTANCE.getGiver();

		/**
		 * The meta object literal for the '<em><b>Motivations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIVER__MOTIVATIONS = eINSTANCE.getGiver_Motivations();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.ReceiverImpl <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.ReceiverImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.ObservantImpl <em>Observant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.ObservantImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getObservant()
		 * @generated
		 */
		EClass OBSERVANT = eINSTANCE.getObservant();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.MediatorImpl <em>Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.MediatorImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getMediator()
		 * @generated
		 */
		EClass MEDIATOR = eINSTANCE.getMediator();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.MotivationImpl <em>Motivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.MotivationImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getMotivation()
		 * @generated
		 */
		EClass MOTIVATION = eINSTANCE.getMotivation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVATION__TYPE = eINSTANCE.getMotivation_Type();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVATION__LEVEL = eINSTANCE.getMotivation_Level();

		/**
		 * The meta object literal for the '<em><b>Towards</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTIVATION__TOWARDS = eINSTANCE.getMotivation_Towards();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.Social_FactorsImpl <em>Social Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.Social_FactorsImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getSocial_Factors()
		 * @generated
		 */
		EClass SOCIAL_FACTORS = eINSTANCE.getSocial_Factors();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.Psychological_FactorsImpl <em>Psychological Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.Psychological_FactorsImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getPsychological_Factors()
		 * @generated
		 */
		EClass PSYCHOLOGICAL_FACTORS = eINSTANCE.getPsychological_Factors();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.impl.ItemImpl
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.ActType <em>Act Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.ActType
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getActType()
		 * @generated
		 */
		EEnum ACT_TYPE = eINSTANCE.getActType();

		/**
		 * The meta object literal for the '{@link kindness_metamodel.MotivationType <em>Motivation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kindness_metamodel.MotivationType
		 * @see kindness_metamodel.impl.KindnessPackageImpl#getMotivationType()
		 * @generated
		 */
		EEnum MOTIVATION_TYPE = eINSTANCE.getMotivationType();

	}

} //KindnessPackage
