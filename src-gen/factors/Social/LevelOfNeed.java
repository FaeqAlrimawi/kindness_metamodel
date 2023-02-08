/**
 */
package factors.Social;

import factors.Level;
import factors.Need;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Of Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.Social.LevelOfNeed#getNeed <em>Need</em>}</li>
 *   <li>{@link factors.Social.LevelOfNeed#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see factors.Social.NewPackage1Package#getLevelOfNeed()
 * @model
 * @generated
 */
public interface LevelOfNeed extends SocialFactor {
	/**
	 * Returns the value of the '<em><b>Need</b></em>' attribute.
	 * The default value is <code>"EMOTIONAL"</code>.
	 * The literals are from the enumeration {@link factors.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need</em>' attribute.
	 * @see factors.Need
	 * @see #setNeed(Need)
	 * @see factors.Social.NewPackage1Package#getLevelOfNeed_Need()
	 * @model default="EMOTIONAL"
	 * @generated
	 */
	Need getNeed();

	/**
	 * Sets the value of the '{@link factors.Social.LevelOfNeed#getNeed <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need</em>' attribute.
	 * @see factors.Need
	 * @see #getNeed()
	 * @generated
	 */
	void setNeed(Need value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"MEDIUM"</code>.
	 * The literals are from the enumeration {@link factors.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see factors.Level
	 * @see #setLevel(Level)
	 * @see factors.Social.NewPackage1Package#getLevelOfNeed_Level()
	 * @model default="MEDIUM"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link factors.Social.LevelOfNeed#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see factors.Level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

} // LevelOfNeed
