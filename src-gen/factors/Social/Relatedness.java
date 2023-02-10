/**
 */
package factors.Social;

import factors.DegreeOfRelatedness;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relatedness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.Social.Relatedness#getDegree <em>Degree</em>}</li>
 * </ul>
 *
 * @see factors.Social.NewPackage1Package#getRelatedness()
 * @model
 * @generated
 */
public interface Relatedness extends SocialFactor {
	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * The literals are from the enumeration {@link factors.DegreeOfRelatedness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see factors.DegreeOfRelatedness
	 * @see #setDegree(DegreeOfRelatedness)
	 * @see factors.Social.NewPackage1Package#getRelatedness_Degree()
	 * @model
	 * @generated
	 */
	DegreeOfRelatedness getDegree();

	/**
	 * Sets the value of the '{@link factors.Social.Relatedness#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see factors.DegreeOfRelatedness
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(DegreeOfRelatedness value);

} // Relatedness
