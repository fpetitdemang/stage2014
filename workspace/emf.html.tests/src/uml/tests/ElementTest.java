/**
 */
package uml.tests;

import junit.framework.TestCase;

import uml.Element;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link uml.Element#getOwnedElement() <em>Owned Element</em>}</li>
 *   <li>{@link uml.Element#getOwner() <em>Owner</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link uml.Element#not_own_self(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not own self</em>}</li>
 *   <li>{@link uml.Element#has_owner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has owner</em>}</li>
 *   <li>{@link uml.Element#destroy() <em>Destroy</em>}</li>
 *   <li>{@link uml.Element#hasKeyword(java.lang.String) <em>Has Keyword</em>}</li>
 *   <li>{@link uml.Element#getKeywords() <em>Get Keywords</em>}</li>
 *   <li>{@link uml.Element#addKeyword(java.lang.String) <em>Add Keyword</em>}</li>
 *   <li>{@link uml.Element#removeKeyword(java.lang.String) <em>Remove Keyword</em>}</li>
 *   <li>{@link uml.Element#getNearestPackage() <em>Get Nearest Package</em>}</li>
 *   <li>{@link uml.Element#getModel() <em>Get Model</em>}</li>
 *   <li>{@link uml.Element#isStereotypeApplicable(uml.Stereotype) <em>Is Stereotype Applicable</em>}</li>
 *   <li>{@link uml.Element#isStereotypeRequired(uml.Stereotype) <em>Is Stereotype Required</em>}</li>
 *   <li>{@link uml.Element#isStereotypeApplied(uml.Stereotype) <em>Is Stereotype Applied</em>}</li>
 *   <li>{@link uml.Element#applyStereotype(uml.Stereotype) <em>Apply Stereotype</em>}</li>
 *   <li>{@link uml.Element#unapplyStereotype(uml.Stereotype) <em>Unapply Stereotype</em>}</li>
 *   <li>{@link uml.Element#getApplicableStereotypes() <em>Get Applicable Stereotypes</em>}</li>
 *   <li>{@link uml.Element#getApplicableStereotype(java.lang.String) <em>Get Applicable Stereotype</em>}</li>
 *   <li>{@link uml.Element#getStereotypeApplications() <em>Get Stereotype Applications</em>}</li>
 *   <li>{@link uml.Element#getStereotypeApplication(uml.Stereotype) <em>Get Stereotype Application</em>}</li>
 *   <li>{@link uml.Element#getRequiredStereotypes() <em>Get Required Stereotypes</em>}</li>
 *   <li>{@link uml.Element#getRequiredStereotype(java.lang.String) <em>Get Required Stereotype</em>}</li>
 *   <li>{@link uml.Element#getAppliedStereotypes() <em>Get Applied Stereotypes</em>}</li>
 *   <li>{@link uml.Element#getAppliedStereotype(java.lang.String) <em>Get Applied Stereotype</em>}</li>
 *   <li>{@link uml.Element#getAppliedSubstereotypes(uml.Stereotype) <em>Get Applied Substereotypes</em>}</li>
 *   <li>{@link uml.Element#getAppliedSubstereotype(uml.Stereotype, java.lang.String) <em>Get Applied Substereotype</em>}</li>
 *   <li>{@link uml.Element#hasValue(uml.Stereotype, java.lang.String) <em>Has Value</em>}</li>
 *   <li>{@link uml.Element#getValue(uml.Stereotype, java.lang.String) <em>Get Value</em>}</li>
 *   <li>{@link uml.Element#setValue(uml.Stereotype, java.lang.String, java.lang.Object) <em>Set Value</em>}</li>
 *   <li>{@link uml.Element#createEAnnotation(java.lang.String) <em>Create EAnnotation</em>}</li>
 *   <li>{@link uml.Element#getRelationships() <em>Get Relationships</em>}</li>
 *   <li>{@link uml.Element#getRelationships(org.eclipse.emf.ecore.EClass) <em>Get Relationships</em>}</li>
 *   <li>{@link uml.Element#getSourceDirectedRelationships() <em>Get Source Directed Relationships</em>}</li>
 *   <li>{@link uml.Element#getSourceDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Source Directed Relationships</em>}</li>
 *   <li>{@link uml.Element#getTargetDirectedRelationships() <em>Get Target Directed Relationships</em>}</li>
 *   <li>{@link uml.Element#getTargetDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Target Directed Relationships</em>}</li>
 *   <li>{@link uml.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link uml.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ElementTest extends TestCase {

	/**
	 * The fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element fixture = null;

	/**
	 * Constructs a new Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Element fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link uml.Element#getOwnedElement() <em>Owned Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getOwnedElement()
	 * @generated
	 */
	public void testGetOwnedElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getOwner() <em>Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getOwner()
	 * @generated
	 */
	public void testGetOwner() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#not_own_self(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not own self</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#not_own_self(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testNot_own_self__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#has_owner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has owner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#has_owner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testHas_owner__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#destroy() <em>Destroy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#destroy()
	 * @generated
	 */
	public void testDestroy() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#hasKeyword(java.lang.String) <em>Has Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#hasKeyword(java.lang.String)
	 * @generated
	 */
	public void testHasKeyword__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getKeywords() <em>Get Keywords</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getKeywords()
	 * @generated
	 */
	public void testGetKeywords() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#addKeyword(java.lang.String) <em>Add Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#addKeyword(java.lang.String)
	 * @generated
	 */
	public void testAddKeyword__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#removeKeyword(java.lang.String) <em>Remove Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#removeKeyword(java.lang.String)
	 * @generated
	 */
	public void testRemoveKeyword__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getNearestPackage() <em>Get Nearest Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getNearestPackage()
	 * @generated
	 */
	public void testGetNearestPackage() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getModel() <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getModel()
	 * @generated
	 */
	public void testGetModel() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#isStereotypeApplicable(uml.Stereotype) <em>Is Stereotype Applicable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#isStereotypeApplicable(uml.Stereotype)
	 * @generated
	 */
	public void testIsStereotypeApplicable__Stereotype() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#isStereotypeRequired(uml.Stereotype) <em>Is Stereotype Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#isStereotypeRequired(uml.Stereotype)
	 * @generated
	 */
	public void testIsStereotypeRequired__Stereotype() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#isStereotypeApplied(uml.Stereotype) <em>Is Stereotype Applied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#isStereotypeApplied(uml.Stereotype)
	 * @generated
	 */
	public void testIsStereotypeApplied__Stereotype() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#applyStereotype(uml.Stereotype) <em>Apply Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#applyStereotype(uml.Stereotype)
	 * @generated
	 */
	public void testApplyStereotype__Stereotype() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#unapplyStereotype(uml.Stereotype) <em>Unapply Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#unapplyStereotype(uml.Stereotype)
	 * @generated
	 */
	public void testUnapplyStereotype__Stereotype() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getApplicableStereotypes() <em>Get Applicable Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getApplicableStereotypes()
	 * @generated
	 */
	public void testGetApplicableStereotypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getApplicableStereotype(java.lang.String) <em>Get Applicable Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getApplicableStereotype(java.lang.String)
	 * @generated
	 */
	public void testGetApplicableStereotype__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getStereotypeApplications() <em>Get Stereotype Applications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getStereotypeApplications()
	 * @generated
	 */
	public void testGetStereotypeApplications() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getStereotypeApplication(uml.Stereotype) <em>Get Stereotype Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getStereotypeApplication(uml.Stereotype)
	 * @generated
	 */
	public void testGetStereotypeApplication__Stereotype() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getRequiredStereotypes() <em>Get Required Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getRequiredStereotypes()
	 * @generated
	 */
	public void testGetRequiredStereotypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getRequiredStereotype(java.lang.String) <em>Get Required Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getRequiredStereotype(java.lang.String)
	 * @generated
	 */
	public void testGetRequiredStereotype__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getAppliedStereotypes() <em>Get Applied Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getAppliedStereotypes()
	 * @generated
	 */
	public void testGetAppliedStereotypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getAppliedStereotype(java.lang.String) <em>Get Applied Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getAppliedStereotype(java.lang.String)
	 * @generated
	 */
	public void testGetAppliedStereotype__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getAppliedSubstereotypes(uml.Stereotype) <em>Get Applied Substereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getAppliedSubstereotypes(uml.Stereotype)
	 * @generated
	 */
	public void testGetAppliedSubstereotypes__Stereotype() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getAppliedSubstereotype(uml.Stereotype, java.lang.String) <em>Get Applied Substereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getAppliedSubstereotype(uml.Stereotype, java.lang.String)
	 * @generated
	 */
	public void testGetAppliedSubstereotype__Stereotype_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#hasValue(uml.Stereotype, java.lang.String) <em>Has Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#hasValue(uml.Stereotype, java.lang.String)
	 * @generated
	 */
	public void testHasValue__Stereotype_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getValue(uml.Stereotype, java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getValue(uml.Stereotype, java.lang.String)
	 * @generated
	 */
	public void testGetValue__Stereotype_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#setValue(uml.Stereotype, java.lang.String, java.lang.Object) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#setValue(uml.Stereotype, java.lang.String, java.lang.Object)
	 * @generated
	 */
	public void testSetValue__Stereotype_String_Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#createEAnnotation(java.lang.String) <em>Create EAnnotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#createEAnnotation(java.lang.String)
	 * @generated
	 */
	public void testCreateEAnnotation__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getRelationships() <em>Get Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getRelationships()
	 * @generated
	 */
	public void testGetRelationships() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getRelationships(org.eclipse.emf.ecore.EClass) <em>Get Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getRelationships(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	public void testGetRelationships__EClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getSourceDirectedRelationships() <em>Get Source Directed Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getSourceDirectedRelationships()
	 * @generated
	 */
	public void testGetSourceDirectedRelationships() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getSourceDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Source Directed Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getSourceDirectedRelationships(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	public void testGetSourceDirectedRelationships__EClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getTargetDirectedRelationships() <em>Get Target Directed Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getTargetDirectedRelationships()
	 * @generated
	 */
	public void testGetTargetDirectedRelationships() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#getTargetDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Target Directed Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#getTargetDirectedRelationships(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	public void testGetTargetDirectedRelationships__EClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#allOwnedElements()
	 * @generated
	 */
	public void testAllOwnedElements() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Element#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Element#mustBeOwned()
	 * @generated
	 */
	public void testMustBeOwned() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ElementTest
