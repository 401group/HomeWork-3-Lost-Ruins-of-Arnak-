package game;

public class CardTest {

	// This method tests  returns the name of a card
		@Test
		public void returnCardName(){
			Card one = new Card("Exploration", 1, 2); //New card
			
			//Test to see if the name returned is accurate
			assertEquals("Exploration", one.getName());
		}
}

