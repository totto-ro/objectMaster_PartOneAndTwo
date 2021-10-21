package com.objectMaster;

public class Human {

	private String name;
    private int strength;
    private int stealth;
    private int intelligence;
    private int health;
    
  //Constructor
    public Human( String name, int strength, int stealth, int intelligence,  int health ){
        this.name = name;
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }
    
    public Human( String name){
        this.name = name;
    }
    
  //Getters
    public String getName(){
        return this.name;
    }
    
    public int getStrength(){
        return this.strength;
    }
    
    public int getStealth(){
        return this.stealth;
    }
    
    public int getIntelligence(){
        return this.intelligence;
    }
    
    public int getHealth(){
        return this.health;
    }
    
  //Setters
    public void setName( String name ){
        this.name = name;
    }
    
    public void setStrength( int strength ) {
		this.strength = strength;
	}
    
    public void setStealth( int stealth ) {
		this.stealth = stealth;
	}
    
    public void setIntelligence( int intelligence ) {
		this.intelligence = intelligence;
	}
    
    public void setHealth( int health ) {
		this.health = health;
	}
    
  //Methods
    public void attack( Human target ) {
        int health = target.health - this.strength;
        target.setHealth( health );
    }
    
    public void printHealth() {
        System.out.println( "Human: " + this.name + "." + " Current Health: " + this.getHealth() );
        
    }
	
	
}
