/**
 */
package Psycho_Social_Factor.Social;

import Psycho_Social_Factor.DegreeOfRelatedness;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relatedness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.Social.Relatedness#getDegree <em>Degree</em>}</li>
 * </ul>
 *
 * @see Psycho_Social_Factor.Social.SocialFactor_pkgPackage#getRelatedness()
 * @model
 * @generated
 */
public interface Relatedness extends SocialFactor {
	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * The literals are from the enumeration {@link Psycho_Social_Factor.DegreeOfRelatedness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see Psycho_Social_Factor.DegreeOfRelatedness
	 * @see #setDegree(DegreeOfRelatedness)
	 * @see Psycho_Social_Factor.Social.SocialFactor_pkgPackage#getRelatedness_Degree()
	 * @model
	 * @generated
	 */
	DegreeOfRelatedness getDegree();

	/**
	 * Sets the value of the '{@link Psycho_Social_Factor.Social.Relatedness#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see Psycho_Social_Factor.DegreeOfRelatedness
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(DegreeOfRelatedness value);

} // Relatedness
