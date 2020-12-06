// Model class used to manage the control of the program
package game;

public class Model {

    View view = new View();

    // Player Menu Selection
    public char playerChoice(char pInput, Player player){
        switch(pInput){
            case 'a' : case 'A':
                // Option to play card from hand
                // Prints hand to console
                player.printPlayersHand();
                // Choice made by player
                player.playCardFromHand(player);
                break;
            case 'b' : case 'B':
                // Returns the total cards in the players hand
                player.sizeOfHand();
                break;
            case 'c' : case 'C':
                //Returns the total cards in the players deck
                player.sizeOfDeck();
                break;
            case 'd' : case 'D':
                // Returns the total gems in the players possession
            	player.numOfGems();
                break;
            case 'e' : case 'E':
                //Exits Game
                System.out.println("Thank you.");
                System.exit(0);
                break;
            default:
                view.errorMsg();
        }
        return pInput;
    }


    // Card selection
    public int selectedCard(int pInput){
        return pInput;
    }
}
