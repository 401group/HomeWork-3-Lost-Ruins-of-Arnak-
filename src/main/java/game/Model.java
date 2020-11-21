package game;

public class Model {
    // Player Menu Selection
    public char playerChoice(char pInput, Player player){

        switch(pInput){
            case 'a' : case 'A':
                // Option to play card from hand
                System.out.println("\nCards in My Hand - ");
                player.playersHand.printHand();
                break;
            case 'b' : case 'B':
                // Returns the total cards in the players hand
                player.sizeOfHand();
                break;
            case 'c' : case 'C':
                // Returns the total cards in the players deck
                player.sizeOfDeck();
                break;
            default:
                player.errorMsg();
        }
        return pInput;
    }
}
