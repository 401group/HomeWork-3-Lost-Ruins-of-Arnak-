// Manages the game environment
package game;

public class Game {

    // Private Class Variables
    private int round;
    private int playerVal;

    // Constructor
    public Game(){
        round = 1;
        playerVal = 1;
    }

    // Class Getters
    // Round number (Getter)
    public int getRound(){
        return round;
    }
    // Player numbers turn (Getter)
    public int getPlayersTurn(){
        return playerVal;
    }

    // Class Actions
    // Round count increases
    public void nextRound(){
        round++;
    }
    // Next player
    public void updatePlayerVal(int value){
        playerVal = value;
    }



    public void addActionValue(Player player){
        player.setActionCounter();
    }
}
