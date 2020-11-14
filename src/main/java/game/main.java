package game;

public class main {
    public static void main(String[] args){

        char choice;

        // View/Model objects
        View view = new View();
        Model model = new Model();
        // Create players
        Player player1 = new Player();
        Player player2 = new Player();

        // Game Start
        // Round 1 - Player 1's turn
        choice = view.menu();
        model.playerChoice(choice, player1);
        // Round 1 - Player 2's turn
        choice = view.menu();
        model.playerChoice(choice, player2);
    }
}
