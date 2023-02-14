/**
 */
package Psycho_Social_Factor.impl;

import Psycho_Social_Factor.*;

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
public class Psycho_Social_FactorFactoryImpl extends EFactoryImpl implements Psycho_Social_FactorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Psycho_Social_FactorFactory init() {
		try {
			Psycho_Social_FactorFactory thePsycho_Social_FactorFactory = (Psycho_Social_FactorFactory) EPackage.Registry.INSTANCE
					.getEFactory(Psycho_Social_FactorPackage.eNS_URI);
			if (thePsycho_Social_FactorFactory != null) {
				return thePsycho_Social_FactorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Psycho_Social_FactorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psycho_Social_FactorFactoryImpl() {
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
		case Psycho_Social_FactorPackage.AFFECTED_FACTORS:
			return createAffectedFactors();
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
		case Psycho_Social_FactorPackage.DEGREE_OF_RELATEDNESS:
			return createDegreeOfRelatednessFromString(eDataType, initialValue);
		case Psycho_Social_FactorPackage.NEED:
			return createNeedFromString(eDataType, initialValue);
		case Psycho_Social_FactorPackage.OPPORTUNITY:
			return createOpportunityFromString(eDataType, initialValue);
		case Psycho_Social_FactorPackage.LEVEL:
			return createLevelFromString(eDataType, initialValue);
		case Psycho_Social_FactorPackage.FACTOR_IMPACT:
			return createFactorImpactFromString(eDataType, initialValue);
		case Psycho_Social_FactorPackage.EMOTION_TYPE:
			return createEmotionTypeFromString(eDataType, initialValue);
		case Psycho_Social_FactorPackage.TRAIT_TYPE:
			return createTraitTypeFromString(eDataType, initialValue);
		case Psycho_Social_FactorPackage.HUMAN_VALUE_TYPE:
			return createHumanValueTypeFromString(eDataType, initialValue);
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
		case Psycho_Social_FactorPackage.DEGREE_OF_RELATEDNESS:
			return convertDegreeOfRelatednessToString(eDataType, instanceValue);
		case Psycho_Social_FactorPackage.NEED:
			return convertNeedToString(eDataType, instanceValue);
		case Psycho_Social_FactorPackage.OPPORTUNITY:
			return convertOpportunityToString(eDataType, instanceValue);
		case Psycho_Social_FactorPackage.LEVEL:
			return convertLevelToString(eDataType, instanceValue);
		case Psycho_Social_FactorPackage.FACTOR_IMPACT:
			return convertFactorImpactToString(eDataType, instanceValue);
		case Psycho_Social_FactorPackage.EMOTION_TYPE:
			return convertEmotionTypeToString(eDataType, instanceValue);
		case Psycho_Social_FactorPackage.TRAIT_TYPE:
			return convertTraitTypeToString(eDataType, instanceValue);
		case Psycho_Social_FactorPackage.HUMAN_VALUE_TYPE:
			return convertHumanValueTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectedFactors createAffectedFactors() {
		AffectedFactorsImpl affectedFactors = new AffectedFactorsImpl();
		return affectedFactors;
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
	public EmotionType createEmotionTypeFromString(EDataType eDataType, String initialValue) {
		EmotionType result = EmotionType.get(initialValue);
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
	public String convertEmotionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraitType createTraitTypeFromString(EDataType eDataType, String initialValue) {
		TraitType result = TraitType.get(initialValue);
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
	public String convertTraitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanValueType createHumanValueTypeFromString(EDataType eDataType, String initialValue) {
		HumanValueType result = HumanValueType.get(initialValue);
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
	public String convertHumanValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psycho_Social_FactorPackage getPsycho_Social_FactorPackage() {
		return (Psycho_Social_FactorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Psycho_Social_FactorPackage getPackage() {
		return Psycho_Social_FactorPackage.eINSTANCE;
	}

} //Psycho_Social_FactorFactoryImpl
