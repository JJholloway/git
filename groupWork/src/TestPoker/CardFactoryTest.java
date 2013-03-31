package TestPoker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Poker.CardFactory;

public class CardFactoryTest {

	
	@Test
	// Test the shuffle
	public void testGetDeck() {
		assertFalse("Shuffle has not worked", CardFactory.getDeck()== CardFactory.getDeck());
	}
	
	// test that a Deck has been created
	@Test 
	public void testGetDeck1(){
		assertNotNull("no deck was created", CardFactory.getDeck());
	}

}
