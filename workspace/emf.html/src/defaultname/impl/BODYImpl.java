/**
 */
package defaultname.impl;

import defaultname.BODY;
import defaultname.BODYElement;
import defaultname.DefaultnamePackage;
import defaultname.HTML;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BODY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.BODYImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link defaultname.impl.BODYImpl#getBgcolor <em>Bgcolor</em>}</li>
 *   <li>{@link defaultname.impl.BODYImpl#getText <em>Text</em>}</li>
 *   <li>{@link defaultname.impl.BODYImpl#getLink <em>Link</em>}</li>
 *   <li>{@link defaultname.impl.BODYImpl#getAlink <em>Alink</em>}</li>
 *   <li>{@link defaultname.impl.BODYImpl#getVlink <em>Vlink</em>}</li>
 *   <li>{@link defaultname.impl.BODYImpl#getBodyElements <em>Body Elements</em>}</li>
 *   <li>{@link defaultname.impl.BODYImpl#getHtml <em>Html</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BODYImpl extends HTMLElementImpl implements BODY {
	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected Object background;

	/**
	 * The cached value of the '{@link #getBgcolor() <em>Bgcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgcolor()
	 * @generated
	 * @ordered
	 */
	protected Object bgcolor;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Object text;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Object link;

	/**
	 * The cached value of the '{@link #getAlink() <em>Alink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlink()
	 * @generated
	 * @ordered
	 */
	protected Object alink;

	/**
	 * The cached value of the '{@link #getVlink() <em>Vlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlink()
	 * @generated
	 * @ordered
	 */
	protected Object vlink;

	/**
	 * The cached value of the '{@link #getBodyElements() <em>Body Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BODYElement> bodyElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BODYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(Object newBackground) {
		Object oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.BODY__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBgcolor() {
		return bgcolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgcolor(Object newBgcolor) {
		Object oldBgcolor = bgcolor;
		bgcolor = newBgcolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.BODY__BGCOLOR, oldBgcolor, bgcolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Object newText) {
		Object oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.BODY__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Object newLink) {
		Object oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.BODY__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAlink() {
		return alink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlink(Object newAlink) {
		Object oldAlink = alink;
		alink = newAlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.BODY__ALINK, oldAlink, alink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVlink() {
		return vlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVlink(Object newVlink) {
		Object oldVlink = vlink;
		vlink = newVlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.BODY__VLINK, oldVlink, vlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BODYElement> getBodyElements() {
		if (bodyElements == null) {
			bodyElements = new EObjectWithInverseResolvingEList<BODYElement>(BODYElement.class, this, DefaultnamePackage.BODY__BODY_ELEMENTS, DefaultnamePackage.BODY_ELEMENT__BODY);
		}
		return bodyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML getHtml() {
		if (eContainerFeatureID() != DefaultnamePackage.BODY__HTML) return null;
		return (HTML)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtml(HTML newHtml, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHtml, DefaultnamePackage.BODY__HTML, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtml(HTML newHtml) {
		if (newHtml != eInternalContainer() || (eContainerFeatureID() != DefaultnamePackage.BODY__HTML && newHtml != null)) {
			if (EcoreUtil.isAncestor(this, newHtml))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHtml != null)
				msgs = ((InternalEObject)newHtml).eInverseAdd(this, DefaultnamePackage.HTML__BODY, HTML.class, msgs);
			msgs = basicSetHtml(newHtml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.BODY__HTML, newHtml, newHtml));
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
			case DefaultnamePackage.BODY__BODY_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodyElements()).basicAdd(otherEnd, msgs);
			case DefaultnamePackage.BODY__HTML:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHtml((HTML)otherEnd, msgs);
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
			case DefaultnamePackage.BODY__BODY_ELEMENTS:
				return ((InternalEList<?>)getBodyElements()).basicRemove(otherEnd, msgs);
			case DefaultnamePackage.BODY__HTML:
				return basicSetHtml(null, msgs);
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
			case DefaultnamePackage.BODY__HTML:
				return eInternalContainer().eInverseRemove(this, DefaultnamePackage.HTML__BODY, HTML.class, msgs);
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
			case DefaultnamePackage.BODY__BACKGROUND:
				return getBackground();
			case DefaultnamePackage.BODY__BGCOLOR:
				return getBgcolor();
			case DefaultnamePackage.BODY__TEXT:
				return getText();
			case DefaultnamePackage.BODY__LINK:
				return getLink();
			case DefaultnamePackage.BODY__ALINK:
				return getAlink();
			case DefaultnamePackage.BODY__VLINK:
				return getVlink();
			case DefaultnamePackage.BODY__BODY_ELEMENTS:
				return getBodyElements();
			case DefaultnamePackage.BODY__HTML:
				return getHtml();
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
			case DefaultnamePackage.BODY__BACKGROUND:
				setBackground(newValue);
				return;
			case DefaultnamePackage.BODY__BGCOLOR:
				setBgcolor(newValue);
				return;
			case DefaultnamePackage.BODY__TEXT:
				setText(newValue);
				return;
			case DefaultnamePackage.BODY__LINK:
				setLink(newValue);
				return;
			case DefaultnamePackage.BODY__ALINK:
				setAlink(newValue);
				return;
			case DefaultnamePackage.BODY__VLINK:
				setVlink(newValue);
				return;
			case DefaultnamePackage.BODY__BODY_ELEMENTS:
				getBodyElements().clear();
				getBodyElements().addAll((Collection<? extends BODYElement>)newValue);
				return;
			case DefaultnamePackage.BODY__HTML:
				setHtml((HTML)newValue);
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
			case DefaultnamePackage.BODY__BACKGROUND:
				setBackground((Object)null);
				return;
			case DefaultnamePackage.BODY__BGCOLOR:
				setBgcolor((Object)null);
				return;
			case DefaultnamePackage.BODY__TEXT:
				setText((Object)null);
				return;
			case DefaultnamePackage.BODY__LINK:
				setLink((Object)null);
				return;
			case DefaultnamePackage.BODY__ALINK:
				setAlink((Object)null);
				return;
			case DefaultnamePackage.BODY__VLINK:
				setVlink((Object)null);
				return;
			case DefaultnamePackage.BODY__BODY_ELEMENTS:
				getBodyElements().clear();
				return;
			case DefaultnamePackage.BODY__HTML:
				setHtml((HTML)null);
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
			case DefaultnamePackage.BODY__BACKGROUND:
				return background != null;
			case DefaultnamePackage.BODY__BGCOLOR:
				return bgcolor != null;
			case DefaultnamePackage.BODY__TEXT:
				return text != null;
			case DefaultnamePackage.BODY__LINK:
				return link != null;
			case DefaultnamePackage.BODY__ALINK:
				return alink != null;
			case DefaultnamePackage.BODY__VLINK:
				return vlink != null;
			case DefaultnamePackage.BODY__BODY_ELEMENTS:
				return bodyElements != null && !bodyElements.isEmpty();
			case DefaultnamePackage.BODY__HTML:
				return getHtml() != null;
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
		result.append(" (background: ");
		result.append(background);
		result.append(", bgcolor: ");
		result.append(bgcolor);
		result.append(", text: ");
		result.append(text);
		result.append(", link: ");
		result.append(link);
		result.append(", alink: ");
		result.append(alink);
		result.append(", vlink: ");
		result.append(vlink);
		result.append(')');
		return result.toString();
	}

} //BODYImpl
