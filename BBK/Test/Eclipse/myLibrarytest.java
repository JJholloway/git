package Eclipse;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class myLibrarytest {

private Book b1;
private Book b2;
private Person p1;
private Person p2;
private myLibrary ml;

// test constructer 
	@Test
	public void testMyLibrary() {
		myLibrary ml = new myLibrary("Test");
		assertEquals("Test", ml.name);
		
		assertTrue(ml.book instanceof ArrayList);
		assertTrue(ml.people instanceof ArrayList);
		
		
	}
	
	public void setup (){
		
		b1 = new Book ("book1");
		b2 = new Book ("book2");
		
		p1 = new Person();
	    p2 = new Person();
	    
	    p1.setName("Fred");
	    p2.setName("Sue");
	    
	    ml = new myLibrary("test");
	    
	    // the problam is that at the moment all of the variables are local 
	    // we need to turn them into a feild of the class 
	    // to do this we got to refactor and click convert local veriables to feilds 
	        
	}

	@Test
	public void addBook(){
	// lets run the setup method to create the tests objects 
		setup();
		
	// create an initial test 
		
		assertEquals(0, ml.getBook().size());
		
	ml.addBook(b1);
	ml.addBook(b2);
	
	assertEquals(2, ml.getBook().size());
	assertEquals(0, ml.getBook().indexOf(b1));
	
	assertEquals(1, ml.getBook().indexOf(b2));
	
	ml.removeBook(b1);
	assertEquals(1, ml.getBook().size());
	assertEquals(0, ml.getBook().indexOf(b2));
	
	ml.removeBook(b2); 
	assertEquals(0, ml.getBook().size());
	
	ml.addPerson(p1);
	ml.addPerson(p2);
	
	//p1.getName()
	}
	
	// lets create a check out method 
	@Test
	public void checkOut (){
		
		// lets setup the object 
		
		setup(); 
		
		addItems();
		
		assertTrue("Book did not get checked out correctly", ml.checkOut(b1,p1));
		
		assertEquals("Fred", b1.getPerson().getName());
		
		
		assertFalse("book was already checked out", ml.checkOut(b1,p2));
		
		assertTrue("book chekc in falied", ml.checkIn(b1));
		
		assertFalse("Book was already check in", ml.checkIn(b1));
		
		assertFalse("Book was never checked out", ml.checkIn(b2));
		
		
		// additional test for maximum books 
		
		setup();
		p1.setMaximunBooks(1);
		addItems();
		
		assertTrue("Person has checked too many books!!", ml.checkOut(b2, p1));
		
		assertFalse("Second book should no have checked out", ml.checkOut(b1, p1));
		
			
	}

	private void addItems() {
		ml.addBook(b1);
		ml.addBook(b2);
		
		ml.addPerson(p1);
		ml.addPerson(p2);
	}
	
	@Test
	public void getBooksForPerson(){
		setup();
		addItems();
		
		assertEquals(0, ml.getBooksForPerson(p1).size());
		
		ml.checkOut(b1,p1);
		
		ArrayList<Book> testBooks = ml.getBooksForPerson(p1);
		
		assertEquals(1, testBooks.size());
	    assertEquals(0, testBooks.indexOf(b1));
	    
	    ml.checkOut(b2, p1);
	    
	    testBooks = ml.getBooksForPerson(p1);
		assertEquals(2, testBooks.size());
	    assertEquals(1, testBooks.indexOf(b2));
	    
	    
		
	}
	
	@Test 
	public void getAvailableBooks(){
		setup();
		addItems();
		ArrayList<Book> testBooks = ml.getAvailableBooks();
		assertEquals(2, testBooks.size());
		assertEquals(1, testBooks.indexOf(b2));
		
		ml.checkOut(b1, p1);
		
		testBooks = ml.getAvailableBooks();
		assertEquals(1, testBooks.size());
		assertEquals(0, testBooks.indexOf(b2));
		
		
		ml.checkOut(b2, p1);
		
		testBooks = ml.getAvailableBooks();
		assertEquals(0, testBooks.size());

			}
	
	@Test 
	public void getUnavailableBooks(){
		setup();
		addItems();
		ArrayList<Book> testBooks = ml.getUnavailableBooks();
		assertEquals(0, testBooks.size());
		//assertEquals(1, testBooks.indexOf(b2));
		
		ml.checkOut(b1, p1);
		
		testBooks = ml.getUnavailableBooks();
		assertEquals(1, testBooks.size());
		//assertEquals(0, testBooks.indexOf(b2));
		
		
		ml.checkOut(b2, p1);
		
		testBooks = ml.getUnavailableBooks();
		assertEquals(2, testBooks.size());

			}
	
	@Test
	public void TesttoString(){
		setup();
		addItems();
		
		assertEquals("test: 2 books; 2 people.", ml.toString());
		
	}
	}
	
	
	
	
	
