package TestPoker;

import static org.junit.Assert.*;

import org.junit.Test;

import Poker.CardFactory;
import Poker.Deck;

public class TestCardFactory {

	@Test
	public void test() {

		assertEquals(Deck.getInstance(),CardFactory.getDeck());
	}

}
