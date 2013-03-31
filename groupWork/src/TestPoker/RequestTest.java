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

import Poker.Request;

/**
 * @author jmorri13
 *
 */
public class RequestTest {
	static Request r1;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		r1 = new Request("Start");
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	/**
	 * Test method for {@link Poker.Request#getRequestType()}.
	 */
	@Test
	public void testGetRequestType() {
		assertEquals("Wrong value returned","Start", r1.getRequestType());
	}

	/**
	 * Test method for {@link Poker.Request#getPlayerResult()}.
	 */
	@Test
	public void testGetPlayerResult() {
		int playerResultToGet = 110;
		r1.setResult(playerResultToGet);
		
		assertEquals("Wrong value returned", 110, r1.getPlayerResult());
	}

	
	/**
	 * Test method for {@link Poker.Request#getDealerResult()}.
	 */
	@Test
	public void testGetDealerResult() {
		int dealerResultToGet =500;
		r1.setDealerResult(dealerResultToGet);
		assertEquals("Wrong value returned", 500, r1.getDealerResult());
	}

	
}
