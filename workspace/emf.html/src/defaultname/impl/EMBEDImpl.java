/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.EMBED;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMBED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.EMBEDImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link defaultname.impl.EMBEDImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link defaultname.impl.EMBEDImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link defaultname.impl.EMBEDImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link defaultname.impl.EMBEDImpl#getVspace <em>Vspace</em>}</li>
 *   <li>{@link defaultname.impl.EMBEDImpl#getHspace <em>Hspace</em>}</li>
 *   <li>{@link defaultname.impl.EMBEDImpl#getBorder <em>Border</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMBEDImpl extends BODYElementImpl implements EMBED {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Object src;

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
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Object height;

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
	 * The cached value of the '{@link #getVspace() <em>Vspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVspace()
	 * @generated
	 * @ordered
	 */
	protected Object vspace;

	/**
	 * The cached value of the '{@link #getHspace() <em>Hspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHspace()
	 * @generated
	 * @ordered
	 */
	protected Object hspace;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMBEDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.EMBED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(Object newSrc) {
		Object oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.EMBED__SRC, oldSrc, src));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.EMBED__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Object newHeight) {
		Object oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.EMBED__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.EMBED__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVspace() {
		return vspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVspace(Object newVspace) {
		Object oldVspace = vspace;
		vspace = newVspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.EMBED__VSPACE, oldVspace, vspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHspace() {
		return hspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHspace(Object newHspace) {
		Object oldHspace = hspace;
		hspace = newHspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.EMBED__HSPACE, oldHspace, hspace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.EMBED__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DefaultnamePackage.EMBED__SRC:
				return getSrc();
			case DefaultnamePackage.EMBED__WIDTH:
				return getWidth();
			case DefaultnamePackage.EMBED__HEIGHT:
				return getHeight();
			case DefaultnamePackage.EMBED__ALIGN:
				return getAlign();
			case DefaultnamePackage.EMBED__VSPACE:
				return getVspace();
			case DefaultnamePackage.EMBED__HSPACE:
				return getHspace();
			case DefaultnamePackage.EMBED__BORDER:
				return getBorder();
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
			case DefaultnamePackage.EMBED__SRC:
				setSrc(newValue);
				return;
			case DefaultnamePackage.EMBED__WIDTH:
				setWidth(newValue);
				return;
			case DefaultnamePackage.EMBED__HEIGHT:
				setHeight(newValue);
				return;
			case DefaultnamePackage.EMBED__ALIGN:
				setAlign(newValue);
				return;
			case DefaultnamePackage.EMBED__VSPACE:
				setVspace(newValue);
				return;
			case DefaultnamePackage.EMBED__HSPACE:
				setHspace(newValue);
				return;
			case DefaultnamePackage.EMBED__BORDER:
				setBorder(newValue);
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
			case DefaultnamePackage.EMBED__SRC:
				setSrc((Object)null);
				return;
			case DefaultnamePackage.EMBED__WIDTH:
				setWidth((Object)null);
				return;
			case DefaultnamePackage.EMBED__HEIGHT:
				setHeight((Object)null);
				return;
			case DefaultnamePackage.EMBED__ALIGN:
				setAlign((Object)null);
				return;
			case DefaultnamePackage.EMBED__VSPACE:
				setVspace((Object)null);
				return;
			case DefaultnamePackage.EMBED__HSPACE:
				setHspace((Object)null);
				return;
			case DefaultnamePackage.EMBED__BORDER:
				setBorder((Object)null);
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
			case DefaultnamePackage.EMBED__SRC:
				return src != null;
			case DefaultnamePackage.EMBED__WIDTH:
				return width != null;
			case DefaultnamePackage.EMBED__HEIGHT:
				return height != null;
			case DefaultnamePackage.EMBED__ALIGN:
				return align != null;
			case DefaultnamePackage.EMBED__VSPACE:
				return vspace != null;
			case DefaultnamePackage.EMBED__HSPACE:
				return hspace != null;
			case DefaultnamePackage.EMBED__BORDER:
				return border != null;
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
		result.append(" (src: ");
		result.append(src);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", align: ");
		result.append(align);
		result.append(", vspace: ");
		result.append(vspace);
		result.append(", hspace: ");
		result.append(hspace);
		result.append(", border: ");
		result.append(border);
		result.append(')');
		return result.toString();
	}

} //EMBEDImpl
