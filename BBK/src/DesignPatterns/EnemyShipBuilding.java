package DesignPatterns;

public abstract class EnemyShipBuilding { 
	
	//A bit of blurb about this class
	//This class acts a mechinsham for ording enemy ships that have a weapon, engine & name  and nothing else 
	
	// The specific parts used for engine and weapon depend upon the string that is passed into thsi method 
	
	
	protected abstract EnemyShip makeEnemyShip(String typeOfShip);
	
	//When called a new enemy ship is made. The specific pats are based on the string entered. 
	//After the ship is made we execute multiple method in the EnemyShip object  

	public EnemyShip orderTheShip(String typeOfShip) {
		EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
		
		theEnemyShip.makeShip();
		theEnemyShip.displayEnemyShip();
		theEnemyShip.followHeroShip();
		theEnemyShip.enemyShipShoots();
		
		
		return theEnemyShip;
		
		
	}
	
	

}
