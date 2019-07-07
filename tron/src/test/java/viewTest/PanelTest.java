package viewTest;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

import view.*;
import model.*;

/**
* <h1>PanelTest Class</h1>
* 
* @author Antoine Baudusseau
* @version 1.0
*
*/
public class PanelTest {

	private Panel Panel;
	private Model Model;
	
	/**
	 * Set up test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.Panel = new Panel(Model);
	}
}
