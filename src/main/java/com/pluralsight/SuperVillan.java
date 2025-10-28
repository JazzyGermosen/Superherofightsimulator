package com.pluralsight;

public class SuperVillan extends SuperPerson {
    public SuperVillan(String name, int health, String axe, String sword, String lance, String magic){
        //call the parent constructor with the super() method
        super(name, health, axe, sword, lance, magic);

        //set the exerience points to the evilness value
        this.experiencePoints = evilness;
    }
}
