/**
 */
package kindness_metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kindness_metamodel.KindnessPackage
 * @generated
 */
public interface KindnessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KindnessFactory eINSTANCE = kindness_metamodel.impl.KindnessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Opportunity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opportunity</em>'.
	 * @generated
	 */
	KindnessOpportunity createKindnessOpportunity();

	/**
	 * Returns a new object of class '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Act</em>'.
	 * @generated
	 */
	Act createAct();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	KindnessEntity createKindnessEntity();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Giver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Giver</em>'.
	 * @generated
	 */
	Giver createGiver();

	/**
	 * Returns a new object of class '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver</em>'.
	 * @generated
	 */
	Receiver createReceiver();

	/**
	 * Returns a new object of class '<em>Observant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observant</em>'.
	 * @generated
	 */
	Observant createObservant();

	/**
	 * Returns a new object of class '<em>Mediator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mediator</em>'.
	 * @generated
	 */
	Mediator createMediator();

	/**
	 * Returns a new object of class '<em>Motivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motivation</em>'.
	 * @generated
	 */
	Motivation createMotivation();

	/**
	 * Returns a new object of class '<em>Social Factors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Factors</em>'.
	 * @generated
	 */
	Social_Factors createSocial_Factors();

	/**
	 * Returns a new object of class '<em>Psychological Factors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Psychological Factors</em>'.
	 * @generated
	 */
	Psychological_Factors createPsychological_Factors();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KindnessPackage getKindnessPackage();

} //KindnessFactory
