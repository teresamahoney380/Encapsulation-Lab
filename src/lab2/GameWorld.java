/*
 * Based on value of Dice roll and power of character determine amount added or
 * subtracted from player's score
 */
package lab2;

/**
 *
 * @author Teresa Mahoney
 */
public class GameWorld {

    public GameWorld() {
    }
    
    public int determineScoreAdd(int dice, int power){
        return dice*power;
        
    }
    
}
