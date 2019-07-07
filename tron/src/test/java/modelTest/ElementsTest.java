package modelTest;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

import model.elements.*;

/**
* <h1>ElementsTest Class</h1>
* 
* @author Antoine Baudusseau
* @version 1.0
*
*/
public class ElementsTest {
	
	private Elements Elements;

	/**
	 * Set up test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		Elements = new Elements(10, 12, Color.red);
	}

	/**
	 * Test for getting color
	 */
	@Test
	public void testgetColor() {
		Color expected = Color.red;
		assertEquals(expected,Elements.getColor());
	}
	
	/**
	 * Test for setting color
	 */
	@Test
	public void testsetColor() {
		Color expected = Color.blue;
		Elements.setColor(Color.blue);
		assertEquals(expected,Elements.getColor());
	} 

}