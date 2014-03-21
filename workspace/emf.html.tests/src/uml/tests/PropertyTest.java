/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.Property;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link uml.ConnectableElement#getEnd() <em>End</em>}</li>
 *   <li>{@link uml.DeploymentTarget#getDeployedElement() <em>Deployed Element</em>}</li>
 *   <li>{@link uml.Property#getClass_() <em>Class</em>}</li>
 *   <li>{@link uml.Property#getDefault() <em>Default</em>}</li>
 *   <li>{@link uml.Property#isIsComposite() <em>Is Composite</em>}</li>
 *   <li>{@link uml.Property#getOpposite() <em>Opposite</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link uml.Property#multiplicity_of_composite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Multiplicity of composite</em>}</li>
 *   <li>{@link uml.Property#subsetting_context_conforms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subsetting context conforms</em>}</li>
 *   <li>{@link uml.Property#redefined_property_inherited(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Redefined property inherited</em>}</li>
 *   <li>{@link uml.Property#subsetting_rules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subsetting rules</em>}</li>
 *   <li>{@link uml.Property#navigable_readonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Navigable readonly</em>}</li>
 *   <li>{@link uml.Property#derived_union_is_derived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derived union is derived</em>}</li>
 *   <li>{@link uml.Property#derived_union_is_read_only(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derived union is read only</em>}</li>
 *   <li>{@link uml.Property#subsetted_property_names(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subsetted property names</em>}</li>
 *   <li>{@link uml.Property#deployment_target(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Deployment target</em>}</li>
 *   <li>{@link uml.Property#binding_to_attribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Binding to attribute</em>}</li>
 *   <li>{@link uml.Property#setIsNavigable(boolean) <em>Set Is Navigable</em>}</li>
 *   <li>{@link uml.Property#getOtherEnd() <em>Get Other End</em>}</li>
 *   <li>{@link uml.Property#setBooleanDefaultValue(boolean) <em>Set Boolean Default Value</em>}</li>
 *   <li>{@link uml.Property#setIntegerDefaultValue(int) <em>Set Integer Default Value</em>}</li>
 *   <li>{@link uml.Property#setStringDefaultValue(java.lang.String) <em>Set String Default Value</em>}</li>
 *   <li>{@link uml.Property#setUnlimitedNaturalDefaultValue(int) <em>Set Unlimited Natural Default Value</em>}</li>
 *   <li>{@link uml.Property#setNullDefaultValue() <em>Set Null Default Value</em>}</li>
 *   <li>{@link uml.Property#isAttribute(uml.Property) <em>Is Attribute</em>}</li>
 *   <li>{@link uml.Property#isComposite() <em>Is Composite</em>}</li>
 *   <li>{@link uml.Property#subsettingContext() <em>Subsetting Context</em>}</li>
 *   <li>{@link uml.Property#isNavigable() <em>Is Navigable</em>}</li>
 *   <li>{@link uml.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}</li>
 *   <li>{@link uml.TemplateableElement#isTemplate() <em>Is Template</em>}</li>
 *   <li>{@link uml.DeploymentTarget#getDeployedElements() <em>Get Deployed Elements</em>}</li>
 *   <li>{@link uml.ConnectableElement#getEnds() <em>Get Ends</em>}</li>
 *   <li>{@link uml.ParameterableElement#isCompatibleWith(uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 *   <li>{@link uml.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PropertyTest extends StructuralFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyTest.class);
	}

	/**
	 * Constructs a new Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Property getFixture() {
		return (Property)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmlFactory.eINSTANCE.createProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link uml.ConnectableElement#getEnd() <em>End</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.ConnectableElement#getEnd()
	 * @generated
	 */
	public void testGetEnd() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.DeploymentTarget#getDeployedElement() <em>Deployed Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.DeploymentTarget#getDeployedElement()
	 * @generated
	 */
	public void testGetDeployedElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#getClass_() <em>Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#getClass_()
	 * @generated
	 */
	public void testGetClass_() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#getDefault() <em>Default</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#getDefault()
	 * @generated
	 */
	public void testGetDefault() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#setDefault(java.lang.String) <em>Default</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#setDefault(java.lang.String)
	 * @generated
	 */
	public void testSetDefault() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#unsetDefault() <em>unsetDefault()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#unsetDefault()
	 * @generated
	 */
	public void testUnsetDefault() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#isSetDefault() <em>isSetDefault()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#isSetDefault()
	 * @generated
	 */
	public void testIsSetDefault() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#isIsComposite() <em>Is Composite</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#isIsComposite()
	 * @generated
	 */
	public void testIsIsComposite() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#setIsComposite(boolean) <em>Is Composite</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#setIsComposite(boolean)
	 * @generated
	 */
	public void testSetIsComposite() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#getOpposite() <em>Opposite</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#getOpposite()
	 * @generated
	 */
	public void testGetOpposite() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#setOpposite(uml.Property) <em>Opposite</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#setOpposite(uml.Property)
	 * @generated
	 */
	public void testSetOpposite() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#multiplicity_of_composite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Multiplicity of composite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#multiplicity_of_composite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testMultiplicity_of_composite__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#subsetting_context_conforms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subsetting context conforms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#subsetting_context_conforms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testSubsetting_context_conforms__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#redefined_property_inherited(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Redefined property inherited</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#redefined_property_inherited(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testRedefined_property_inherited__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#subsetting_rules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subsetting rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#subsetting_rules(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testSubsetting_rules__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#navigable_readonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Navigable readonly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#navigable_readonly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testNavigable_readonly__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#derived_union_is_derived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derived union is derived</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#derived_union_is_derived(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testDerived_union_is_derived__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#derived_union_is_read_only(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derived union is read only</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#derived_union_is_read_only(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testDerived_union_is_read_only__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#subsetted_property_names(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subsetted property names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#subsetted_property_names(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testSubsetted_property_names__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#deployment_target(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Deployment target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#deployment_target(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testDeployment_target__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#binding_to_attribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Binding to attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#binding_to_attribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testBinding_to_attribute__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#setIsNavigable(boolean) <em>Set Is Navigable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#setIsNavigable(boolean)
	 * @generated
	 */
	public void testSetIsNavigable__boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#getOtherEnd() <em>Get Other End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#getOtherEnd()
	 * @generated
	 */
	public void testGetOtherEnd() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#setBooleanDefaultValue(boolean) <em>Set Boolean Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#setBooleanDefaultValue(boolean)
	 * @generated
	 */
	public void testSetBooleanDefaultValue__boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#setIntegerDefaultValue(int) <em>Set Integer Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#setIntegerDefaultValue(int)
	 * @generated
	 */
	public void testSetIntegerDefaultValue__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#setStringDefaultValue(java.lang.String) <em>Set String Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#setStringDefaultValue(java.lang.String)
	 * @generated
	 */
	public void testSetStringDefaultValue__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#setUnlimitedNaturalDefaultValue(int) <em>Set Unlimited Natural Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#setUnlimitedNaturalDefaultValue(int)
	 * @generated
	 */
	public void testSetUnlimitedNaturalDefaultValue__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#setNullDefaultValue() <em>Set Null Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#setNullDefaultValue()
	 * @generated
	 */
	public void testSetNullDefaultValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#isAttribute(uml.Property) <em>Is Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#isAttribute(uml.Property)
	 * @generated
	 */
	public void testIsAttribute__Property() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#isComposite() <em>Is Composite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#isComposite()
	 * @generated
	 */
	public void testIsComposite() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#subsettingContext() <em>Subsetting Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#subsettingContext()
	 * @generated
	 */
	public void testSubsettingContext() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Property#isNavigable() <em>Is Navigable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Property#isNavigable()
	 * @generated
	 */
	public void testIsNavigable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public void testParameterableElements() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.TemplateableElement#isTemplate() <em>Is Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.TemplateableElement#isTemplate()
	 * @generated
	 */
	public void testIsTemplate() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.DeploymentTarget#getDeployedElements() <em>Get Deployed Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.DeploymentTarget#getDeployedElements()
	 * @generated
	 */
	public void testGetDeployedElements() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.ConnectableElement#getEnds() <em>Get Ends</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.ConnectableElement#getEnds()
	 * @generated
	 */
	public void testGetEnds() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.ParameterableElement#isCompatibleWith(uml.ParameterableElement) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.ParameterableElement#isCompatibleWith(uml.ParameterableElement)
	 * @generated
	 */
	public void testIsCompatibleWith__ParameterableElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.ParameterableElement#isTemplateParameter()
	 * @generated
	 */
	public void testIsTemplateParameter() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PropertyTest
