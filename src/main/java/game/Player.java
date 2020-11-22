// Player class
// Each player has a Hand, a Deck, various currencies
package game;

public class Player {

    // Moves per turn
    private int actionCounter = 0;

    // Currencies
    private int gold = 0;
    private int compass = 0;
    // Player's Deck object
    Deck playersDeck = new Deck();
    // Players Hand object
    Hand playersHand = new Hand();

    View view = new View();
    Model model = new Model();

    // Constructor
    // Player begins with 6 cards in their deck (Gold x2, Compass x2, Fear x2)
    // and draws 5 cards randomly to form the players starting hand. The
    // player also begins with gold currency (1) and compass currency (1)
    public Player(){
        // Starting Currency
        gold = 1;
        compass = 1;

        // Starting Deck
        Card goldCard = new Card("Gold", 1, 1);
        Card exploration = new Card("Exploration", 1, 1);
        Card fear = new Card("Fear", 1, 0);
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

    // Every turn the player begins with one action
    // Returns the value of the actionCounter (getter)
    public int getActionCounter(){
        return actionCounter;
    }
    // Displays action count
    public void printActionCount(){
        System.out.println(actionCounter);
    }
    // Updates actionCounter
    public void updateActionCounter(int updateValue){
        actionCounter = actionCounter + updateValue;
    }
    // Restore actionCounter (Setter)
    public void setActionCounter(){
        actionCounter = 1;
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

    // Print cards in hand
    public void printPlayersHand(){
        System.out.println("\nCards in My Hand - ");
        playersHand.printHand();
    }

    // Play card from hand
    public void playCardFromHand(){
        int choice = view.chooseCardToPlay();

    }

    // Invalid selection error message
    public void errorMsg(){
        System.out.println("Invalid Selection");
    }



}
