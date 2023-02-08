/**
 */
package factors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impacted Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.ImpactedFactor#getImpact <em>Impact</em>}</li>
 *   <li>{@link factors.ImpactedFactor#getFactors <em>Factors</em>}</li>
 * </ul>
 *
 * @see factors.FactorsPackage#getImpactedFactor()
 * @model
 * @generated
 */
public interface ImpactedFactor extends Factor {
	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * The default value is <code>"POSITIVE"</code>.
	 * The literals are from the enumeration {@link factors.FactorImpact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see factors.FactorImpact
	 * @see #setImpact(FactorImpact)
	 * @see factors.FactorsPackage#getImpactedFactor_Impact()
	 * @model default="POSITIVE"
	 * @generated
	 */
	FactorImpact getImpact();

	/**
	 * Sets the value of the '{@link factors.ImpactedFactor#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see factors.FactorImpact
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(FactorImpact value);

	/**
	 * Returns the value of the '<em><b>Factors</b></em>' reference list.
	 * The list contents are of type {@link factors.Factor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factors</em>' reference list.
	 * @see factors.FactorsPackage#getImpactedFactor_Factors()
	 * @model required="true"
	 * @generated
	 */
	EList<Factor> getFactors();

} // ImpactedFactor
