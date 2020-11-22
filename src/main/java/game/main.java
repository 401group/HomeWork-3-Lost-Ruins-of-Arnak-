package game;

public class main {
    public static void main(String[] args){

        char choice;

        // View/Model objects
        View view = new View();
        Model model = new Model();
        // Create Game Object
        Game game = new Game();
        // Create players
        Player player1 = new Player();
        Player player2 = new Player();


        // Game Start
        int round = game.getRound();
        int playersTurn = game.getPlayersTurn();
        view.roundStart(round, playersTurn);

        //view.gameKeeper();
        // Round 1 - Player 1's turn
        choice = view.menu();
        model.playerChoice(choice, player1);



        /*
        // Round 1 - Player 2's turn
        choice = view.menu();
        model.playerChoice(choice, player2);
    */

    }
}
