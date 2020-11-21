// Card class for all the various types of game cards
package game;

public class Card {

    // Name of card
    private String name;
    // Value on the card
    private int value;
    // Action Value
    private  int actionVal;

    // Array of card names
    private static String[] names = {"Gold", "Exploration", "Fear"};

    // Constructor
    public Card(String name, int value, int actionVal){
        this.name = name;
        this.value = value;
        this.actionVal = actionVal;
    }

    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }

    // Override the toString method to print name of
    // the card and not the object address
    public String toString(){
        return name + " [" + "Value: " + value + "  Action: +" + actionVal + "]";
    }
}
