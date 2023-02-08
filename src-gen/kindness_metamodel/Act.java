/**
 */
package kindness_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.Act#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.Act#getType <em>Type</em>}</li>
 *   <li>{@link kindness_metamodel.Act#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link kindness_metamodel.Act#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link kindness_metamodel.Act#getGiver <em>Giver</em>}</li>
 *   <li>{@link kindness_metamodel.Act#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link kindness_metamodel.Act#getObservant <em>Observant</em>}</li>
 *   <li>{@link kindness_metamodel.Act#getMediator <em>Mediator</em>}</li>
 *   <li>{@link kindness_metamodel.Act#getNext <em>Next</em>}</li>
 *   <li>{@link kindness_metamodel.Act#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see kindness_metamodel.KindnessPackage#getAct()
 * @model
 * @generated
 */
public interface Act extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kindness_metamodel.KindnessPackage#getAct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Act#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"KINDNESS"</code>.
	 * The literals are from the enumeration {@link kindness_metamodel.ActType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see kindness_metamodel.ActType
	 * @see #setType(ActType)
	 * @see kindness_metamodel.KindnessPackage#getAct_Type()
	 * @model default="KINDNESS"
	 * @generated
	 */
	ActType getType();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Act#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see kindness_metamodel.ActType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActType value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(Condition)
	 * @see kindness_metamodel.KindnessPackage#getAct_Precondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getPrecondition();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Act#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference.
	 * @see #setPostcondition(Condition)
	 * @see kindness_metamodel.KindnessPackage#getAct_Postcondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getPostcondition();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Act#getPostcondition <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' containment reference.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Giver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Giver</em>' containment reference.
	 * @see #setGiver(Giver)
	 * @see kindness_metamodel.KindnessPackage#getAct_Giver()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Giver getGiver();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Act#getGiver <em>Giver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Giver</em>' containment reference.
	 * @see #getGiver()
	 * @generated
	 */
	void setGiver(Giver value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(Receiver)
	 * @see kindness_metamodel.KindnessPackage#getAct_Receiver()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Receiver getReceiver();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Act#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Receiver value);

	/**
	 * Returns the value of the '<em><b>Observant</b></em>' containment reference list.
	 * The list contents are of type {@link kindness_metamodel.Observant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observant</em>' containment reference list.
	 * @see kindness_metamodel.KindnessPackage#getAct_Observant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Observant> getObservant();

	/**
	 * Returns the value of the '<em><b>Mediator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediator</em>' containment reference.
	 * @see #setMediator(Mediator)
	 * @see kindness_metamodel.KindnessPackage#getAct_Mediator()
	 * @model containment="true"
	 * @generated
	 */
	Mediator getMediator();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Act#getMediator <em>Mediator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediator</em>' containment reference.
	 * @see #getMediator()
	 * @generated
	 */
	void setMediator(Mediator value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Act)
	 * @see kindness_metamodel.KindnessPackage#getAct_Next()
	 * @model
	 * @generated
	 */
	Act getNext();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Act#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Act value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link kindness_metamodel.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see kindness_metamodel.KindnessPackage#getAct_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Item> getItems();

} // Act
