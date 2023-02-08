/**
 */
package factors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see factors.FactorsPackage
 * @generated
 */
public interface FactorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactorsFactory eINSTANCE = factors.impl.FactorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Impacted Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impacted Factor</em>'.
	 * @generated
	 */
	ImpactedFactor createImpactedFactor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FactorsPackage getFactorsPackage();

} //FactorsFactory
