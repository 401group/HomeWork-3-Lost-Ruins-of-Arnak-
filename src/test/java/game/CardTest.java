package game;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

	// This method tests  returns the name of a card
		@Test
		public void returnCardName(){
			Card one = new Card("Exploration", 1, 2); //New card
			
			//Test to see if the name returned is accurate
			assertEquals("Exploration", one.getName());
		}
	
	// This method tests the value of a card
		@Test
		public void returnCardValue(){
			Card one = new Card("Fear", 5, 4); //New card
			
			//Test to see if the wrong value is returned
			assertNotEquals(3, one.getValue());
		}
}
