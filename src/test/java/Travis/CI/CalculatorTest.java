package Travis.CI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void test1() {
		assertEquals(5,Calculator.Sum(2,3));
	}
	
	@Test
	public void test2() {
		assertEquals(1,Calculator.Sum(-1,2));
	}
	
	@Test
	public void test3() {
		assertEquals(10,Calculator.Minus(11,1));
	}

	@Test
	public void test4() {
		assertEquals(-5,Calculator.Minus(1,-6));
	}
}
