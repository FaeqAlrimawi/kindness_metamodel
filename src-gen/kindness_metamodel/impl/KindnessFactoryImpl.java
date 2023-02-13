/**
 */
package kindness_metamodel.impl;

import kindness_metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KindnessFactoryImpl extends EFactoryImpl implements KindnessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KindnessFactory init() {
		try {
			KindnessFactory theKindnessFactory = (KindnessFactory) EPackage.Registry.INSTANCE
					.getEFactory(KindnessPackage.eNS_URI);
			if (theKindnessFactory != null) {
				return theKindnessFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KindnessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case KindnessPackage.PROPERTY:
			return createProperty();
		case KindnessPackage.KINDNESS_OPPORTUNITY:
			return createKindnessOpportunity();
		case KindnessPackage.ACT:
			return createAct();
		case KindnessPackage.CONDITION:
			return createCondition();
		case KindnessPackage.KINDNESS_ENTITY:
			return createKindnessEntity();
		case KindnessPackage.CONNECTION:
			return createConnection();
		case KindnessPackage.LOCATION:
			return createLocation();
		case KindnessPackage.TIME:
			return createTime();
		case KindnessPackage.ACTOR:
			return createActor();
		case KindnessPackage.GIVER:
			return createGiver();
		case KindnessPackage.RECEIVER:
			return createReceiver();
		case KindnessPackage.OBSERVANT:
			return createObservant();
		case KindnessPackage.MEDIATOR:
			return createMediator();
		case KindnessPackage.MOTIVATION:
			return createMotivation();
		case KindnessPackage.SOCIAL_FACTORS:
			return createSocial_Factors();
		case KindnessPackage.PSYCHOLOGICAL_FACTORS:
			return createPsychological_Factors();
		case KindnessPackage.ITEM:
			return createItem();
		case KindnessPackage.OTHER_ACTOR:
			return createOtherActor();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case KindnessPackage.ACT_TYPE:
			return createActTypeFromString(eDataType, initialValue);
		case KindnessPackage.MOTIVATION_TYPE:
			return createMotivationTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case KindnessPackage.ACT_TYPE:
			return convertActTypeToString(eDataType, instanceValue);
		case KindnessPackage.MOTIVATION_TYPE:
			return convertMotivationTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessOpportunity createKindnessOpportunity() {
		KindnessOpportunityImpl kindnessOpportunity = new KindnessOpportunityImpl();
		return kindnessOpportunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act createAct() {
		ActImpl act = new ActImpl();
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessEntity createKindnessEntity() {
		KindnessEntityImpl kindnessEntity = new KindnessEntityImpl();
		return kindnessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Giver createGiver() {
		GiverImpl giver = new GiverImpl();
		return giver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver createReceiver() {
		ReceiverImpl receiver = new ReceiverImpl();
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observant createObservant() {
		ObservantImpl observant = new ObservantImpl();
		return observant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mediator createMediator() {
		MediatorImpl mediator = new MediatorImpl();
		return mediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motivation createMotivation() {
		MotivationImpl motivation = new MotivationImpl();
		return motivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Social_Factors createSocial_Factors() {
		Social_FactorsImpl social_Factors = new Social_FactorsImpl();
		return social_Factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psychological_Factors createPsychological_Factors() {
		Psychological_FactorsImpl psychological_Factors = new Psychological_FactorsImpl();
		return psychological_Factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherActor createOtherActor() {
		OtherActorImpl otherActor = new OtherActorImpl();
		return otherActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActType createActTypeFromString(EDataType eDataType, String initialValue) {
		ActType result = ActType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotivationType createMotivationTypeFromString(EDataType eDataType, String initialValue) {
		MotivationType result = MotivationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMotivationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessPackage getKindnessPackage() {
		return (KindnessPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KindnessPackage getPackage() {
		return KindnessPackage.eINSTANCE;
	}

} //KindnessFactoryImpl
