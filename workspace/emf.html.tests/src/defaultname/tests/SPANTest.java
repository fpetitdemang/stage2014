/**
 */
package defaultname.tests;

import defaultname.DefaultnameFactory;
import defaultname.SPAN;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SPAN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SPANTest extends BODYElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SPANTest.class);
	}

	/**
	 * Constructs a new SPAN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPANTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SPAN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SPAN getFixture() {
		return (SPAN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DefaultnameFactory.eINSTANCE.createSPAN());
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

} //SPANTest
