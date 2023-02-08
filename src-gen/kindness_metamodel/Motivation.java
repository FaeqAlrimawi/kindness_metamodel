/**
 */
package kindness_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.Motivation#getType <em>Type</em>}</li>
 *   <li>{@link kindness_metamodel.Motivation#getLevel <em>Level</em>}</li>
 *   <li>{@link kindness_metamodel.Motivation#getTowards <em>Towards</em>}</li>
 * </ul>
 *
 * @see kindness_metamodel.KindnessPackage#getMotivation()
 * @model
 * @generated
 */
public interface Motivation extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link kindness_metamodel.MotivationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see kindness_metamodel.MotivationType
	 * @see #setType(MotivationType)
	 * @see kindness_metamodel.KindnessPackage#getMotivation_Type()
	 * @model
	 * @generated
	 */
	MotivationType getType();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Motivation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see kindness_metamodel.MotivationType
	 * @see #getType()
	 * @generated
	 */
	void setType(MotivationType value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(float)
	 * @see kindness_metamodel.KindnessPackage#getMotivation_Level()
	 * @model
	 * @generated
	 */
	float getLevel();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Motivation#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(float value);

	/**
	 * Returns the value of the '<em><b>Towards</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Towards</em>' reference.
	 * @see #setTowards(Receiver)
	 * @see kindness_metamodel.KindnessPackage#getMotivation_Towards()
	 * @model
	 * @generated
	 */
	Receiver getTowards();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Motivation#getTowards <em>Towards</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Towards</em>' reference.
	 * @see #getTowards()
	 * @generated
	 */
	void setTowards(Receiver value);

} // Motivation
