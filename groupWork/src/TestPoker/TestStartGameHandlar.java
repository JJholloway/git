package TestPoker;

import static org.junit.Assert.*;

import org.junit.Test;

import Poker.PlayHandler;
import Poker.Request;
import Poker.StartGameHandler;

public class TestStartGameHandlar {

	@Test
	public void test() {
		PlayHandler test = new StartGameHandler();
		
		Request request = new Request ("Start");
		
		Boolean  = test.canHandle(request);
		
		assertEquals(1, test);
		
		
	}

}
