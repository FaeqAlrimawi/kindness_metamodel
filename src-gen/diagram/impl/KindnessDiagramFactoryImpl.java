/**
 */
package diagram.impl;

import diagram.*;

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
public class KindnessDiagramFactoryImpl extends EFactoryImpl implements KindnessDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KindnessDiagramFactory init() {
		try {
			KindnessDiagramFactory theKindnessDiagramFactory = (KindnessDiagramFactory) EPackage.Registry.INSTANCE
					.getEFactory(KindnessDiagramPackage.eNS_URI);
			if (theKindnessDiagramFactory != null) {
				return theKindnessDiagramFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KindnessDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessDiagramFactoryImpl() {
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
		case KindnessDiagramPackage.KDIAGRAM:
			return createKDiagram();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDiagram createKDiagram() {
		KDiagramImpl kDiagram = new KDiagramImpl();
		return kDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessDiagramPackage getKindnessDiagramPackage() {
		return (KindnessDiagramPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KindnessDiagramPackage getPackage() {
		return KindnessDiagramPackage.eINSTANCE;
	}

} //KindnessDiagramFactoryImpl
