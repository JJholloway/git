package DesignPatterns;

public class ESOUFOEngine implements ESEngine {

	// this will be a lot like ESWeapon
	// sooo here we define a basic conpnaent of a space ship -- the engine
	//Any part that implements the interface ESEngine can that replace that part in any ship
	
	
	
	// EnemyShip contains a refirance to the object ESWeapon -- it is stored in the field ESWeapon 
	//When the feild of the type ESUFOEngine is printed it will return the following 
	//and will be shown in screen 
	
	public String toString(){
		return "100 mph";
	}
	
}
