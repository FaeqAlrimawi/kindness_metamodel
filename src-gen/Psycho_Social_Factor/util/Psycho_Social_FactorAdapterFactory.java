/**
 */
package Psycho_Social_Factor.util;

import Psycho_Social_Factor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage
 * @generated
 */
public class Psycho_Social_FactorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Psycho_Social_FactorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psycho_Social_FactorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Psycho_Social_FactorPackage.eINSTANCE;
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
	protected Psycho_Social_FactorSwitch<Adapter> modelSwitch = new Psycho_Social_FactorSwitch<Adapter>() {
		@Override
		public Adapter caseAbsSocialFactors(AbsSocialFactors object) {
			return createAbsSocialFactorsAdapter();
		}

		@Override
		public Adapter caseAbsConnection(AbsConnection object) {
			return createAbsConnectionAdapter();
		}

		@Override
		public Adapter caseFactor(Factor object) {
			return createFactorAdapter();
		}

		@Override
		public Adapter caseAbsPsychologicalFactors(AbsPsychologicalFactors object) {
			return createAbsPsychologicalFactorsAdapter();
		}

		@Override
		public Adapter caseAffectedFactors(AffectedFactors object) {
			return createAffectedFactorsAdapter();
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
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.AbsSocialFactors <em>Abs Social Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.AbsSocialFactors
	 * @generated
	 */
	public Adapter createAbsSocialFactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.AbsConnection <em>Abs Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.AbsConnection
	 * @generated
	 */
	public Adapter createAbsConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Factor
	 * @generated
	 */
	public Adapter createFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.AbsPsychologicalFactors <em>Abs Psychological Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.AbsPsychologicalFactors
	 * @generated
	 */
	public Adapter createAbsPsychologicalFactorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.AffectedFactors <em>Affected Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.AffectedFactors
	 * @generated
	 */
	public Adapter createAffectedFactorsAdapter() {
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

} //Psycho_Social_FactorAdapterFactory
