package viewTest;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

import view.*;
import model.*;

/**
* <h1>FrameTest Class</h1>
* 
* @author Antoine Baudusseau
* @version 1.0
*
*/
public class FrameTest {

	private Frame frame;
	private Model Model;
	
	/**
	 * Set up test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.frame = new Frame(Model);
	}
}
