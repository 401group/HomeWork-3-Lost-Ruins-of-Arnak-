// Hand class for each player, holds all of the cards available for play
package game;
import java.util.ArrayList;

public class Hand {

    // Private Class Variables
    // ArrayList to the Players Card objects
    private ArrayList<Card> cardsInHand;


    // Constructor
    Hand(){
        cardsInHand = new ArrayList<Card>();
    }


    // Class Getters
    // Size of hand (Getter)
    public int getSize(){
        return cardsInHand.size();
    }
    // Print cards in hand (Getter)
    public void printHand(){
        for(int i = 0; i < cardsInHand.size(); i++){
            System.out.print(i + 1 + " - ");
            System.out.println(cardsInHand.get(i));
        }
    }
    // Returns card selected by player
    public Card getCardsInHand(int value){
        return cardsInHand.get(value);
    }


    // Class Actions
    // Add card to hand
    public void addToHand(Card newCard){
        cardsInHand.add(newCard);
    }
    // Remove card from hand and place in discard pile
    public void moveToDiscard(Card removeCard){
        cardsInHand.remove(removeCard);
    }
}
