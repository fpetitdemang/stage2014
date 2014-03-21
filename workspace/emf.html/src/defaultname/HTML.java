/**
 */
package defaultname;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.HTML#getHead <em>Head</em>}</li>
 *   <li>{@link defaultname.HTML#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getHTML()
 * @model
 * @generated
 */
public interface HTML extends EObject {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link defaultname.HEAD#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(HEAD)
	 * @see defaultname.DefaultnamePackage#getHTML_Head()
	 * @see defaultname.HEAD#getHtml
	 * @model opposite="html" containment="true" required="true" ordered="false"
	 * @generated
	 */
	HEAD getHead();

	/**
	 * Sets the value of the '{@link defaultname.HTML#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(HEAD value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link defaultname.BODY#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BODY)
	 * @see defaultname.DefaultnamePackage#getHTML_Body()
	 * @see defaultname.BODY#getHtml
	 * @model opposite="html" containment="true" required="true" ordered="false"
	 * @generated
	 */
	BODY getBody();

	/**
	 * Sets the value of the '{@link defaultname.HTML#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BODY value);

} // HTML
