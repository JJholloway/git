package TestPoker;

//import static org.junit.Assert.*;
//import org.junit.Test;

import Poker.PlayHandler;
import Poker.Request;
import Poker.cardRequestHandler;



public class TestCardHandler {

	//@Test
	public void test() {
		PlayHandler classUnderTest = new cardRequestHandler();
		
		Request request = new Request ("cardRequest", 5);
		
		Boolean actualOutput = classUnderTest.canHandle(request);
		
		//assertTrue("Handler failed to grab", actualOutput);
		
	}

}

