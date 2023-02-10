/**
 */
package factors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_SOCIAL_FACTORS__CONNECTION = 0;

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
	 * The meta object id for the '{@link factors.impl.AbsConnectionImpl <em>Abs Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.impl.AbsConnectionImpl
	 * @see factors.impl.FactorsPackageImpl#getAbsConnection()
	 * @generated
	 */
	int ABS_CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Abs Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_CONNECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abs Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_CONNECTION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Affectedfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__AFFECTEDFACTOR = 1;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__OTHER = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Compute Impact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR___COMPUTE_IMPACT__FACTORIMPACT = 0;

	/**
	 * The number of operations of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_OPERATION_COUNT = 1;

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
	 * The feature id for the '<em><b>Psychologicalfactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR = 0;

	/**
	 * The number of structural features of the '<em>Abs Psychological Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PSYCHOLOGICAL_FACTORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abs Psychological Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_PSYCHOLOGICAL_FACTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factors.impl.AffectedFactorsImpl <em>Affected Factors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.impl.AffectedFactorsImpl
	 * @see factors.impl.FactorsPackageImpl#getAffectedFactors()
	 * @generated
	 */
	int AFFECTED_FACTORS = 4;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTED_FACTORS__FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTED_FACTORS__IMPACT = 1;

	/**
	 * The number of structural features of the '<em>Affected Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTED_FACTORS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Affected Factors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTED_FACTORS_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link factors.EmotionType <em>Emotion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.EmotionType
	 * @see factors.impl.FactorsPackageImpl#getEmotionType()
	 * @generated
	 */
	int EMOTION_TYPE = 10;

	/**
	 * The meta object id for the '{@link factors.TraitType <em>Trait Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.TraitType
	 * @see factors.impl.FactorsPackageImpl#getTraitType()
	 * @generated
	 */
	int TRAIT_TYPE = 11;

	/**
	 * The meta object id for the '{@link factors.HumanValueType <em>Human Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.HumanValueType
	 * @see factors.impl.FactorsPackageImpl#getHumanValueType()
	 * @generated
	 */
	int HUMAN_VALUE_TYPE = 12;

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
	 * Returns the meta object for the reference '{@link factors.AbsSocialFactors#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see factors.AbsSocialFactors#getConnection()
	 * @see #getAbsSocialFactors()
	 * @generated
	 */
	EReference getAbsSocialFactors_Connection();

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
	 * Returns the meta object for class '{@link factors.AbsConnection <em>Abs Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Connection</em>'.
	 * @see factors.AbsConnection
	 * @generated
	 */
	EClass getAbsConnection();

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
	 * Returns the meta object for the containment reference list '{@link factors.Factor#getAffectedfactor <em>Affectedfactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affectedfactor</em>'.
	 * @see factors.Factor#getAffectedfactor()
	 * @see #getFactor()
	 * @generated
	 */
	EReference getFactor_Affectedfactor();

	/**
	 * Returns the meta object for the attribute '{@link factors.Factor#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see factors.Factor#getOther()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Other();

	/**
	 * Returns the meta object for the attribute '{@link factors.Factor#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see factors.Factor#getLevel()
	 * @see #getFactor()
	 * @generated
	 */
	EAttribute getFactor_Level();

	/**
	 * Returns the meta object for the '{@link factors.Factor#computeImpact(factors.FactorImpact) <em>Compute Impact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Impact</em>' operation.
	 * @see factors.Factor#computeImpact(factors.FactorImpact)
	 * @generated
	 */
	EOperation getFactor__ComputeImpact__FactorImpact();

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
	 * Returns the meta object for the containment reference list '{@link factors.AbsPsychologicalFactors#getPsychologicalfactor <em>Psychologicalfactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Psychologicalfactor</em>'.
	 * @see factors.AbsPsychologicalFactors#getPsychologicalfactor()
	 * @see #getAbsPsychologicalFactors()
	 * @generated
	 */
	EReference getAbsPsychologicalFactors_Psychologicalfactor();

	/**
	 * Returns the meta object for class '{@link factors.AffectedFactors <em>Affected Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affected Factors</em>'.
	 * @see factors.AffectedFactors
	 * @generated
	 */
	EClass getAffectedFactors();

	/**
	 * Returns the meta object for the reference '{@link factors.AffectedFactors#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Factor</em>'.
	 * @see factors.AffectedFactors#getFactor()
	 * @see #getAffectedFactors()
	 * @generated
	 */
	EReference getAffectedFactors_Factor();

	/**
	 * Returns the meta object for the attribute '{@link factors.AffectedFactors#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact</em>'.
	 * @see factors.AffectedFactors#getImpact()
	 * @see #getAffectedFactors()
	 * @generated
	 */
	EAttribute getAffectedFactors_Impact();

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
	 * Returns the meta object for enum '{@link factors.EmotionType <em>Emotion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Emotion Type</em>'.
	 * @see factors.EmotionType
	 * @generated
	 */
	EEnum getEmotionType();

	/**
	 * Returns the meta object for enum '{@link factors.TraitType <em>Trait Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trait Type</em>'.
	 * @see factors.TraitType
	 * @generated
	 */
	EEnum getTraitType();

	/**
	 * Returns the meta object for enum '{@link factors.HumanValueType <em>Human Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Human Value Type</em>'.
	 * @see factors.HumanValueType
	 * @generated
	 */
	EEnum getHumanValueType();

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
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__CONNECTION = eINSTANCE.getAbsSocialFactors_Connection();

		/**
		 * The meta object literal for the '<em><b>Socialfactor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_SOCIAL_FACTORS__SOCIALFACTOR = eINSTANCE.getAbsSocialFactors_Socialfactor();

		/**
		 * The meta object literal for the '{@link factors.impl.AbsConnectionImpl <em>Abs Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.impl.AbsConnectionImpl
		 * @see factors.impl.FactorsPackageImpl#getAbsConnection()
		 * @generated
		 */
		EClass ABS_CONNECTION = eINSTANCE.getAbsConnection();

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
		 * The meta object literal for the '<em><b>Affectedfactor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTOR__AFFECTEDFACTOR = eINSTANCE.getFactor_Affectedfactor();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__OTHER = eINSTANCE.getFactor_Other();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR__LEVEL = eINSTANCE.getFactor_Level();

		/**
		 * The meta object literal for the '<em><b>Compute Impact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACTOR___COMPUTE_IMPACT__FACTORIMPACT = eINSTANCE.getFactor__ComputeImpact__FactorImpact();

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
		 * The meta object literal for the '<em><b>Psychologicalfactor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_PSYCHOLOGICAL_FACTORS__PSYCHOLOGICALFACTOR = eINSTANCE
				.getAbsPsychologicalFactors_Psychologicalfactor();

		/**
		 * The meta object literal for the '{@link factors.impl.AffectedFactorsImpl <em>Affected Factors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.impl.AffectedFactorsImpl
		 * @see factors.impl.FactorsPackageImpl#getAffectedFactors()
		 * @generated
		 */
		EClass AFFECTED_FACTORS = eINSTANCE.getAffectedFactors();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECTED_FACTORS__FACTOR = eINSTANCE.getAffectedFactors_Factor();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTED_FACTORS__IMPACT = eINSTANCE.getAffectedFactors_Impact();

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

		/**
		 * The meta object literal for the '{@link factors.EmotionType <em>Emotion Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.EmotionType
		 * @see factors.impl.FactorsPackageImpl#getEmotionType()
		 * @generated
		 */
		EEnum EMOTION_TYPE = eINSTANCE.getEmotionType();

		/**
		 * The meta object literal for the '{@link factors.TraitType <em>Trait Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.TraitType
		 * @see factors.impl.FactorsPackageImpl#getTraitType()
		 * @generated
		 */
		EEnum TRAIT_TYPE = eINSTANCE.getTraitType();

		/**
		 * The meta object literal for the '{@link factors.HumanValueType <em>Human Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.HumanValueType
		 * @see factors.impl.FactorsPackageImpl#getHumanValueType()
		 * @generated
		 */
		EEnum HUMAN_VALUE_TYPE = eINSTANCE.getHumanValueType();

	}

} //FactorsPackage
