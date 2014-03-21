/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.BehaviorExecutionSpecification;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavior Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorExecutionSpecificationTest extends ExecutionSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BehaviorExecutionSpecificationTest.class);
	}

	/**
	 * Constructs a new Behavior Execution Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorExecutionSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behavior Execution Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BehaviorExecutionSpecification getFixture() {
		return (BehaviorExecutionSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmlFactory.eINSTANCE.createBehaviorExecutionSpecification());
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

} //BehaviorExecutionSpecificationTest
