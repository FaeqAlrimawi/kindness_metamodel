/**
 */
package factors;

import factors.Social.SocialFactor;

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
 *   <li>{@link factors.AbsSocialFactors#getConnection <em>Connection</em>}</li>
 *   <li>{@link factors.AbsSocialFactors#getSocialfactor <em>Socialfactor</em>}</li>
 * </ul>
 *
 * @see factors.FactorsPackage#getAbsSocialFactors()
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
	 * @see factors.FactorsPackage#getAbsSocialFactors_Connection()
	 * @model
	 * @generated
	 */
	AbsConnection getConnection();

	/**
	 * Sets the value of the '{@link factors.AbsSocialFactors#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(AbsConnection value);

	/**
	 * Returns the value of the '<em><b>Socialfactor</b></em>' containment reference list.
	 * The list contents are of type {@link factors.Social.SocialFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socialfactor</em>' containment reference list.
	 * @see factors.FactorsPackage#getAbsSocialFactors_Socialfactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<SocialFactor> getSocialfactor();

} // AbsSocialFactors
