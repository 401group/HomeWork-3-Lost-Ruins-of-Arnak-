// Hand class for each player, holds all of the cards available for play
package game;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cardsInHand;

    // Constructor
    Hand(){
        cardsInHand = new ArrayList<Card>();
    }

    // Add card to hand
    public void addToHand(Card newCard){
        cardsInHand.add(newCard);
    }

    // Size of hand (Getter)
    public int getSize(){
        return cardsInHand.size();
    }

    // View cards in hand (Getter)
}
