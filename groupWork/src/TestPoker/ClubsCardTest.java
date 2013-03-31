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

import Poker.ClubsCard;



/**
 * @author jmorri13
 *
 */
public class ClubsCardTest {

	static ClubsCard cc;
	static ClubsCard cc1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cc = new ClubsCard(1);
		cc1 = new ClubsCard(13);
	}

	/**
	 * Test method for {@link Poker.ClubsCard#ClubsCard(int)}.
	 */
	@Test
	public void testClubsCardACE() {
		assertEquals("No card reurned", 1, cc.getValue());
		assertEquals("No card reurned", "Clubs", cc.getSuit());
	}
	public void testClubsCardKing() {
		assertEquals("No card reurned", 13, cc1.getValue());
		assertEquals("No card reurned", "Clubs", cc1.getSuit());
	}

}
