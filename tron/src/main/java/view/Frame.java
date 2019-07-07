package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.IModel;

/**
 * <h1>Frame Class</h1>
 *
 * @author Antoine Baudusseau
 * @version 1.0
 */
public class Frame extends JFrame implements KeyListener, view.IView {

	private static final long serialVersionUID = 980608594850156308L;
	private int width;
    private int height;
    private Panel Panel;
    private IModel model;
    
    /**
     * Instantiate a new frame
     * @param model
     */
    public Frame (IModel model) {
    	this.model = model;
    	this.width = model.getGrid().getWidth();
    	this.height = model.getGrid().getHeight();
    	this.Panel = new Panel(this.model);
    	this.setTitle("Tron");
    	this.setContentPane(this.Panel);
	    this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.addKeyListener(this);
		this.setVisible(true);
    }

    /**
     * move LightCycle when a key is pressed
     * @param keyEvent
     */
	public void keyPressed(final KeyEvent keyEvent) {
		switch(keyEvent.getKeyCode()) {
			case KeyEvent.VK_RIGHT : 
				model.getGrid().getLightCycle1().turnRight();
				System.out.println("Player1 Right");
				break;
				
			case KeyEvent.VK_LEFT : 
				model.getGrid().getLightCycle1().turnLeft();
				System.out.println("Player1 Left");
				break;
				
			case KeyEvent.VK_Q : 
				model.getGrid().getLightCycle2().turnRight();
				System.out.println("Player2 Right");
				break;
				
			case KeyEvent.VK_D : 
				model.getGrid().getLightCycle2().turnLeft();
				System.out.println("Player2 Left");
				break;
			default : 
				break;
		}	
	}

	public void keyTyped(final KeyEvent keyEvent) {
	}
	
	public void repaint()
	{
		this.Panel.repaint();
	}
	
	/**
	 * Get Panel
	 * @return Panel
	 */
	public Panel getPanel() {
		return Panel;
	}
	
	/**
	 * Set Panel
	 * @param Panel
	 */
	public void setPanel(Panel Panel) {
		this.Panel = Panel;
	}
	
	/**
	 * Get width
	 * @return width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Set width
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Get height.
	 * @return height
	 */
	public int getHeight() {
		return height;
		
	}
	
	/**
	 * Set height
	 * @param height		
	 */
	public void setHeight(int height) {
		this.height = height;
		
	}
	
	/*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
	public void keyReleased(final KeyEvent keyEvent) {
	}

}