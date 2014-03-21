/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.OBJECT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OBJECT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.OBJECTImpl#getClassid <em>Classid</em>}</li>
 *   <li>{@link defaultname.impl.OBJECTImpl#getId <em>Id</em>}</li>
 *   <li>{@link defaultname.impl.OBJECTImpl#getData <em>Data</em>}</li>
 *   <li>{@link defaultname.impl.OBJECTImpl#getType <em>Type</em>}</li>
 *   <li>{@link defaultname.impl.OBJECTImpl#getStandby <em>Standby</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OBJECTImpl extends EObjectImpl implements OBJECT {
	/**
	 * The cached value of the '{@link #getClassid() <em>Classid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassid()
	 * @generated
	 * @ordered
	 */
	protected Object classid;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Object id;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Object data;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type;

	/**
	 * The cached value of the '{@link #getStandby() <em>Standby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandby()
	 * @generated
	 * @ordered
	 */
	protected Object standby;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OBJECTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getClassid() {
		return classid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassid(Object newClassid) {
		Object oldClassid = classid;
		classid = newClassid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.OBJECT__CLASSID, oldClassid, classid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Object newId) {
		Object oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Object newData) {
		Object oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.OBJECT__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStandby() {
		return standby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandby(Object newStandby) {
		Object oldStandby = standby;
		standby = newStandby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.OBJECT__STANDBY, oldStandby, standby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DefaultnamePackage.OBJECT__CLASSID:
				return getClassid();
			case DefaultnamePackage.OBJECT__ID:
				return getId();
			case DefaultnamePackage.OBJECT__DATA:
				return getData();
			case DefaultnamePackage.OBJECT__TYPE:
				return getType();
			case DefaultnamePackage.OBJECT__STANDBY:
				return getStandby();
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
			case DefaultnamePackage.OBJECT__CLASSID:
				setClassid(newValue);
				return;
			case DefaultnamePackage.OBJECT__ID:
				setId(newValue);
				return;
			case DefaultnamePackage.OBJECT__DATA:
				setData(newValue);
				return;
			case DefaultnamePackage.OBJECT__TYPE:
				setType(newValue);
				return;
			case DefaultnamePackage.OBJECT__STANDBY:
				setStandby(newValue);
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
			case DefaultnamePackage.OBJECT__CLASSID:
				setClassid((Object)null);
				return;
			case DefaultnamePackage.OBJECT__ID:
				setId((Object)null);
				return;
			case DefaultnamePackage.OBJECT__DATA:
				setData((Object)null);
				return;
			case DefaultnamePackage.OBJECT__TYPE:
				setType((Object)null);
				return;
			case DefaultnamePackage.OBJECT__STANDBY:
				setStandby((Object)null);
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
			case DefaultnamePackage.OBJECT__CLASSID:
				return classid != null;
			case DefaultnamePackage.OBJECT__ID:
				return id != null;
			case DefaultnamePackage.OBJECT__DATA:
				return data != null;
			case DefaultnamePackage.OBJECT__TYPE:
				return type != null;
			case DefaultnamePackage.OBJECT__STANDBY:
				return standby != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (classid: ");
		result.append(classid);
		result.append(", id: ");
		result.append(id);
		result.append(", data: ");
		result.append(data);
		result.append(", type: ");
		result.append(type);
		result.append(", standby: ");
		result.append(standby);
		result.append(')');
		return result.toString();
	}

} //OBJECTImpl
