package com.pluralsight;

import java.util.Random;

public class SuperVillain extends SuperPerson {
    public SuperVillain(String name, int health, int strength, int speed, int defense, int luck, int level){
        //call the parent constructor with the super() method
        super(name, health,  strength, speed, defense, luck);

        //set the exerience points to the evilness value
        // intellej is saying that evilness is not defined which makes sense
        //it was not defined LOL
        this.experiencePoints = level;
        // setting the experience points to level because while reading it doesnt make sense so yea :/
    }
    @Override
    public void fight(SuperPerson attacker, SuperPerson enemy, CombatPhase phase){
        // creating variables for the person who is initiating
        SuperPerson initiator = (phase == CombatPhase.SUPERHERO_TURN) ? attacker : enemy;
        SuperPerson defender = (phase == CombatPhase.SUPERVILLAIN_TURN) ? enemy : attacker;

        System.out.println("=== " + phase + " ===");
        System.out.println(initiator.getName() + " is fighting " + defender.getName());

        //doing a speed check
        checkDouble(attacker, enemy);
        //using random to generate a random number between 1 - 101
        Random rand = new Random();
        int baseDamage = rand.nextInt(101);
        int totalDamage = baseDamage + this.experiencePoints;
        // determine if we missed the hit, using a if else statement
        if (baseDamage == 0){
            System.out.println(this.getName() + " HA HA U MISSED LOSER");
        }else{
            System.out.println(this.getName() + " hits " + enemy.getName() + " for  " + totalDamage + " damage ");
            //making it so that the opponent actually takes damage
            defender.takeDamage(totalDamage);
        }
        logHit(attacker, enemy);
        printBattleLog();
    }
}
