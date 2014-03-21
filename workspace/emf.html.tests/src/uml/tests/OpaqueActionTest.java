/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.OpaqueAction;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpaqueActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OpaqueActionTest.class);
	}

	/**
	 * Constructs a new Opaque Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Opaque Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OpaqueAction getFixture() {
		return (OpaqueAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmlFactory.eINSTANCE.createOpaqueAction());
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

} //OpaqueActionTest
