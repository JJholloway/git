package Eclipse;

import java.util.ArrayList;

import lombok.*;

public class myLibrary {
	
	


	String name;
	 ArrayList<Book> book;
	 ArrayList<Person> people;

	public myLibrary(String name) {
		this.name = name;
		
		// note - we need to call empty paranthises on contructers that have no parameters 
		book = new ArrayList<Book>();
		people = new ArrayList<Person>();	
	}
	
//	@Getter private boolean myLibrary = ture;
	

	 public String getName() {
		return name;
	}

	public ArrayList<Book> getBook() {
		return book;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void addBook(Book b1) {
		this.book.add(b1);
		
	}

	public void removeBook(Book b1) {
		this.book.remove(b1);
		
	}

	public void addPerson(Person p1) {
		this.people.add(p1);
		
	}
	
	public void removePerson(Person p1){
		this.people.remove(p1);
	}

	public boolean checkOut(Book b1, Person p1) {
		int booksOut = this.getBooksForPerson(p1).size();
		if((b1.getPerson()== null)&& (booksOut < p1.getMaximunBooks()) ){
			
			b1.setPerson(p1);
			return true;			
		}else 
			return false;
	}

	public boolean checkIn(Book b1) {
		if(b1.getPerson() != null){
			b1.setPerson(null);
			return true;
		}else
			return false; 
	}


	public ArrayList<Book> getBooksForPerson(Person p1) {
		 ArrayList<Book> result = new ArrayList<Book>();
		 
		 for (Book aBook : this.getBook()) {
			 if((aBook.getPerson() != null) && 
					 (aBook.getPerson().getName().equals(p1.getName())))
			 {
				 result.add(aBook);
			 }			 
			
		}
		
		 return result;	
		
	}

	public ArrayList<Book> getAvailableBooks() {
		ArrayList<Book> result = new ArrayList<Book>();
		
		for (Book aBook : this.getBook()) {
			if(aBook.getPerson() == null){
				result.add(aBook);
			}
					
			}
		return result;
		}

	public ArrayList<Book> getUnavailableBooks() {
	ArrayList<Book> result = new ArrayList<Book>();
		
		for (Book aBook : this.getBook()) {
			if(aBook.getPerson() != null){
				result.add(aBook);
			}
					
			}
		return result;
		
	}

	public String toString(){
		return this.getName() + ": " + 
	    this.getBook().size() + " books; " + 
		this.getPeople().size() + " people.";
	}

	public static void main(String[] args) {
		myLibrary testLibrary = new myLibrary("test library");
		
		Book b1 = new Book("War and peace");
		
		Book b2 = new Book("greate expectations");
		
		b1.setAuthor("Tolstoy");
		b2.setAuthor("Dickens");
		
	
		
		Person jim = new Person();
		Person sue = new Person();
		
		jim.setName("Jim");
		sue.setName("Sue");
		
		testLibrary.addBook(b1);
		testLibrary.addBook(b2);
		
		testLibrary.addPerson(sue);
		testLibrary.addPerson(jim);
		
		System.out.println("Just create new Library");
		
		
		testLibrary.printStatus();
		
		System.out.println("Check out war and peace to Sue");
		testLibrary.checkOut(b1, sue);
		
		testLibrary.printStatus();
		
		System.out.println("So some more stuff");
		testLibrary.checkIn(b1);
		testLibrary.checkOut(b1, jim);
		
		testLibrary.printStatus();
		
		
		
		
		
		
	}

	private void printStatus() {
		System.out.println("Status Report of my library \n" + this.toString());
		
		for (Book thisBook : this.getBook()) {
			System.out.println(thisBook);			
		}
		
		for (Person p : this.getPeople()) {
			
			int count = this.getBooksForPerson(p).size();
			System.out.println(p + " (has " + count + "of my books)");
					}
		
		System.out.println("Books Available: "
				+ this.getAvailableBooks().size());
		
		System.out.println("---End of Status Report---");
	}
		
	}
	

	

