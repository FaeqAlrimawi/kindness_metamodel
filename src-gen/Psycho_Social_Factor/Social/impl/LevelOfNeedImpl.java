/**
 */
package Psycho_Social_Factor.Social.impl;

import Psycho_Social_Factor.Need;

import Psycho_Social_Factor.Social.LevelOfNeed;
import Psycho_Social_Factor.Social.SocialFactor_pkgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Of Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.Social.impl.LevelOfNeedImpl#getNeed <em>Need</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelOfNeedImpl extends SocialFactorImpl implements LevelOfNeed {
	/**
	 * The default value of the '{@link #getNeed() <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeed()
	 * @generated
	 * @ordered
	 */
	protected static final Need NEED_EDEFAULT = Need.EMOTIONAL;

	/**
	 * The cached value of the '{@link #getNeed() <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeed()
	 * @generated
	 * @ordered
	 */
	protected Need need = NEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelOfNeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialFactor_pkgPackage.Literals.LEVEL_OF_NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Need getNeed() {
		return need;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeed(Need newNeed) {
		Need oldNeed = need;
		need = newNeed == null ? NEED_EDEFAULT : newNeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialFactor_pkgPackage.LEVEL_OF_NEED__NEED, oldNeed,
					need));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SocialFactor_pkgPackage.LEVEL_OF_NEED__NEED:
			return getNeed();
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
		case SocialFactor_pkgPackage.LEVEL_OF_NEED__NEED:
			setNeed((Need) newValue);
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
		case SocialFactor_pkgPackage.LEVEL_OF_NEED__NEED:
			setNeed(NEED_EDEFAULT);
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
		case SocialFactor_pkgPackage.LEVEL_OF_NEED__NEED:
			return need != NEED_EDEFAULT;
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
		result.append(" (need: ");
		result.append(need);
		result.append(')');
		return result.toString();
	}

} //LevelOfNeedImpl
