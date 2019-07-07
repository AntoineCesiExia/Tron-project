package model;

import model.elements.*;

/**
 * <h1>IGrid Interface</h1>
 * 
 * @author Antoine Baudusseau
 * @version 1.0
 */
public interface IGrid {

	/**
	 * get Cells number on height
	 * @return return Cells number on height
	 */
	public int getNbrCellHeight();
	
	/**
	 * get Cells number on width
	 * @return return Cells number on width
	 */
	public int getNbrCellWidth();
	
	/**
	 * get width
	 * @return return width
	 */
	public int getWidth();
	
	/**
	 * get height
	 * @return return height
	 */
	public int getHeight();
	
	/**
	 * get LightCycle1
	 * @return return LightCycle1
	 */
	public ILightCycle getLightCycle1();
	
	/**
	 * get LightCycle2
	 * @return return LightCycle2
	 */
	public ILightCycle getLightCycle2();
	
	public void save(String name1, String name2);

	/**
	 * get Podium
	 * @return Podium
	 */
	String[] getWinner();
}