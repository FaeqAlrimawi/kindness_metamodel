/**
 */
package factors.Psychological.impl;

import factors.Psychological.CharacterTrait;
import factors.Psychological.NewPackage2Package;

import factors.TraitType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Trait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factors.Psychological.impl.CharacterTraitImpl#getTrait <em>Trait</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterTraitImpl extends PsychologicalFactorImpl implements CharacterTrait {
	/**
	 * The default value of the '{@link #getTrait() <em>Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrait()
	 * @generated
	 * @ordered
	 */
	protected static final TraitType TRAIT_EDEFAULT = TraitType.OPENNESS;

	/**
	 * The cached value of the '{@link #getTrait() <em>Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrait()
	 * @generated
	 * @ordered
	 */
	protected TraitType trait = TRAIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterTraitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage2Package.Literals.CHARACTER_TRAIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraitType getTrait() {
		return trait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrait(TraitType newTrait) {
		TraitType oldTrait = trait;
		trait = newTrait == null ? TRAIT_EDEFAULT : newTrait;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage2Package.CHARACTER_TRAIT__TRAIT, oldTrait,
					trait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NewPackage2Package.CHARACTER_TRAIT__TRAIT:
			return getTrait();
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
		case NewPackage2Package.CHARACTER_TRAIT__TRAIT:
			setTrait((TraitType) newValue);
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
		case NewPackage2Package.CHARACTER_TRAIT__TRAIT:
			setTrait(TRAIT_EDEFAULT);
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
		case NewPackage2Package.CHARACTER_TRAIT__TRAIT:
			return trait != TRAIT_EDEFAULT;
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
		result.append(" (trait: ");
		result.append(trait);
		result.append(')');
		return result.toString();
	}

} //CharacterTraitImpl
