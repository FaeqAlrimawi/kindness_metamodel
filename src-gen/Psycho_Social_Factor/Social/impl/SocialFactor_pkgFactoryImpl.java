/**
 */
package Psycho_Social_Factor.Social.impl;

import Psycho_Social_Factor.Social.*;

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
public class SocialFactor_pkgFactoryImpl extends EFactoryImpl implements SocialFactor_pkgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SocialFactor_pkgFactory init() {
		try {
			SocialFactor_pkgFactory theSocialFactor_pkgFactory = (SocialFactor_pkgFactory) EPackage.Registry.INSTANCE
					.getEFactory(SocialFactor_pkgPackage.eNS_URI);
			if (theSocialFactor_pkgFactory != null) {
				return theSocialFactor_pkgFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SocialFactor_pkgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialFactor_pkgFactoryImpl() {
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
		case SocialFactor_pkgPackage.LEVEL_OF_NEED:
			return createLevelOfNeed();
		case SocialFactor_pkgPackage.RELATEDNESS:
			return createRelatedness();
		case SocialFactor_pkgPackage.RECIPROCITY:
			return createReciprocity();
		case SocialFactor_pkgPackage.OPPORTUNITY_TO_CONNECT:
			return createOpportunityToConnect();
		case SocialFactor_pkgPackage.TRUST:
			return createTrust();
		case SocialFactor_pkgPackage.OTHER_SOCIAL_FACTOR:
			return createOtherSocialFactor();
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
	public OtherSocialFactor createOtherSocialFactor() {
		OtherSocialFactorImpl otherSocialFactor = new OtherSocialFactorImpl();
		return otherSocialFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialFactor_pkgPackage getSocialFactor_pkgPackage() {
		return (SocialFactor_pkgPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SocialFactor_pkgPackage getPackage() {
		return SocialFactor_pkgPackage.eINSTANCE;
	}

} //SocialFactor_pkgFactoryImpl
