/**
 */
package Psycho_Social_Factor;

import Psycho_Social_Factor.Psychological.PsychologicalFactor;

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
 *   <li>{@link Psycho_Social_Factor.AbsPsychologicalFactors#getPsychologicalfactor <em>Psychologicalfactor</em>}</li>
 * </ul>
 *
 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getAbsPsychologicalFactors()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbsPsychologicalFactors extends EObject {
	/**
	 * Returns the value of the '<em><b>Psychologicalfactor</b></em>' containment reference list.
	 * The list contents are of type {@link Psycho_Social_Factor.Psychological.PsychologicalFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psychologicalfactor</em>' containment reference list.
	 * @see Psycho_Social_Factor.Psycho_Social_FactorPackage#getAbsPsychologicalFactors_Psychologicalfactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<PsychologicalFactor> getPsychologicalfactor();

} // AbsPsychologicalFactors
