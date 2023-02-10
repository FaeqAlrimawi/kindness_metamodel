/**
 */
package factors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affected Factors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.AffectedFactors#getFactor <em>Factor</em>}</li>
 *   <li>{@link factors.AffectedFactors#getImpact <em>Impact</em>}</li>
 * </ul>
 *
 * @see factors.FactorsPackage#getAffectedFactors()
 * @model
 * @generated
 */
public interface AffectedFactors extends EObject {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' reference.
	 * @see #setFactor(Factor)
	 * @see factors.FactorsPackage#getAffectedFactors_Factor()
	 * @model
	 * @generated
	 */
	Factor getFactor();

	/**
	 * Sets the value of the '{@link factors.AffectedFactors#getFactor <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Factor value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * The default value is <code>"POSITIVE"</code>.
	 * The literals are from the enumeration {@link factors.FactorImpact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see factors.FactorImpact
	 * @see #setImpact(FactorImpact)
	 * @see factors.FactorsPackage#getAffectedFactors_Impact()
	 * @model default="POSITIVE"
	 * @generated
	 */
	FactorImpact getImpact();

	/**
	 * Sets the value of the '{@link factors.AffectedFactors#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see factors.FactorImpact
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(FactorImpact value);

} // AffectedFactors
