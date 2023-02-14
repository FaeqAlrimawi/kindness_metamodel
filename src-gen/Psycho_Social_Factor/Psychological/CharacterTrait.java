/**
 */
package Psycho_Social_Factor.Psychological;

import Psycho_Social_Factor.TraitType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Trait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.Psychological.CharacterTrait#getTrait <em>Trait</em>}</li>
 * </ul>
 *
 * @see Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage#getCharacterTrait()
 * @model
 * @generated
 */
public interface CharacterTrait extends PsychologicalFactor {
	/**
	 * Returns the value of the '<em><b>Trait</b></em>' attribute.
	 * The literals are from the enumeration {@link Psycho_Social_Factor.TraitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trait</em>' attribute.
	 * @see Psycho_Social_Factor.TraitType
	 * @see #setTrait(TraitType)
	 * @see Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage#getCharacterTrait_Trait()
	 * @model
	 * @generated
	 */
	TraitType getTrait();

	/**
	 * Sets the value of the '{@link Psycho_Social_Factor.Psychological.CharacterTrait#getTrait <em>Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trait</em>' attribute.
	 * @see Psycho_Social_Factor.TraitType
	 * @see #getTrait()
	 * @generated
	 */
	void setTrait(TraitType value);

} // CharacterTrait
