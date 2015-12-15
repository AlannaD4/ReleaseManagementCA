package Shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTests {
	Circle myCircle = new Circle();
	
	@Test
	public void test() {

		assertEquals(myClass.add(1,2),3);		
		assertEquals(myClass.multiply(3,2),6);
		assertEquals(myClass.divide(4,2),2);
		assertEquals(myClass.subtract(6,2),4);
		
		
	}
	
	@Test
	public void testDiameter() throws Exception {		
	    myCircle.setRadius(10);
		assertEquals(myCircle.getDiameter(), 20);
	}

	@Test
	public void testDivideByZero() throws Exception {	
		myCircle.setRadius(10);
		assertEquals(myCircle.getCircumference(), 62.8318);
	
	}
	
	@Test
		public void testDiameter() throws Exception{
			myCircle.setRadius(10);
			assertNull(myCircle.setRadius(),null);
		}
	
	
	

}
