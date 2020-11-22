package game;

public class Game {

    private int round;
    private int playerVal;

    //View view = new View();

    // Constructor
    public Game(){
        round = 1;
        playerVal = 1;
    }

    // Round count increases
    public void nextRound(){
        round++;
    }

    // Round number (Getter)
    public int getRound(){
        return round;
    }

    // Player numbers turn (Getter)
    public int getPlayersTurn(){
        return playerVal;
    }

    // Next player
    public void updatePlayerVal(int value){
        playerVal = value;
    }
}
