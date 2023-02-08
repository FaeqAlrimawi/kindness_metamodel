/**
 */
package factors.Social.impl;

import factors.Opportunity;

import factors.Social.NewPackage1Package;
import factors.Social.OpportunityToConnect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opportunity To Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factors.Social.impl.OpportunityToConnectImpl#getOpportunity <em>Opportunity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpportunityToConnectImpl extends SocialFactorImpl implements OpportunityToConnect {
	/**
	 * The default value of the '{@link #getOpportunity() <em>Opportunity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpportunity()
	 * @generated
	 * @ordered
	 */
	protected static final Opportunity OPPORTUNITY_EDEFAULT = Opportunity.MAKE_NEW_FRIEND;

	/**
	 * The cached value of the '{@link #getOpportunity() <em>Opportunity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpportunity()
	 * @generated
	 * @ordered
	 */
	protected Opportunity opportunity = OPPORTUNITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpportunityToConnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage1Package.Literals.OPPORTUNITY_TO_CONNECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opportunity getOpportunity() {
		return opportunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpportunity(Opportunity newOpportunity) {
		Opportunity oldOpportunity = opportunity;
		opportunity = newOpportunity == null ? OPPORTUNITY_EDEFAULT : newOpportunity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewPackage1Package.OPPORTUNITY_TO_CONNECT__OPPORTUNITY, oldOpportunity, opportunity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NewPackage1Package.OPPORTUNITY_TO_CONNECT__OPPORTUNITY:
			return getOpportunity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NewPackage1Package.OPPORTUNITY_TO_CONNECT__OPPORTUNITY:
			setOpportunity((Opportunity) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case NewPackage1Package.OPPORTUNITY_TO_CONNECT__OPPORTUNITY:
			setOpportunity(OPPORTUNITY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NewPackage1Package.OPPORTUNITY_TO_CONNECT__OPPORTUNITY:
			return opportunity != OPPORTUNITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (opportunity: ");
		result.append(opportunity);
		result.append(')');
		return result.toString();
	}

} //OpportunityToConnectImpl
