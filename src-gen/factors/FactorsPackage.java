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
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS__ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Socialfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS__SOCIALFACTOR = 1;

	/**
	 * The number of structural features of the '<em>Abs Social Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Impactedfactors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__IMPACTEDFACTORS = 1;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link factors.impl.ImpactedFactorImpl <em>Impacted Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.impl.ImpactedFactorImpl
	 * @see factors.impl.FactorsPackageImpl#getImpactedFactor()
	 * @generated
	 */
	int IMPACTED_FACTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACTED_FACTOR__NAME = FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Impactedfactors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACTED_FACTOR__IMPACTEDFACTORS = FACTOR__IMPACTEDFACTORS;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACTED_FACTOR__IMPACT = FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACTED_FACTOR__FACTORS = FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Impacted Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACTED_FACTOR_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Impacted Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACTED_FACTOR_OPERATION_COUNT = FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factors.DegreeOfRelatedness <em>Degree Of Relatedness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.DegreeOfRelatedness
	 * @see factors.impl.FactorsPackageImpl#getDegreeOfRelatedness()
	 * @generated
	 */
	int DEGREE_OF_RELATEDNESS = 5;

	/**
	 * The meta object id for the '{@link factors.Need <em>Need</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Need
	 * @see factors.impl.FactorsPackageImpl#getNeed()
	 * @generated
	 */
	int NEED = 6;

	/**
	 * The meta object id for the '{@link factors.Opportunity <em>Opportunity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Opportunity
	 * @see factors.impl.FactorsPackageImpl#getOpportunity()
	 * @generated
	 */
	int OPPORTUNITY = 7;

	/**
	 * The meta object id for the '{@link factors.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Level
	 * @see factors.impl.FactorsPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 8;

	/**
	 * The meta object id for the '{@link factors.FactorImpact <em>Factor Impact</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.FactorImpact
	 * @see factors.impl.FactorsPackageImpl#getFactorImpact()
	 * @generated
	 */
	int FACTOR_IMPACT = 9;

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
	 * Returns the meta object for the containment reference list '{@link factors.AbsSocialFactors#getSocialfactor <em>Socialfactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Socialfactor</em>'.
	 * @see factors.AbsSocialFactors#getSocialfactor()
	 * @see #getAbsSocialFactors()
	 * @generated
	 */
	EReference getAbsSocialFactors_Socialfactor();

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
	 * Returns the meta object for the reference list '{@link factors.Factor#getImpactedfactors <em>Impactedfactors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impactedfactors</em>'.
	 * @see factors.Factor#getImpactedfactors()
	 * @see #getFactor()
	 * @generated
	 */
	EReference getFactor_Impactedfactors();

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
	 * Returns the meta object for class '{@link factors.ImpactedFactor <em>Impacted Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impacted Factor</em>'.
	 * @see factors.ImpactedFactor
	 * @generated
	 */
	EClass getImpactedFactor();

	/**
	 * Returns the meta object for the attribute '{@link factors.ImpactedFactor#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact</em>'.
	 * @see factors.ImpactedFactor#getImpact()
	 * @see #getImpactedFactor()
	 * @generated
	 */
	EAttribute getImpactedFactor_Impact();

	/**
	 * Returns the meta object for the reference list '{@link factors.ImpactedFactor#getFactors <em>Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Factors</em>'.
	 * @see factors.ImpactedFactor#getFactors()
	 * @see #getImpactedFactor()
	 * @generated
	 */
	EReference getImpactedFactor_Factors();

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
	 * Returns the meta object for enum '{@link factors.FactorImpact <em>Factor Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Factor Impact</em>'.
	 * @see factors.FactorImpact
	 * @generated
	 */
	EEnum getFactorImpact();

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
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__ACTOR = eINSTANCE.getAbsSocialFactors_Actor();

		/**
		 * The meta object literal for the '<em><b>Socialfactor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__SOCIALFACTOR = eINSTANCE.getAbsSocialFactors_Socialfactor();

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
		 * The meta object literal for the '<em><b>Impactedfactors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTOR__IMPACTEDFACTORS = eINSTANCE.getFactor_Impactedfactors();

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
		 * The meta object literal for the '{@link factors.impl.ImpactedFactorImpl <em>Impacted Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.impl.ImpactedFactorImpl
		 * @see factors.impl.FactorsPackageImpl#getImpactedFactor()
		 * @generated
		 */
		EClass IMPACTED_FACTOR = eINSTANCE.getImpactedFactor();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPACTED_FACTOR__IMPACT = eINSTANCE.getImpactedFactor_Impact();

		/**
		 * The meta object literal for the '<em><b>Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACTED_FACTOR__FACTORS = eINSTANCE.getImpactedFactor_Factors();

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

		/**
		 * The meta object literal for the '{@link factors.FactorImpact <em>Factor Impact</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.FactorImpact
		 * @see factors.impl.FactorsPackageImpl#getFactorImpact()
		 * @generated
		 */
		EEnum FACTOR_IMPACT = eINSTANCE.getFactorImpact();

	}

} //FactorsPackage
