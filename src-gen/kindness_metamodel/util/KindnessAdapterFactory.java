/**
 */
package kindness_metamodel.util;

import factors.AbsKindnessEntity;
import factors.AbsPsychologicalFactors;
import factors.AbsSocialFactors;

import kindness_metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kindness_metamodel.KindnessPackage
 * @generated
 */
public class KindnessAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KindnessPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KindnessPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindnessSwitch<Adapter> modelSwitch = new KindnessSwitch<Adapter>() {
		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseKindnessOpportunity(KindnessOpportunity object) {
			return createKindnessOpportunityAdapter();
		}

		@Override
		public Adapter caseAct(Act object) {
			return createActAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseKindnessEntity(KindnessEntity object) {
			return createKindnessEntityAdapter();
		}

		@Override
		public Adapter caseConnection(Connection object) {
			return createConnectionAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseTime(Time object) {
			return createTimeAdapter();
		}

		@Override
		public Adapter caseActor(Actor object) {
			return createActorAdapter();
		}

		@Override
		public Adapter caseGiver(Giver object) {
			return createGiverAdapter();
		}

		@Override
		public Adapter caseReceiver(Receiver object) {
			return createReceiverAdapter();
		}

		@Override
		public Adapter caseObservant(Observant object) {
			return createObservantAdapter();
		}

		@Override
		public Adapter caseMediator(Mediator object) {
			return createMediatorAdapter();
		}

		@Override
		public Adapter caseMotivation(Motivation object) {
			return createMotivationAdapter();
		}

		@Override
		public Adapter caseSocial_Factors(Social_Factors object) {
			return createSocial_FactorsAdapter();
		}

		@Override
		public Adapter casePsychological_Factors(Psychological_Factors object) {
			return createPsychological_FactorsAdapter();
		}

		@Override
		public Adapter caseItem(Item object) {
			return createItemAdapter();
		}

		@Override
		public Adapter caseAbsKindnessEntity(AbsKindnessEntity object) {
			return createAbsKindnessEntityAdapter();
		}

		@Override
		public Adapter caseAbsSocialFactors(AbsSocialFactors object) {
			return createAbsSocialFactorsAdapter();
		}

		@Override
		public Adapter caseAbsPsychologicalFactors(AbsPsychologicalFactors object) {
			return createAbsPsychologicalFactorsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.KindnessOpportunity <em>Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.KindnessOpportunity
	 * @generated
	 */
	public Adapter createKindnessOpportunityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.KindnessEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.KindnessEntity
	 * @generated
	 */
	public Adapter createKindnessEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Giver <em>Giver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Giver
	 * @generated
	 */
	public Adapter createGiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Observant <em>Observant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Observant
	 * @generated
	 */
	public Adapter createObservantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Mediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Mediator
	 * @generated
	 */
	public Adapter createMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Motivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Motivation
	 * @generated
	 */
	public Adapter createMotivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Social_Factors <em>Social Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Social_Factors
	 * @generated
	 */
	public Adapter createSocial_FactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Psychological_Factors <em>Psychological Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Psychological_Factors
	 * @generated
	 */
	public Adapter createPsychological_FactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kindness_metamodel.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kindness_metamodel.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factors.AbsKindnessEntity <em>Abs Kindness Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.AbsKindnessEntity
	 * @generated
	 */
	public Adapter createAbsKindnessEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factors.AbsSocialFactors <em>Abs Social Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.AbsSocialFactors
	 * @generated
	 */
	public Adapter createAbsSocialFactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factors.AbsPsychologicalFactors <em>Abs Psychological Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.AbsPsychologicalFactors
	 * @generated
	 */
	public Adapter createAbsPsychologicalFactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KindnessAdapterFactory
