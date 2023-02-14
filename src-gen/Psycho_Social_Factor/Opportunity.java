/**
 */
package Psycho_Social_Factor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Opportunity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getOpportunity()
 * @model
 * @generated
 */
public enum Opportunity implements Enumerator {
	/**
	 * The '<em><b>MAKE NEW FRIEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE_NEW_FRIEND_VALUE
	 * @generated
	 * @ordered
	 */
	MAKE_NEW_FRIEND(0, "MAKE_NEW_FRIEND", "MAKE_NEW_FRIEND"),

	/**
	 * The '<em><b>KEEP OLD FRIEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_OLD_FRIEND_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_OLD_FRIEND(1, "KEEP_OLD_FRIEND", "KEEP_OLD_FRIEND"),

	/**
	 * The '<em><b>STRENGTHEN FAMILY TIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRENGTHEN_FAMILY_TIES_VALUE
	 * @generated
	 * @ordered
	 */
	STRENGTHEN_FAMILY_TIES(2, "STRENGTHEN_FAMILY_TIES", "STRENGTHEN_FAMILY_TIES"),

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
	 * The '<em><b>MAKE NEW FRIEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE_NEW_FRIEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAKE_NEW_FRIEND_VALUE = 0;

	/**
	 * The '<em><b>KEEP OLD FRIEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_OLD_FRIEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_OLD_FRIEND_VALUE = 1;

	/**
	 * The '<em><b>STRENGTHEN FAMILY TIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRENGTHEN_FAMILY_TIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRENGTHEN_FAMILY_TIES_VALUE = 2;

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
	 * An array of all the '<em><b>Opportunity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Opportunity[] VALUES_ARRAY = new Opportunity[] { MAKE_NEW_FRIEND, KEEP_OLD_FRIEND,
			STRENGTHEN_FAMILY_TIES, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>Opportunity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Opportunity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Opportunity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Opportunity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Opportunity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Opportunity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Opportunity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Opportunity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Opportunity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Opportunity get(int value) {
		switch (value) {
		case MAKE_NEW_FRIEND_VALUE:
			return MAKE_NEW_FRIEND;
		case KEEP_OLD_FRIEND_VALUE:
			return KEEP_OLD_FRIEND;
		case STRENGTHEN_FAMILY_TIES_VALUE:
			return STRENGTHEN_FAMILY_TIES;
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
	private Opportunity(int value, String name, String literal) {
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

} //Opportunity
