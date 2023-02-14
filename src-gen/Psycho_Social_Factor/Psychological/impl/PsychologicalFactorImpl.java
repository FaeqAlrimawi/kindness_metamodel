/**
 */
package Psycho_Social_Factor.Psychological.impl;

import Psycho_Social_Factor.AffectedFactors;
import Psycho_Social_Factor.FactorImpact;
import Psycho_Social_Factor.Level;

import Psycho_Social_Factor.Psychological.PsychologicalFactor;
import Psycho_Social_Factor.Psychological.psychoFactor_pkgPackage;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Psychological Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Psycho_Social_Factor.Psychological.impl.PsychologicalFactorImpl#getName <em>Name</em>}</li>
 *   <li>{@link Psycho_Social_Factor.Psychological.impl.PsychologicalFactorImpl#getAffectedfactor <em>Affectedfactor</em>}</li>
 *   <li>{@link Psycho_Social_Factor.Psychological.impl.PsychologicalFactorImpl#getOther <em>Other</em>}</li>
 *   <li>{@link Psycho_Social_Factor.Psychological.impl.PsychologicalFactorImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PsychologicalFactorImpl extends MinimalEObjectImpl.Container implements PsychologicalFactor {
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
	protected EList<AffectedFactors> affectedfactor;

	/**
	 * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected String other = OTHER_EDEFAULT;

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
	protected PsychologicalFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return psychoFactor_pkgPackage.Literals.PSYCHOLOGICAL_FACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AffectedFactors> getAffectedfactor() {
		if (affectedfactor == null) {
			affectedfactor = new EObjectContainmentEList<AffectedFactors>(AffectedFactors.class, this,
					psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR);
		}
		return affectedfactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOther(String newOther) {
		String oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__OTHER,
					oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__LEVEL,
					oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void computeImpact(FactorImpact impact) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR:
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
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__NAME:
			return getName();
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR:
			return getAffectedfactor();
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__OTHER:
			return getOther();
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__LEVEL:
			return getLevel();
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
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__NAME:
			setName((String) newValue);
			return;
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR:
			getAffectedfactor().clear();
			getAffectedfactor().addAll((Collection<? extends AffectedFactors>) newValue);
			return;
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__OTHER:
			setOther((String) newValue);
			return;
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__LEVEL:
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
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR:
			getAffectedfactor().clear();
			return;
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__OTHER:
			setOther(OTHER_EDEFAULT);
			return;
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__LEVEL:
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
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__AFFECTEDFACTOR:
			return affectedfactor != null && !affectedfactor.isEmpty();
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__OTHER:
			return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR__LEVEL:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case psychoFactor_pkgPackage.PSYCHOLOGICAL_FACTOR___COMPUTE_IMPACT__FACTORIMPACT:
			computeImpact((FactorImpact) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", other: ");
		result.append(other);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //PsychologicalFactorImpl
