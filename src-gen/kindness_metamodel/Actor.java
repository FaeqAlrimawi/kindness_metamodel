/**
 */
package kindness_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.Actor#getSocial_factors <em>Social factors</em>}</li>
 *   <li>{@link kindness_metamodel.Actor#getPsychological_factors <em>Psychological factors</em>}</li>
 * </ul>
 *
 * @see kindness_metamodel.KindnessPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends KindnessEntity {
	/**
	 * Returns the value of the '<em><b>Social factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social factors</em>' containment reference.
	 * @see #setSocial_factors(Social_Factors)
	 * @see kindness_metamodel.KindnessPackage#getActor_Social_factors()
	 * @model containment="true"
	 * @generated
	 */
	Social_Factors getSocial_factors();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Actor#getSocial_factors <em>Social factors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social factors</em>' containment reference.
	 * @see #getSocial_factors()
	 * @generated
	 */
	void setSocial_factors(Social_Factors value);

	/**
	 * Returns the value of the '<em><b>Psychological factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psychological factors</em>' containment reference.
	 * @see #setPsychological_factors(Psychological_Factors)
	 * @see kindness_metamodel.KindnessPackage#getActor_Psychological_factors()
	 * @model containment="true"
	 * @generated
	 */
	Psychological_Factors getPsychological_factors();

	/**
	 * Sets the value of the '{@link kindness_metamodel.Actor#getPsychological_factors <em>Psychological factors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psychological factors</em>' containment reference.
	 * @see #getPsychological_factors()
	 * @generated
	 */
	void setPsychological_factors(Psychological_Factors value);

} // Actor
