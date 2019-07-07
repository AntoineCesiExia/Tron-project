package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.*;
import view.*;

/**
 * <h1>Controller Class</h1>
 *
 * @author AntoineBaudusseau
 * @version 1.0
 */
public class Controller implements IController {

	IView  view;
	IModel model;
	public String player1 = "";
	public String player2 = "";

	/**
	 * Controller Class constructor
	 * @param model
	 * @param view
	 */
	public Controller(IModel model , IView view) {
	    this.view = view;
	    this.model = model;
	}

	/**
	 * Play the game     
	 */   
	public void play() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(player1.length() != 3) {
			System.out.println("Player 1 Name: (3 characters)");
			try {
				player1 = br.readLine();
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		while(player2.length() != 3) {
			System.out.println("Player 2 Name: (3 characters)");
			try {
				player2 = br.readLine();
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	
		//While LightCycle isAlive
		while(model.getGrid().getLightCycle1().isAlive() && model.getGrid().getLightCycle2().isAlive()) {
			
			// Move LightCycle1
			model.getGrid().getLightCycle1().move();
		
			//If LightCycle1 is not alive
			if(model.getGrid().getLightCycle1().isAlive() == false) {
				//Display message
				this.view.displayMessage("Player " + player2 + " Win (Blue)");
				model.getGrid().save(player1, player2);
				String[] podium = model.getGrid().getWinner();
				System.out.println("Podium:");
				for(int i = 0; i<podium.length; i++) {
					System.out.println(i + ": "+podium[i]);
				}
			}
	
			//Move LightCycle2
			model.getGrid().getLightCycle2().move();
		
			//If LightCycle2 is not alive
			if(model.getGrid().getLightCycle2().isAlive() == false) {
				//Display message
				this.view.displayMessage("Player " + player1 + " Win (Red)");
				model.getGrid().save(player1, player2);
				String[] podium = model.getGrid().getWinner();
				System.out.println("Winner:");
				for(int i = 0; i<podium.length; i++) {
					System.out.println(i + ": "+podium[i]);
				}
			}
			
			try {	
				Thread.sleep(150);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}