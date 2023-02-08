/**
 */
package factors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see factors.FactorsFactory
 * @model kind="package"
 * @generated
 */
public interface FactorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "factors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kindness_metamodel_factors";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kindness_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactorsPackage eINSTANCE = factors.impl.FactorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link factors.impl.AbsSocialFactorsImpl <em>Abs Social Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.impl.AbsSocialFactorsImpl
	 * @see factors.impl.FactorsPackageImpl#getAbsSocialFactors()
	 * @generated
	 */
	int ABS_SOCIAL_FACTORS = 0;

	/**
	 * The feature id for the '<em><b>Relatedness</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS__RELATEDNESS = 0;

	/**
	 * The feature id for the '<em><b>Reciprocity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS__RECIPROCITY = 1;

	/**
	 * The feature id for the '<em><b>Levelofneed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS__LEVELOFNEED = 2;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS__ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Opportunitytoconnect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS__OPPORTUNITYTOCONNECT = 4;

	/**
	 * The feature id for the '<em><b>Trust</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS__TRUST = 5;

	/**
	 * The number of structural features of the '<em>Abs Social Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Abs Social Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factors.impl.AbsKindnessEntityImpl <em>Abs Kindness Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.impl.AbsKindnessEntityImpl
	 * @see factors.impl.FactorsPackageImpl#getAbsKindnessEntity()
	 * @generated
	 */
	int ABS_KINDNESS_ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Abs Kindness Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KINDNESS_ENTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abs Kindness Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KINDNESS_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factors.Factor <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Factor
	 * @see factors.impl.FactorsPackageImpl#getFactor()
	 * @generated
	 */
	int FACTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factors.AbsPsychologicalFactors <em>Abs Psychological Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.AbsPsychologicalFactors
	 * @see factors.impl.FactorsPackageImpl#getAbsPsychologicalFactors()
	 * @generated
	 */
	int ABS_PSYCHOLOGICAL_FACTORS = 3;

	/**
	 * The number of structural features of the '<em>Abs Psychological Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PSYCHOLOGICAL_FACTORS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abs Psychological Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PSYCHOLOGICAL_FACTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factors.DegreeOfRelatedness <em>Degree Of Relatedness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.DegreeOfRelatedness
	 * @see factors.impl.FactorsPackageImpl#getDegreeOfRelatedness()
	 * @generated
	 */
	int DEGREE_OF_RELATEDNESS = 4;

	/**
	 * The meta object id for the '{@link factors.Need <em>Need</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Need
	 * @see factors.impl.FactorsPackageImpl#getNeed()
	 * @generated
	 */
	int NEED = 5;

	/**
	 * The meta object id for the '{@link factors.Opportunity <em>Opportunity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Opportunity
	 * @see factors.impl.FactorsPackageImpl#getOpportunity()
	 * @generated
	 */
	int OPPORTUNITY = 6;

	/**
	 * The meta object id for the '{@link factors.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Level
	 * @see factors.impl.FactorsPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 7;

	/**
	 * Returns the meta object for class '{@link factors.AbsSocialFactors <em>Abs Social Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Social Factors</em>'.
	 * @see factors.AbsSocialFactors
	 * @generated
	 */
	EClass getAbsSocialFactors();

	/**
	 * Returns the meta object for the containment reference list '{@link factors.AbsSocialFactors#getRelatedness <em>Relatedness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relatedness</em>'.
	 * @see factors.AbsSocialFactors#getRelatedness()
	 * @see #getAbsSocialFactors()
	 * @generated
	 */
	EReference getAbsSocialFactors_Relatedness();

	/**
	 * Returns the meta object for the containment reference list '{@link factors.AbsSocialFactors#getReciprocity <em>Reciprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reciprocity</em>'.
	 * @see factors.AbsSocialFactors#getReciprocity()
	 * @see #getAbsSocialFactors()
	 * @generated
	 */
	EReference getAbsSocialFactors_Reciprocity();

	/**
	 * Returns the meta object for the containment reference list '{@link factors.AbsSocialFactors#getLevelofneed <em>Levelofneed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levelofneed</em>'.
	 * @see factors.AbsSocialFactors#getLevelofneed()
	 * @see #getAbsSocialFactors()
	 * @generated
	 */
	EReference getAbsSocialFactors_Levelofneed();

	/**
	 * Returns the meta object for the reference '{@link factors.AbsSocialFactors#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see factors.AbsSocialFactors#getActor()
	 * @see #getAbsSocialFactors()
	 * @generated
	 */
	EReference getAbsSocialFactors_Actor();

	/**
	 * Returns the meta object for the containment reference list '{@link factors.AbsSocialFactors#getOpportunitytoconnect <em>Opportunitytoconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opportunitytoconnect</em>'.
	 * @see factors.AbsSocialFactors#getOpportunitytoconnect()
	 * @see #getAbsSocialFactors()
	 * @generated
	 */
	EReference getAbsSocialFactors_Opportunitytoconnect();

	/**
	 * Returns the meta object for the containment reference list '{@link factors.AbsSocialFactors#getTrust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trust</em>'.
	 * @see factors.AbsSocialFactors#getTrust()
	 * @see #getAbsSocialFactors()
	 * @generated
	 */
	EReference getAbsSocialFactors_Trust();

	/**
	 * Returns the meta object for class '{@link factors.AbsKindnessEntity <em>Abs Kindness Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Kindness Entity</em>'.
	 * @see factors.AbsKindnessEntity
	 * @generated
	 */
	EClass getAbsKindnessEntity();

	/**
	 * Returns the meta object for class '{@link factors.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see factors.Factor
	 * @generated
	 */
	EClass getFactor();

	/**
	 * Returns the meta object for the attribute '{@link factors.Factor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factors.Factor#getName()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Name();

	/**
	 * Returns the meta object for class '{@link factors.AbsPsychologicalFactors <em>Abs Psychological Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Psychological Factors</em>'.
	 * @see factors.AbsPsychologicalFactors
	 * @generated
	 */
	EClass getAbsPsychologicalFactors();

	/**
	 * Returns the meta object for enum '{@link factors.DegreeOfRelatedness <em>Degree Of Relatedness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Degree Of Relatedness</em>'.
	 * @see factors.DegreeOfRelatedness
	 * @generated
	 */
	EEnum getDegreeOfRelatedness();

	/**
	 * Returns the meta object for enum '{@link factors.Need <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Need</em>'.
	 * @see factors.Need
	 * @generated
	 */
	EEnum getNeed();

	/**
	 * Returns the meta object for enum '{@link factors.Opportunity <em>Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Opportunity</em>'.
	 * @see factors.Opportunity
	 * @generated
	 */
	EEnum getOpportunity();

	/**
	 * Returns the meta object for enum '{@link factors.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see factors.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FactorsFactory getFactorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link factors.impl.AbsSocialFactorsImpl <em>Abs Social Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.impl.AbsSocialFactorsImpl
		 * @see factors.impl.FactorsPackageImpl#getAbsSocialFactors()
		 * @generated
		 */
		EClass ABS_SOCIAL_FACTORS = eINSTANCE.getAbsSocialFactors();

		/**
		 * The meta object literal for the '<em><b>Relatedness</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__RELATEDNESS = eINSTANCE.getAbsSocialFactors_Relatedness();

		/**
		 * The meta object literal for the '<em><b>Reciprocity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__RECIPROCITY = eINSTANCE.getAbsSocialFactors_Reciprocity();

		/**
		 * The meta object literal for the '<em><b>Levelofneed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__LEVELOFNEED = eINSTANCE.getAbsSocialFactors_Levelofneed();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__ACTOR = eINSTANCE.getAbsSocialFactors_Actor();

		/**
		 * The meta object literal for the '<em><b>Opportunitytoconnect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__OPPORTUNITYTOCONNECT = eINSTANCE.getAbsSocialFactors_Opportunitytoconnect();

		/**
		 * The meta object literal for the '<em><b>Trust</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__TRUST = eINSTANCE.getAbsSocialFactors_Trust();

		/**
		 * The meta object literal for the '{@link factors.impl.AbsKindnessEntityImpl <em>Abs Kindness Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.impl.AbsKindnessEntityImpl
		 * @see factors.impl.FactorsPackageImpl#getAbsKindnessEntity()
		 * @generated
		 */
		EClass ABS_KINDNESS_ENTITY = eINSTANCE.getAbsKindnessEntity();

		/**
		 * The meta object literal for the '{@link factors.Factor <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Factor
		 * @see factors.impl.FactorsPackageImpl#getFactor()
		 * @generated
		 */
		EClass FACTOR = eINSTANCE.getFactor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__NAME = eINSTANCE.getFactor_Name();

		/**
		 * The meta object literal for the '{@link factors.AbsPsychologicalFactors <em>Abs Psychological Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.AbsPsychologicalFactors
		 * @see factors.impl.FactorsPackageImpl#getAbsPsychologicalFactors()
		 * @generated
		 */
		EClass ABS_PSYCHOLOGICAL_FACTORS = eINSTANCE.getAbsPsychologicalFactors();

		/**
		 * The meta object literal for the '{@link factors.DegreeOfRelatedness <em>Degree Of Relatedness</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.DegreeOfRelatedness
		 * @see factors.impl.FactorsPackageImpl#getDegreeOfRelatedness()
		 * @generated
		 */
		EEnum DEGREE_OF_RELATEDNESS = eINSTANCE.getDegreeOfRelatedness();

		/**
		 * The meta object literal for the '{@link factors.Need <em>Need</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Need
		 * @see factors.impl.FactorsPackageImpl#getNeed()
		 * @generated
		 */
		EEnum NEED = eINSTANCE.getNeed();

		/**
		 * The meta object literal for the '{@link factors.Opportunity <em>Opportunity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Opportunity
		 * @see factors.impl.FactorsPackageImpl#getOpportunity()
		 * @generated
		 */
		EEnum OPPORTUNITY = eINSTANCE.getOpportunity();

		/**
		 * The meta object literal for the '{@link factors.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Level
		 * @see factors.impl.FactorsPackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

	}

} //FactorsPackage
