/**
 */
package kindness_metamodel;

import Psycho_Social_Factor.AbsConnection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.Connection#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.Connection#getType <em>Type</em>}</li>
 *   <li>{@link kindness_metamodel.Connection#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link kindness_metamodel.Connection#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link kindness_metamodel.Connection#getEntity2 <em>Entity2</em>}</li>
 * </ul>
 *
 * @see kindness_metamodel.KindnessPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends AbsConnection {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kindness_metamodel.KindnessPackage#getConnection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Connection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see kindness_metamodel.KindnessPackage#getConnection_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Connection#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see kindness_metamodel.KindnessPackage#getConnection_Bidirectional()
	 * @model default="True"
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Connection#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Entity1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity1</em>' reference.
	 * @see #setEntity1(KindnessEntity)
	 * @see kindness_metamodel.KindnessPackage#getConnection_Entity1()
	 * @model required="true"
	 * @generated
	 */
	KindnessEntity getEntity1();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Connection#getEntity1 <em>Entity1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity1</em>' reference.
	 * @see #getEntity1()
	 * @generated
	 */
	void setEntity1(KindnessEntity value);

	/**
	 * Returns the value of the '<em><b>Entity2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity2</em>' reference.
	 * @see #setEntity2(KindnessEntity)
	 * @see kindness_metamodel.KindnessPackage#getConnection_Entity2()
	 * @model required="true"
	 * @generated
	 */
	KindnessEntity getEntity2();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Connection#getEntity2 <em>Entity2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity2</em>' reference.
	 * @see #getEntity2()
	 * @generated
	 */
	void setEntity2(KindnessEntity value);

} // Connection
