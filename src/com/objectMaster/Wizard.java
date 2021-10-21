package com.objectMaster;

public class Wizard extends Human{
	
	//Constructor
	public Wizard( String name, int strength, int stealth, int intelligence,  int health ) {
		super(name, strength, stealth, intelligence, health);
	}
	
	public Wizard(String name) {
		super(name);
		this.setHealth(50);
		this.setIntelligence(8);
	}
	

	//Methods
	 public void heal( Human target ) {
	        int health = target.getHealth() + this.getIntelligence();
	        target.setHealth( health );
	    }
	 
	 public void fireball( Human target ) {
	        int decreaseHealth = target.getHealth() - this.getIntelligence() * 3;
	        target.setHealth( decreaseHealth );
	    }
    

	
	
	
	
	

}
