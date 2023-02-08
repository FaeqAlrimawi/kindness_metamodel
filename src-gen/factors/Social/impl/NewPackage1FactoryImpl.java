/**
 */
package factors.Social.impl;

import factors.Social.*;

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
public class NewPackage1FactoryImpl extends EFactoryImpl implements NewPackage1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NewPackage1Factory init() {
		try {
			NewPackage1Factory theNewPackage1Factory = (NewPackage1Factory) EPackage.Registry.INSTANCE
					.getEFactory(NewPackage1Package.eNS_URI);
			if (theNewPackage1Factory != null) {
				return theNewPackage1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NewPackage1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage1FactoryImpl() {
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
		case NewPackage1Package.LEVEL_OF_NEED:
			return createLevelOfNeed();
		case NewPackage1Package.RELATEDNESS:
			return createRelatedness();
		case NewPackage1Package.RECIPROCITY:
			return createReciprocity();
		case NewPackage1Package.OPPORTUNITY_TO_CONNECT:
			return createOpportunityToConnect();
		case NewPackage1Package.TRUST:
			return createTrust();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfNeed createLevelOfNeed() {
		LevelOfNeedImpl levelOfNeed = new LevelOfNeedImpl();
		return levelOfNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relatedness createRelatedness() {
		RelatednessImpl relatedness = new RelatednessImpl();
		return relatedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reciprocity createReciprocity() {
		ReciprocityImpl reciprocity = new ReciprocityImpl();
		return reciprocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpportunityToConnect createOpportunityToConnect() {
		OpportunityToConnectImpl opportunityToConnect = new OpportunityToConnectImpl();
		return opportunityToConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trust createTrust() {
		TrustImpl trust = new TrustImpl();
		return trust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage1Package getNewPackage1Package() {
		return (NewPackage1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NewPackage1Package getPackage() {
		return NewPackage1Package.eINSTANCE;
	}

} //NewPackage1FactoryImpl
