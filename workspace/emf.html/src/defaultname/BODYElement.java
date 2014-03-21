/**
 */
package defaultname;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BODY Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.BODYElement#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getBODYElement()
 * @model abstract="true"
 * @generated
 */
public interface BODYElement extends HTMLElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link defaultname.BODY#getBodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(BODY)
	 * @see defaultname.DefaultnamePackage#getBODYElement_Body()
	 * @see defaultname.BODY#getBodyElements
	 * @model opposite="bodyElements" required="true" ordered="false"
	 * @generated
	 */
	BODY getBody();

	/**
	 * Sets the value of the '{@link defaultname.BODYElement#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BODY value);

} // BODYElement
