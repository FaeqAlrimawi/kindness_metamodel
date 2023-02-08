/**
 */
package factors;

import factors.Social.LevelOfNeed;
import factors.Social.OpportunityToConnect;
import factors.Social.Reciprocity;
import factors.Social.Relatedness;
import factors.Social.Trust;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Social Factors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link factors.AbsSocialFactors#getRelatedness <em>Relatedness</em>}</li>
 *   <li>{@link factors.AbsSocialFactors#getReciprocity <em>Reciprocity</em>}</li>
 *   <li>{@link factors.AbsSocialFactors#getLevelofneed <em>Levelofneed</em>}</li>
 *   <li>{@link factors.AbsSocialFactors#getActor <em>Actor</em>}</li>
 *   <li>{@link factors.AbsSocialFactors#getOpportunitytoconnect <em>Opportunitytoconnect</em>}</li>
 *   <li>{@link factors.AbsSocialFactors#getTrust <em>Trust</em>}</li>
 * </ul>
 *
 * @see factors.FactorsPackage#getAbsSocialFactors()
 * @model abstract="true"
 * @generated
 */
public interface AbsSocialFactors extends EObject {
	/**
	 * Returns the value of the '<em><b>Relatedness</b></em>' containment reference list.
	 * The list contents are of type {@link factors.Social.Relatedness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relatedness</em>' containment reference list.
	 * @see factors.FactorsPackage#getAbsSocialFactors_Relatedness()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relatedness> getRelatedness();

	/**
	 * Returns the value of the '<em><b>Reciprocity</b></em>' containment reference list.
	 * The list contents are of type {@link factors.Social.Reciprocity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reciprocity</em>' containment reference list.
	 * @see factors.FactorsPackage#getAbsSocialFactors_Reciprocity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reciprocity> getReciprocity();

	/**
	 * Returns the value of the '<em><b>Levelofneed</b></em>' containment reference list.
	 * The list contents are of type {@link factors.Social.LevelOfNeed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levelofneed</em>' containment reference list.
	 * @see factors.FactorsPackage#getAbsSocialFactors_Levelofneed()
	 * @model containment="true"
	 * @generated
	 */
	EList<LevelOfNeed> getLevelofneed();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(AbsKindnessEntity)
	 * @see factors.FactorsPackage#getAbsSocialFactors_Actor()
	 * @model
	 * @generated
	 */
	AbsKindnessEntity getActor();

	/**
	 * Sets the value of the '{@link factors.AbsSocialFactors#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(AbsKindnessEntity value);

	/**
	 * Returns the value of the '<em><b>Opportunitytoconnect</b></em>' containment reference list.
	 * The list contents are of type {@link factors.Social.OpportunityToConnect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opportunitytoconnect</em>' containment reference list.
	 * @see factors.FactorsPackage#getAbsSocialFactors_Opportunitytoconnect()
	 * @model containment="true"
	 * @generated
	 */
	EList<OpportunityToConnect> getOpportunitytoconnect();

	/**
	 * Returns the value of the '<em><b>Trust</b></em>' containment reference list.
	 * The list contents are of type {@link factors.Social.Trust}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust</em>' containment reference list.
	 * @see factors.FactorsPackage#getAbsSocialFactors_Trust()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trust> getTrust();

} // AbsSocialFactors
