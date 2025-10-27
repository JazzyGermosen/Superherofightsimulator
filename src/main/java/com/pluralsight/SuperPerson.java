package com.pluralsight;

public class SuperPerson {
    private String name;
    private int health;
    private int experiencePoints;

    public SuperPerson(String name, int health){
        this.name = name;
        this.health = health;
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
    public void takeDamage(int amount){
        this.health -= amountOfDamage;

        if(this.health < 0 ){
            this.health = 0;
        }
    }
    // this method will allow a super person to fight another person
    public void fight(SuperPerson opponent){
        System.out.println(this.name + " is ready to fight" + opponent.getName());

    }

    public String getName() {+
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
}
