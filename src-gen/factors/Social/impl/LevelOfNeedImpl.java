/**
 */
package factors.Social.impl;

import factors.Level;
import factors.Need;

import factors.Social.LevelOfNeed;
import factors.Social.NewPackage1Package;

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
 *   <li>{@link factors.Social.impl.LevelOfNeedImpl#getNeed <em>Need</em>}</li>
 *   <li>{@link factors.Social.impl.LevelOfNeedImpl#getLevel <em>Level</em>}</li>
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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Level LEVEL_EDEFAULT = Level.MEDIUM;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level = LEVEL_EDEFAULT;

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
		return NewPackage1Package.Literals.LEVEL_OF_NEED;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage1Package.LEVEL_OF_NEED__NEED, oldNeed,
					need));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage1Package.LEVEL_OF_NEED__LEVEL, oldLevel,
					level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NewPackage1Package.LEVEL_OF_NEED__NEED:
			return getNeed();
		case NewPackage1Package.LEVEL_OF_NEED__LEVEL:
			return getLevel();
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
		case NewPackage1Package.LEVEL_OF_NEED__NEED:
			setNeed((Need) newValue);
			return;
		case NewPackage1Package.LEVEL_OF_NEED__LEVEL:
			setLevel((Level) newValue);
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
		case NewPackage1Package.LEVEL_OF_NEED__NEED:
			setNeed(NEED_EDEFAULT);
			return;
		case NewPackage1Package.LEVEL_OF_NEED__LEVEL:
			setLevel(LEVEL_EDEFAULT);
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
		case NewPackage1Package.LEVEL_OF_NEED__NEED:
			return need != NEED_EDEFAULT;
		case NewPackage1Package.LEVEL_OF_NEED__LEVEL:
			return level != LEVEL_EDEFAULT;
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
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //LevelOfNeedImpl
