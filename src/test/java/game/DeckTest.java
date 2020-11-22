package game;

public class DeckTest{

	public DeckTest() {
	}
	
	// This method tests  returns the size of a Deck
	@Test
	public void returnSizeOfHand(){
		Card one = new Card("Fear", 1, 2);//New Card
		Card two = new Card("Gold", 5, 7);//New Card
		Deck d1 = new Deck();
		
		//New cards added to Deck
		d1.addCard(one); 
		d1.addCard(two);
		
		//Test to see if size is equal to 2
		assertEquals(2, h1.getSize());
	}
}
