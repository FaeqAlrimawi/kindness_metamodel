/**
 */
package Psycho_Social_Factor.Psychological;

import Psycho_Social_Factor.HumanValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.Psychological.HumanValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage#getHumanValue()
 * @model
 * @generated
 */
public interface HumanValue extends PsychologicalFactor {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link Psycho_Social_Factor.HumanValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see Psycho_Social_Factor.HumanValueType
	 * @see #setValue(HumanValueType)
	 * @see Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage#getHumanValue_Value()
	 * @model
	 * @generated
	 */
	HumanValueType getValue();

	/**
	 * Sets the value of the '{@link Psycho_Social_Factor.Psychological.HumanValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see Psycho_Social_Factor.HumanValueType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(HumanValueType value);

} // HumanValue
