package model;

/**
 * <h1>Model class</h1>
 * 
 * @author Antoine Baudusseau
 * @version 1.0
 */
public class Model implements IModel {
	
	private IGrid grid;
	
	/**
	 * get Grid
	 * @return return grid
	 */
	public IGrid getGrid() {
		return grid;
	}

	/**
	 * Set Grid
	 * @param grid
	 */
	public void setGrid(IGrid grid) {
		this.grid = grid;
	}
}
