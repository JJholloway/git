package DesignPatterns;

// this class uses the EnmeyShipFactroy interface to create a very specific UFO enemy ship

// Theis is where we will deifne all of the parts the enemy ship will use be defining the methods implemented being:
//ESWepon and ESEngin 

// the returned object specifies a specific weapon and engine

public class UFOEnemyShipFactory implements EnemyShipFactory {
	
	// this will define the weapon object to associate  to a ship 
	
	public ESWeapon addESGun(){
		return new ESUFOGun(); // this is specific to a regular UFO 
		}
	
	public ESEngine addESEngine(){
		return new ESOUFOEngine(); // specify a regular UFO 
	}
	
}
