package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public final void testReturnTrue() {
		assertTrue("Should be True", MyClass.ReturnTrue() );
		assertEquals("This should fail",false, MyClass.ReturnTrue());
	}
	
	@Test
	public final void testAddTwoNumbers(){
		assertEquals("This should pass", 4, MyClass.AddTwoNumbers(2, 2));
		assertEquals("This should pass", 0, MyClass.AddTwoNumbers(2, -2));
		assertEquals("This should pass", 0, MyClass.AddTwoNumbers(-2, 2));
		assertEquals("This should fail", 3, MyClass.AddTwoNumbers(-2, -2));
	}

}
