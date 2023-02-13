/**
 */
package ktypes;

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
 * @see ktypes.KtypesFactory
 * @model kind="package"
 * @generated
 */
public interface KtypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ktypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kindness_metamodel_ktypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kindness_meta_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KtypesPackage eINSTANCE = ktypes.impl.KtypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ktypes.impl.KObjectImpl <em>KObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ktypes.impl.KObjectImpl
	 * @see ktypes.impl.KtypesPackageImpl#getKObject()
	 * @generated
	 */
	int KOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Ktype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT__KTYPE = 0;

	/**
	 * The number of structural features of the '<em>KObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>KObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ktypes.impl.KTypeImpl <em>KType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ktypes.impl.KTypeImpl
	 * @see ktypes.impl.KtypesPackageImpl#getKType()
	 * @generated
	 */
	int KTYPE = 1;

	/**
	 * The number of structural features of the '<em>KType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KTYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>KType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ktypes.impl.KPhysicalImpl <em>KPhysical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ktypes.impl.KPhysicalImpl
	 * @see ktypes.impl.KtypesPackageImpl#getKPhysical()
	 * @generated
	 */
	int KPHYSICAL = 4;

	/**
	 * The number of structural features of the '<em>KPhysical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPHYSICAL_FEATURE_COUNT = KTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KPhysical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPHYSICAL_OPERATION_COUNT = KTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ktypes.impl.KHumanImpl <em>KHuman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ktypes.impl.KHumanImpl
	 * @see ktypes.impl.KtypesPackageImpl#getKHuman()
	 * @generated
	 */
	int KHUMAN = 2;

	/**
	 * The number of structural features of the '<em>KHuman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KHUMAN_FEATURE_COUNT = KPHYSICAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KHuman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KHUMAN_OPERATION_COUNT = KPHYSICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ktypes.impl.KDigitalImpl <em>KDigital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ktypes.impl.KDigitalImpl
	 * @see ktypes.impl.KtypesPackageImpl#getKDigital()
	 * @generated
	 */
	int KDIGITAL = 3;

	/**
	 * The number of structural features of the '<em>KDigital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIGITAL_FEATURE_COUNT = KTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KDigital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIGITAL_OPERATION_COUNT = KTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ktypes.impl.KSocialImpl <em>KSocial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ktypes.impl.KSocialImpl
	 * @see ktypes.impl.KtypesPackageImpl#getKSocial()
	 * @generated
	 */
	int KSOCIAL = 5;

	/**
	 * The number of structural features of the '<em>KSocial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KSOCIAL_FEATURE_COUNT = KTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KSocial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KSOCIAL_OPERATION_COUNT = KTYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ktypes.KObject <em>KObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KObject</em>'.
	 * @see ktypes.KObject
	 * @generated
	 */
	EClass getKObject();

	/**
	 * Returns the meta object for the containment reference '{@link ktypes.KObject#getKtype <em>Ktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ktype</em>'.
	 * @see ktypes.KObject#getKtype()
	 * @see #getKObject()
	 * @generated
	 */
	EReference getKObject_Ktype();

	/**
	 * Returns the meta object for class '{@link ktypes.KType <em>KType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KType</em>'.
	 * @see ktypes.KType
	 * @generated
	 */
	EClass getKType();

	/**
	 * Returns the meta object for class '{@link ktypes.KHuman <em>KHuman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KHuman</em>'.
	 * @see ktypes.KHuman
	 * @generated
	 */
	EClass getKHuman();

	/**
	 * Returns the meta object for class '{@link ktypes.KDigital <em>KDigital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KDigital</em>'.
	 * @see ktypes.KDigital
	 * @generated
	 */
	EClass getKDigital();

	/**
	 * Returns the meta object for class '{@link ktypes.KPhysical <em>KPhysical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPhysical</em>'.
	 * @see ktypes.KPhysical
	 * @generated
	 */
	EClass getKPhysical();

	/**
	 * Returns the meta object for class '{@link ktypes.KSocial <em>KSocial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KSocial</em>'.
	 * @see ktypes.KSocial
	 * @generated
	 */
	EClass getKSocial();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KtypesFactory getKtypesFactory();

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
		 * The meta object literal for the '{@link ktypes.impl.KObjectImpl <em>KObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ktypes.impl.KObjectImpl
		 * @see ktypes.impl.KtypesPackageImpl#getKObject()
		 * @generated
		 */
		EClass KOBJECT = eINSTANCE.getKObject();

		/**
		 * The meta object literal for the '<em><b>Ktype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOBJECT__KTYPE = eINSTANCE.getKObject_Ktype();

		/**
		 * The meta object literal for the '{@link ktypes.impl.KTypeImpl <em>KType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ktypes.impl.KTypeImpl
		 * @see ktypes.impl.KtypesPackageImpl#getKType()
		 * @generated
		 */
		EClass KTYPE = eINSTANCE.getKType();

		/**
		 * The meta object literal for the '{@link ktypes.impl.KHumanImpl <em>KHuman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ktypes.impl.KHumanImpl
		 * @see ktypes.impl.KtypesPackageImpl#getKHuman()
		 * @generated
		 */
		EClass KHUMAN = eINSTANCE.getKHuman();

		/**
		 * The meta object literal for the '{@link ktypes.impl.KDigitalImpl <em>KDigital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ktypes.impl.KDigitalImpl
		 * @see ktypes.impl.KtypesPackageImpl#getKDigital()
		 * @generated
		 */
		EClass KDIGITAL = eINSTANCE.getKDigital();

		/**
		 * The meta object literal for the '{@link ktypes.impl.KPhysicalImpl <em>KPhysical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ktypes.impl.KPhysicalImpl
		 * @see ktypes.impl.KtypesPackageImpl#getKPhysical()
		 * @generated
		 */
		EClass KPHYSICAL = eINSTANCE.getKPhysical();

		/**
		 * The meta object literal for the '{@link ktypes.impl.KSocialImpl <em>KSocial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ktypes.impl.KSocialImpl
		 * @see ktypes.impl.KtypesPackageImpl#getKSocial()
		 * @generated
		 */
		EClass KSOCIAL = eINSTANCE.getKSocial();

	}

} //KtypesPackage
