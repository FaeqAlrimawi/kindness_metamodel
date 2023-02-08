/**
 */
package factors.Social.util;

import factors.Factor;

import factors.Social.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see factors.Social.NewPackage1Package
 * @generated
 */
public class NewPackage1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NewPackage1Package.eINSTANCE;
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
	protected NewPackage1Switch<Adapter> modelSwitch = new NewPackage1Switch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link factors.Social.LevelOfNeed <em>Level Of Need</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.Social.LevelOfNeed
	 * @generated
	 */
	public Adapter createLevelOfNeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factors.Social.Relatedness <em>Relatedness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.Social.Relatedness
	 * @generated
	 */
	public Adapter createRelatednessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factors.Social.Reciprocity <em>Reciprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.Social.Reciprocity
	 * @generated
	 */
	public Adapter createReciprocityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factors.Social.SocialFactor <em>Social Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.Social.SocialFactor
	 * @generated
	 */
	public Adapter createSocialFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factors.Social.OpportunityToConnect <em>Opportunity To Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.Social.OpportunityToConnect
	 * @generated
	 */
	public Adapter createOpportunityToConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factors.Social.Trust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.Social.Trust
	 * @generated
	 */
	public Adapter createTrustAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link factors.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see factors.Factor
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

} //NewPackage1AdapterFactory
