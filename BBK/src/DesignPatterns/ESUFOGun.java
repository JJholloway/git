package DesignPatterns;

// Here we define the basic component of a space ship
//Any part that implements the interface ESWEAPON can replace that part in any ship 

public class ESUFOGun implements ESWeapon {
	
	// EnemyShip contains a a referance to the object ESWeapon -- it is stored in the field weapon 
	
	// the Strategy design pattern is being used here -- i will have to do a bit more reading but it is something like below :
	// Strategy - defines an interface common to all supported algorithms.
	//Context uses this interface to call the algorithm defined by a ConcreteStrategy.
	
	// When the field that is of type ESUFOGun is printed 
	// the following shows in the screen 
	
	public String toString(){
		return "20 damage";
	}
	
	
	
	
	
	

}
