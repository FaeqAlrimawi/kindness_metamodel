/**
 */
package kindness_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.KindnessEntity#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.KindnessEntity#getType <em>Type</em>}</li>
 *   <li>{@link kindness_metamodel.KindnessEntity#getConnections <em>Connections</em>}</li>
 *   <li>{@link kindness_metamodel.KindnessEntity#getContainerEntity <em>Container Entity</em>}</li>
 *   <li>{@link kindness_metamodel.KindnessEntity#getContainedEntities <em>Contained Entities</em>}</li>
 *   <li>{@link kindness_metamodel.KindnessEntity#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see kindness_metamodel.KindnessPackage#getKindnessEntity()
 * @model
 * @generated
 */
public interface KindnessEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kindness_metamodel.KindnessPackage#getKindnessEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kindness_metamodel.KindnessEntity#getName <em>Name</em>}' attribute.
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
	 * @see kindness_metamodel.KindnessPackage#getKindnessEntity_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link kindness_metamodel.KindnessEntity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link kindness_metamodel.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see kindness_metamodel.KindnessPackage#getKindnessEntity_Connections()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Container Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Entity</em>' reference.
	 * @see #setContainerEntity(KindnessEntity)
	 * @see kindness_metamodel.KindnessPackage#getKindnessEntity_ContainerEntity()
	 * @model
	 * @generated
	 */
	KindnessEntity getContainerEntity();

	/**
	 * Sets the value of the '{@link kindness_metamodel.KindnessEntity#getContainerEntity <em>Container Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Entity</em>' reference.
	 * @see #getContainerEntity()
	 * @generated
	 */
	void setContainerEntity(KindnessEntity value);

	/**
	 * Returns the value of the '<em><b>Contained Entities</b></em>' reference list.
	 * The list contents are of type {@link kindness_metamodel.KindnessEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Entities</em>' reference list.
	 * @see kindness_metamodel.KindnessPackage#getKindnessEntity_ContainedEntities()
	 * @model
	 * @generated
	 */
	EList<KindnessEntity> getContainedEntities();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link kindness_metamodel.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see kindness_metamodel.KindnessPackage#getKindnessEntity_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // KindnessEntity
