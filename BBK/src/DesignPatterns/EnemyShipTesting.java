package DesignPatterns;

public class EnemyShipTesting {

	public static void main (String [] args){
		// The EnemyShipBuilding handles order for new EnemyShips. 
		// You send it a cose the the orderShips method &
		// it sends the order to the right factory for creation 
		
		EnemyShipBuilding makeUFOs= new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theBoss + "\n");
		
		
		
		
	}
}
