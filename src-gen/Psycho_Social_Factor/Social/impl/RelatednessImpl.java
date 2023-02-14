/**
 */
package Psycho_Social_Factor.Social.impl;

import Psycho_Social_Factor.DegreeOfRelatedness;

import Psycho_Social_Factor.Social.Relatedness;
import Psycho_Social_Factor.Social.SocialFactor_pkgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relatedness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.Social.impl.RelatednessImpl#getDegree <em>Degree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatednessImpl extends SocialFactorImpl implements Relatedness {
	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final DegreeOfRelatedness DEGREE_EDEFAULT = DegreeOfRelatedness.FAMILY;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected DegreeOfRelatedness degree = DEGREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatednessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialFactor_pkgPackage.Literals.RELATEDNESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfRelatedness getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegree(DegreeOfRelatedness newDegree) {
		DegreeOfRelatedness oldDegree = degree;
		degree = newDegree == null ? DEGREE_EDEFAULT : newDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialFactor_pkgPackage.RELATEDNESS__DEGREE,
					oldDegree, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SocialFactor_pkgPackage.RELATEDNESS__DEGREE:
			return getDegree();
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
		case SocialFactor_pkgPackage.RELATEDNESS__DEGREE:
			setDegree((DegreeOfRelatedness) newValue);
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
		case SocialFactor_pkgPackage.RELATEDNESS__DEGREE:
			setDegree(DEGREE_EDEFAULT);
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
		case SocialFactor_pkgPackage.RELATEDNESS__DEGREE:
			return degree != DEGREE_EDEFAULT;
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
		result.append(" (degree: ");
		result.append(degree);
		result.append(')');
		return result.toString();
	}

} //RelatednessImpl
