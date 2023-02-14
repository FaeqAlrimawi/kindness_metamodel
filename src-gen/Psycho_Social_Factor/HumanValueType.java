/**
 */
package Psycho_Social_Factor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Human Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getHumanValueType()
 * @model
 * @generated
 */
public enum HumanValueType implements Enumerator {
	/**
	 * The '<em><b>BENEVOLENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BENEVOLENCE_VALUE
	 * @generated
	 * @ordered
	 */
	BENEVOLENCE(0, "BENEVOLENCE", "BENEVOLENCE"),

	/**
	 * The '<em><b>UNIVERSALISM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVERSALISM_VALUE
	 * @generated
	 * @ordered
	 */
	UNIVERSALISM(1, "UNIVERSALISM", "UNIVERSALISM"),

	/**
	 * The '<em><b>TRADITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRADITION_VALUE
	 * @generated
	 * @ordered
	 */
	TRADITION(2, "TRADITION", "TRADITION"),

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
	 * The '<em><b>BENEVOLENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BENEVOLENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BENEVOLENCE_VALUE = 0;

	/**
	 * The '<em><b>UNIVERSALISM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVERSALISM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIVERSALISM_VALUE = 1;

	/**
	 * The '<em><b>TRADITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRADITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRADITION_VALUE = 2;

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
	 * An array of all the '<em><b>Human Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HumanValueType[] VALUES_ARRAY = new HumanValueType[] { BENEVOLENCE, UNIVERSALISM, TRADITION,
			OTHER, };

	/**
	 * A public read-only list of all the '<em><b>Human Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HumanValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Human Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HumanValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HumanValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Human Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HumanValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HumanValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Human Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HumanValueType get(int value) {
		switch (value) {
		case BENEVOLENCE_VALUE:
			return BENEVOLENCE;
		case UNIVERSALISM_VALUE:
			return UNIVERSALISM;
		case TRADITION_VALUE:
			return TRADITION;
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
	private HumanValueType(int value, String name, String literal) {
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

} //HumanValueType
