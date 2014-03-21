/**
 */
package uml.tests;

import uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link uml.RedefinableElement#getRedefinedElement() <em>Redefined Element</em>}</li>
 *   <li>{@link uml.RedefinableElement#getRedefinitionContext() <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.Type#getPackage() <em>Package</em>}</li>
 *   <li>{@link uml.Classifier#getFeature() <em>Feature</em>}</li>
 *   <li>{@link uml.Classifier#getInheritedMember() <em>Inherited Member</em>}</li>
 *   <li>{@link uml.Classifier#getGeneral() <em>General</em>}</li>
 *   <li>{@link uml.Classifier#getAttribute() <em>Attribute</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link uml.Classifier#no_cycles_in_generalization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No cycles in generalization</em>}</li>
 *   <li>{@link uml.Classifier#generalization_hierarchies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Generalization hierarchies</em>}</li>
 *   <li>{@link uml.Classifier#specialize_type(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Specialize type</em>}</li>
 *   <li>{@link uml.Classifier#maps_to_generalization_set(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Maps to generalization set</em>}</li>
 *   <li>{@link uml.Classifier#getAllAttributes() <em>Get All Attributes</em>}</li>
 *   <li>{@link uml.Classifier#getOperations() <em>Get Operations</em>}</li>
 *   <li>{@link uml.Classifier#getAllOperations() <em>Get All Operations</em>}</li>
 *   <li>{@link uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Operation</em>}</li>
 *   <li>{@link uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Get Operation</em>}</li>
 *   <li>{@link uml.Classifier#getUsedInterfaces() <em>Get Used Interfaces</em>}</li>
 *   <li>{@link uml.Classifier#getAllUsedInterfaces() <em>Get All Used Interfaces</em>}</li>
 *   <li>{@link uml.Classifier#getGenerals() <em>Get Generals</em>}</li>
 *   <li>{@link uml.Classifier#getInheritedMembers() <em>Get Inherited Members</em>}</li>
 *   <li>{@link uml.Classifier#allFeatures() <em>All Features</em>}</li>
 *   <li>{@link uml.Classifier#parents() <em>Parents</em>}</li>
 *   <li>{@link uml.Classifier#inheritableMembers(uml.Classifier) <em>Inheritable Members</em>}</li>
 *   <li>{@link uml.Classifier#hasVisibilityOf(uml.NamedElement) <em>Has Visibility Of</em>}</li>
 *   <li>{@link uml.Classifier#conformsTo(uml.Classifier) <em>Conforms To</em>}</li>
 *   <li>{@link uml.Classifier#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}</li>
 *   <li>{@link uml.Classifier#maySpecializeType(uml.Classifier) <em>May Specialize Type</em>}</li>
 *   <li>{@link uml.Classifier#allParents() <em>All Parents</em>}</li>
 *   <li>{@link uml.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}</li>
 *   <li>{@link uml.TemplateableElement#isTemplate() <em>Is Template</em>}</li>
 *   <li>{@link uml.Type#createAssociation(boolean, uml.AggregationKind, java.lang.String, int, int, uml.Type, boolean, uml.AggregationKind, java.lang.String, int, int) <em>Create Association</em>}</li>
 *   <li>{@link uml.Type#getAssociations() <em>Get Associations</em>}</li>
 *   <li>{@link uml.Type#conformsTo(uml.Type) <em>Conforms To</em>}</li>
 *   <li>{@link uml.ParameterableElement#isCompatibleWith(uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 *   <li>{@link uml.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}</li>
 *   <li>{@link uml.RedefinableElement#redefinition_context_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Redefinition context valid</em>}</li>
 *   <li>{@link uml.RedefinableElement#redefinition_consistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Redefinition consistent</em>}</li>
 *   <li>{@link uml.RedefinableElement#isConsistentWith(uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link uml.RedefinableElement#isRedefinitionContextValid(uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ClassifierTest extends NamespaceTest {

	/**
	 * Constructs a new Classifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Classifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Classifier getFixture() {
		return (Classifier)fixture;
	}

	/**
	 * Tests the '{@link uml.RedefinableElement#getRedefinedElement() <em>Redefined Element</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.RedefinableElement#getRedefinedElement()
	 * @generated
	 */
	public void testGetRedefinedElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.RedefinableElement#getRedefinitionContext() <em>Redefinition Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.RedefinableElement#getRedefinitionContext()
	 * @generated
	 */
	public void testGetRedefinitionContext() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Type#getPackage() <em>Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Type#getPackage()
	 * @generated
	 */
	public void testGetPackage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Type#setPackage(uml.Package) <em>Package</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Type#setPackage(uml.Package)
	 * @generated
	 */
	public void testSetPackage() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getFeature() <em>Feature</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getFeature()
	 * @generated
	 */
	public void testGetFeature() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getInheritedMember() <em>Inherited Member</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getInheritedMember()
	 * @generated
	 */
	public void testGetInheritedMember() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getGeneral() <em>General</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getGeneral()
	 * @generated
	 */
	public void testGetGeneral() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getAttribute() <em>Attribute</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getAttribute()
	 * @generated
	 */
	public void testGetAttribute() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#no_cycles_in_generalization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No cycles in generalization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#no_cycles_in_generalization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testNo_cycles_in_generalization__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#generalization_hierarchies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Generalization hierarchies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#generalization_hierarchies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testGeneralization_hierarchies__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#specialize_type(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Specialize type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#specialize_type(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testSpecialize_type__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#maps_to_generalization_set(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Maps to generalization set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#maps_to_generalization_set(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testMaps_to_generalization_set__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getAllAttributes() <em>Get All Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getAllAttributes()
	 * @generated
	 */
	public void testGetAllAttributes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getOperations() <em>Get Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getOperations()
	 * @generated
	 */
	public void testGetOperations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getAllOperations() <em>Get All Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getAllOperations()
	 * @generated
	 */
	public void testGetAllOperations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testGetOperation__String_EList_EList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Get Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	public void testGetOperation__String_EList_EList_boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getUsedInterfaces() <em>Get Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getUsedInterfaces()
	 * @generated
	 */
	public void testGetUsedInterfaces() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getAllUsedInterfaces() <em>Get All Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getAllUsedInterfaces()
	 * @generated
	 */
	public void testGetAllUsedInterfaces() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getGenerals() <em>Get Generals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getGenerals()
	 * @generated
	 */
	public void testGetGenerals() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#getInheritedMembers() <em>Get Inherited Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#getInheritedMembers()
	 * @generated
	 */
	public void testGetInheritedMembers() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#allFeatures() <em>All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#allFeatures()
	 * @generated
	 */
	public void testAllFeatures() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#parents() <em>Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#parents()
	 * @generated
	 */
	public void testParents() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#inheritableMembers(uml.Classifier) <em>Inheritable Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#inheritableMembers(uml.Classifier)
	 * @generated
	 */
	public void testInheritableMembers__Classifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#hasVisibilityOf(uml.NamedElement) <em>Has Visibility Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#hasVisibilityOf(uml.NamedElement)
	 * @generated
	 */
	public void testHasVisibilityOf__NamedElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#conformsTo(uml.Classifier) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#conformsTo(uml.Classifier)
	 * @generated
	 */
	public void testConformsTo__Classifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#inherit(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testInherit__EList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#maySpecializeType(uml.Classifier) <em>May Specialize Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#maySpecializeType(uml.Classifier)
	 * @generated
	 */
	public void testMaySpecializeType__Classifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Classifier#allParents() <em>All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Classifier#allParents()
	 * @generated
	 */
	public void testAllParents() {
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
	 * Tests the '{@link uml.Type#createAssociation(boolean, uml.AggregationKind, java.lang.String, int, int, uml.Type, boolean, uml.AggregationKind, java.lang.String, int, int) <em>Create Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Type#createAssociation(boolean, uml.AggregationKind, java.lang.String, int, int, uml.Type, boolean, uml.AggregationKind, java.lang.String, int, int)
	 * @generated
	 */
	public void testCreateAssociation__boolean_AggregationKind_String_int_int_Type_boolean_AggregationKind_String_int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Type#getAssociations() <em>Get Associations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Type#getAssociations()
	 * @generated
	 */
	public void testGetAssociations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.Type#conformsTo(uml.Type) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.Type#conformsTo(uml.Type)
	 * @generated
	 */
	public void testConformsTo__Type() {
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

	/**
	 * Tests the '{@link uml.RedefinableElement#redefinition_context_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Redefinition context valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.RedefinableElement#redefinition_context_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testRedefinition_context_valid__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.RedefinableElement#redefinition_consistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Redefinition consistent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.RedefinableElement#redefinition_consistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testRedefinition_consistent__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.RedefinableElement#isConsistentWith(uml.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.RedefinableElement#isConsistentWith(uml.RedefinableElement)
	 * @generated
	 */
	public void testIsConsistentWith__RedefinableElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link uml.RedefinableElement#isRedefinitionContextValid(uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.RedefinableElement#isRedefinitionContextValid(uml.RedefinableElement)
	 * @generated
	 */
	public void testIsRedefinitionContextValid__RedefinableElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ClassifierTest
