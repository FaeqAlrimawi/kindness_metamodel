/**
 */
package factors.impl;

import factors.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactorsFactoryImpl extends EFactoryImpl implements FactorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FactorsFactory init() {
		try {
			FactorsFactory theFactorsFactory = (FactorsFactory) EPackage.Registry.INSTANCE
					.getEFactory(FactorsPackage.eNS_URI);
			if (theFactorsFactory != null) {
				return theFactorsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FactorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FactorsPackage.IMPACTED_FACTOR:
			return createImpactedFactor();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FactorsPackage.DEGREE_OF_RELATEDNESS:
			return createDegreeOfRelatednessFromString(eDataType, initialValue);
		case FactorsPackage.NEED:
			return createNeedFromString(eDataType, initialValue);
		case FactorsPackage.OPPORTUNITY:
			return createOpportunityFromString(eDataType, initialValue);
		case FactorsPackage.LEVEL:
			return createLevelFromString(eDataType, initialValue);
		case FactorsPackage.FACTOR_IMPACT:
			return createFactorImpactFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FactorsPackage.DEGREE_OF_RELATEDNESS:
			return convertDegreeOfRelatednessToString(eDataType, instanceValue);
		case FactorsPackage.NEED:
			return convertNeedToString(eDataType, instanceValue);
		case FactorsPackage.OPPORTUNITY:
			return convertOpportunityToString(eDataType, instanceValue);
		case FactorsPackage.LEVEL:
			return convertLevelToString(eDataType, instanceValue);
		case FactorsPackage.FACTOR_IMPACT:
			return convertFactorImpactToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactedFactor createImpactedFactor() {
		ImpactedFactorImpl impactedFactor = new ImpactedFactorImpl();
		return impactedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfRelatedness createDegreeOfRelatednessFromString(EDataType eDataType, String initialValue) {
		DegreeOfRelatedness result = DegreeOfRelatedness.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegreeOfRelatednessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Need createNeedFromString(EDataType eDataType, String initialValue) {
		Need result = Need.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opportunity createOpportunityFromString(EDataType eDataType, String initialValue) {
		Opportunity result = Opportunity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpportunityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorImpact createFactorImpactFromString(EDataType eDataType, String initialValue) {
		FactorImpact result = FactorImpact.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFactorImpactToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorsPackage getFactorsPackage() {
		return (FactorsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FactorsPackage getPackage() {
		return FactorsPackage.eINSTANCE;
	}

} //FactorsFactoryImpl
