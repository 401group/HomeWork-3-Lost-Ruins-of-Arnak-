// Class managing the game, the players, the view and model objects
package game;

public class main {
    public static void main(String[] args){

        // Class Variable
        char choice;


        // Class Objects
        // View/Model objects
        View view = new View();
        Model model = new Model();
        // Create Game object
        Game game = new Game();
        // Create player objects
        Player player1 = new Player();


        // Round Information
        int round = game.getRound();
        int playersTurn = game.getPlayersTurn();
        view.roundStart(round, playersTurn);


        // Round 1 - Player 1's turn
        game.addActionValue(player1);
        choice = view.menu();
        model.playerChoice(choice, player1);
    }
}
