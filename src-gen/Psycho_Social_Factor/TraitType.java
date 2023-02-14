/**
 */
package Psycho_Social_Factor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trait Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getTraitType()
 * @model
 * @generated
 */
public enum TraitType implements Enumerator {
	/**
	 * The '<em><b>OPENNESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENNESS_VALUE
	 * @generated
	 * @ordered
	 */
	OPENNESS(0, "OPENNESS", "OPENNESS"),

	/**
	 * The '<em><b>AGREEABLENESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEABLENESS_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEABLENESS(1, "AGREEABLENESS", "AGREEABLENESS"),

	/**
	 * The '<em><b>EXTRAVERSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRAVERSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTRAVERSION(2, "EXTRAVERSION", "EXTRAVERSION"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "OTHER", "OTHER");

	/**
	 * The '<em><b>OPENNESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENNESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENNESS_VALUE = 0;

	/**
	 * The '<em><b>AGREEABLENESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEABLENESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGREEABLENESS_VALUE = 1;

	/**
	 * The '<em><b>EXTRAVERSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRAVERSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTRAVERSION_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Trait Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TraitType[] VALUES_ARRAY = new TraitType[] { OPENNESS, AGREEABLENESS, EXTRAVERSION, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>Trait Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TraitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trait Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TraitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TraitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trait Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TraitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TraitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trait Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TraitType get(int value) {
		switch (value) {
		case OPENNESS_VALUE:
			return OPENNESS;
		case AGREEABLENESS_VALUE:
			return AGREEABLENESS;
		case EXTRAVERSION_VALUE:
			return EXTRAVERSION;
		case OTHER_VALUE:
			return OTHER;
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
	private TraitType(int value, String name, String literal) {
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

} //TraitType
