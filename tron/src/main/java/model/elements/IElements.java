package model.elements;

import java.awt.Color;
import java.util.Observer;

/**
 * <h1>IElements Interface</h1>
 * @author Antoine Baudusseau
 * @version 1.0
 *
 */
public interface IElements {
	
	/**
	 * Get Element's x
	 * @return x
	 */
	public int getX();
	
	/**
	 * Get Element's y
	 * @return y
	 */
	public int getY();
	
	/**
	 * Get Element's Color
	 * @return color
	 */
	public Color getColor();
	
	/**
	 * Add observer
	 * 
	 * @param o
	 * 		param Observer
	 */
	void addObserver(Observer o);
	
}