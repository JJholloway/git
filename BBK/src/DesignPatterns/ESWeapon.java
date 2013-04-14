package DesignPatterns;


// any part that implements the interface ESWeapon can replace that part in any ship 

public interface ESWeapon {
	
	// this user is forced to implement this method ,
	// it outputs the string returned when the object is printed 
	
	public String toString();

}
