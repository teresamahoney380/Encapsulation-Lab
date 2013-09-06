/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Teresa Mahoney
 */
public class GameCharacter {
    private String characterName;
    private String characterPower;
    private String characterStatus;
    private int characterScore;

    public GameCharacter(String name) {
        this.characterName=name;
    }

    private void setCharacterScore(int characterScore) {
        this.characterScore = characterScore;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterPower() {
        return characterPower;
    }

    public void setCharacterPower(String characterPower) {
        this.characterPower = characterPower;
    }

    public String getCharacterStatus() {
        return characterStatus;
    }

    public void setCharacterStatus(String characterStatus) {
        this.characterStatus = characterStatus;
    }
    
    
    
    
}
