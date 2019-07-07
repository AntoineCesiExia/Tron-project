package model.elements;

import java.awt.Color;
import java.util.ArrayList;
import model.*;

/**
 * <h1>LightCycle Class</h1>
 * 
 * @author Antoine Baudusseau
 * @version 1.0
 */
public class LightCycle extends Elements implements ILightCycle, IElements {
	
	private Direction direction;
	public ArrayList<IElements> LightWall = new ArrayList<IElements>();
	boolean alive = true;
	public Grid Grid;
	
	/**
	 * LightCycle Class constructor
	 * @param x the x
	 * @param y the y
	 * @param color the color
	 * @param direction the direction
	 * @param grid the grid
	 */
	public LightCycle(int x, int y, Color color, Direction direction, Grid grid) {
		super(x, y, color);	
		this.direction = direction;
		this.Grid = grid;
	}
	
	/**
	 * move method for LightCycle
	 */
	public void move() {
		this.LightWall.add(0, new LightWall(this.x, this.y, this.Color));
		
		switch (this.direction) {
			case EST : 
				this.x=x+1;
				break;
			case NORD : 
				this.y=y-1;
				break;
			case OUEST : 
				this.x=x-1;
				break;
			case SUD : 
				this.y=y+1;
				break;
			default : break;
		}
		
		Grid.checkCollision(this);
		this.setChanged();
		this.notifyObservers();
	}
	
	/**
	 * isAlive method use to know if the LightCycle is alive
	 * @return if LyghtCycle is alive
	 */
	public boolean isAlive() {
		return alive;
	}
	
	/**
	 * Set status of lightcycle
	 * @param alive
	 * 				set the status
	 */
	public void setAlive(boolean alive) {
		this.alive =alive;
	}

	/**
	 * @see model.ILightCycle#getParticles()
	 */
	public ArrayList<IElements> getLightWall() {
		return LightWall;
	}

	/**
	 * turnRight method for LightCycle
	 */
	public void turnRight() {
		switch(this.direction) {
			case NORD :
				direction = Direction.EST;
				break;			
			case EST : 
				direction = Direction.SUD;
				break;		
			case SUD : 
				direction = Direction.OUEST;
				break;		
			case OUEST : 
				direction = Direction.NORD;
				break;
		}
	}

	/**
	 * turnLeft method for LightCycle
	 */
	public void turnLeft() {
		switch(this.direction) {
			case NORD : 
				direction = Direction.OUEST;
				break;
							
			case EST : 
				direction = Direction.NORD;
				break;
							
			case SUD : 
				direction = Direction.EST;
				break;
							
			case OUEST : 
				direction = Direction.SUD;
				break;
		}
	}

	/**
	 * Get the Direction
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * Set the Direction
	 */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
		
}