// Deck class, holds game cards
package game;
import java.util.ArrayList;

public class Deck {

    // Private Class Variables
    // ArrayList to hols Card objects
    private ArrayList<Card> cardsInDeck;

    // Constructor
    public Deck(){
        // ArrayList to hold Card objects
        cardsInDeck = new ArrayList<Card>();
    }


    // Class Getters
    // Size of Deck
    public int getSize(){
        int sizeOfDeck;
        return sizeOfDeck = cardsInDeck.size();
    }


    // Class Actions
    // Draw top card from deck
    public Card drawCard(){
        Card topCard = cardsInDeck.get(0);
        cardsInDeck.remove(0);
        return topCard;
    }
    // Add card object to Deck
    public void addCard(Card newCard){
        cardsInDeck.add(newCard);
    }
}
