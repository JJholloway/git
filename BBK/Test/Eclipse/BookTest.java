package Eclipse;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class BookTest {

	@Test
	public void testBook() {
		Book b1 = new Book ("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
	}

	@Test 
	public void testGetPerson(){
		Book b2 = new Book("War and peace");
		Person p2 = new Person();
		p2.setName("Elvis");
		
		// method to say that the book is loaned to this person 
		b2.setPerson(p2);
		
		// get the name of the person who has the book 
		
//		Person testPerson = b2.getPerson();
//		
//		String testName = testPerson.getName();
		String testName = b2.getPerson().getName();
		
		assertEquals("Elvis", testName);
		
		
	}
	
	@Test	
	public void TestToString(){
		
		Book b2 = new Book("War and peace");
		Person p2 = new Person();
		p2.setName("Elvis");
		
		assertEquals("War and peace by unknown author; Available", b2.toString());
		
		b2.setPerson(p2);
		
		assertEquals("War and peace by unknown author; checked out to Elvis", b2.toString());
		
	}
}
