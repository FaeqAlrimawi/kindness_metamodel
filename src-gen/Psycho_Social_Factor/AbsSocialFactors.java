/**
 */
package Psycho_Social_Factor;

import Psycho_Social_Factor.Social.SocialFactor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Social Factors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.AbsSocialFactors#getConnection <em>Connection</em>}</li>
 *   <li>{@link Psycho_Social_Factor.AbsSocialFactors#getSocialfactor <em>Socialfactor</em>}</li>
 * </ul>
 *
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getAbsSocialFactors()
 * @model abstract="true"
 * @generated
 */
public interface AbsSocialFactors extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(AbsConnection)
	 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getAbsSocialFactors_Connection()
	 * @model
	 * @generated
	 */
	AbsConnection getConnection();

	/**
	 * Sets the value of the '{@link Psycho_Social_Factor.AbsSocialFactors#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(AbsConnection value);

	/**
	 * Returns the value of the '<em><b>Socialfactor</b></em>' containment reference list.
	 * The list contents are of type {@link Psycho_Social_Factor.Social.SocialFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socialfactor</em>' containment reference list.
	 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getAbsSocialFactors_Socialfactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<SocialFactor> getSocialfactor();

} // AbsSocialFactors
