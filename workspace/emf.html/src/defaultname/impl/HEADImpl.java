/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.HEAD;
import defaultname.HEADElement;
import defaultname.HTML;

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
 * An implementation of the model object '<em><b>HEAD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.HEADImpl#getHeadElements <em>Head Elements</em>}</li>
 *   <li>{@link defaultname.impl.HEADImpl#getHtml <em>Html</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HEADImpl extends HTMLElementImpl implements HEAD {
	/**
	 * The cached value of the '{@link #getHeadElements() <em>Head Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HEADElement> headElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HEADImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.HEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HEADElement> getHeadElements() {
		if (headElements == null) {
			headElements = new EObjectContainmentWithInverseEList<HEADElement>(HEADElement.class, this, DefaultnamePackage.HEAD__HEAD_ELEMENTS, DefaultnamePackage.HEAD_ELEMENT__HEAD);
		}
		return headElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML getHtml() {
		if (eContainerFeatureID() != DefaultnamePackage.HEAD__HTML) return null;
		return (HTML)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtml(HTML newHtml, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHtml, DefaultnamePackage.HEAD__HTML, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtml(HTML newHtml) {
		if (newHtml != eInternalContainer() || (eContainerFeatureID() != DefaultnamePackage.HEAD__HTML && newHtml != null)) {
			if (EcoreUtil.isAncestor(this, newHtml))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHtml != null)
				msgs = ((InternalEObject)newHtml).eInverseAdd(this, DefaultnamePackage.HTML__HEAD, HTML.class, msgs);
			msgs = basicSetHtml(newHtml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.HEAD__HTML, newHtml, newHtml));
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
			case DefaultnamePackage.HEAD__HEAD_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeadElements()).basicAdd(otherEnd, msgs);
			case DefaultnamePackage.HEAD__HTML:
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
			case DefaultnamePackage.HEAD__HEAD_ELEMENTS:
				return ((InternalEList<?>)getHeadElements()).basicRemove(otherEnd, msgs);
			case DefaultnamePackage.HEAD__HTML:
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
			case DefaultnamePackage.HEAD__HTML:
				return eInternalContainer().eInverseRemove(this, DefaultnamePackage.HTML__HEAD, HTML.class, msgs);
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
			case DefaultnamePackage.HEAD__HEAD_ELEMENTS:
				return getHeadElements();
			case DefaultnamePackage.HEAD__HTML:
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
			case DefaultnamePackage.HEAD__HEAD_ELEMENTS:
				getHeadElements().clear();
				getHeadElements().addAll((Collection<? extends HEADElement>)newValue);
				return;
			case DefaultnamePackage.HEAD__HTML:
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
			case DefaultnamePackage.HEAD__HEAD_ELEMENTS:
				getHeadElements().clear();
				return;
			case DefaultnamePackage.HEAD__HTML:
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
			case DefaultnamePackage.HEAD__HEAD_ELEMENTS:
				return headElements != null && !headElements.isEmpty();
			case DefaultnamePackage.HEAD__HTML:
				return getHtml() != null;
		}
		return super.eIsSet(featureID);
	}

} //HEADImpl
