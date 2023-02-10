/**
 */
package factors.Psychological;

import factors.HumanValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.Psychological.HumanValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see factors.Psychological.NewPackage2Package#getHumanValue()
 * @model
 * @generated
 */
public interface HumanValue extends PsychologicalFactor {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link factors.HumanValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see factors.HumanValueType
	 * @see #setValue(HumanValueType)
	 * @see factors.Psychological.NewPackage2Package#getHumanValue_Value()
	 * @model
	 * @generated
	 */
	HumanValueType getValue();

	/**
	 * Sets the value of the '{@link factors.Psychological.HumanValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see factors.HumanValueType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(HumanValueType value);

} // HumanValue
