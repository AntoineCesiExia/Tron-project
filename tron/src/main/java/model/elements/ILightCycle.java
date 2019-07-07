package model.elements;

import java.util.ArrayList;

/**
 * <h1>ILightcycle Interface</h1>
 * 
 * @author Antoine Baudusseau
 * @version 1.0
 *
 */
public interface ILightCycle extends IElements {

	/**
	 *  Move LightCycle
	 */
	public void move();
	
	/**
	 * Get lightcycle's LightWall
	 * @return return lightcycle's LightWall
	 */
	public ArrayList<IElements> getLightWall();
	
	/**
	 * turnLeft method for LightCycle
	 */
	public void turnLeft();
	
	/**
	 * turnRight method for LightCycle
	 */
	public void turnRight();
	
	/**
	 * isAlive method to check if LightCycle is alive
	 * @return if LyghtCycle is alive
	 */
	public boolean isAlive();
	
}