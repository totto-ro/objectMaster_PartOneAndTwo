package com.objectMaster;


public class HumanTest {
    public static void main(String[] args) {
    	
        Human ramona = new Human( "Ramona", 3, 3, 3, 100 );
        Human pepe = new Human("Pepe", 3, 3, 3, 100);

        Human sanchez = new Human("Sánchez", 3, 3, 3, 100);

        sanchez.attack(pepe);
        ramona.attack(pepe);
        
        ramona.printHealth();
        pepe.printHealth();
        sanchez.printHealth();
        
        Wizard harry = new Wizard("harry");
        harry.heal(pepe);
        pepe.printHealth();
        harry.fireball(ramona);
        ramona.printHealth();
        
        Ninja naruto = new Ninja("Naruto", 3, 10, 3, 100);
        naruto.steal(sanchez);
        sanchez.printHealth();
        naruto.printHealth();
        naruto.runAway();
        naruto.printHealth();
        
        Ninja sasuke = new Ninja("Sasuke");
        sasuke.steal(sanchez);
        sanchez.printHealth();
        sasuke.printHealth();
        sasuke.runAway();
        sasuke.printHealth();
        
        Samurai musashi = new Samurai( "Musashi" );
        musashi.printHealth();
        musashi.deathBlow(naruto);
        naruto.printHealth();
        musashi.printHealth();
        
        Samurai hideyoshi = new Samurai( "Hideyoshi" );
        hideyoshi.printHealth();
        
        Samurai nobunaga = new Samurai( "Nobunaga" );
        nobunaga.printHealth();
        
        System.out.println( "Current number of Samurais: " + Samurai.howMany() );
        
        
        
        
    }
}