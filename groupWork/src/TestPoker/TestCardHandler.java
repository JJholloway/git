package TestPoker;

//import static org.junit.Assert.*;
//import org.junit.Test;

import Poker.PlayHandler;
import Poker.Request;
import Poker.CardRequestHandler;



public class TestCardHandler {

	//@Test
	public void test() {
		PlayHandler classUnderTest = new CardRequestHandler();
		
		Request request = new Request ("cardRequest");
		
		boolean actualOutput = classUnderTest.canHandle(request);
		
		//assertEquals("Handler failed to grab", actualOutput);
		
	}

}


