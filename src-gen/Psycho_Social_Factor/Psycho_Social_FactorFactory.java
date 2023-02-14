/**
 */
package Psycho_Social_Factor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage
 * @generated
 */
public interface Psycho_Social_FactorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Psycho_Social_FactorFactory eINSTANCE = Psycho_Social_Factor.impl.Psycho_Social_FactorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Affected Factors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affected Factors</em>'.
	 * @generated
	 */
	AffectedFactors createAffectedFactors();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Psycho_Social_FactorPackage getPsycho_Social_FactorPackage();

} //Psycho_Social_FactorFactory
