/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.Interval;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntervalTest extends ValueSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntervalTest.class);
	}

	/**
	 * Constructs a new Interval test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Interval getFixture() {
		return (Interval)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmlFactory.eINSTANCE.createInterval());
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

} //IntervalTest
