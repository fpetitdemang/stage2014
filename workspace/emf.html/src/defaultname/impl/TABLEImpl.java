/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.TABLE;
import defaultname.TR;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TABLE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.TABLEImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link defaultname.impl.TABLEImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link defaultname.impl.TABLEImpl#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link defaultname.impl.TABLEImpl#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link defaultname.impl.TABLEImpl#getTrs <em>Trs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TABLEImpl extends TABLEElementImpl implements TABLE {
	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected Object border;

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
	 * The cached value of the '{@link #getCellspacing() <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellspacing()
	 * @generated
	 * @ordered
	 */
	protected Object cellspacing;

	/**
	 * The cached value of the '{@link #getCellpadding() <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellpadding()
	 * @generated
	 * @ordered
	 */
	protected Object cellpadding;

	/**
	 * The cached value of the '{@link #getTrs() <em>Trs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrs()
	 * @generated
	 * @ordered
	 */
	protected EList<TR> trs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TABLEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(Object newBorder) {
		Object oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TABLE__BORDER, oldBorder, border));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TABLE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCellspacing() {
		return cellspacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellspacing(Object newCellspacing) {
		Object oldCellspacing = cellspacing;
		cellspacing = newCellspacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TABLE__CELLSPACING, oldCellspacing, cellspacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCellpadding() {
		return cellpadding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellpadding(Object newCellpadding) {
		Object oldCellpadding = cellpadding;
		cellpadding = newCellpadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.TABLE__CELLPADDING, oldCellpadding, cellpadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TR> getTrs() {
		if (trs == null) {
			trs = new EObjectContainmentWithInverseEList<TR>(TR.class, this, DefaultnamePackage.TABLE__TRS, DefaultnamePackage.TR__TABLE);
		}
		return trs;
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
			case DefaultnamePackage.TABLE__TRS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrs()).basicAdd(otherEnd, msgs);
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
			case DefaultnamePackage.TABLE__TRS:
				return ((InternalEList<?>)getTrs()).basicRemove(otherEnd, msgs);
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
			case DefaultnamePackage.TABLE__BORDER:
				return getBorder();
			case DefaultnamePackage.TABLE__WIDTH:
				return getWidth();
			case DefaultnamePackage.TABLE__CELLSPACING:
				return getCellspacing();
			case DefaultnamePackage.TABLE__CELLPADDING:
				return getCellpadding();
			case DefaultnamePackage.TABLE__TRS:
				return getTrs();
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
			case DefaultnamePackage.TABLE__BORDER:
				setBorder(newValue);
				return;
			case DefaultnamePackage.TABLE__WIDTH:
				setWidth(newValue);
				return;
			case DefaultnamePackage.TABLE__CELLSPACING:
				setCellspacing(newValue);
				return;
			case DefaultnamePackage.TABLE__CELLPADDING:
				setCellpadding(newValue);
				return;
			case DefaultnamePackage.TABLE__TRS:
				getTrs().clear();
				getTrs().addAll((Collection<? extends TR>)newValue);
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
			case DefaultnamePackage.TABLE__BORDER:
				setBorder((Object)null);
				return;
			case DefaultnamePackage.TABLE__WIDTH:
				setWidth((Object)null);
				return;
			case DefaultnamePackage.TABLE__CELLSPACING:
				setCellspacing((Object)null);
				return;
			case DefaultnamePackage.TABLE__CELLPADDING:
				setCellpadding((Object)null);
				return;
			case DefaultnamePackage.TABLE__TRS:
				getTrs().clear();
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
			case DefaultnamePackage.TABLE__BORDER:
				return border != null;
			case DefaultnamePackage.TABLE__WIDTH:
				return width != null;
			case DefaultnamePackage.TABLE__CELLSPACING:
				return cellspacing != null;
			case DefaultnamePackage.TABLE__CELLPADDING:
				return cellpadding != null;
			case DefaultnamePackage.TABLE__TRS:
				return trs != null && !trs.isEmpty();
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
		result.append(" (border: ");
		result.append(border);
		result.append(", width: ");
		result.append(width);
		result.append(", cellspacing: ");
		result.append(cellspacing);
		result.append(", cellpadding: ");
		result.append(cellpadding);
		result.append(')');
		return result.toString();
	}

} //TABLEImpl
