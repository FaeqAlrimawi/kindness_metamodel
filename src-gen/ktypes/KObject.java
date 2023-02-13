/**
 */
package ktypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ktypes.KObject#getKtype <em>Ktype</em>}</li>
 * </ul>
 *
 * @see ktypes.KtypesPackage#getKObject()
 * @model abstract="true"
 * @generated
 */
public interface KObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Ktype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ktype</em>' containment reference.
	 * @see #setKtype(KType)
	 * @see ktypes.KtypesPackage#getKObject_Ktype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	KType getKtype();

	/**
	 * Sets the value of the '{@link ktypes.KObject#getKtype <em>Ktype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ktype</em>' containment reference.
	 * @see #getKtype()
	 * @generated
	 */
	void setKtype(KType value);

} // KObject
