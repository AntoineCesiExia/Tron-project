package model;

import java.awt.Color;
import model.bdd.*;
import model.elements.*;

/**
 * <h1>Grid class</h1>
 * 
 * @author Antoine Baudusseau
 * @version 1.0
 */
public class Grid implements IGrid, ITime {

	private ILightCycle LightCycle1;
	private ILightCycle LightCycle2;
	private int width = 600;
	private int height = 400;
	private int nbrCellHeight = 40;
	private int nbrCellWidth = 60;
	private Database database = new Database();
	private ITime time;

	/**
	 * Constructor of grid class
	 */
	public Grid() {
		this.LightCycle1 = new LightCycle(2, 2, Color.red, Direction.EST, this);
		this.LightCycle2 = new LightCycle(50, 30, Color.cyan, Direction.OUEST, this);
		this.time = new Time();
		time.start();
	}

	/**
	 * Check collision for LightCycle
	 * 
	 * @param lightcycle
	 *            check collision between LightCycle
	 * 
	 * @return return if there is a collision
	 */
	public boolean checkCollision(LightCycle LightCycle) {
		if (LightCycle.getX() > this.nbrCellWidth || LightCycle.getX() <= 0 || LightCycle.getY() <= 0 || LightCycle.getY() > this.nbrCellHeight) {
			LightCycle.setAlive(false);
			return true;
		}

		for (IElements LightWall : LightCycle1.getLightWall()) {
			if (LightCycle.getX() == LightWall.getX() && LightCycle.getY() == LightWall.getY()) {
				LightCycle.setAlive(false);
				return true;
			}
		}

		for (IElements LightWall : LightCycle2.getLightWall()) {
			if (LightCycle.getX() == LightWall.getX() && LightCycle.getY() == LightWall.getY()) {
				LightCycle.setAlive(false);
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Save method to save the time of the game
	 */
	public void save(String name1, String name2) {
		if (LightCycle1.isAlive()) {
			database.save(name1, (int) time.getTime()/1000000);
		} 
		else {
			database.save(name2, (int) time.getTime()/1000000);
		}
	}

	public void start() {
	}
	
	/**
	 * Get LightCycle1
	 */
	public ILightCycle getLightCycle1() {
		return LightCycle1;
	}

	/**
	 * Set LightCycle1
	 * @param LightCycle1
	 */
	public void setLightCycle1(LightCycle LightCycle1) {
		this.LightCycle1 = LightCycle1;
	}

	/**
	 * Get LightCycle2
	 */
	public ILightCycle getLightCycle2() {
		return LightCycle2;
	}

	/**
	 * Set LightCycle2
	 * @param LightCycle2
	 */
	public void setLightCycle2(LightCycle LightCycle2) {
		this.LightCycle2 = LightCycle2;
	}

	/**
	 * Get map width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Set map width
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Get map height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Set map height
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Get cells number on height
	 */
	public int getNbrCellHeight() {
		return nbrCellHeight;
	}

	/**
	 * Set cells number on height
	 * @param nbCelsHeight
	 */
	public void setNbrCellHeight(int nbrCellHeight) {
		this.nbrCellHeight = nbrCellHeight;
	}

	/**
	 * Get cells number on width
	 */
	public int getNbrCellWidth() {
		return nbrCellWidth;
	}

	/**
	 * Set cells number on width
	 * @param nbCelsHeight
	 */
	public void setNbrCellWidth(int nbrCellWidth) {
		this.nbrCellWidth = nbrCellWidth;
	}

	/**
	 * Get timer
	 */
	public ITime getTimer() {
		return time;
	}

	/**
	 * Get time
	 */
	public double getTime() {
		return 0;
	}
	
	/**
	 * Get Podium
	 */
	public String[] getWinner() {
		return database.getWinner();
	}

}
