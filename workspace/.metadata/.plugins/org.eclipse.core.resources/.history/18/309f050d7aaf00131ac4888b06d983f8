/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.TABLE;
import defaultname.TD;
import defaultname.TR;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.TRImpl#getValign <em>Valign</em>}</li>
 *   <li>{@link defaultname.impl.TRImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link defaultname.impl.TRImpl#getTable <em>Table</em>}</li>
 *   <li>{@link defaultname.impl.TRImpl#getTds <em>Tds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRImpl extends TABLEElementImpl implements TR {
	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected Object valign;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected Object align;

	/**
	 * The cached value of the '{@link #getTds() <em>Tds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTds()
	 * @generated
	 * @ordered
	 */
	protected EList<TD> tds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.TR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValign(Object newValign) {
		Object oldValign = valign;
		valign = newValign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TR__VALIGN, oldValign, valign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(Object newAlign) {
		Object oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TR__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TABLE getTable() {
		if (eContainerFeatureID() != DefaultnamePackage.TR__TABLE) return null;
		return (TABLE)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(TABLE newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, DefaultnamePackage.TR__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(TABLE newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != DefaultnamePackage.TR__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, DefaultnamePackage.TABLE__TRS, TABLE.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TR__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TD> getTds() {
		if (tds == null) {
			tds = new EObjectContainmentWithInverseEList<TD>(TD.class, this, DefaultnamePackage.TR__TDS, DefaultnamePackage.TD__TR);
		}
		return tds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DefaultnamePackage.TR__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((TABLE)otherEnd, msgs);
			case DefaultnamePackage.TR__TDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTds()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DefaultnamePackage.TR__TABLE:
				return basicSetTable(null, msgs);
			case DefaultnamePackage.TR__TDS:
				return ((InternalEList<?>)getTds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DefaultnamePackage.TR__TABLE:
				return eInternalContainer().eInverseRemove(this, DefaultnamePackage.TABLE__TRS, TABLE.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DefaultnamePackage.TR__VALIGN:
				return getValign();
			case DefaultnamePackage.TR__ALIGN:
				return getAlign();
			case DefaultnamePackage.TR__TABLE:
				return getTable();
			case DefaultnamePackage.TR__TDS:
				return getTds();
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
			case DefaultnamePackage.TR__VALIGN:
				setValign(newValue);
				return;
			case DefaultnamePackage.TR__ALIGN:
				setAlign(newValue);
				return;
			case DefaultnamePackage.TR__TABLE:
				setTable((TABLE)newValue);
				return;
			case DefaultnamePackage.TR__TDS:
				getTds().clear();
				getTds().addAll((Collection<? extends TD>)newValue);
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
			case DefaultnamePackage.TR__VALIGN:
				setValign((Object)null);
				return;
			case DefaultnamePackage.TR__ALIGN:
				setAlign((Object)null);
				return;
			case DefaultnamePackage.TR__TABLE:
				setTable((TABLE)null);
				return;
			case DefaultnamePackage.TR__TDS:
				getTds().clear();
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
			case DefaultnamePackage.TR__VALIGN:
				return valign != null;
			case DefaultnamePackage.TR__ALIGN:
				return align != null;
			case DefaultnamePackage.TR__TABLE:
				return getTable() != null;
			case DefaultnamePackage.TR__TDS:
				return tds != null && !tds.isEmpty();
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
		result.append(" (valign: ");
		result.append(valign);
		result.append(", align: ");
		result.append(align);
		result.append(')');
		return result.toString();
	}

} //TRImpl
