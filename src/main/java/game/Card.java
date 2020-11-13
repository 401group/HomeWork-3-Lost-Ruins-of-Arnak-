// Card class for all the various types of game cards
package game;

public class Card {

    // Name of card
    private String name;
    // Value on the card
    private int value;

    // Array of card names
    private static String[] names = {"Gold", "Exploration", "Fear"};

    // Constructor
    public Card(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }
}
