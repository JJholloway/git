package Eclipse;

import lombok.Data;

public @Data class Book {

	 String title;
	 String author;
	 //field Person of type person
	 Person person;
	
	public Book(String string) {
		this.title = string;
		this.author = "unknown author";

	}
	
	public String toString(){
		String available; 
		
		if(this.getPerson() == null){
			available = "Available";
		}
		else {
			available = "checked out to " + this.getPerson().getName();
		}
		
		return this.getTitle() + " by " + this.getAuthor() + "; " + available;
		
		
	}
	

}
