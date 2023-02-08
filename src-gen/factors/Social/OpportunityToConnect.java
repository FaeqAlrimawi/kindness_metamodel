/**
 */
package factors.Social;

import factors.Opportunity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opportunity To Connect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.Social.OpportunityToConnect#getOpportunity <em>Opportunity</em>}</li>
 * </ul>
 *
 * @see factors.Social.NewPackage1Package#getOpportunityToConnect()
 * @model
 * @generated
 */
public interface OpportunityToConnect extends SocialFactor {
	/**
	 * Returns the value of the '<em><b>Opportunity</b></em>' attribute.
	 * The literals are from the enumeration {@link factors.Opportunity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opportunity</em>' attribute.
	 * @see factors.Opportunity
	 * @see #setOpportunity(Opportunity)
	 * @see factors.Social.NewPackage1Package#getOpportunityToConnect_Opportunity()
	 * @model
	 * @generated
	 */
	Opportunity getOpportunity();

	/**
	 * Sets the value of the '{@link factors.Social.OpportunityToConnect#getOpportunity <em>Opportunity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opportunity</em>' attribute.
	 * @see factors.Opportunity
	 * @see #getOpportunity()
	 * @generated
	 */
	void setOpportunity(Opportunity value);

} // OpportunityToConnect
