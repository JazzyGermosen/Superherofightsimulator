package com.pluralsight;

public class SuperVillan extends SuperPerson {
    public SuperVillan(String name, int health, String axe, String sword, String lance, String magic, int darkMage){
        //call the parent constructor with the super() method
        super(name, health, axe, sword, lance, magic);

        //set the exerience points to the evilness value
        // intellej is saying that evilness is not defined which makes sense
        //it was not defined LOL
        this.experiencePoints = darkMage;
    }
}
