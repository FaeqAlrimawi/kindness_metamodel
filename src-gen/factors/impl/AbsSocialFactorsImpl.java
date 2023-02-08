/**
 */
package factors.impl;

import factors.AbsKindnessEntity;
import factors.AbsSocialFactors;
import factors.FactorsPackage;

import factors.Social.LevelOfNeed;
import factors.Social.OpportunityToConnect;
import factors.Social.Reciprocity;
import factors.Social.Relatedness;
import factors.Social.Trust;

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
 * An implementation of the model object '<em><b>Abs Social Factors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link factors.impl.AbsSocialFactorsImpl#getRelatedness <em>Relatedness</em>}</li>
 *   <li>{@link factors.impl.AbsSocialFactorsImpl#getReciprocity <em>Reciprocity</em>}</li>
 *   <li>{@link factors.impl.AbsSocialFactorsImpl#getLevelofneed <em>Levelofneed</em>}</li>
 *   <li>{@link factors.impl.AbsSocialFactorsImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link factors.impl.AbsSocialFactorsImpl#getOpportunitytoconnect <em>Opportunitytoconnect</em>}</li>
 *   <li>{@link factors.impl.AbsSocialFactorsImpl#getTrust <em>Trust</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbsSocialFactorsImpl extends MinimalEObjectImpl.Container implements AbsSocialFactors {
	/**
	 * The cached value of the '{@link #getRelatedness() <em>Relatedness</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedness()
	 * @generated
	 * @ordered
	 */
	protected EList<Relatedness> relatedness;

	/**
	 * The cached value of the '{@link #getReciprocity() <em>Reciprocity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReciprocity()
	 * @generated
	 * @ordered
	 */
	protected EList<Reciprocity> reciprocity;

	/**
	 * The cached value of the '{@link #getLevelofneed() <em>Levelofneed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelofneed()
	 * @generated
	 * @ordered
	 */
	protected EList<LevelOfNeed> levelofneed;

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
	 * The cached value of the '{@link #getOpportunitytoconnect() <em>Opportunitytoconnect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpportunitytoconnect()
	 * @generated
	 * @ordered
	 */
	protected EList<OpportunityToConnect> opportunitytoconnect;

	/**
	 * The cached value of the '{@link #getTrust() <em>Trust</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrust()
	 * @generated
	 * @ordered
	 */
	protected EList<Trust> trust;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsSocialFactorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactorsPackage.Literals.ABS_SOCIAL_FACTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relatedness> getRelatedness() {
		if (relatedness == null) {
			relatedness = new EObjectContainmentEList<Relatedness>(Relatedness.class, this,
					FactorsPackage.ABS_SOCIAL_FACTORS__RELATEDNESS);
		}
		return relatedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reciprocity> getReciprocity() {
		if (reciprocity == null) {
			reciprocity = new EObjectContainmentEList<Reciprocity>(Reciprocity.class, this,
					FactorsPackage.ABS_SOCIAL_FACTORS__RECIPROCITY);
		}
		return reciprocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LevelOfNeed> getLevelofneed() {
		if (levelofneed == null) {
			levelofneed = new EObjectContainmentEList<LevelOfNeed>(LevelOfNeed.class, this,
					FactorsPackage.ABS_SOCIAL_FACTORS__LEVELOFNEED);
		}
		return levelofneed;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR,
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
			eNotify(new ENotificationImpl(this, Notification.SET, FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR, oldActor,
					actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpportunityToConnect> getOpportunitytoconnect() {
		if (opportunitytoconnect == null) {
			opportunitytoconnect = new EObjectContainmentEList<OpportunityToConnect>(OpportunityToConnect.class, this,
					FactorsPackage.ABS_SOCIAL_FACTORS__OPPORTUNITYTOCONNECT);
		}
		return opportunitytoconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trust> getTrust() {
		if (trust == null) {
			trust = new EObjectContainmentEList<Trust>(Trust.class, this, FactorsPackage.ABS_SOCIAL_FACTORS__TRUST);
		}
		return trust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FactorsPackage.ABS_SOCIAL_FACTORS__RELATEDNESS:
			return ((InternalEList<?>) getRelatedness()).basicRemove(otherEnd, msgs);
		case FactorsPackage.ABS_SOCIAL_FACTORS__RECIPROCITY:
			return ((InternalEList<?>) getReciprocity()).basicRemove(otherEnd, msgs);
		case FactorsPackage.ABS_SOCIAL_FACTORS__LEVELOFNEED:
			return ((InternalEList<?>) getLevelofneed()).basicRemove(otherEnd, msgs);
		case FactorsPackage.ABS_SOCIAL_FACTORS__OPPORTUNITYTOCONNECT:
			return ((InternalEList<?>) getOpportunitytoconnect()).basicRemove(otherEnd, msgs);
		case FactorsPackage.ABS_SOCIAL_FACTORS__TRUST:
			return ((InternalEList<?>) getTrust()).basicRemove(otherEnd, msgs);
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
		case FactorsPackage.ABS_SOCIAL_FACTORS__RELATEDNESS:
			return getRelatedness();
		case FactorsPackage.ABS_SOCIAL_FACTORS__RECIPROCITY:
			return getReciprocity();
		case FactorsPackage.ABS_SOCIAL_FACTORS__LEVELOFNEED:
			return getLevelofneed();
		case FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR:
			if (resolve)
				return getActor();
			return basicGetActor();
		case FactorsPackage.ABS_SOCIAL_FACTORS__OPPORTUNITYTOCONNECT:
			return getOpportunitytoconnect();
		case FactorsPackage.ABS_SOCIAL_FACTORS__TRUST:
			return getTrust();
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
		case FactorsPackage.ABS_SOCIAL_FACTORS__RELATEDNESS:
			getRelatedness().clear();
			getRelatedness().addAll((Collection<? extends Relatedness>) newValue);
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__RECIPROCITY:
			getReciprocity().clear();
			getReciprocity().addAll((Collection<? extends Reciprocity>) newValue);
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__LEVELOFNEED:
			getLevelofneed().clear();
			getLevelofneed().addAll((Collection<? extends LevelOfNeed>) newValue);
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR:
			setActor((AbsKindnessEntity) newValue);
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__OPPORTUNITYTOCONNECT:
			getOpportunitytoconnect().clear();
			getOpportunitytoconnect().addAll((Collection<? extends OpportunityToConnect>) newValue);
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__TRUST:
			getTrust().clear();
			getTrust().addAll((Collection<? extends Trust>) newValue);
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
		case FactorsPackage.ABS_SOCIAL_FACTORS__RELATEDNESS:
			getRelatedness().clear();
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__RECIPROCITY:
			getReciprocity().clear();
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__LEVELOFNEED:
			getLevelofneed().clear();
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR:
			setActor((AbsKindnessEntity) null);
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__OPPORTUNITYTOCONNECT:
			getOpportunitytoconnect().clear();
			return;
		case FactorsPackage.ABS_SOCIAL_FACTORS__TRUST:
			getTrust().clear();
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
		case FactorsPackage.ABS_SOCIAL_FACTORS__RELATEDNESS:
			return relatedness != null && !relatedness.isEmpty();
		case FactorsPackage.ABS_SOCIAL_FACTORS__RECIPROCITY:
			return reciprocity != null && !reciprocity.isEmpty();
		case FactorsPackage.ABS_SOCIAL_FACTORS__LEVELOFNEED:
			return levelofneed != null && !levelofneed.isEmpty();
		case FactorsPackage.ABS_SOCIAL_FACTORS__ACTOR:
			return actor != null;
		case FactorsPackage.ABS_SOCIAL_FACTORS__OPPORTUNITYTOCONNECT:
			return opportunitytoconnect != null && !opportunitytoconnect.isEmpty();
		case FactorsPackage.ABS_SOCIAL_FACTORS__TRUST:
			return trust != null && !trust.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbsSocialFactorsImpl
