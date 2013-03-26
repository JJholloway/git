package TestPoker;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Poker.CardFactory;
import Poker.Deck;
import Poker.iCard;

public class TestDeck {

	@Test
	public void test() {
		
	//Deck.getRequestedCards(5);
		
	assertEquals(5, Deck.getRequestedCards(5));
		}

}
