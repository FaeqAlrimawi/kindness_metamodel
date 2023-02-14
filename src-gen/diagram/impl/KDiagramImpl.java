/**
 */
package diagram.impl;

import diagram.AbsKindnessEntity;
import diagram.AbsKindnessOpportunity;
import diagram.KDiagram;
import diagram.KindnessDiagramPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KDiagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagram.impl.KDiagramImpl#getAbskindnessopportunity <em>Abskindnessopportunity</em>}</li>
 *   <li>{@link diagram.impl.KDiagramImpl#getAbskindnessentity <em>Abskindnessentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KDiagramImpl extends MinimalEObjectImpl.Container implements KDiagram {
	/**
	 * The cached value of the '{@link #getAbskindnessopportunity() <em>Abskindnessopportunity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbskindnessopportunity()
	 * @generated
	 * @ordered
	 */
	protected EList<AbsKindnessOpportunity> abskindnessopportunity;

	/**
	 * The cached value of the '{@link #getAbskindnessentity() <em>Abskindnessentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbskindnessentity()
	 * @generated
	 * @ordered
	 */
	protected EList<AbsKindnessEntity> abskindnessentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessDiagramPackage.Literals.KDIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsKindnessOpportunity> getAbskindnessopportunity() {
		if (abskindnessopportunity == null) {
			abskindnessopportunity = new EObjectContainmentEList<AbsKindnessOpportunity>(AbsKindnessOpportunity.class,
					this, KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSOPPORTUNITY);
		}
		return abskindnessopportunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsKindnessEntity> getAbskindnessentity() {
		if (abskindnessentity == null) {
			abskindnessentity = new EObjectContainmentEList<AbsKindnessEntity>(AbsKindnessEntity.class, this,
					KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSENTITY);
		}
		return abskindnessentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSOPPORTUNITY:
			return ((InternalEList<?>) getAbskindnessopportunity()).basicRemove(otherEnd, msgs);
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSENTITY:
			return ((InternalEList<?>) getAbskindnessentity()).basicRemove(otherEnd, msgs);
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
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSOPPORTUNITY:
			return getAbskindnessopportunity();
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSENTITY:
			return getAbskindnessentity();
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
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSOPPORTUNITY:
			getAbskindnessopportunity().clear();
			getAbskindnessopportunity().addAll((Collection<? extends AbsKindnessOpportunity>) newValue);
			return;
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSENTITY:
			getAbskindnessentity().clear();
			getAbskindnessentity().addAll((Collection<? extends AbsKindnessEntity>) newValue);
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
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSOPPORTUNITY:
			getAbskindnessopportunity().clear();
			return;
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSENTITY:
			getAbskindnessentity().clear();
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
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSOPPORTUNITY:
			return abskindnessopportunity != null && !abskindnessopportunity.isEmpty();
		case KindnessDiagramPackage.KDIAGRAM__ABSKINDNESSENTITY:
			return abskindnessentity != null && !abskindnessentity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KDiagramImpl
