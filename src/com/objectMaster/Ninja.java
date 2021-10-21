package com.objectMaster;

public class Ninja extends Human{
	
	//Constructor
	public Ninja( String name, int strength, int stealth, int intelligence,  int health ) {
		super(name, strength, stealth, intelligence, health);
	}
	
	public Ninja(String name) {
		super(name);
		this.setStealth(10);
	}
	

	//Methods
	 public void steal( Human target ) {
	        int health = target.getHealth() - this.getStealth();
	        target.setHealth( health );
	        int ninjaHealth = this.getHealth() + this.getStealth(); 
	        this.setHealth( ninjaHealth );
        }
	 
	 public void runAway( ) {
	        int ninjaHealth = this.getHealth() - 10; 
	        this.setHealth( ninjaHealth );
        }
 
	 
}
	 
	 