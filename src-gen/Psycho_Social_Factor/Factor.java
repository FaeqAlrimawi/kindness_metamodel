/**
 */
package Psycho_Social_Factor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.Factor#getName <em>Name</em>}</li>
 *   <li>{@link Psycho_Social_Factor.Factor#getAffectedfactor <em>Affectedfactor</em>}</li>
 *   <li>{@link Psycho_Social_Factor.Factor#getOther <em>Other</em>}</li>
 *   <li>{@link Psycho_Social_Factor.Factor#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getFactor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Factor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getFactor_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Psycho_Social_Factor.Factor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * The list contents are of type {@link Psycho_Social_Factor.AffectedFactors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectedfactor</em>' containment reference list.
	 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getFactor_Affectedfactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<AffectedFactors> getAffectedfactor();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(String)
	 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getFactor_Other()
	 * @model
	 * @generated
	 */
	String getOther();

	/**
	 * Sets the value of the '{@link Psycho_Social_Factor.Factor#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"MEDIUM"</code>.
	 * The literals are from the enumeration {@link Psycho_Social_Factor.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see Psycho_Social_Factor.Level
	 * @see #setLevel(Level)
	 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getFactor_Level()
	 * @model default="MEDIUM"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link Psycho_Social_Factor.Factor#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see Psycho_Social_Factor.Level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void computeImpact(FactorImpact impact);

} // Factor
