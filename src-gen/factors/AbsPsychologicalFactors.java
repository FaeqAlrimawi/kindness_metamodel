/**
 */
package factors;

import factors.Psychological.PsychologicalFactor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Psychological Factors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.AbsPsychologicalFactors#getPsychologicalfactor <em>Psychologicalfactor</em>}</li>
 * </ul>
 *
 * @see factors.FactorsPackage#getAbsPsychologicalFactors()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbsPsychologicalFactors extends EObject {
	/**
	 * Returns the value of the '<em><b>Psychologicalfactor</b></em>' containment reference list.
	 * The list contents are of type {@link factors.Psychological.PsychologicalFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psychologicalfactor</em>' containment reference list.
	 * @see factors.FactorsPackage#getAbsPsychologicalFactors_Psychologicalfactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<PsychologicalFactor> getPsychologicalfactor();

} // AbsPsychologicalFactors
