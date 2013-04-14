package DesignPatterns;

public class UFOEnemyShip extends EnemyShip {
	
	private String idCode = "100";
	
	private String getPrivate (){
		
		return "How did you get this ";
	}
	
	private String getOtherPrivate(int thisInt, String thatString){
		
		return "How did you get here" + thisInt + " " + thatString;
		
	}
	
	public UFOEnemyShip(int number, String randString){
		
		System.out.println("You sent: " + number + " " + randString);
		
		
	}
	
	
	// We define the type of ship we want to create by stating that we want to use the factory that makes enemy ships 
	
	EnemyShipFactory shipFactory; 
	
	//The enemy ships required parts list is sent to this method 
	// They state that the enemy ship must have a weapon and engine assigned 
	//he object also states the specific parts needed to make a regular UFO vs a Boss UFO
	
	public UFOEnemyShip (EnemyShipFactory shipFactory){
			
	 this.shipFactory = shipFactory; 	
	}
	
	//EnemyShipFactory calls this method to build a specific UFOEnemyShip 
	
	void makeShip() {
		 
		System.out.println("Making enemy ship " + getName());
		
		// the specific weapon and engine needed were passed in shipfactory 
		// we are then assigning the specific parts objects (e.g the engine and Weapon) to the UFOEnemyShip here 
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
		
		
	}

}
