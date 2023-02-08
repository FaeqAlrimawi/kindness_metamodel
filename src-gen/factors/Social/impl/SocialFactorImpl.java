/**
 */
package factors.Social.impl;

import factors.AbsKindnessEntity;

import factors.AffectedFactor;
import factors.Social.NewPackage1Package;
import factors.Social.SocialFactor;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factors.Social.impl.SocialFactorImpl#getName <em>Name</em>}</li>
 *   <li>{@link factors.Social.impl.SocialFactorImpl#getAffectedfactor <em>Affectedfactor</em>}</li>
 *   <li>{@link factors.Social.impl.SocialFactorImpl#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SocialFactorImpl extends MinimalEObjectImpl.Container implements SocialFactor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffectedfactor() <em>Affectedfactor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedfactor()
	 * @generated
	 * @ordered
	 */
	protected EList<AffectedFactor> affectedfactor;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected AbsKindnessEntity actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage1Package.Literals.SOCIAL_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage1Package.SOCIAL_FACTOR__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AffectedFactor> getAffectedfactor() {
		if (affectedfactor == null) {
			affectedfactor = new EObjectContainmentEList<AffectedFactor>(AffectedFactor.class, this,
					NewPackage1Package.SOCIAL_FACTOR__AFFECTEDFACTOR);
		}
		return affectedfactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsKindnessEntity getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject) actor;
			actor = (AbsKindnessEntity) eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NewPackage1Package.SOCIAL_FACTOR__ACTOR,
							oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsKindnessEntity basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(AbsKindnessEntity newActor) {
		AbsKindnessEntity oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage1Package.SOCIAL_FACTOR__ACTOR, oldActor,
					actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NewPackage1Package.SOCIAL_FACTOR__AFFECTEDFACTOR:
			return ((InternalEList<?>) getAffectedfactor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NewPackage1Package.SOCIAL_FACTOR__NAME:
			return getName();
		case NewPackage1Package.SOCIAL_FACTOR__AFFECTEDFACTOR:
			return getAffectedfactor();
		case NewPackage1Package.SOCIAL_FACTOR__ACTOR:
			if (resolve)
				return getActor();
			return basicGetActor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NewPackage1Package.SOCIAL_FACTOR__NAME:
			setName((String) newValue);
			return;
		case NewPackage1Package.SOCIAL_FACTOR__AFFECTEDFACTOR:
			getAffectedfactor().clear();
			getAffectedfactor().addAll((Collection<? extends AffectedFactor>) newValue);
			return;
		case NewPackage1Package.SOCIAL_FACTOR__ACTOR:
			setActor((AbsKindnessEntity) newValue);
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
		case NewPackage1Package.SOCIAL_FACTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case NewPackage1Package.SOCIAL_FACTOR__AFFECTEDFACTOR:
			getAffectedfactor().clear();
			return;
		case NewPackage1Package.SOCIAL_FACTOR__ACTOR:
			setActor((AbsKindnessEntity) null);
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
		case NewPackage1Package.SOCIAL_FACTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case NewPackage1Package.SOCIAL_FACTOR__AFFECTEDFACTOR:
			return affectedfactor != null && !affectedfactor.isEmpty();
		case NewPackage1Package.SOCIAL_FACTOR__ACTOR:
			return actor != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SocialFactorImpl
