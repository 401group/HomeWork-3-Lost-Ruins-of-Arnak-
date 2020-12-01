// Card class for various types of game cards
package game;

public class Card {

    // Private Class Variables
    // Name of card
    private String name;
    // Value on the card
    private int value;
    // Action Value
    private  int actionVal;


    // Constructor
    public Card(String name, int value, int actionVal){
        this.name = name;
        this.value = value;
        this.actionVal = actionVal;
    }


    // Class Getters
    // Card Name
    public String getName(){
        return name;
    }
    // Card Value
    public int getValue(){
        return value;
    }
    // Override the toString method to print name of
    // the card and not the object address
    public String toString(){
        return name + " [" + "Value: " + value + "  Action: +" + actionVal + "]";
    }



    public int getActionVal(){
        return actionVal;
    };

}


