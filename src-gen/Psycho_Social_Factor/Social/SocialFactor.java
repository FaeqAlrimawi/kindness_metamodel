/**
 */
package Psycho_Social_Factor.Social;

import Psycho_Social_Factor.AbsConnection;
import Psycho_Social_Factor.Factor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.Social.SocialFactor#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see Psycho_Social_Factor.Social.SocialFactor_pkgPackage#getSocialFactor()
 * @model abstract="true"
 * @generated
 */
public interface SocialFactor extends Factor {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(AbsConnection)
	 * @see Psycho_Social_Factor.Social.SocialFactor_pkgPackage#getSocialFactor_Connection()
	 * @model
	 * @generated
	 */
	AbsConnection getConnection();

	/**
	 * Sets the value of the '{@link Psycho_Social_Factor.Social.SocialFactor#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(AbsConnection value);

} // SocialFactor
