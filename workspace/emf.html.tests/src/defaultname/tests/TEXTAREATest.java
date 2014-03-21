/**
 */
package defaultname.tests;

import defaultname.DefaultnameFactory;
import defaultname.TEXTAREA;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TEXTAREA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TEXTAREATest extends TestCase {

	/**
	 * The fixture for this TEXTAREA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEXTAREA fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TEXTAREATest.class);
	}

	/**
	 * Constructs a new TEXTAREA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTAREATest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TEXTAREA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TEXTAREA fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TEXTAREA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEXTAREA getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DefaultnameFactory.eINSTANCE.createTEXTAREA());
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

} //TEXTAREATest
