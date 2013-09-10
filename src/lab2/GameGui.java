/*
 * This GameGui Class would set up the characters and their powers etc.
 * Once the set up was complete the Start Game Button would pass control
 * to the Game Class that will create object for each character and their power,
 * establish the order of play, roll the dice and keep track of each player's
 * score.
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
    private ArrayList<String> characterPower=new ArrayList<String>();
    private static int characterIndex=0;
    private String enteredName;
    private String powerSelected;

    public GameGui() {
    }
 // Button action methods
    
    private void btnCreateCharacter(){
        // this method is to add a new character to the ArrayList of game Characters
        gameCharacters.add(enteredName);
        characterPower.add(powerSelected);
    }
    
    private void btnStartGame(){
        game= new Game(gameCharacters, characterPower);
        
    }
    // public getters
     public int getNumberOfPlayers(){
            return gameCharacters.size();
       
        
    }
    
    
    
    
}
