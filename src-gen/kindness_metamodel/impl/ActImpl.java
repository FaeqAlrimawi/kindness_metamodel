/**
 */
package kindness_metamodel.impl;

import java.util.Collection;

import kindness_metamodel.Act;
import kindness_metamodel.ActType;
import kindness_metamodel.Condition;
import kindness_metamodel.Giver;
import kindness_metamodel.Item;
import kindness_metamodel.KindnessPackage;
import kindness_metamodel.Location;
import kindness_metamodel.Mediator;
import kindness_metamodel.Observant;
import kindness_metamodel.Receiver;
import kindness_metamodel.Time;

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
 * An implementation of the model object '<em><b>Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getName <em>Name</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getType <em>Type</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getGiver <em>Giver</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getObservant <em>Observant</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getMediator <em>Mediator</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getNext <em>Next</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getItems <em>Items</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link kindness_metamodel.impl.ActImpl#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActImpl extends MinimalEObjectImpl.Container implements Act {
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
	protected static final ActType TYPE_EDEFAULT = ActType.KINDNESS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Condition precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected Condition postcondition;

	/**
	 * The cached value of the '{@link #getGiver() <em>Giver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiver()
	 * @generated
	 * @ordered
	 */
	protected Giver giver;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Receiver receiver;

	/**
	 * The cached value of the '{@link #getObservant() <em>Observant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservant()
	 * @generated
	 * @ordered
	 */
	protected EList<Observant> observant;

	/**
	 * The cached value of the '{@link #getMediator() <em>Mediator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediator()
	 * @generated
	 * @ordered
	 */
	protected Mediator mediator;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Act next;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getTimes() <em>Times</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> times;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KindnessPackage.Literals.ACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActType newType) {
		ActType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(Condition newPrecondition, NotificationChain msgs) {
		Condition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					KindnessPackage.ACT__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(Condition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject) precondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject) newPrecondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACT__PRECONDITION, newPrecondition,
					newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostcondition(Condition newPostcondition, NotificationChain msgs) {
		Condition oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					KindnessPackage.ACT__POSTCONDITION, oldPostcondition, newPostcondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(Condition newPostcondition) {
		if (newPostcondition != postcondition) {
			NotificationChain msgs = null;
			if (postcondition != null)
				msgs = ((InternalEObject) postcondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__POSTCONDITION, null, msgs);
			if (newPostcondition != null)
				msgs = ((InternalEObject) newPostcondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__POSTCONDITION, null, msgs);
			msgs = basicSetPostcondition(newPostcondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACT__POSTCONDITION, newPostcondition,
					newPostcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Giver getGiver() {
		return giver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGiver(Giver newGiver, NotificationChain msgs) {
		Giver oldGiver = giver;
		giver = newGiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KindnessPackage.ACT__GIVER,
					oldGiver, newGiver);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGiver(Giver newGiver) {
		if (newGiver != giver) {
			NotificationChain msgs = null;
			if (giver != null)
				msgs = ((InternalEObject) giver).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__GIVER, null, msgs);
			if (newGiver != null)
				msgs = ((InternalEObject) newGiver).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__GIVER, null, msgs);
			msgs = basicSetGiver(newGiver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACT__GIVER, newGiver, newGiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver getReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(Receiver newReceiver, NotificationChain msgs) {
		Receiver oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					KindnessPackage.ACT__RECEIVER, oldReceiver, newReceiver);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Receiver newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject) receiver).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__RECEIVER, null, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject) newReceiver).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__RECEIVER, null, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACT__RECEIVER, newReceiver,
					newReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observant> getObservant() {
		if (observant == null) {
			observant = new EObjectContainmentEList<Observant>(Observant.class, this, KindnessPackage.ACT__OBSERVANT);
		}
		return observant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mediator getMediator() {
		return mediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMediator(Mediator newMediator, NotificationChain msgs) {
		Mediator oldMediator = mediator;
		mediator = newMediator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					KindnessPackage.ACT__MEDIATOR, oldMediator, newMediator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediator(Mediator newMediator) {
		if (newMediator != mediator) {
			NotificationChain msgs = null;
			if (mediator != null)
				msgs = ((InternalEObject) mediator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__MEDIATOR, null, msgs);
			if (newMediator != null)
				msgs = ((InternalEObject) newMediator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KindnessPackage.ACT__MEDIATOR, null, msgs);
			msgs = basicSetMediator(newMediator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACT__MEDIATOR, newMediator,
					newMediator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (Act) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KindnessPackage.ACT__NEXT, oldNext,
							next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Act newNext) {
		Act oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KindnessPackage.ACT__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, KindnessPackage.ACT__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, KindnessPackage.ACT__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Time> getTimes() {
		if (times == null) {
			times = new EObjectContainmentEList<Time>(Time.class, this, KindnessPackage.ACT__TIMES);
		}
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KindnessPackage.ACT__PRECONDITION:
			return basicSetPrecondition(null, msgs);
		case KindnessPackage.ACT__POSTCONDITION:
			return basicSetPostcondition(null, msgs);
		case KindnessPackage.ACT__GIVER:
			return basicSetGiver(null, msgs);
		case KindnessPackage.ACT__RECEIVER:
			return basicSetReceiver(null, msgs);
		case KindnessPackage.ACT__OBSERVANT:
			return ((InternalEList<?>) getObservant()).basicRemove(otherEnd, msgs);
		case KindnessPackage.ACT__MEDIATOR:
			return basicSetMediator(null, msgs);
		case KindnessPackage.ACT__ITEMS:
			return ((InternalEList<?>) getItems()).basicRemove(otherEnd, msgs);
		case KindnessPackage.ACT__LOCATIONS:
			return ((InternalEList<?>) getLocations()).basicRemove(otherEnd, msgs);
		case KindnessPackage.ACT__TIMES:
			return ((InternalEList<?>) getTimes()).basicRemove(otherEnd, msgs);
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
		case KindnessPackage.ACT__NAME:
			return getName();
		case KindnessPackage.ACT__TYPE:
			return getType();
		case KindnessPackage.ACT__PRECONDITION:
			return getPrecondition();
		case KindnessPackage.ACT__POSTCONDITION:
			return getPostcondition();
		case KindnessPackage.ACT__GIVER:
			return getGiver();
		case KindnessPackage.ACT__RECEIVER:
			return getReceiver();
		case KindnessPackage.ACT__OBSERVANT:
			return getObservant();
		case KindnessPackage.ACT__MEDIATOR:
			return getMediator();
		case KindnessPackage.ACT__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case KindnessPackage.ACT__ITEMS:
			return getItems();
		case KindnessPackage.ACT__LOCATIONS:
			return getLocations();
		case KindnessPackage.ACT__TIMES:
			return getTimes();
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
		case KindnessPackage.ACT__NAME:
			setName((String) newValue);
			return;
		case KindnessPackage.ACT__TYPE:
			setType((ActType) newValue);
			return;
		case KindnessPackage.ACT__PRECONDITION:
			setPrecondition((Condition) newValue);
			return;
		case KindnessPackage.ACT__POSTCONDITION:
			setPostcondition((Condition) newValue);
			return;
		case KindnessPackage.ACT__GIVER:
			setGiver((Giver) newValue);
			return;
		case KindnessPackage.ACT__RECEIVER:
			setReceiver((Receiver) newValue);
			return;
		case KindnessPackage.ACT__OBSERVANT:
			getObservant().clear();
			getObservant().addAll((Collection<? extends Observant>) newValue);
			return;
		case KindnessPackage.ACT__MEDIATOR:
			setMediator((Mediator) newValue);
			return;
		case KindnessPackage.ACT__NEXT:
			setNext((Act) newValue);
			return;
		case KindnessPackage.ACT__ITEMS:
			getItems().clear();
			getItems().addAll((Collection<? extends Item>) newValue);
			return;
		case KindnessPackage.ACT__LOCATIONS:
			getLocations().clear();
			getLocations().addAll((Collection<? extends Location>) newValue);
			return;
		case KindnessPackage.ACT__TIMES:
			getTimes().clear();
			getTimes().addAll((Collection<? extends Time>) newValue);
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
		case KindnessPackage.ACT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case KindnessPackage.ACT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case KindnessPackage.ACT__PRECONDITION:
			setPrecondition((Condition) null);
			return;
		case KindnessPackage.ACT__POSTCONDITION:
			setPostcondition((Condition) null);
			return;
		case KindnessPackage.ACT__GIVER:
			setGiver((Giver) null);
			return;
		case KindnessPackage.ACT__RECEIVER:
			setReceiver((Receiver) null);
			return;
		case KindnessPackage.ACT__OBSERVANT:
			getObservant().clear();
			return;
		case KindnessPackage.ACT__MEDIATOR:
			setMediator((Mediator) null);
			return;
		case KindnessPackage.ACT__NEXT:
			setNext((Act) null);
			return;
		case KindnessPackage.ACT__ITEMS:
			getItems().clear();
			return;
		case KindnessPackage.ACT__LOCATIONS:
			getLocations().clear();
			return;
		case KindnessPackage.ACT__TIMES:
			getTimes().clear();
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
		case KindnessPackage.ACT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case KindnessPackage.ACT__TYPE:
			return type != TYPE_EDEFAULT;
		case KindnessPackage.ACT__PRECONDITION:
			return precondition != null;
		case KindnessPackage.ACT__POSTCONDITION:
			return postcondition != null;
		case KindnessPackage.ACT__GIVER:
			return giver != null;
		case KindnessPackage.ACT__RECEIVER:
			return receiver != null;
		case KindnessPackage.ACT__OBSERVANT:
			return observant != null && !observant.isEmpty();
		case KindnessPackage.ACT__MEDIATOR:
			return mediator != null;
		case KindnessPackage.ACT__NEXT:
			return next != null;
		case KindnessPackage.ACT__ITEMS:
			return items != null && !items.isEmpty();
		case KindnessPackage.ACT__LOCATIONS:
			return locations != null && !locations.isEmpty();
		case KindnessPackage.ACT__TIMES:
			return times != null && !times.isEmpty();
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

} //ActImpl
