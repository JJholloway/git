package DesignPatterns;

// ok so - this is the only class that you need to change. if you want to determine which enemy ship you want to provide as an 
//option to build. So if you want another option of ship you wil have to 'hard code it in here'

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
	
	protected EnemyShip makeEnemyShip(String typeOfShip){
		EnemyShip theEnemyShip = null;
		
		//If UFO was sent then grab factory that knows what type of 
		//weapons and engine a regular UFO needs. 
		//The enemy ship is ruturned and given a name 
		
		if(typeOfShip.equals("UFO")){
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory(); 
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
			
			
		}else 
			// now we want to build a UFO BOSS ship so we want to see if the user had asked for a boss ship 
			
			if(typeOfShip.equals("UFO BOSS")){
				EnemyShipFactory shipPartsFactory = new UFOBOSSEnemyShipFactory(); 
				theEnemyShip = new UFOBOSSEnemyShip(shipPartsFactory);
				theEnemyShip.setName("UFO Boss Ship");
				
			}
		
		return theEnemyShip;
				
			}
		
		
	}
	
	


