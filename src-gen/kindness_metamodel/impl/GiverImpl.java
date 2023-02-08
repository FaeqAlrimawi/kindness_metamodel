/**
 */
package kindness_metamodel.impl;

import java.util.Collection;

import kindness_metamodel.Giver;
import kindness_metamodel.KindnessPackage;
import kindness_metamodel.Motivation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Giver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.impl.GiverImpl#getMotivations <em>Motivations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GiverImpl extends ActorImpl implements Giver {
	/**
	 * The cached value of the '{@link #getMotivations() <em>Motivations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivations()
	 * @generated
	 * @ordered
	 */
	protected EList<Motivation> motivations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.GIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motivation> getMotivations() {
		if (motivations == null) {
			motivations = new EObjectResolvingEList<Motivation>(Motivation.class, this,
					KindnessPackage.GIVER__MOTIVATIONS);
		}
		return motivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KindnessPackage.GIVER__MOTIVATIONS:
			return getMotivations();
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
		case KindnessPackage.GIVER__MOTIVATIONS:
			getMotivations().clear();
			getMotivations().addAll((Collection<? extends Motivation>) newValue);
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
		case KindnessPackage.GIVER__MOTIVATIONS:
			getMotivations().clear();
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
		case KindnessPackage.GIVER__MOTIVATIONS:
			return motivations != null && !motivations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GiverImpl
