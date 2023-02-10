/**
 */
package factors.Psychological.impl;

import factors.Psychological.*;

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
public class NewPackage2FactoryImpl extends EFactoryImpl implements NewPackage2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NewPackage2Factory init() {
		try {
			NewPackage2Factory theNewPackage2Factory = (NewPackage2Factory) EPackage.Registry.INSTANCE
					.getEFactory(NewPackage2Package.eNS_URI);
			if (theNewPackage2Factory != null) {
				return theNewPackage2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NewPackage2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage2FactoryImpl() {
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
		case NewPackage2Package.EMOTION:
			return createEmotion();
		case NewPackage2Package.SELF_EFFICACY:
			return createSelfEfficacy();
		case NewPackage2Package.CHARACTER_TRAIT:
			return createCharacterTrait();
		case NewPackage2Package.HUMAN_VALUE:
			return createHumanValue();
		case NewPackage2Package.OTHER_PSYCHOLOGICAL_FACTOR:
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
	public NewPackage2Package getNewPackage2Package() {
		return (NewPackage2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NewPackage2Package getPackage() {
		return NewPackage2Package.eINSTANCE;
	}

} //NewPackage2FactoryImpl
