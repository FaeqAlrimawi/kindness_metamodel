/**
 */
package factors.Social;

import factors.AbsKindnessEntity;
import factors.Factor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.Social.SocialFactor#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see factors.Social.NewPackage1Package#getSocialFactor()
 * @model abstract="true"
 * @generated
 */
public interface SocialFactor extends Factor {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(AbsKindnessEntity)
	 * @see factors.Social.NewPackage1Package#getSocialFactor_Actor()
	 * @model required="true"
	 * @generated
	 */
	AbsKindnessEntity getActor();

	/**
	 * Sets the value of the '{@link factors.Social.SocialFactor#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(AbsKindnessEntity value);

} // SocialFactor
