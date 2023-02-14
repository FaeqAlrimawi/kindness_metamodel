/**
 */
package Psycho_Social_Factor.Psychological.impl;

import Psycho_Social_Factor.Psychological.*;

import org.eclipse.emf.ecore.EClass;
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
public class psychoFactor_pkgFactoryImpl extends EFactoryImpl implements psychoFactor_pkgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static psychoFactor_pkgFactory init() {
		try {
			psychoFactor_pkgFactory thepsychoFactor_pkgFactory = (psychoFactor_pkgFactory) EPackage.Registry.INSTANCE
					.getEFactory(psychoFactor_pkgPackage.eNS_URI);
			if (thepsychoFactor_pkgFactory != null) {
				return thepsychoFactor_pkgFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new psychoFactor_pkgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public psychoFactor_pkgFactoryImpl() {
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
		case psychoFactor_pkgPackage.EMOTION:
			return createEmotion();
		case psychoFactor_pkgPackage.SELF_EFFICACY:
			return createSelfEfficacy();
		case psychoFactor_pkgPackage.CHARACTER_TRAIT:
			return createCharacterTrait();
		case psychoFactor_pkgPackage.HUMAN_VALUE:
			return createHumanValue();
		case psychoFactor_pkgPackage.OTHER_PSYCHOLOGICAL_FACTOR:
			return createOtherPsychologicalFactor();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emotion createEmotion() {
		EmotionImpl emotion = new EmotionImpl();
		return emotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfEfficacy createSelfEfficacy() {
		SelfEfficacyImpl selfEfficacy = new SelfEfficacyImpl();
		return selfEfficacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterTrait createCharacterTrait() {
		CharacterTraitImpl characterTrait = new CharacterTraitImpl();
		return characterTrait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanValue createHumanValue() {
		HumanValueImpl humanValue = new HumanValueImpl();
		return humanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPsychologicalFactor createOtherPsychologicalFactor() {
		OtherPsychologicalFactorImpl otherPsychologicalFactor = new OtherPsychologicalFactorImpl();
		return otherPsychologicalFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public psychoFactor_pkgPackage getpsychoFactor_pkgPackage() {
		return (psychoFactor_pkgPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static psychoFactor_pkgPackage getPackage() {
		return psychoFactor_pkgPackage.eINSTANCE;
	}

} //psychoFactor_pkgFactoryImpl
