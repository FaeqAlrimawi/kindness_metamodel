/**
 */
package factors.Psychological;

import factors.EmotionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emotion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.Psychological.Emotion#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see factors.Psychological.NewPackage2Package#getEmotion()
 * @model
 * @generated
 */
public interface Emotion extends PsychologicalFactor {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link factors.EmotionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see factors.EmotionType
	 * @see #setType(EmotionType)
	 * @see factors.Psychological.NewPackage2Package#getEmotion_Type()
	 * @model
	 * @generated
	 */
	EmotionType getType();

	/**
	 * Sets the value of the '{@link factors.Psychological.Emotion#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see factors.EmotionType
	 * @see #getType()
	 * @generated
	 */
	void setType(EmotionType value);

} // Emotion
