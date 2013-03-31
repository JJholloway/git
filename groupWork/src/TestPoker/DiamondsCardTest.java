/**
 * 
 */
package TestPoker;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

import Poker.DiamondsCard;


/**
 * @author jmorri13
 *
 */
public class DiamondsCardTest {

	static DiamondsCard dc;
	static DiamondsCard dc1;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dc = new DiamondsCard(1);
		dc1 = new DiamondsCard(13);
	}

	
	/**
	 * Test method for {@link Poker.DiamondsCard#DiamondsCard(int)}.
	 */
	@Test
	public void testDiamondsCardACE() {
		assertEquals("No card reurned", 1, dc.getValue());
		assertEquals("No card reurned", "Diamonds", dc.getSuit());
	}

	
	@Test
	public void testDiamondsCardKing() {
		assertEquals("No card reurned", 13, dc1.getValue());
		assertEquals("No card reurned", "Diamonds", dc1.getSuit());
	}

}
