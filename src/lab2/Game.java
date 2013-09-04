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

    public Game() {
    }
    
    private void setNumberOfPlayers(){
        // this method will determine the number of players based on the length
        // of the Players ArrayList
        // numberOfPlayers=playerList.size
        numberOfPlayers=5;
    }
    private void setOrderofPlayers(){
        // this method will get a random number from 1 to number of players and assign 
        // the name of the player with the random number-1 index of playerList to the 
        // orderOfPlayers index that is the same as the for loop index to randomly determine 
        // the order of play
    }
    private int getRandomNumber(){
        return rNum;
    }
    
}
