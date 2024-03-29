/**
 */
package ktypes.util;

import ktypes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ktypes.KtypesPackage
 * @generated
 */
public class KtypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KtypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KtypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KtypesPackage.eINSTANCE;
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
	protected KtypesSwitch<Adapter> modelSwitch = new KtypesSwitch<Adapter>() {
		@Override
		public Adapter caseKObject(KObject object) {
			return createKObjectAdapter();
		}

		@Override
		public Adapter caseKType(KType object) {
			return createKTypeAdapter();
		}

		@Override
		public Adapter caseKHuman(KHuman object) {
			return createKHumanAdapter();
		}

		@Override
		public Adapter caseKDigital(KDigital object) {
			return createKDigitalAdapter();
		}

		@Override
		public Adapter caseKPhysical(KPhysical object) {
			return createKPhysicalAdapter();
		}

		@Override
		public Adapter caseKSocial(KSocial object) {
			return createKSocialAdapter();
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
	 * Creates a new adapter for an object of class '{@link ktypes.KObject <em>KObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ktypes.KObject
	 * @generated
	 */
	public Adapter createKObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ktypes.KType <em>KType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ktypes.KType
	 * @generated
	 */
	public Adapter createKTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ktypes.KHuman <em>KHuman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ktypes.KHuman
	 * @generated
	 */
	public Adapter createKHumanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ktypes.KDigital <em>KDigital</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ktypes.KDigital
	 * @generated
	 */
	public Adapter createKDigitalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ktypes.KPhysical <em>KPhysical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ktypes.KPhysical
	 * @generated
	 */
	public Adapter createKPhysicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ktypes.KSocial <em>KSocial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ktypes.KSocial
	 * @generated
	 */
	public Adapter createKSocialAdapter() {
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

} //KtypesAdapterFactory
