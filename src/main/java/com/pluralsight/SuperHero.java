package com.pluralsight;

import java.util.Random;

public class SuperHero extends SuperPerson {
    // ^ essentially saying that a superhero is an extention of super person
    //
    public SuperHero(String name, int health){
        // you can use super function to refer to the parents constructor
        Super(name, health);
        // override function is method is used to replace a method from tthe parent class without changing it in its origonal class
        // changing the behavior of the method without actually changing the main method in the parent function
        // this will deal wtih the custom hero stuff
        this.getExperiencePoints = powerlevel;
    }

    @Override
    public void fight(SuperPerson opponent){
        // Random is a function that can be used to generate random number
        Random rand = new Random();
        // in this statement we will choose a number between 0 and 101
        // we are adding 101 because the computer will not be reading the 1 in 101
        int baseDamage = baseDamage + this.experiencePoints;
        //determine if we missed the hit based on the baseDamage
        // if we got 0 for the base damage we missed
        // other wise we landed our attack on the opponent and took damage away from them
        if(baseDamage == 0){
            System.out.println(this.getName() + "HA HA U MISSED LOSER!");
        }else{
            System.out.println(this.getName() + " hit " + opponent.getName() + " for " + totalDamage + " damage ");
        }
    }
}
