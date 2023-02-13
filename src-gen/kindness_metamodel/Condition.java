/**
 */
package kindness_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.Condition#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.Condition#getKindnessentity <em>Kindnessentity</em>}</li>
 * </ul>
 *
 * @see kindness_metamodel.KindnessPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kindness_metamodel.KindnessPackage#getCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kindnessentity</b></em>' containment reference list.
	 * The list contents are of type {@link kindness_metamodel.KindnessEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kindnessentity</em>' containment reference list.
	 * @see kindness_metamodel.KindnessPackage#getCondition_Kindnessentity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<KindnessEntity> getKindnessentity();

} // Condition
