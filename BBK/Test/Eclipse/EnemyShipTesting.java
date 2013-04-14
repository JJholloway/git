package Eclipse;

import DesignPatterns.EnemyShip;
import DesignPatterns.EnemyShipBuilding;

public class EnemyShipTesting {
	
	public static void main(String[] args) {
		
		//Enemyshipbuilding hadles orders for new ships 
		//you sent it code using the order ship method &
		//it sends the order to ight factory for the creation 
		
		EnemyShipBuilding MakeUFOs = new EnemyShipBuilding();
		
		// oooooooooooo lets make an enemy ship	
		EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theBoss + "\n");
		
		
		
		
		
	}

}
