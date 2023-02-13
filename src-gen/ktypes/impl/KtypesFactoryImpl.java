/**
 */
package ktypes.impl;

import ktypes.*;

import org.eclipse.emf.ecore.EClass;
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
public class KtypesFactoryImpl extends EFactoryImpl implements KtypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KtypesFactory init() {
		try {
			KtypesFactory theKtypesFactory = (KtypesFactory) EPackage.Registry.INSTANCE
					.getEFactory(KtypesPackage.eNS_URI);
			if (theKtypesFactory != null) {
				return theKtypesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KtypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KtypesFactoryImpl() {
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
		case KtypesPackage.KHUMAN:
			return createKHuman();
		case KtypesPackage.KDIGITAL:
			return createKDigital();
		case KtypesPackage.KPHYSICAL:
			return createKPhysical();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KHuman createKHuman() {
		KHumanImpl kHuman = new KHumanImpl();
		return kHuman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDigital createKDigital() {
		KDigitalImpl kDigital = new KDigitalImpl();
		return kDigital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPhysical createKPhysical() {
		KPhysicalImpl kPhysical = new KPhysicalImpl();
		return kPhysical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KtypesPackage getKtypesPackage() {
		return (KtypesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KtypesPackage getPackage() {
		return KtypesPackage.eINSTANCE;
	}

} //KtypesFactoryImpl
