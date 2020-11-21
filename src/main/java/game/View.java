package game;

import java.util.Scanner;

public class View {
    Scanner scan = new Scanner(System.in);

    // Player Menu
    public char menu(){
        System.out.println("\nPlayer Menu");
        System.out.println("a - Play Card From Hand ");
        System.out.println("b - Hand Count");
        System.out.println("c - Deck Count");
        System.out.println("\nSelect a, b, or c");
        // Accepts char from scanner
        char choice = scan.next().charAt(0);
        return choice;
    }
}
