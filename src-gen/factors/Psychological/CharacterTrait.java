/**
 */
package factors.Psychological;

import factors.TraitType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Trait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.Psychological.CharacterTrait#getTrait <em>Trait</em>}</li>
 * </ul>
 *
 * @see factors.Psychological.NewPackage2Package#getCharacterTrait()
 * @model
 * @generated
 */
public interface CharacterTrait extends PsychologicalFactor {
	/**
	 * Returns the value of the '<em><b>Trait</b></em>' attribute.
	 * The literals are from the enumeration {@link factors.TraitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trait</em>' attribute.
	 * @see factors.TraitType
	 * @see #setTrait(TraitType)
	 * @see factors.Psychological.NewPackage2Package#getCharacterTrait_Trait()
	 * @model
	 * @generated
	 */
	TraitType getTrait();

	/**
	 * Sets the value of the '{@link factors.Psychological.CharacterTrait#getTrait <em>Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trait</em>' attribute.
	 * @see factors.TraitType
	 * @see #getTrait()
	 * @generated
	 */
	void setTrait(TraitType value);

} // CharacterTrait
