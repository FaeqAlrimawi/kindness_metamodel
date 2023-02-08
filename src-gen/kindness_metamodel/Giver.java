/**
 */
package kindness_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Giver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.Giver#getMotivations <em>Motivations</em>}</li>
 * </ul>
 *
 * @see kindness_metamodel.KindnessPackage#getGiver()
 * @model
 * @generated
 */
public interface Giver extends Actor {
	/**
	 * Returns the value of the '<em><b>Motivations</b></em>' reference list.
	 * The list contents are of type {@link kindness_metamodel.Motivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motivations</em>' reference list.
	 * @see kindness_metamodel.KindnessPackage#getGiver_Motivations()
	 * @model
	 * @generated
	 */
	EList<Motivation> getMotivations();

} // Giver
