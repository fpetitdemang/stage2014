/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.DestructionEvent;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Destruction Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link uml.DestructionEvent#no_occurrence_specifications_below(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No occurrence specifications below</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DestructionEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DestructionEventTest.class);
	}

	/**
	 * Constructs a new Destruction Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestructionEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Destruction Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DestructionEvent getFixture() {
		return (DestructionEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmlFactory.eINSTANCE.createDestructionEvent());
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
	 * Tests the '{@link uml.DestructionEvent#no_occurrence_specifications_below(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No occurrence specifications below</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.DestructionEvent#no_occurrence_specifications_below(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testNo_occurrence_specifications_below__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DestructionEventTest
