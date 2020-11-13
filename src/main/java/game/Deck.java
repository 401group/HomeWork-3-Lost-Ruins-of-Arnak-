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

    // Pull from Deck
    public Card pullCard() {
        return cardsInDeck.remove(0);
    }

    // Size of Deck (Getter)
    public int getSize(){
        int sizeOfDeck;
        return sizeOfDeck = cardsInDeck.size();
    }

}
