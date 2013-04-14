package DesignPatterns;

// with an abstract build factory pattern you wont just build ships, but also all of the components 
//for the ships ---- oooooooooo sounds fun

//here is where you define the parts that are required is an object wants to be an enemy ship 


public interface EnemyShipFactory {
	
	public ESWeapon addESGun();
	
	public ESEngine addESEngine();

}
