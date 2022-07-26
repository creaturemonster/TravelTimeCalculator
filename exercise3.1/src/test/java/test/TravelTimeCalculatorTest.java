package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import taxi.TravelTimeCalculator;

public class TravelTimeCalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculate() {
		TravelTimeCalculator calculator=new TravelTimeCalculator();
		assertTrue(calculator.calculate(10, 80, 10) == 10);
	}
	
	@Test
	public void testHighTraffic() {
		TravelTimeCalculator calculator=new TravelTimeCalculator();
		assertTrue(calculator.getHighTraffic(10) == true);
	}
	
	
	
	@Test
	public void testHighwayScenario() {
		TravelTimeCalculator calculator=new TravelTimeCalculator();
		assertTrue(calculator.getHighWayScenario(80) == true);
	}
	
	@Test
	public void testCityScenario() {
		TravelTimeCalculator calculator=new TravelTimeCalculator();
		assertTrue(calculator.getCityScenario(79) == true);
	}

}
