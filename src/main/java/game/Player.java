// Player class
// Each player has a Hand, a Deck, various currencies
package game;

public class Player {

    // Private Class Variables
    // Moves per turn
    private int actionCounter = 0;
    // Currencies
    private int gold = 0;
    private int compass = 0;
    private int travel = 0;


    // Player Objects
    // Player's Deck object
    Deck playersDeck = new Deck();
    Deck playersDiscardPile = new Deck();
    // Players Hand object
    Hand playersHand = new Hand();
    // View object
    View view = new View();


    // Constructor
    // Player begins with 6 cards in their deck (Gold x2, Compass x2, Fear x2)
    // and draws 5 cards randomly to form the players starting hand. The
    // player also begins with gold currency (1) and compass currency (1)
    public Player(){
        // Initial Currencies, Deck, and Hand
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


    // Class Getters
    // Every turn the player begins with one action
    // Returns the value of the actionCounter (getter)
    public int getActionCounter(){
        return actionCounter;
    }
    // Player's Deck Count (Getter)
    public void sizeOfDeck(){
        System.out.println(playersDeck.getSize());
    }
    // Player's Hand Count (Getter)
    public void sizeOfHand(){
        System.out.println(playersHand.getSize());
    }


    // Class Actions
    // Variable Updaters
    // Updates actionCounter
    public void updateActionCounter(int updateValue){
        actionCounter = actionCounter + updateValue;
    }
    // Restore actionCounter (Setter)
    public void setActionCounter(){
        actionCounter = 1;
    }
    // Print cards in hand
    public void printPlayersHand(){
        System.out.println("\nCards in My Hand - ");
        playersHand.printHand();
    }
    // Updates Gold Currency
    public void updateGold(Player player, int amount){
        player.gold = player.gold + amount;
    }
    // Updates Compass Currency
    public void updateCompass(Player player, int amount){
        player.compass = player.compass + amount;
    }
    // Updates Travel Currency
    public void updateTravel(Player player, int amount){
        player.travel = player.travel + amount;
    }

    // Play card from hand
    public void playCardFromHand(Player player){
        // Value passed from user
        int choice = view.chooseCardToPlay();
        // Card from hand is stored in card object
        Card card = playersHand.getCardsInHand(choice - 1);
        // Prints the selected card
        view.cardPlayed(card);
        // Performs the cards task
        cardTask(card, player);
        // Adds card to players discard pile
        playersDiscardPile.addCard(card);
        // Removes card from players hand
        playersHand.moveToDiscard(card);
        updateActionCounter(-1);
    }

    // Performs actions specified by card object
    public void cardTask(Card card, Player player){
        switch (card.getName()){
            case "Gold":
                updateGold(player, 1);
                view.goldUpdater(1);
                updateActionCounter(card.getActionVal());
                view.turnUpdater(getActionCounter());
                break;
            case "Exploration":
                updateCompass(player, 1);
                view.compassUpdater(1);
                updateActionCounter(card.getActionVal());
                view.turnUpdater(getActionCounter());
                break;
            case "Fear":
                updateTravel(player, 1);
                view.travelUpdater(1);
                updateActionCounter(card.getActionVal());
                view.turnUpdater(getActionCounter());
                break;
        }
    }
}
