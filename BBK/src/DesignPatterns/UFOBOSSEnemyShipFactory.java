package DesignPatterns;

public class UFOBOSSEnemyShipFactory implements EnemyShipFactory {
	
	// this class will use the EnemyShipFactory to create a very spefic UFO Ship 
	
	// This is where we define all the parts that the enemy ship will use by defineing the method:
	// the methods being ESWepon and ESEngine 
	
	public ESWeapon addESGun(){
		return new ESUFOBossGun();
	}
	
	
	// this will define the  engine object to assoiate with the ship 
	
	public ESEngine addESEngine(){
		return new ESUFOBOSSEngine(); //this is specific to the 
	}

}
