package main;

import controller.*;
import model.*;
import view.*;

/**
* <h1>App Class</h1>
*
* @author Antoine Baudusseau
* @version 1.0
*/
public abstract class App {

    /**
     * main method
     * @param args
     */
    public static void main(final String[] args) {
    	//Load model
        final IModel model = new Model();
        
        // Set grid
        model.setGrid(new Grid());
        
        //Load view with model
        final IView view = new Frame(model);
        
        //Load controller
        IController game = new Controller(model, view);
        
        //Start game
        game.play();      
    }
}