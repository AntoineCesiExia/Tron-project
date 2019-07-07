package model.elements;

import java.awt.Color;
import java.util.Observable;

/**
* <h1>Elements Class</h1>
* 
* @author Antoine Baudusseau
* @version 1.0
*/
public class Elements extends Observable implements IElements {
	
	protected int x;
	protected int y;
	protected Color Color;
	
	/**
	 * Elements Class constructor
	 * 
	 * @param x the x
	 * @param y the y 
	 * @param color the color
	 */
	public Elements(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.Color = color;
	}
	
	/**
	 * Get x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Set x
	 * @param x
	 */
	public void setX(int x) {
		 this.x = x;
	}

	
	/**
	 * Get y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Set y
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Get Color
	 */
	public Color getColor() {
		return Color;
	}
	
	/**
	 * Set Color Element
	 * @param color
	 */
	public void setColor( Color color) {
		this.Color = color;
	}

}