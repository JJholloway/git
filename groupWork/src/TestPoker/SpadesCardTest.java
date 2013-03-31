package TestPoker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Poker.SpadesCard;

public class SpadesCardTest {

	static SpadesCard sc;
	static SpadesCard sc1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sc = new SpadesCard(1);
		sc1 = new SpadesCard(13);
		
	}

	@Test
	public void testSpadesCardACE() {
		assertEquals("No card reurned", 1, sc.getValue());
		assertEquals("No card reurned", "Spades", sc.getSuit());
	}

	
	@Test
	public void testSpadesCardKing() {
		assertEquals("No card reurned", 1, sc1.getValue());
		assertEquals("No card reurned", "Spades", sc1.getSuit());
	}

}
