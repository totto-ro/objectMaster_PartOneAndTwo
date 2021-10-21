package com.objectMaster;

public class Samurai extends Human{
	private static int number0fSamurai = 0;
	
	//Constructor
		public Samurai( String name, int strength, int stealth, int intelligence,  int health ) {
			super(name, strength, stealth, intelligence, health);
			number0fSamurai++;
		}
		
		public Samurai(String name) {
			super(name);
			this.setHealth(200);
			number0fSamurai++;
		}
		

		//Methods
		 public void deathBlow( Human target ) {
		        int certainDeath = 0;
		        target.setHealth( certainDeath );
		        int samuraiHealth = this.getHealth() / 2; 
		        this.setHealth( samuraiHealth );
		    }
		 
		 public void meditate() {
			 int samuraiHeal = this.getHealth() + ( this.getHealth() / 2 );
			 this.setHealth( samuraiHeal );
		    }
		 
		 public static int howMany() {
			 return number0fSamurai;
		 }

	
	
	
	
}
