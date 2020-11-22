package game;
import static org.junit.Test;

import org.junit.Assert.asserEquals;

public class HandTestDriver {

	public HandTestDriver() {
	}
	
	// This method tests  returns the size of a players hand
	@Test
	public void returnSizeOfHand(){
		Card one = new Card("FearCard", 1, 2); //New card
		Hand h1 = new Hand();
		
		//New card added to players hand
		h1.addToHand(one); 
		
		//Test to see if size is equal to 1
		assertEquals(expected: 1, h1.getSize());
	}
}
