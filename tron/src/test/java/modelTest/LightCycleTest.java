package modelTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.awt.Color;

import model.*;
import model.elements.*;

/**
* <h1>LightCycleTest Class</h1>
* 
* @author Antoine Baudusseau
* @version 1.0
*
*/
public class LightCycleTest {
	
	private LightCycle LighCycle;
	private Grid gridTest;

	/**
	 * Set up the test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		gridTest = new Grid();
		LighCycle = new LightCycle(10, 12, Color.red,Direction.EST,gridTest);
	}

	/**
	 * Test turn right
	 */
	@Test
	public void testturnRight() {
		Direction expected = Direction.SUD;
		LighCycle.turnRight();
		assertEquals(expected,LighCycle.getDirection());
	}
	
	/**
	 * Test turn left
	 */
	@Test
	public void testturnLeft() {
		LighCycle.setDirection(Direction.EST);;
		Direction expected = Direction.NORD;
		LighCycle.turnLeft();
		assertEquals(expected,LighCycle.getDirection());
	}
	
	/**
	 * Test for setting the LightWall
	 */
	@Test
	public void testsetColor() {
			int expected = 11;
			LighCycle.setDirection(Direction.EST);
			LighCycle.move();
			assertEquals(expected,LighCycle.getX());
			expected = 1;
			assertEquals(expected,LighCycle.getLightWall().size());
	}
}