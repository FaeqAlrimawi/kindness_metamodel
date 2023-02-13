/**
 */
package kindness_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opportunity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.KindnessOpportunity#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.KindnessOpportunity#getProperties <em>Properties</em>}</li>
 *   <li>{@link kindness_metamodel.KindnessOpportunity#getAct <em>Act</em>}</li>
 *   <li>{@link kindness_metamodel.KindnessOpportunity#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see kindness_metamodel.KindnessPackage#getKindnessOpportunity()
 * @model
 * @generated
 */
public interface KindnessOpportunity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kindness_metamodel.KindnessPackage#getKindnessOpportunity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kindness_metamodel.KindnessOpportunity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link kindness_metamodel.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see kindness_metamodel.KindnessPackage#getKindnessOpportunity_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Act</b></em>' containment reference list.
	 * The list contents are of type {@link kindness_metamodel.Act}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' containment reference list.
	 * @see kindness_metamodel.KindnessPackage#getKindnessOpportunity_Act()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Act> getAct();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see kindness_metamodel.KindnessPackage#getKindnessOpportunity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link kindness_metamodel.KindnessOpportunity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // KindnessOpportunity
