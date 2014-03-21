/**
 */
package defaultname;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.HTMLElement#getValue <em>Value</em>}</li>
 *   <li>{@link defaultname.HTMLElement#getChildren <em>Children</em>}</li>
 *   <li>{@link defaultname.HTMLElement#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getHTMLElement()
 * @model
 * @generated
 */
public interface HTMLElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see defaultname.DefaultnamePackage#getHTMLElement_Value()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link defaultname.HTMLElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link defaultname.HTMLElement}.
	 * It is bidirectional and its opposite is '{@link defaultname.HTMLElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see defaultname.DefaultnamePackage#getHTMLElement_Children()
	 * @see defaultname.HTMLElement#getParent
	 * @model opposite="parent" ordered="false"
	 * @generated
	 */
	EList<HTMLElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link defaultname.HTMLElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(HTMLElement)
	 * @see defaultname.DefaultnamePackage#getHTMLElement_Parent()
	 * @see defaultname.HTMLElement#getChildren
	 * @model opposite="children" required="true" ordered="false"
	 * @generated
	 */
	HTMLElement getParent();

	/**
	 * Sets the value of the '{@link defaultname.HTMLElement#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(HTMLElement value);

} // HTMLElement