/**
 */
package diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDiagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.KDiagram#getAbskindnessopportunity <em>Abskindnessopportunity</em>}</li>
 *   <li>{@link diagram.KDiagram#getAbskindnessentity <em>Abskindnessentity</em>}</li>
 * </ul>
 *
 * @see diagram.KindnessDiagramPackage#getKDiagram()
 * @model
 * @generated
 */
public interface KDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Abskindnessopportunity</b></em>' containment reference list.
	 * The list contents are of type {@link diagram.AbsKindnessOpportunity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abskindnessopportunity</em>' containment reference list.
	 * @see diagram.KindnessDiagramPackage#getKDiagram_Abskindnessopportunity()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbsKindnessOpportunity> getAbskindnessopportunity();

	/**
	 * Returns the value of the '<em><b>Abskindnessentity</b></em>' containment reference list.
	 * The list contents are of type {@link diagram.AbsKindnessEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abskindnessentity</em>' containment reference list.
	 * @see diagram.KindnessDiagramPackage#getKDiagram_Abskindnessentity()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbsKindnessEntity> getAbskindnessentity();

} // KDiagram
