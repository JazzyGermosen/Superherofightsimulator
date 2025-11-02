package com.pluralsight;

import java.util.Random;

public class SuperHero extends SuperPerson {
    // ^ essentially saying that a superhero is an extention of super person
    public SuperHero(String name, int health, int strength, int speed, int defense, int luck, int level) {
        // you can use super function to refer to the parents constructor
        super(name, health, strength, speed, defense, luck);
        // override function is method is used to replace a method from tthe parent class without changing it in its origonal class
        // changing the behavior of the method without actually changing the main method in the parent function
        // this will deal wtih the custom hero stuff
        this.experiencePoints = level;
        //abstract methods created in parent class must be used in extended children classes
        //an abstract method must be overridden in its subclass
    }

    /*public void SuperPerson(String name, int health, String axe, String sword, String lance, String magic, int divinePriest){
        super(name, health, axe, sword, lance, magic, divinePriest);
        this.experiencePoints = divinePriest;
    }

    ^^ i dont know why this wawsnt working, it seems it might be because i automatically entered in (int divine priest)
        */
    @Override
    public void fight(SuperPerson opponent){
        // Random is a function that can be used to generate random number
        Random rand = new Random();
        // in this statement we will choose a number between 0 and 101
        // we are adding 101 because the computer will not be reading the 1 in 101
        int baseDamage = rand.nextInt(101);
        int totalDamage = baseDamage + this.experiencePoints;
        //determine if we missed the hit based on the baseDamage
        // if we got 0 for the base damage we missed
        // other wise we landed our attack on the opponent and took damage away from them
        if(baseDamage == 0){
            System.out.println(this.getName() + "HA HA U MISSED LOSER!");
        }else{
            System.out.println(this.getName() + " hits " + opponent.getName() + " for " + totalDamage + " damage ");
            // this is what causes the opponent to actually take damage
            opponent.takeDamage(totalDamage);
        }
    }
}
