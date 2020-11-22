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

    // Print cards in hand (Getter)
    public void printHand(){
        for(int i = 0; i < cardsInHand.size(); i++){
            System.out.print(i + 1 + " - ");
            System.out.println(cardsInHand.get(i));
        }
    }

    public Card getCardsInHand(int value){
        return cardsInHand.get(value);
    }
}
