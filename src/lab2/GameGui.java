/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class GameGui {
    private GameCharacter gameCharacter;
    private Game game;
    private ArrayList<String> gameCharacters=new ArrayList<String>();
    private static int characterIndex=0;
    private String enteredName;

    public GameGui() {
    }
 // Button action methods
    
    private void btnCreateCharacter(){
        // this method is to add a new character to the ArrayList of game Characters
        gameCharacters.add(enteredName);        
    }
    
    private void btnStartGame(){
        game= new Game(gameCharacters);
        
    }
    // public getters
     public int getNumberOfPlayers(){
            return gameCharacters.size();
       
        
    }
    
    
    
    
}
