/**
 */
package factors.Social;

import factors.Level;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.Social.Trust#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see factors.Social.NewPackage1Package#getTrust()
 * @model
 * @generated
 */
public interface Trust extends SocialFactor {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"MEDIUM"</code>.
	 * The literals are from the enumeration {@link factors.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see factors.Level
	 * @see #setLevel(Level)
	 * @see factors.Social.NewPackage1Package#getTrust_Level()
	 * @model default="MEDIUM"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link factors.Social.Trust#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see factors.Level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

} // Trust
