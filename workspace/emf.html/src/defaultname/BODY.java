/**
 */
package defaultname;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BODY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.BODY#getBackground <em>Background</em>}</li>
 *   <li>{@link defaultname.BODY#getBgcolor <em>Bgcolor</em>}</li>
 *   <li>{@link defaultname.BODY#getText <em>Text</em>}</li>
 *   <li>{@link defaultname.BODY#getLink <em>Link</em>}</li>
 *   <li>{@link defaultname.BODY#getAlink <em>Alink</em>}</li>
 *   <li>{@link defaultname.BODY#getVlink <em>Vlink</em>}</li>
 *   <li>{@link defaultname.BODY#getBodyElements <em>Body Elements</em>}</li>
 *   <li>{@link defaultname.BODY#getHtml <em>Html</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getBODY()
 * @model
 * @generated
 */
public interface BODY extends HTMLElement {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(Object)
	 * @see defaultname.DefaultnamePackage#getBODY_Background()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getBackground();

	/**
	 * Sets the value of the '{@link defaultname.BODY#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Object value);

	/**
	 * Returns the value of the '<em><b>Bgcolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bgcolor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bgcolor</em>' attribute.
	 * @see #setBgcolor(Object)
	 * @see defaultname.DefaultnamePackage#getBODY_Bgcolor()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getBgcolor();

	/**
	 * Sets the value of the '{@link defaultname.BODY#getBgcolor <em>Bgcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bgcolor</em>' attribute.
	 * @see #getBgcolor()
	 * @generated
	 */
	void setBgcolor(Object value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(Object)
	 * @see defaultname.DefaultnamePackage#getBODY_Text()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getText();

	/**
	 * Sets the value of the '{@link defaultname.BODY#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(Object value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(Object)
	 * @see defaultname.DefaultnamePackage#getBODY_Link()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getLink();

	/**
	 * Sets the value of the '{@link defaultname.BODY#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Object value);

	/**
	 * Returns the value of the '<em><b>Alink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alink</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alink</em>' attribute.
	 * @see #setAlink(Object)
	 * @see defaultname.DefaultnamePackage#getBODY_Alink()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getAlink();

	/**
	 * Sets the value of the '{@link defaultname.BODY#getAlink <em>Alink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alink</em>' attribute.
	 * @see #getAlink()
	 * @generated
	 */
	void setAlink(Object value);

	/**
	 * Returns the value of the '<em><b>Vlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vlink</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlink</em>' attribute.
	 * @see #setVlink(Object)
	 * @see defaultname.DefaultnamePackage#getBODY_Vlink()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getVlink();

	/**
	 * Sets the value of the '{@link defaultname.BODY#getVlink <em>Vlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlink</em>' attribute.
	 * @see #getVlink()
	 * @generated
	 */
	void setVlink(Object value);

	/**
	 * Returns the value of the '<em><b>Body Elements</b></em>' reference list.
	 * The list contents are of type {@link defaultname.BODYElement}.
	 * It is bidirectional and its opposite is '{@link defaultname.BODYElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Elements</em>' reference list.
	 * @see defaultname.DefaultnamePackage#getBODY_BodyElements()
	 * @see defaultname.BODYElement#getBody
	 * @model opposite="body" ordered="false"
	 * @generated
	 */
	EList<BODYElement> getBodyElements();

	/**
	 * Returns the value of the '<em><b>Html</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link defaultname.HTML#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' container reference.
	 * @see #setHtml(HTML)
	 * @see defaultname.DefaultnamePackage#getBODY_Html()
	 * @see defaultname.HTML#getBody
	 * @model opposite="body" required="true" transient="false" ordered="false"
	 * @generated
	 */
	HTML getHtml();

	/**
	 * Sets the value of the '{@link defaultname.BODY#getHtml <em>Html</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' container reference.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(HTML value);

} // BODY
