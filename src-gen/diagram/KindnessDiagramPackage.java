/**
 */
package diagram;

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
 * @see diagram.KindnessDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface KindnessDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kindness_metamodel_diagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KindnessDiagramPackage eINSTANCE = diagram.impl.KindnessDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagram.impl.KDiagramImpl <em>KDiagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.KDiagramImpl
	 * @see diagram.impl.KindnessDiagramPackageImpl#getKDiagram()
	 * @generated
	 */
	int KDIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Abskindnessopportunity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM__ABSKINDNESSOPPORTUNITY = 0;

	/**
	 * The feature id for the '<em><b>Abskindnessentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM__ABSKINDNESSENTITY = 1;

	/**
	 * The number of structural features of the '<em>KDiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>KDiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagram.impl.AbsKindnessOpportunityImpl <em>Abs Kindness Opportunity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.AbsKindnessOpportunityImpl
	 * @see diagram.impl.KindnessDiagramPackageImpl#getAbsKindnessOpportunity()
	 * @generated
	 */
	int ABS_KINDNESS_OPPORTUNITY = 1;

	/**
	 * The number of structural features of the '<em>Abs Kindness Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KINDNESS_OPPORTUNITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abs Kindness Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_KINDNESS_OPPORTUNITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagram.impl.AbsKindnessEntityImpl <em>Abs Kindness Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.AbsKindnessEntityImpl
	 * @see diagram.impl.KindnessDiagramPackageImpl#getAbsKindnessEntity()
	 * @generated
	 */
	int ABS_KINDNESS_ENTITY = 2;

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
	 * Returns the meta object for class '{@link diagram.KDiagram <em>KDiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KDiagram</em>'.
	 * @see diagram.KDiagram
	 * @generated
	 */
	EClass getKDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link diagram.KDiagram#getAbskindnessopportunity <em>Abskindnessopportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abskindnessopportunity</em>'.
	 * @see diagram.KDiagram#getAbskindnessopportunity()
	 * @see #getKDiagram()
	 * @generated
	 */
	EReference getKDiagram_Abskindnessopportunity();

	/**
	 * Returns the meta object for the containment reference list '{@link diagram.KDiagram#getAbskindnessentity <em>Abskindnessentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abskindnessentity</em>'.
	 * @see diagram.KDiagram#getAbskindnessentity()
	 * @see #getKDiagram()
	 * @generated
	 */
	EReference getKDiagram_Abskindnessentity();

	/**
	 * Returns the meta object for class '{@link diagram.AbsKindnessOpportunity <em>Abs Kindness Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Kindness Opportunity</em>'.
	 * @see diagram.AbsKindnessOpportunity
	 * @generated
	 */
	EClass getAbsKindnessOpportunity();

	/**
	 * Returns the meta object for class '{@link diagram.AbsKindnessEntity <em>Abs Kindness Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Kindness Entity</em>'.
	 * @see diagram.AbsKindnessEntity
	 * @generated
	 */
	EClass getAbsKindnessEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KindnessDiagramFactory getKindnessDiagramFactory();

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
		 * The meta object literal for the '{@link diagram.impl.KDiagramImpl <em>KDiagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.KDiagramImpl
		 * @see diagram.impl.KindnessDiagramPackageImpl#getKDiagram()
		 * @generated
		 */
		EClass KDIAGRAM = eINSTANCE.getKDiagram();

		/**
		 * The meta object literal for the '<em><b>Abskindnessopportunity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDIAGRAM__ABSKINDNESSOPPORTUNITY = eINSTANCE.getKDiagram_Abskindnessopportunity();

		/**
		 * The meta object literal for the '<em><b>Abskindnessentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDIAGRAM__ABSKINDNESSENTITY = eINSTANCE.getKDiagram_Abskindnessentity();

		/**
		 * The meta object literal for the '{@link diagram.impl.AbsKindnessOpportunityImpl <em>Abs Kindness Opportunity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.AbsKindnessOpportunityImpl
		 * @see diagram.impl.KindnessDiagramPackageImpl#getAbsKindnessOpportunity()
		 * @generated
		 */
		EClass ABS_KINDNESS_OPPORTUNITY = eINSTANCE.getAbsKindnessOpportunity();

		/**
		 * The meta object literal for the '{@link diagram.impl.AbsKindnessEntityImpl <em>Abs Kindness Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.AbsKindnessEntityImpl
		 * @see diagram.impl.KindnessDiagramPackageImpl#getAbsKindnessEntity()
		 * @generated
		 */
		EClass ABS_KINDNESS_ENTITY = eINSTANCE.getAbsKindnessEntity();

	}

} //KindnessDiagramPackage
