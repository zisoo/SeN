package seNex;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		cal.add(10,  20);
		assertEquals(30, cal.getResult());
	}
	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		cal.sub(10,  20);
		assertEquals(-10, cal.getResult());
	}
	@Test
	public void testMul() {
		Calculator cal = new Calculator();
		cal.mul(10,  20);
		assertEquals(200, cal.getResult());
	}
}

