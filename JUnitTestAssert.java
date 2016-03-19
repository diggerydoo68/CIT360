// Author: Kyle Stucki
// Built to test the AddThenDivide.java class

// Import the tools we need
import static org.junit.Assert.*;
import org.junit.Test;

// Class called Addition
public class JUnitTestAssert {

	// The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case.
	@SuppressWarnings("static-access")
	@Test
	// Method additionTest
	public void additionTest1() {
		
		// Create a test object named test from the JUnit class
		AddThenDivide test = new AddThenDivide();
		// Make a call to the method additionTest and store returned result
		double remainder = test.additionTest(78.56, 52.64);
		// Assert if the remaider equals what the actual correct return should be
		assertEquals(remainder, 131.2, 0);	
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void multiplyTest1() {
		
		AddThenDivide test = new AddThenDivide();
		double remainder = test.multiplyTest(9, 4);
		assertEquals(remainder, 36, 0);		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void multiplyTest2() {
		
		AddThenDivide test = new AddThenDivide();
		double remainder = test.multiplyTest(3.50, 4.75);
		assertEquals(remainder, 16.625, 0);		
	}
}
