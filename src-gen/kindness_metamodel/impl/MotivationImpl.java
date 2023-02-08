/**
 */
package kindness_metamodel.impl;

import kindness_metamodel.KindnessPackage;
import kindness_metamodel.Motivation;
import kindness_metamodel.MotivationType;
import kindness_metamodel.Receiver;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.impl.MotivationImpl#getType <em>Type</em>}</li>
 *   <li>{@link kindness_metamodel.impl.MotivationImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link kindness_metamodel.impl.MotivationImpl#getTowards <em>Towards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotivationImpl extends MinimalEObjectImpl.Container implements Motivation {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MotivationType TYPE_EDEFAULT = MotivationType.OTHER_BETTERMENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MotivationType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected float level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTowards() <em>Towards</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTowards()
	 * @generated
	 * @ordered
	 */
	protected Receiver towards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.MOTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotivationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MotivationType newType) {
		MotivationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.MOTIVATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(float newLevel) {
		float oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.MOTIVATION__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver getTowards() {
		if (towards != null && towards.eIsProxy()) {
			InternalEObject oldTowards = (InternalEObject) towards;
			towards = (Receiver) eResolveProxy(oldTowards);
			if (towards != oldTowards) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KindnessPackage.MOTIVATION__TOWARDS,
							oldTowards, towards));
			}
		}
		return towards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver basicGetTowards() {
		return towards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTowards(Receiver newTowards) {
		Receiver oldTowards = towards;
		towards = newTowards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.MOTIVATION__TOWARDS, oldTowards,
					towards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KindnessPackage.MOTIVATION__TYPE:
			return getType();
		case KindnessPackage.MOTIVATION__LEVEL:
			return getLevel();
		case KindnessPackage.MOTIVATION__TOWARDS:
			if (resolve)
				return getTowards();
			return basicGetTowards();
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
		case KindnessPackage.MOTIVATION__TYPE:
			setType((MotivationType) newValue);
			return;
		case KindnessPackage.MOTIVATION__LEVEL:
			setLevel((Float) newValue);
			return;
		case KindnessPackage.MOTIVATION__TOWARDS:
			setTowards((Receiver) newValue);
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
		case KindnessPackage.MOTIVATION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case KindnessPackage.MOTIVATION__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case KindnessPackage.MOTIVATION__TOWARDS:
			setTowards((Receiver) null);
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
		case KindnessPackage.MOTIVATION__TYPE:
			return type != TYPE_EDEFAULT;
		case KindnessPackage.MOTIVATION__LEVEL:
			return level != LEVEL_EDEFAULT;
		case KindnessPackage.MOTIVATION__TOWARDS:
			return towards != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //MotivationImpl
