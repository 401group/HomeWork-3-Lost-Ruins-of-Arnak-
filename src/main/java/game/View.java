// Manages console output display
package game;
import java.util.Scanner;

public class View {

    // Class Objects
    Scanner scan = new Scanner(System.in);


    // Round Start
    public void roundStart(int round, int playerVal){
        System.out.print("Round " + round + " Player " + playerVal + "'s Turn");
    }


    // Player Menu
    public char menu(){
        System.out.println("\nPlayer Menu");
        System.out.println("a - Play Card From Hand ");
        System.out.println("b - Hand Count");
        System.out.println("c - Deck Count");
        System.out.println("d - Gem Count");
        System.out.println("e - Exit Game");
        System.out.println("\nSelect a, b, c, d, or e");
        // Accepts char from scanner
        char choice = scan.next().charAt(0);
        return choice;
    }

    // Player Messages
    // Choose card
    public int chooseCardToPlay(){
        System.out.println("Choose Card to Play");
        int choice = scan.nextInt();
        return choice;
    }
    // Card Information
    public void cardPlayed(Card card){
        System.out.print("Card Played: ");
        System.out.println(card.getName() + " [" + "Value: " + card.getValue() + "  Action: +" + card.getActionVal() + "]");
    }
    // Turn Information
    public void turnUpdater(int turns){
        if (turns == 0){
            System.out.println("Your Turn is Over");
        }
        if (turns > 0){
            System.out.println("Continue Turn");
        }
    }
    // Currency Update Messages
    public void travelUpdater(int value){
        System.out.println("You can now travel by " + value);
    }
    public void compassUpdater(int value){
        System.out.println("Compasses increased by " + value);
    }
    public void goldUpdater(int value){
        System.out.println("Gold increased by " + value);
    }
    // Invalid selection error message
    public void errorMsg(){
        System.out.println("Invalid Selection");
    }
}
