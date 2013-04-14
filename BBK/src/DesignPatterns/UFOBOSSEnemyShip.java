package DesignPatterns;

public class UFOBOSSEnemyShip extends EnemyShip {
	
	// this should be written in the same way as the UFO enemy ship 
	// soooooooooo we define the type of ship that we want to create by stating the we want to use the factory that makes enemy ships
	
	EnemyShipFactory shipFactory; 
	
	// The enemy ships required parts is sent to this method
	//they state that the enemy ship must have a weapon and engine assigned -- you can double chekc this by looking at the EnemyShipFacoty class 
	// That object also states the specific parts needed to make a Boss UFO VS a regular UFO 
	
	public UFOBOSSEnemyShip (EnemyShipFactory shipFactory){
		
		this.shipFactory = shipFactory; 
		
	}
	
	
	// the EnemyShipFactory calls this method to build a specific boss UFO ship 
	
	void makeShip(){
		
		System.out.println("Making enemy ship " + getName());
		
		// the specific weapon and engine needed were passed in ship factory 
		//we are then assigning the specific part object to the UFOBOSSEnemyShip here 
		
		weapon = shipFactory.addESGun();		
		engine = shipFactory.addESEngine();
		
	}

}
