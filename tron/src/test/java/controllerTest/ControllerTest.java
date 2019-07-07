package controllerTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controller.Controller;
import model.*;
import view.*;

/**
* <h1>ControllerTest Class</h1>
* 
* @author Antoine Baudusseau
* @version 1.0
*
*/
public class ControllerTest {

	private Controller Controller;
	private IModel model;
	private IView view;
	
	/**
	 * Set up test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.Controller = new Controller(model, view);
	}
	
	/**
	 * Test playing method
	 */
	@Test
	public void testPlay() {
		String expectedName = "";
		assertEquals(expectedName, Controller.player1);
		assertEquals(expectedName, Controller.player2);
	}
}
