package com.pluralsight;

import java.util.HashMap;

public class SuperPerson {
    protected String name;
    protected int health;
    protected int experiencePoints;
    // i dont know what protected means but we are rolling with it since it seems like thats what fixed my code
    //when we use private a child class will inherit the properties but the will not be able to access it
    // strength - how strong super person is
    // speed - how fast super is ( if superperson speed is greater than opponent then attack twice )
    // defense - how bulky the super person is
    // luck - determines how likely someone will be able to land a hit
    protected int strength;
    protected int speed;
    protected int defense;
    protected int luck;
    private HashMap<String, Integer> battleLog = new HashMap<>();
    // ^^these are all predefined characteristics a super person will have
    public enum CombatPhase {
        SUPERHERO_TURN,
        SUPERVILLAIN_TURN
        // creating an enum to clarify who's turn it is
    }

    public SuperPerson(String name, int health, int strength, int speed, int defense, int luck){
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.defense = defense;
        this.strength = strength;
        this.luck = luck;

    }

    // creating a method in the super person class to call for a speed check when a fight occurs
    public static void checkDouble(SuperPerson attacker, SuperPerson enemy){
        // creating a variable that will check for the speed difference between the super person and villian
        int speedDifference = attacker.getSpeed() - enemy.getSpeed();
        // creating a if statement to determine who gets to make a follow up attack
        if (speedDifference >= 5){
            // ^ this is saying if the speed difference is greater than or equal to 5
            System.out.println(attacker.getName() + " makes a follow up attack");
        } else if (speedDifference <= -5) {
            System.out.println(enemy.getName() + " makes a follow up attack");
        }else {
            System.out.println("Neither unit can make a follow up attack");
        }
        // when the fight is occuring we will use checkDouble( superPerson, superVillain) to check
    }

    public void logHit (SuperPerson attacker, SuperPerson enemy){
        //this method will log the hit
        String name = opponent.name;
        int count = battleLog.getOrDefault(name, 0);
        battleLog.put(name, count +1);
    }

    public void printBattleLog(){
        System.out.println("Battle log for " + name + ":");
        for (HashMap.Entry<String, Integer> entry : battleLog.entrySet()){
            System.out.println(" - Hit " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }

    public boolean isAlive(){
        if(this.health > 0 ){
            return true;
        }else{
            return false;
        }
        // alternate code with one line of code
        // return this.health >0;
    }

    public void takeDamage(int amountOfDamage){
        this.health -= amountOfDamage;
        // this is essentially saying if the user health takes damage and falls below 0 then will reset back to 0
        if(this.health < 0 ){
            this.health = 0;
        }
    }

    // this method will allow a super person to fight another person
    public void fight(SuperPerson attacker, SuperPerson enemy, CombatPhase phase){
        System.out.println(this.name + " is ready to fight" + enemy.getName());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    // method that allows the superperson to tell us how they are doing
    public String getStatus(){
        return this.name + "has" + this.health + "health";
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    }
