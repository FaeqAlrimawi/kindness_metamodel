/**
 */
package Psycho_Social_Factor.Social;

import Psycho_Social_Factor.Need;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Of Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.Social.LevelOfNeed#getNeed <em>Need</em>}</li>
 * </ul>
 *
 * @see Psycho_Social_Factor.Social.SocialFactor_pkgPackage#getLevelOfNeed()
 * @model
 * @generated
 */
public interface LevelOfNeed extends SocialFactor {
	/**
	 * Returns the value of the '<em><b>Need</b></em>' attribute.
	 * The default value is <code>"EMOTIONAL"</code>.
	 * The literals are from the enumeration {@link Psycho_Social_Factor.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need</em>' attribute.
	 * @see Psycho_Social_Factor.Need
	 * @see #setNeed(Need)
	 * @see Psycho_Social_Factor.Social.SocialFactor_pkgPackage#getLevelOfNeed_Need()
	 * @model default="EMOTIONAL"
	 * @generated
	 */
	Need getNeed();

	/**
	 * Sets the value of the '{@link Psycho_Social_Factor.Social.LevelOfNeed#getNeed <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need</em>' attribute.
	 * @see Psycho_Social_Factor.Need
	 * @see #getNeed()
	 * @generated
	 */
	void setNeed(Need value);

} // LevelOfNeed
