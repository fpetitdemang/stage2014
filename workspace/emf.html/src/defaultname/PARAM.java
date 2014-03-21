/**
 */
package defaultname;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PARAM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.PARAM#getName <em>Name</em>}</li>
 *   <li>{@link defaultname.PARAM#getParamValue <em>Param Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getPARAM()
 * @model
 * @generated
 */
public interface PARAM extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see defaultname.DefaultnamePackage#getPARAM_Name()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link defaultname.PARAM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Param Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Value</em>' attribute.
	 * @see #setParamValue(Object)
	 * @see defaultname.DefaultnamePackage#getPARAM_ParamValue()
	 * @model unique="false" dataType="defaultname.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getParamValue();

	/**
	 * Sets the value of the '{@link defaultname.PARAM#getParamValue <em>Param Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Value</em>' attribute.
	 * @see #getParamValue()
	 * @generated
	 */
	void setParamValue(Object value);

} // PARAM
