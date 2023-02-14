/**
 */
package Psycho_Social_Factor.Social;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Social.SocialFactor_pkgPackage
 * @generated
 */
public interface SocialFactor_pkgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SocialFactor_pkgFactory eINSTANCE = Psycho_Social_Factor.Social.impl.SocialFactor_pkgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Level Of Need</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level Of Need</em>'.
	 * @generated
	 */
	LevelOfNeed createLevelOfNeed();

	/**
	 * Returns a new object of class '<em>Relatedness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relatedness</em>'.
	 * @generated
	 */
	Relatedness createRelatedness();

	/**
	 * Returns a new object of class '<em>Reciprocity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reciprocity</em>'.
	 * @generated
	 */
	Reciprocity createReciprocity();

	/**
	 * Returns a new object of class '<em>Opportunity To Connect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opportunity To Connect</em>'.
	 * @generated
	 */
	OpportunityToConnect createOpportunityToConnect();

	/**
	 * Returns a new object of class '<em>Trust</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trust</em>'.
	 * @generated
	 */
	Trust createTrust();

	/**
	 * Returns a new object of class '<em>Other Social Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Social Factor</em>'.
	 * @generated
	 */
	OtherSocialFactor createOtherSocialFactor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SocialFactor_pkgPackage getSocialFactor_pkgPackage();

} //SocialFactor_pkgFactory
