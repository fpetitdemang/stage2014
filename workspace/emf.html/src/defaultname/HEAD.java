/**
 */
package defaultname;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HEAD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.HEAD#getHeadElements <em>Head Elements</em>}</li>
 *   <li>{@link defaultname.HEAD#getHtml <em>Html</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getHEAD()
 * @model
 * @generated
 */
public interface HEAD extends HTMLElement {
	/**
	 * Returns the value of the '<em><b>Head Elements</b></em>' containment reference list.
	 * The list contents are of type {@link defaultname.HEADElement}.
	 * It is bidirectional and its opposite is '{@link defaultname.HEADElement#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Elements</em>' containment reference list.
	 * @see defaultname.DefaultnamePackage#getHEAD_HeadElements()
	 * @see defaultname.HEADElement#getHead
	 * @model opposite="head" containment="true" ordered="false"
	 * @generated
	 */
	EList<HEADElement> getHeadElements();

	/**
	 * Returns the value of the '<em><b>Html</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link defaultname.HTML#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' container reference.
	 * @see #setHtml(HTML)
	 * @see defaultname.DefaultnamePackage#getHEAD_Html()
	 * @see defaultname.HTML#getHead
	 * @model opposite="head" required="true" transient="false" ordered="false"
	 * @generated
	 */
	HTML getHtml();

	/**
	 * Sets the value of the '{@link defaultname.HEAD#getHtml <em>Html</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' container reference.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(HTML value);

} // HEAD
