/**
 */
package kindness_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Act Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kindness_metamodel.KindnessPackage#getActType()
 * @model
 * @generated
 */
public enum ActType implements Enumerator {
	/**
	 * The '<em><b>MOTIVATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	MOTIVATION(0, "MOTIVATION", "MOTIVATION"),

	/**
	 * The '<em><b>ABILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	ABILITY(1, "ABILITY", "ABILITY"),

	/**
	 * The '<em><b>PROMPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMPT_VALUE
	 * @generated
	 * @ordered
	 */
	PROMPT(2, "PROMPT", "PROMPT"),

	/**
	 * The '<em><b>KINDNESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KINDNESS_VALUE
	 * @generated
	 * @ordered
	 */
	KINDNESS(3, "KINDNESS", "KINDNESS");

	/**
	 * The '<em><b>MOTIVATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTIVATION_VALUE = 0;

	/**
	 * The '<em><b>ABILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABILITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABILITY_VALUE = 1;

	/**
	 * The '<em><b>PROMPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROMPT_VALUE = 2;

	/**
	 * The '<em><b>KINDNESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KINDNESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KINDNESS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Act Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActType[] VALUES_ARRAY = new ActType[] { MOTIVATION, ABILITY, PROMPT, KINDNESS, };

	/**
	 * A public read-only list of all the '<em><b>Act Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Act Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActType get(int value) {
		switch (value) {
		case MOTIVATION_VALUE:
			return MOTIVATION;
		case ABILITY_VALUE:
			return ABILITY;
		case PROMPT_VALUE:
			return PROMPT;
		case KINDNESS_VALUE:
			return KINDNESS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ActType
