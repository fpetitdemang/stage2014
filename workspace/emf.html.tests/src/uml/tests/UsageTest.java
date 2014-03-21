/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.UmlFactory;
import uml.Usage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsageTest.class);
	}

	/**
	 * Constructs a new Usage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Usage getFixture() {
		return (Usage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmlFactory.eINSTANCE.createUsage());
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

} //UsageTest
