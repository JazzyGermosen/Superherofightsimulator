package com.pluralsight;

public class SuperHero extends SuperPerson {
    // ^ essentially saying that a superhero is an extention of super person
    //
    public SuperHero(String name, int health){
        // you can use super function to refer to the parents constructor
        Super(name, health)
        // override function is method is used to replace a method from tthe parent class without changing it in its origonal class
        // changing the behavior of the method without actually changing the main method in the parent function


    }
}
