package Eclipse;

public class Person {

	private String name;  // the name of the person 
	private int maximunBooks; // the max number of book that a person can reserve
	
	// Lets add a constructer = this is a sepcial block of code to initlize the object 
	
	public Person(){
		 name = "unknown name";
		 maximunBooks = 3;
		
	}
	
	
	//methods 
	public String getName(){
		return name;
	}
	
	public void setName(String anyName) {  // void because you do not want to return anything 
		name = anyName;		
	}

	public int getMaximunBooks() {
		return maximunBooks;
	}

	public void setMaximunBooks(int maximunBooks1) {
		maximunBooks = maximunBooks1;
	}
	
	public String toString() {
		return this.getName() + " (" + this.getMaximunBooks() + " books)";
		
	}
	
}
