/**
 */
package ktypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ktypes.KtypesPackage
 * @generated
 */
public interface KtypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KtypesFactory eINSTANCE = ktypes.impl.KtypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>KHuman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KHuman</em>'.
	 * @generated
	 */
	KHuman createKHuman();

	/**
	 * Returns a new object of class '<em>KDigital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KDigital</em>'.
	 * @generated
	 */
	KDigital createKDigital();

	/**
	 * Returns a new object of class '<em>KPhysical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KPhysical</em>'.
	 * @generated
	 */
	KPhysical createKPhysical();

	/**
	 * Returns a new object of class '<em>KSocial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KSocial</em>'.
	 * @generated
	 */
	KSocial createKSocial();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KtypesPackage getKtypesPackage();

} //KtypesFactory
