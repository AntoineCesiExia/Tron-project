package view;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.elements.IElements;
import model.IModel;

/**
 * <h1>Panel Class</h1>
 * 
 * @author Antoine Baudusseau
 * @version 1.0
 */
public class Panel extends JPanel implements Observer {

	private static final long serialVersionUID = 1486253681027625508L;
	private IModel model;

	/*
	 * Panel class Constructor
	 */
	public Panel(IModel model) {
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		System.out.println("Affichage");
		this.model = model;
		
		model.getGrid().getLightCycle1().addObserver(this);
		model.getGrid().getLightCycle2().addObserver(this);
	}

	/**
	 * Draw Grid
	 * @param graphics graphic
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void drawGrid(Graphics graphic) throws IOException, InterruptedException {
		//LightCycle 1
		graphic.setColor(model.getGrid().getLightCycle1().getColor());
		
		graphic.fillRect(
			model.getGrid().getLightCycle1().getX()*model.getGrid().getWidth()/model.getGrid().getNbrCellWidth(),
			model.getGrid().getLightCycle1().getY()*model.getGrid().getHeight()/model.getGrid().getNbrCellHeight(),
			model.getGrid().getWidth()/model.getGrid().getNbrCellWidth(),
			model.getGrid().getHeight()/model.getGrid().getNbrCellHeight()
			);
		
		//LightCycle 2
		graphic.setColor(model.getGrid().getLightCycle2().getColor());
		
		graphic.fillRect(	
			model.getGrid().getLightCycle2().getX()*model.getGrid().getWidth()/model.getGrid().getNbrCellWidth(),
			model.getGrid().getLightCycle2().getY()*model.getGrid().getHeight()/model.getGrid().getNbrCellHeight(),
			model.getGrid().getWidth()/model.getGrid().getNbrCellWidth(),
			model.getGrid().getHeight()/model.getGrid().getNbrCellHeight()
			);
		
		//LightCycle's 1 LightWall
		for (IElements element : model.getGrid().getLightCycle1().getLightWall()) {
			graphic.setColor(model.getGrid().getLightCycle1().getColor());
			graphic.fillRect(element.getX()*10, element.getY()*10, 10, 10);
		}
		
		//LightCycle's 2 LightWall
		for (IElements element : model.getGrid().getLightCycle2().getLightWall()) {
			graphic.setColor(model.getGrid().getLightCycle2().getColor());
			graphic.fillRect(element.getX()*10, element.getY()*10, 10, 10);
		}
	}
	
		
	public void paintComponent(Graphics graphic) {
		super.paintComponent(graphic);
		try {
			drawGrid(graphic);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public void update(Observable observable, Object arg) {
		this.repaint();
	}
}