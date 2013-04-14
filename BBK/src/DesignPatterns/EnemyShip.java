package DesignPatterns;

public abstract class EnemyShip {

	private String name; 
	
	
	//Newly defined objects that represent weapon & engines 
	//These can be changed easily by assigning new parts in UFOENemyShip Factory 
		
	ESWeapon weapon; 
	ESEngine engine; 
	
	public String getName(){
		return name;
	}
	
	public 	void setName(String newName){
		name = newName;
	}
	
	
	abstract void makeShip();		
		// because we defined the toString method in engine when it is printed the String defined in toString goes on the screen 
			
	

	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
		
	}

	public void followHeroShip() {
		System.out.println(getName() + " is folowing the hero at" + engine);
		
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does" + weapon);
		
	}
	
	public String toString(){
		
		String infoOnShip = "The" + name + " has a top speed of " + engine + " and an attacke power of " + weapon;
		
		return infoOnShip;
		
	}

	
		
		
		
	}
	
	
	


