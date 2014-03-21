/**
 */
package defaultname;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TABLE Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.TABLEElement#getBgcolor <em>Bgcolor</em>}</li>
 *   <li>{@link defaultname.TABLEElement#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getTABLEElement()
 * @model abstract="true"
 * @generated
 */
public interface TABLEElement extends BODYElement {
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
	 * @see defaultname.DefaultnamePackage#getTABLEElement_Bgcolor()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getBgcolor();

	/**
	 * Sets the value of the '{@link defaultname.TABLEElement#getBgcolor <em>Bgcolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bgcolor</em>' attribute.
	 * @see #getBgcolor()
	 * @generated
	 */
	void setBgcolor(Object value);

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
	 * @see defaultname.DefaultnamePackage#getTABLEElement_Background()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getBackground();

	/**
	 * Sets the value of the '{@link defaultname.TABLEElement#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Object value);

} // TABLEElement
