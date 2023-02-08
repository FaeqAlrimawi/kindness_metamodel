/**
 */
package factors.Social.impl;

import factors.Social.NewPackage1Package;
import factors.Social.Reciprocity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reciprocity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factors.Social.impl.ReciprocityImpl#isIsReciprocal <em>Is Reciprocal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReciprocityImpl extends SocialFactorImpl implements Reciprocity {
	/**
	 * The default value of the '{@link #isIsReciprocal() <em>Is Reciprocal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReciprocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RECIPROCAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReciprocal() <em>Is Reciprocal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReciprocal()
	 * @generated
	 * @ordered
	 */
	protected boolean isReciprocal = IS_RECIPROCAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReciprocityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage1Package.Literals.RECIPROCITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReciprocal() {
		return isReciprocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReciprocal(boolean newIsReciprocal) {
		boolean oldIsReciprocal = isReciprocal;
		isReciprocal = newIsReciprocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage1Package.RECIPROCITY__IS_RECIPROCAL,
					oldIsReciprocal, isReciprocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NewPackage1Package.RECIPROCITY__IS_RECIPROCAL:
			return isIsReciprocal();
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
		case NewPackage1Package.RECIPROCITY__IS_RECIPROCAL:
			setIsReciprocal((Boolean) newValue);
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
		case NewPackage1Package.RECIPROCITY__IS_RECIPROCAL:
			setIsReciprocal(IS_RECIPROCAL_EDEFAULT);
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
		case NewPackage1Package.RECIPROCITY__IS_RECIPROCAL:
			return isReciprocal != IS_RECIPROCAL_EDEFAULT;
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
		result.append(" (isReciprocal: ");
		result.append(isReciprocal);
		result.append(')');
		return result.toString();
	}

} //ReciprocityImpl
