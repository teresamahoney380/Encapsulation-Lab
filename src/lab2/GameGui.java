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
        // this methhod is to instantiate a GameCharacter for each item in Characters ArrayList
        for (int index=0; index<gameCharacters.size(); index++){
            enteredName=gameCharacters.get(index);
            gameCharacters.get(index).equals(new GameCharacter(enteredName));
        }
    }
    // public getters
     public int getNumberOfPlayers(){
            return gameCharacters.size();
       
        
    }
    
    
    
    
}
