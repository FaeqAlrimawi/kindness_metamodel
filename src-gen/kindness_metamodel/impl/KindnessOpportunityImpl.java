/**
 */
package kindness_metamodel.impl;

import diagram.impl.AbsKindnessOpportunityImpl;

import java.util.Collection;

import kindness_metamodel.Act;
import kindness_metamodel.KindnessOpportunity;
import kindness_metamodel.KindnessPackage;
import kindness_metamodel.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opportunity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.impl.KindnessOpportunityImpl#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.impl.KindnessOpportunityImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link kindness_metamodel.impl.KindnessOpportunityImpl#getAct <em>Act</em>}</li>
 *   <li>{@link kindness_metamodel.impl.KindnessOpportunityImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindnessOpportunityImpl extends AbsKindnessOpportunityImpl implements KindnessOpportunity {
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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getAct() <em>Act</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct()
	 * @generated
	 * @ordered
	 */
	protected EList<Act> act;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindnessOpportunityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.KINDNESS_OPPORTUNITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.KINDNESS_OPPORTUNITY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this,
					KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Act> getAct() {
		if (act == null) {
			act = new EObjectContainmentEList<Act>(Act.class, this, KindnessPackage.KINDNESS_OPPORTUNITY__ACT);
		}
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			return ((InternalEList<?>) getAct()).basicRemove(otherEnd, msgs);
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
		case KindnessPackage.KINDNESS_OPPORTUNITY__NAME:
			return getName();
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			return getProperties();
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			return getAct();
		case KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION:
			return getDescription();
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
		case KindnessPackage.KINDNESS_OPPORTUNITY__NAME:
			setName((String) newValue);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			getAct().clear();
			getAct().addAll((Collection<? extends Act>) newValue);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION:
			setDescription((String) newValue);
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
		case KindnessPackage.KINDNESS_OPPORTUNITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			getProperties().clear();
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			getAct().clear();
			return;
		case KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case KindnessPackage.KINDNESS_OPPORTUNITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case KindnessPackage.KINDNESS_OPPORTUNITY__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case KindnessPackage.KINDNESS_OPPORTUNITY__ACT:
			return act != null && !act.isEmpty();
		case KindnessPackage.KINDNESS_OPPORTUNITY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //KindnessOpportunityImpl
