package testClass5;

import static org.junit.Assert.*;

import org.junit.Test;

import class5.Airplane;


public class airplaneTest {
	
	@Test 
	public void test(){
		
		String expectedOutput = "Like a fighter jet!";
		String stringRuturned = null; 
		
		Airplane classUnderTest = new Airplane(1);
		
		stringRuturned = classUnderTest.howDoYouFly();
		
		assertEquals("Wrong Answer !", stringRuturned, expectedOutput);
		
			
		//fail("Not yet doing anything");
	}
	

}
