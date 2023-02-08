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
 *   <li>{@link factors.AbsSocialFactors#getActor <em>Actor</em>}</li>
 *   <li>{@link factors.AbsSocialFactors#getSocialfactor <em>Socialfactor</em>}</li>
 * </ul>
 *
 * @see factors.FactorsPackage#getAbsSocialFactors()
 * @model abstract="true"
 * @generated
 */
public interface AbsSocialFactors extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(AbsKindnessEntity)
	 * @see factors.FactorsPackage#getAbsSocialFactors_Actor()
	 * @model
	 * @generated
	 */
	AbsKindnessEntity getActor();

	/**
	 * Sets the value of the '{@link factors.AbsSocialFactors#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(AbsKindnessEntity value);

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
