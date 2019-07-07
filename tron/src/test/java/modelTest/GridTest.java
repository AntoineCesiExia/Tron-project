package modelTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.*;
import model.elements.LightCycle;

/**
* <h1>GridTest Class</h1>
* 
* @author Antoine Baudusseau
* @version 1.0
*
*/
public class GridTest {

	private Grid Grid;
	
	/**
	 * Set up test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.Grid = new Grid();
	}

	/**
	 * Test for checking the collision
	 */
	@Test
	public void testCheckCollision() {
		Boolean expected = false;
		assertEquals(expected,Grid.checkCollision((LightCycle) Grid.getLightCycle1()));
		expected = true;
		for (int i=0;i<100;i++) {
			Grid.getLightCycle1().move();
		}
		assertEquals(expected,Grid.checkCollision((LightCycle) Grid.getLightCycle1()));;
	}
}
