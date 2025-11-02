package com.pluralsight;

public class ShowdownApp {
    public static void main(String[] args) {
        // going to create fighters
        /*
        when creating the fighters they need more characteristics because thats what the super person
        says. instead of adding the weapons into the characteristics i should make them into methods
        that will effect how the much damage the fighters do. replace some of the characteristics with
        values that effect the amount of damage done and if it is missed or not.
         */
        // JazzyLi will have 45 sth,20 spd, 25 def, 15 lck total stat distribution = 100
        // EvilEric will have 30 sth, 15 spd, 15 def, 20 luck total stat distribution = 80
        SuperPerson JazzyLi = new SuperHero("JazzyLi", 100, 45, 15, 25, 15, 10);
        SuperPerson EvilEric = new SuperVillan("EvilEric", 100, 35, 20, 20, 25, 8);
    }
        /* create 2 super people
        SuperPerson eric = new SuperPerson("eric");
        SuperPerson jazzyli = new SuperPerson("jazzyli");

        // print out the status of each Super person
        System.out.println(eric.getStatus());
        System.out.println(jazzyli.getStatus());

        // deal damage
        eric.takeDamage(15);
        jazzyli.takeDamage(5);

        if(eric.isAlive()){
            System.out.println("Eric Lives");
        }else{
            System.out.println("Eric is dead as hell");
        }
        if(jazzyli.isAlive()){
            System.out.println("JazzyLi Lives");
        }else{
            System.out.println("JazzyLi is dead as hell");
        }
        //this is making the people fight each other
        eric.fight(jazzyli);
        jazzyli.fight(eric);
        */
}
