/**
 */
package factors.Social;

import factors.FactorsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see factors.Social.NewPackage1Factory
 * @model kind="package"
 * @generated
 */
public interface NewPackage1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Social";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kindness_metamodel_factors_social";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "package_socialfactors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NewPackage1Package eINSTANCE = factors.Social.impl.NewPackage1PackageImpl.init();

	/**
	 * The meta object id for the '{@link factors.Social.impl.SocialFactorImpl <em>Social Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Social.impl.SocialFactorImpl
	 * @see factors.Social.impl.NewPackage1PackageImpl#getSocialFactor()
	 * @generated
	 */
	int SOCIAL_FACTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR__NAME = FactorsPackage.FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR__ACTOR = FactorsPackage.FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Social Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR_FEATURE_COUNT = FactorsPackage.FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Social Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FACTOR_OPERATION_COUNT = FactorsPackage.FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factors.Social.impl.LevelOfNeedImpl <em>Level Of Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Social.impl.LevelOfNeedImpl
	 * @see factors.Social.impl.NewPackage1PackageImpl#getLevelOfNeed()
	 * @generated
	 */
	int LEVEL_OF_NEED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__ACTOR = SOCIAL_FACTOR__ACTOR;

	/**
	 * The feature id for the '<em><b>Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__NEED = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED__LEVEL = SOCIAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Level Of Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Level Of Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OF_NEED_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factors.Social.impl.RelatednessImpl <em>Relatedness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Social.impl.RelatednessImpl
	 * @see factors.Social.impl.NewPackage1PackageImpl#getRelatedness()
	 * @generated
	 */
	int RELATEDNESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__ACTOR = SOCIAL_FACTOR__ACTOR;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__LEVEL = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS__DEGREE = SOCIAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relatedness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relatedness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATEDNESS_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factors.Social.impl.ReciprocityImpl <em>Reciprocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Social.impl.ReciprocityImpl
	 * @see factors.Social.impl.NewPackage1PackageImpl#getReciprocity()
	 * @generated
	 */
	int RECIPROCITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__ACTOR = SOCIAL_FACTOR__ACTOR;

	/**
	 * The feature id for the '<em><b>Is Reciprocal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__IS_RECIPROCAL = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reciprocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reciprocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factors.Social.impl.OpportunityToConnectImpl <em>Opportunity To Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Social.impl.OpportunityToConnectImpl
	 * @see factors.Social.impl.NewPackage1PackageImpl#getOpportunityToConnect()
	 * @generated
	 */
	int OPPORTUNITY_TO_CONNECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT__ACTOR = SOCIAL_FACTOR__ACTOR;

	/**
	 * The feature id for the '<em><b>Opportunity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT__OPPORTUNITY = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opportunity To Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Opportunity To Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPORTUNITY_TO_CONNECT_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factors.Social.impl.TrustImpl <em>Trust</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factors.Social.impl.TrustImpl
	 * @see factors.Social.impl.NewPackage1PackageImpl#getTrust()
	 * @generated
	 */
	int TRUST = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__NAME = SOCIAL_FACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__ACTOR = SOCIAL_FACTOR__ACTOR;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST__LEVEL = SOCIAL_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_FEATURE_COUNT = SOCIAL_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trust</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_OPERATION_COUNT = SOCIAL_FACTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link factors.Social.LevelOfNeed <em>Level Of Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Of Need</em>'.
	 * @see factors.Social.LevelOfNeed
	 * @generated
	 */
	EClass getLevelOfNeed();

	/**
	 * Returns the meta object for the attribute '{@link factors.Social.LevelOfNeed#getNeed <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need</em>'.
	 * @see factors.Social.LevelOfNeed#getNeed()
	 * @see #getLevelOfNeed()
	 * @generated
	 */
	EAttribute getLevelOfNeed_Need();

	/**
	 * Returns the meta object for the attribute '{@link factors.Social.LevelOfNeed#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see factors.Social.LevelOfNeed#getLevel()
	 * @see #getLevelOfNeed()
	 * @generated
	 */
	EAttribute getLevelOfNeed_Level();

	/**
	 * Returns the meta object for class '{@link factors.Social.Relatedness <em>Relatedness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relatedness</em>'.
	 * @see factors.Social.Relatedness
	 * @generated
	 */
	EClass getRelatedness();

	/**
	 * Returns the meta object for the attribute '{@link factors.Social.Relatedness#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see factors.Social.Relatedness#getLevel()
	 * @see #getRelatedness()
	 * @generated
	 */
	EAttribute getRelatedness_Level();

	/**
	 * Returns the meta object for the attribute '{@link factors.Social.Relatedness#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see factors.Social.Relatedness#getDegree()
	 * @see #getRelatedness()
	 * @generated
	 */
	EAttribute getRelatedness_Degree();

	/**
	 * Returns the meta object for class '{@link factors.Social.Reciprocity <em>Reciprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reciprocity</em>'.
	 * @see factors.Social.Reciprocity
	 * @generated
	 */
	EClass getReciprocity();

	/**
	 * Returns the meta object for the attribute '{@link factors.Social.Reciprocity#isIsReciprocal <em>Is Reciprocal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reciprocal</em>'.
	 * @see factors.Social.Reciprocity#isIsReciprocal()
	 * @see #getReciprocity()
	 * @generated
	 */
	EAttribute getReciprocity_IsReciprocal();

	/**
	 * Returns the meta object for class '{@link factors.Social.SocialFactor <em>Social Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Factor</em>'.
	 * @see factors.Social.SocialFactor
	 * @generated
	 */
	EClass getSocialFactor();

	/**
	 * Returns the meta object for the reference '{@link factors.Social.SocialFactor#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see factors.Social.SocialFactor#getActor()
	 * @see #getSocialFactor()
	 * @generated
	 */
	EReference getSocialFactor_Actor();

	/**
	 * Returns the meta object for class '{@link factors.Social.OpportunityToConnect <em>Opportunity To Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opportunity To Connect</em>'.
	 * @see factors.Social.OpportunityToConnect
	 * @generated
	 */
	EClass getOpportunityToConnect();

	/**
	 * Returns the meta object for the attribute '{@link factors.Social.OpportunityToConnect#getOpportunity <em>Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opportunity</em>'.
	 * @see factors.Social.OpportunityToConnect#getOpportunity()
	 * @see #getOpportunityToConnect()
	 * @generated
	 */
	EAttribute getOpportunityToConnect_Opportunity();

	/**
	 * Returns the meta object for class '{@link factors.Social.Trust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trust</em>'.
	 * @see factors.Social.Trust
	 * @generated
	 */
	EClass getTrust();

	/**
	 * Returns the meta object for the attribute '{@link factors.Social.Trust#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see factors.Social.Trust#getLevel()
	 * @see #getTrust()
	 * @generated
	 */
	EAttribute getTrust_Level();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NewPackage1Factory getNewPackage1Factory();

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
		 * The meta object literal for the '{@link factors.Social.impl.LevelOfNeedImpl <em>Level Of Need</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Social.impl.LevelOfNeedImpl
		 * @see factors.Social.impl.NewPackage1PackageImpl#getLevelOfNeed()
		 * @generated
		 */
		EClass LEVEL_OF_NEED = eINSTANCE.getLevelOfNeed();

		/**
		 * The meta object literal for the '<em><b>Need</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_OF_NEED__NEED = eINSTANCE.getLevelOfNeed_Need();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_OF_NEED__LEVEL = eINSTANCE.getLevelOfNeed_Level();

		/**
		 * The meta object literal for the '{@link factors.Social.impl.RelatednessImpl <em>Relatedness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Social.impl.RelatednessImpl
		 * @see factors.Social.impl.NewPackage1PackageImpl#getRelatedness()
		 * @generated
		 */
		EClass RELATEDNESS = eINSTANCE.getRelatedness();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATEDNESS__LEVEL = eINSTANCE.getRelatedness_Level();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATEDNESS__DEGREE = eINSTANCE.getRelatedness_Degree();

		/**
		 * The meta object literal for the '{@link factors.Social.impl.ReciprocityImpl <em>Reciprocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Social.impl.ReciprocityImpl
		 * @see factors.Social.impl.NewPackage1PackageImpl#getReciprocity()
		 * @generated
		 */
		EClass RECIPROCITY = eINSTANCE.getReciprocity();

		/**
		 * The meta object literal for the '<em><b>Is Reciprocal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPROCITY__IS_RECIPROCAL = eINSTANCE.getReciprocity_IsReciprocal();

		/**
		 * The meta object literal for the '{@link factors.Social.impl.SocialFactorImpl <em>Social Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Social.impl.SocialFactorImpl
		 * @see factors.Social.impl.NewPackage1PackageImpl#getSocialFactor()
		 * @generated
		 */
		EClass SOCIAL_FACTOR = eINSTANCE.getSocialFactor();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_FACTOR__ACTOR = eINSTANCE.getSocialFactor_Actor();

		/**
		 * The meta object literal for the '{@link factors.Social.impl.OpportunityToConnectImpl <em>Opportunity To Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Social.impl.OpportunityToConnectImpl
		 * @see factors.Social.impl.NewPackage1PackageImpl#getOpportunityToConnect()
		 * @generated
		 */
		EClass OPPORTUNITY_TO_CONNECT = eINSTANCE.getOpportunityToConnect();

		/**
		 * The meta object literal for the '<em><b>Opportunity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPPORTUNITY_TO_CONNECT__OPPORTUNITY = eINSTANCE.getOpportunityToConnect_Opportunity();

		/**
		 * The meta object literal for the '{@link factors.Social.impl.TrustImpl <em>Trust</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factors.Social.impl.TrustImpl
		 * @see factors.Social.impl.NewPackage1PackageImpl#getTrust()
		 * @generated
		 */
		EClass TRUST = eINSTANCE.getTrust();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUST__LEVEL = eINSTANCE.getTrust_Level();

	}

} //NewPackage1Package
