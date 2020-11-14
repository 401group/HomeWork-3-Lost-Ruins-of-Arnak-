// Player class
// Each player has a Hand, a Deck, various currencies
package game;

public class Player {

    // Currencies
    private int gold = 0;
    private int compass = 0;
    // Player's Deck object
    Deck playersDeck = new Deck();
    // Players Hand object
    Hand playersHand = new Hand();


    // Constructor
    // Player begins with 6 cards in their deck (Gold x2, Compass x2, Fear x2)
    // and draws 5 cards randomly to form the players starting hand. The
    // player also begins with gold currency (1) and compass currency (1)
    public Player(){
        // Starting Currency
        gold = 1;
        compass = 1;

        // Starting Deck
        Card goldCard = new Card("Gold", 1);
        Card exploration = new Card("Exploration", 1);
        Card fear = new Card("Fear", 0);
        // Add staring cards (6) to Players starting deck
        // Gold card x2
        playersDeck.addCard(goldCard);
        playersDeck.addCard(goldCard);
        // Exploration card x2
        playersDeck.addCard(exploration);
        playersDeck.addCard(exploration);
        // Fear card x2
        playersDeck.addCard(fear);
        playersDeck.addCard(fear);

        // Starting Hand (5) cards drawn from the playersDeck
        playersHand.addToHand(playersDeck.drawCard());
        playersHand.addToHand(playersDeck.drawCard());
        playersHand.addToHand(playersDeck.drawCard());
        playersHand.addToHand(playersDeck.drawCard());
        playersHand.addToHand(playersDeck.drawCard());
    }


    // Player's Deck Count (Getter)
    public void sizeOfDeck(){
        System.out.println(playersDeck.getSize());
    }

    // Player's Hand Count (Getter)
    public void sizeOfHand(){
        System.out.println(playersHand.getSize());
    }

    // Draw from playersDeck
    public void drawFromDeck(){
        playersDeck.drawCard();
    }

}
