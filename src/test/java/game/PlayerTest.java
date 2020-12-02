package game;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

	// When creating the player object, the player needs to begin the
	// game with a deck of 6 cards = Gold(2) + Exploration(2) + Fear(2).
	// After drawing 5 of the cards from the deck, 1 card remains in the
	// deck while 5 cards are now in the players hand.

	// This tests that the initial player setup by the constructor was
	// performed correctly with 5 of the 6 starting cards in the players
	// hand and the remaining card in the players deck
	@Test
	public void playerObjectConstructorDeck() {
		// Instance of Player object
		Player player = new Player();
		// Players Deck expecting 1
		assertEquals(1, player.playersDeck.getSize());
	}

	// Remaining 5 cards in the players hand
	@Test
	public void playerObjectConstructorHand() {
		// Instance of Player object
		Player player = new Player();
		// Players Hand expecting 5
		assertEquals(5, player.playersHand.getSize());
	}


	// When a player plays a card from their hand the discard pile increases
	@Test
	public void playCardFromHandToDiscardTest(){
		Player player = new Player();
		// Card from hand is stored in card object
		Card card = player.playersHand.getCardsInHand(1);
		// Adds card to players discard pile
		player.playersDiscardPile.addCard(card);
		// Removes card from players hand
		player.playersHand.moveToDiscard(card);
		assertEquals(1, player.playersDiscardPile.getSize());
	}

	// When a player plays a card from their hand, their hand decreases
	@Test
	public void playCardFromHandTest(){
		Player player = new Player();
		// Card from hand is stored in card object
		Card card = player.playersHand.getCardsInHand(1);
		// Adds card to players discard pile
		player.playersDiscardPile.addCard(card);
		// Removes card from players hand
		player.playersHand.moveToDiscard(card);
		assertEquals(4, player.playersHand.getSize());
	}


	// When a card ia played, depending on the card, a specific action
	// should take place; increasing a currency, adding 1 to their
	// turn counter
	// This tests whether the Gold card will increase the players Gold currency
	@Test
	public void cardTaskCurrencyTest(){
		Player player = new Player();
		player.cardTask(player.playersHand.getCardsInHand(1), player);
		assertEquals(2, player.getGold());
	}

	// This tests whether the player is allowed to continue their turn when
	// playing a card that allows them to do so. The value 1 indicates 1 more
	// move is possible
	@Test
	public void cardTaskTurnTest(){
		Player player = new Player();
		player.cardTask(player.playersHand.getCardsInHand(1), player);
		assertEquals(1, player.getActionCounter());
	}
}
