package modelTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.*;

/**
* <h1>TimeTest Class</h1>
* 
* @author Antoine Baudusseau
* @version 1.0
*
*/
public class TimeTest {

	private Time Time;
	
	/**
	 * Set up test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.Time = new Time();
	}
	
	/**
	 * Test time
	 */
	@Test
	public void testTime() {
		double expectedTime = System.currentTimeMillis();
		assertEquals(expectedTime, Time);
	}
}
