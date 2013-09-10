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
public class Game {
    private int diceValue;
    private int numberOfPlayers;
    private ArrayList<String> orderOfPlayers = new ArrayList<String>();
    private int rNum;
    private ArrayList<GameCharacter> players = new ArrayList<GameCharacter>();
    private GameWorld playGame;
    private int powerValue;
    private int playerIndex;

    public Game(ArrayList<String> names, ArrayList<String> power) {
        // the constructor will instantiate a GameCharacter for each item in Characters ArrayList
        for (int index=0; index<names.size(); index++){
            
            players.add(new GameCharacter(names.get(index), power.get(index)));
        }
    }
    private void setupPlay(){
        // This method will call the methods to setup the Game,
        // instantiate the Game Object and loop through play
        // until a player exceeds a score of 150
        
        setNumberOfPlayers();
        setOrderOfPlayers();
        playGame = new GameWorld();
        
        // this code will send the die value and the player power value
        players.get(playerIndex).setCharacterScore(playGame.determineScoreAdd(rNum, powerValue));
    }
    
    public void setNumberOfPlayers(){
        // this method will determine the number of players based on the length
        // of the Players ArrayList
        // numberOfPlayers=playerList.size
        numberOfPlayers=5;
        // not sure how to execute line below
       // numberOfPlayers=GameGui.getNumberOfPlayers();
    }
    private void setOrderOfPlayers(){
        // this method will get a random number from 1 to number of players and assign 
        // the name of the player with the random number-1 index of playerList to the 
        // orderOfPlayers index that is the same as the for loop index to randomly determine 
        // the order of play
    }
    private int getRandomNumber(int i){
        // This method receives and int to determine the high end of the
        // random number selection
        
        return rNum;
    }
    
}
