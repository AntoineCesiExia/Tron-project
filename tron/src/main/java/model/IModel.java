package model;

/**
 * <h1>IModel Interface</h1>
 *
 * @author Antoine Baudusseau
 * @version 1.0
 */
public interface IModel {

   /**
    * Get Grid
    */
	public IGrid getGrid();
	
	/**
	 * Set Grid
	 *  @param grid
	 */
	public void setGrid(IGrid grid);
	
}