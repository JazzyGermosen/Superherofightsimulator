package com.pluralsight;

public class ShowdownApp {
    public static void main(String[] args) {
        // create 2 super people
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

        eric.fight(jazzyli);


    }
}
