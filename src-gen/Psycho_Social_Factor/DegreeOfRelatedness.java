/**
 */
package Psycho_Social_Factor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Degree Of Relatedness</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getDegreeOfRelatedness()
 * @model
 * @generated
 */
public enum DegreeOfRelatedness implements Enumerator {
	/**
	 * The '<em><b>FAMILY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY(0, "FAMILY", "FAMILY"),

	/**
	 * The '<em><b>FRIEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIEND_VALUE
	 * @generated
	 * @ordered
	 */
	FRIEND(1, "FRIEND", "FRIEND"),

	/**
	 * The '<em><b>COLLEAGUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLEAGUE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLEAGUE(2, "COLLEAGUE", "COLLEAGUE"),

	/**
	 * The '<em><b>ACQUAINTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACQUAINTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ACQUAINTANCE(3, "ACQUAINTANCE", "ACQUAINTANCE"),

	/**
	 * The '<em><b>STRANGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRANGER_VALUE
	 * @generated
	 * @ordered
	 */
	STRANGER(4, "STRANGER", "STRANGER"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "OTHER", "OTHER");

	/**
	 * The '<em><b>FAMILY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_VALUE = 0;

	/**
	 * The '<em><b>FRIEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRIEND_VALUE = 1;

	/**
	 * The '<em><b>COLLEAGUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLEAGUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLEAGUE_VALUE = 2;

	/**
	 * The '<em><b>ACQUAINTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACQUAINTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACQUAINTANCE_VALUE = 3;

	/**
	 * The '<em><b>STRANGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRANGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRANGER_VALUE = 4;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Degree Of Relatedness</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DegreeOfRelatedness[] VALUES_ARRAY = new DegreeOfRelatedness[] { FAMILY, FRIEND, COLLEAGUE,
			ACQUAINTANCE, STRANGER, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>Degree Of Relatedness</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DegreeOfRelatedness> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Degree Of Relatedness</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DegreeOfRelatedness get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DegreeOfRelatedness result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Degree Of Relatedness</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DegreeOfRelatedness getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DegreeOfRelatedness result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Degree Of Relatedness</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DegreeOfRelatedness get(int value) {
		switch (value) {
		case FAMILY_VALUE:
			return FAMILY;
		case FRIEND_VALUE:
			return FRIEND;
		case COLLEAGUE_VALUE:
			return COLLEAGUE;
		case ACQUAINTANCE_VALUE:
			return ACQUAINTANCE;
		case STRANGER_VALUE:
			return STRANGER;
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
	private DegreeOfRelatedness(int value, String name, String literal) {
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

} //DegreeOfRelatedness
