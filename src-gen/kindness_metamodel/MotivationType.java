/**
 */
package kindness_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Motivation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kindness_metamodel.KindnessPackage#getMotivationType()
 * @model
 * @generated
 */
public enum MotivationType implements Enumerator {
	/**
	 * The '<em><b>OTHER BETTERMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_BETTERMENT_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_BETTERMENT(0, "OTHER_BETTERMENT", "OTHER_BETTERMENT"),

	/**
	 * The '<em><b>SELF BETTERMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_BETTERMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SELF_BETTERMENT(1, "SELF_BETTERMENT", "SELF_BETTERMENT");

	/**
	 * The '<em><b>OTHER BETTERMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_BETTERMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_BETTERMENT_VALUE = 0;

	/**
	 * The '<em><b>SELF BETTERMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_BETTERMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELF_BETTERMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Motivation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MotivationType[] VALUES_ARRAY = new MotivationType[] { OTHER_BETTERMENT, SELF_BETTERMENT, };

	/**
	 * A public read-only list of all the '<em><b>Motivation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MotivationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Motivation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MotivationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MotivationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Motivation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MotivationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MotivationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Motivation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MotivationType get(int value) {
		switch (value) {
		case OTHER_BETTERMENT_VALUE:
			return OTHER_BETTERMENT;
		case SELF_BETTERMENT_VALUE:
			return SELF_BETTERMENT;
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
	private MotivationType(int value, String name, String literal) {
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

} //MotivationType
