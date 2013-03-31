/**
 * 
 */
package TestPoker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import Poker.DiamondsCard;
import Poker.HeartsCard;

/**
 * @author jmorri13
 *
 */
public class HeartsCardTest {
	
	static HeartsCard hc;
	static HeartsCard hc1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		hc = new HeartsCard(1);
		hc1 = new HeartsCard(13);
	}


	/**
	 * Test method for {@link Poker.HeartsCard#HeartsCard(int)}.
	 */
	@Test
	public void testHeartsCardACE() {
		//assertEquals("No card reurned", "Ace of Hearts", HC );
		assertEquals("No card reurned", 1, hc.getValue());
		assertEquals("No card reurned", "Hearts", hc.getSuit());
		
	}

	@Test
	public void testHeartsCardKing() {
		assertEquals("No card reurned", 13, hc1.getValue());
		assertEquals("No card reurned", "Hearts", hc1.getSuit());
	}
}
