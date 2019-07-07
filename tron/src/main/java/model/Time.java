package model;

/**
* <h1>Time class</h1>
*
* @author AntoineBaudusseau
* @version 1.0
*/
public class Time implements ITime{
	
	private double time;
	
	/**
	 * Time Class Constructor
	 */
	public Time() {
		time=0;
	}
	
	/**
	 * start method to start timer
	 */
	public void start() {
		this.time=System.currentTimeMillis();
	}
	
	/**
	 * stop method to stop timer
	 */
	public void stop() {
		this.time=(System.currentTimeMillis()-time)/1000;
	}
	
	/**
	 * get time
	 * @return return time
	 */
	public double getTime() {
		return this.time;
	}

}