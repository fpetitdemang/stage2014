/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.TD;
import defaultname.TR;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.TDImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link defaultname.impl.TDImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link defaultname.impl.TDImpl#getValign <em>Valign</em>}</li>
 *   <li>{@link defaultname.impl.TDImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link defaultname.impl.TDImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link defaultname.impl.TDImpl#getTr <em>Tr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDImpl extends TABLEElementImpl implements TD {
	/**
	 * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected Object colspan;

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected Object rowspan;

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
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Object width;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.TD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getColspan() {
		return colspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColspan(Object newColspan) {
		Object oldColspan = colspan;
		colspan = newColspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TD__COLSPAN, oldColspan, colspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowspan(Object newRowspan) {
		Object oldRowspan = rowspan;
		rowspan = newRowspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TD__ROWSPAN, oldRowspan, rowspan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TD__VALIGN, oldValign, valign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TD__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Object newWidth) {
		Object oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TD__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TR getTr() {
		if (eContainerFeatureID() != DefaultnamePackage.TD__TR) return null;
		return (TR)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTr(TR newTr, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTr, DefaultnamePackage.TD__TR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTr(TR newTr) {
		if (newTr != eInternalContainer() || (eContainerFeatureID() != DefaultnamePackage.TD__TR && newTr != null)) {
			if (EcoreUtil.isAncestor(this, newTr))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTr != null)
				msgs = ((InternalEObject)newTr).eInverseAdd(this, DefaultnamePackage.TR__TDS, TR.class, msgs);
			msgs = basicSetTr(newTr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TD__TR, newTr, newTr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DefaultnamePackage.TD__TR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTr((TR)otherEnd, msgs);
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
			case DefaultnamePackage.TD__TR:
				return basicSetTr(null, msgs);
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
			case DefaultnamePackage.TD__TR:
				return eInternalContainer().eInverseRemove(this, DefaultnamePackage.TR__TDS, TR.class, msgs);
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
			case DefaultnamePackage.TD__COLSPAN:
				return getColspan();
			case DefaultnamePackage.TD__ROWSPAN:
				return getRowspan();
			case DefaultnamePackage.TD__VALIGN:
				return getValign();
			case DefaultnamePackage.TD__ALIGN:
				return getAlign();
			case DefaultnamePackage.TD__WIDTH:
				return getWidth();
			case DefaultnamePackage.TD__TR:
				return getTr();
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
			case DefaultnamePackage.TD__COLSPAN:
				setColspan(newValue);
				return;
			case DefaultnamePackage.TD__ROWSPAN:
				setRowspan(newValue);
				return;
			case DefaultnamePackage.TD__VALIGN:
				setValign(newValue);
				return;
			case DefaultnamePackage.TD__ALIGN:
				setAlign(newValue);
				return;
			case DefaultnamePackage.TD__WIDTH:
				setWidth(newValue);
				return;
			case DefaultnamePackage.TD__TR:
				setTr((TR)newValue);
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
			case DefaultnamePackage.TD__COLSPAN:
				setColspan((Object)null);
				return;
			case DefaultnamePackage.TD__ROWSPAN:
				setRowspan((Object)null);
				return;
			case DefaultnamePackage.TD__VALIGN:
				setValign((Object)null);
				return;
			case DefaultnamePackage.TD__ALIGN:
				setAlign((Object)null);
				return;
			case DefaultnamePackage.TD__WIDTH:
				setWidth((Object)null);
				return;
			case DefaultnamePackage.TD__TR:
				setTr((TR)null);
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
			case DefaultnamePackage.TD__COLSPAN:
				return colspan != null;
			case DefaultnamePackage.TD__ROWSPAN:
				return rowspan != null;
			case DefaultnamePackage.TD__VALIGN:
				return valign != null;
			case DefaultnamePackage.TD__ALIGN:
				return align != null;
			case DefaultnamePackage.TD__WIDTH:
				return width != null;
			case DefaultnamePackage.TD__TR:
				return getTr() != null;
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
		result.append(" (colspan: ");
		result.append(colspan);
		result.append(", rowspan: ");
		result.append(rowspan);
		result.append(", valign: ");
		result.append(valign);
		result.append(", align: ");
		result.append(align);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //TDImpl
