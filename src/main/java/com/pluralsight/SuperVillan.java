package com.pluralsight;

import java.util.Random;

public class SuperVillan extends SuperPerson {
    public SuperVillan(String name, int health, int strength, int speed, int defense, int luck){
        //call the parent constructor with the super() method
        super(name, health,  strength, speed, defense, luck);

        //set the exerience points to the evilness value
        // intellej is saying that evilness is not defined which makes sense
        //it was not defined LOL
        this.experiencePoints = darkMage;
    }
    @Override
    public void fight(SuperPerson opponent){
        //using random to generate a random number between 1 - 101
        Random rand = new Random();
        int baseDamage = rand.nextInt(101);
        int totalDamage = baseDamage + this.experiencePoints;
        // determine if we missed the hit, using a if else statement
        if (baseDamage == 0){
            System.out.println(this.getName() + " HA HA U MISSED LOSER");
        }else{
            System.out.println(this.getName() + " hits " + opponent.getName() + " for  " + totalDamage + " damage ");
            //making it so that the opponent actuallty takes damage
            opponent.takeDamage(totalDamage);
        }
    }
}
