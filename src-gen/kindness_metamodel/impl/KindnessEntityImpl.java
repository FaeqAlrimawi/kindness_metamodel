/**
 */
package kindness_metamodel.impl;

import factors.impl.AbsKindnessEntityImpl;

import java.util.Collection;

import kindness_metamodel.Connection;
import kindness_metamodel.KindnessEntity;
import kindness_metamodel.KindnessPackage;
import kindness_metamodel.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.impl.KindnessEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.impl.KindnessEntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link kindness_metamodel.impl.KindnessEntityImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link kindness_metamodel.impl.KindnessEntityImpl#getContainerEntity <em>Container Entity</em>}</li>
 *   <li>{@link kindness_metamodel.impl.KindnessEntityImpl#getContainedEntities <em>Contained Entities</em>}</li>
 *   <li>{@link kindness_metamodel.impl.KindnessEntityImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindnessEntityImpl extends AbsKindnessEntityImpl implements KindnessEntity {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getContainerEntity() <em>Container Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerEntity()
	 * @generated
	 * @ordered
	 */
	protected KindnessEntity containerEntity;

	/**
	 * The cached value of the '{@link #getContainedEntities() <em>Contained Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<KindnessEntity> containedEntities;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindnessEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.KINDNESS_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.KINDNESS_ENTITY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.KINDNESS_ENTITY__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectResolvingEList<Connection>(Connection.class, this,
					KindnessPackage.KINDNESS_ENTITY__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessEntity getContainerEntity() {
		if (containerEntity != null && containerEntity.eIsProxy()) {
			InternalEObject oldContainerEntity = (InternalEObject) containerEntity;
			containerEntity = (KindnessEntity) eResolveProxy(oldContainerEntity);
			if (containerEntity != oldContainerEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							KindnessPackage.KINDNESS_ENTITY__CONTAINER_ENTITY, oldContainerEntity, containerEntity));
			}
		}
		return containerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindnessEntity basicGetContainerEntity() {
		return containerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerEntity(KindnessEntity newContainerEntity) {
		KindnessEntity oldContainerEntity = containerEntity;
		containerEntity = newContainerEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.KINDNESS_ENTITY__CONTAINER_ENTITY,
					oldContainerEntity, containerEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KindnessEntity> getContainedEntities() {
		if (containedEntities == null) {
			containedEntities = new EObjectResolvingEList<KindnessEntity>(KindnessEntity.class, this,
					KindnessPackage.KINDNESS_ENTITY__CONTAINED_ENTITIES);
		}
		return containedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this,
					KindnessPackage.KINDNESS_ENTITY__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KindnessPackage.KINDNESS_ENTITY__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
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
		case KindnessPackage.KINDNESS_ENTITY__NAME:
			return getName();
		case KindnessPackage.KINDNESS_ENTITY__TYPE:
			return getType();
		case KindnessPackage.KINDNESS_ENTITY__CONNECTIONS:
			return getConnections();
		case KindnessPackage.KINDNESS_ENTITY__CONTAINER_ENTITY:
			if (resolve)
				return getContainerEntity();
			return basicGetContainerEntity();
		case KindnessPackage.KINDNESS_ENTITY__CONTAINED_ENTITIES:
			return getContainedEntities();
		case KindnessPackage.KINDNESS_ENTITY__PROPERTIES:
			return getProperties();
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
		case KindnessPackage.KINDNESS_ENTITY__NAME:
			setName((String) newValue);
			return;
		case KindnessPackage.KINDNESS_ENTITY__TYPE:
			setType((String) newValue);
			return;
		case KindnessPackage.KINDNESS_ENTITY__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends Connection>) newValue);
			return;
		case KindnessPackage.KINDNESS_ENTITY__CONTAINER_ENTITY:
			setContainerEntity((KindnessEntity) newValue);
			return;
		case KindnessPackage.KINDNESS_ENTITY__CONTAINED_ENTITIES:
			getContainedEntities().clear();
			getContainedEntities().addAll((Collection<? extends KindnessEntity>) newValue);
			return;
		case KindnessPackage.KINDNESS_ENTITY__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
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
		case KindnessPackage.KINDNESS_ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case KindnessPackage.KINDNESS_ENTITY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case KindnessPackage.KINDNESS_ENTITY__CONNECTIONS:
			getConnections().clear();
			return;
		case KindnessPackage.KINDNESS_ENTITY__CONTAINER_ENTITY:
			setContainerEntity((KindnessEntity) null);
			return;
		case KindnessPackage.KINDNESS_ENTITY__CONTAINED_ENTITIES:
			getContainedEntities().clear();
			return;
		case KindnessPackage.KINDNESS_ENTITY__PROPERTIES:
			getProperties().clear();
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
		case KindnessPackage.KINDNESS_ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case KindnessPackage.KINDNESS_ENTITY__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case KindnessPackage.KINDNESS_ENTITY__CONNECTIONS:
			return connections != null && !connections.isEmpty();
		case KindnessPackage.KINDNESS_ENTITY__CONTAINER_ENTITY:
			return containerEntity != null;
		case KindnessPackage.KINDNESS_ENTITY__CONTAINED_ENTITIES:
			return containedEntities != null && !containedEntities.isEmpty();
		case KindnessPackage.KINDNESS_ENTITY__PROPERTIES:
			return properties != null && !properties.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //KindnessEntityImpl
