/**
 */
package Psycho_Social_Factor.Social.util;

import Psycho_Social_Factor.Factor;

import Psycho_Social_Factor.Social.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Social.SocialFactor_pkgPackage
 * @generated
 */
public class SocialFactor_pkgAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SocialFactor_pkgPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialFactor_pkgAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SocialFactor_pkgPackage.eINSTANCE;
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
	protected SocialFactor_pkgSwitch<Adapter> modelSwitch = new SocialFactor_pkgSwitch<Adapter>() {
		@Override
		public Adapter caseLevelOfNeed(LevelOfNeed object) {
			return createLevelOfNeedAdapter();
		}

		@Override
		public Adapter caseRelatedness(Relatedness object) {
			return createRelatednessAdapter();
		}

		@Override
		public Adapter caseReciprocity(Reciprocity object) {
			return createReciprocityAdapter();
		}

		@Override
		public Adapter caseSocialFactor(SocialFactor object) {
			return createSocialFactorAdapter();
		}

		@Override
		public Adapter caseOpportunityToConnect(OpportunityToConnect object) {
			return createOpportunityToConnectAdapter();
		}

		@Override
		public Adapter caseTrust(Trust object) {
			return createTrustAdapter();
		}

		@Override
		public Adapter caseOtherSocialFactor(OtherSocialFactor object) {
			return createOtherSocialFactorAdapter();
		}

		@Override
		public Adapter caseFactor(Factor object) {
			return createFactorAdapter();
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
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Social.LevelOfNeed <em>Level Of Need</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Social.LevelOfNeed
	 * @generated
	 */
	public Adapter createLevelOfNeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Social.Relatedness <em>Relatedness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Social.Relatedness
	 * @generated
	 */
	public Adapter createRelatednessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Social.Reciprocity <em>Reciprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Social.Reciprocity
	 * @generated
	 */
	public Adapter createReciprocityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Social.SocialFactor <em>Social Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Social.SocialFactor
	 * @generated
	 */
	public Adapter createSocialFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Social.OpportunityToConnect <em>Opportunity To Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Social.OpportunityToConnect
	 * @generated
	 */
	public Adapter createOpportunityToConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Social.Trust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Social.Trust
	 * @generated
	 */
	public Adapter createTrustAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Psycho_Social_Factor.Social.OtherSocialFactor <em>Other Social Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Psycho_Social_Factor.Social.OtherSocialFactor
	 * @generated
	 */
	public Adapter createOtherSocialFactorAdapter() {
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

} //SocialFactor_pkgAdapterFactory
