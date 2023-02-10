/**
 */
package factors;

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
 *   <li>{@link factors.Factor#getName <em>Name</em>}</li>
 *   <li>{@link factors.Factor#getAffectedfactor <em>Affectedfactor</em>}</li>
 *   <li>{@link factors.Factor#getOther <em>Other</em>}</li>
 *   <li>{@link factors.Factor#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see factors.FactorsPackage#getFactor()
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
	 * @see factors.FactorsPackage#getFactor_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link factors.Factor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * The list contents are of type {@link factors.AffectedFactors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectedfactor</em>' containment reference list.
	 * @see factors.FactorsPackage#getFactor_Affectedfactor()
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
	 * @see factors.FactorsPackage#getFactor_Other()
	 * @model
	 * @generated
	 */
	String getOther();

	/**
	 * Sets the value of the '{@link factors.Factor#getOther <em>Other</em>}' attribute.
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
	 * The literals are from the enumeration {@link factors.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see factors.Level
	 * @see #setLevel(Level)
	 * @see factors.FactorsPackage#getFactor_Level()
	 * @model default="MEDIUM"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link factors.Factor#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see factors.Level
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
