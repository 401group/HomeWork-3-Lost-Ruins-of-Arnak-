// Deck class, holds game cards
package game;

import java.util.Random;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cardsInDeck;

    // Constructor
    public Deck(){
        // ArrayList to hold Card objects
        cardsInDeck = new ArrayList<Card>();
    }

    // Add card object to Deck
    public void addCard(Card newCard){
        cardsInDeck.add(newCard);
    }

    // Size of Deck (Getter)
    public int getSize(){
        int sizeOfDeck;
        return sizeOfDeck = cardsInDeck.size();
    }

    // Draw top card from deck (Getter?)
    public Card drawCard(){
        Card topCard = cardsInDeck.get(0);
        cardsInDeck.remove(0);
        return topCard;
    }

}
