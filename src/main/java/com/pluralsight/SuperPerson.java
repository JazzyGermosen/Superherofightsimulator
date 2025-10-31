package com.pluralsight;

public class SuperPerson {
    protected String name;
    protected int health;
    protected int experiencePoints;
    // i dont know what protected means but we are rolling with it since it seems like thats what fixed my code
    //when we use private a child class will inherit the properties but the will not be able to access it
    protected String axe;
    protected String sword;
    protected String lance;
    protected String magic;
    protected int darkMage;
    protected int divinePriest;

    //


    public SuperPerson(String name, int health, String axe, String sword, String lance, String magic){
        this.name = name;
        this.health = health;
        this.axe = axe;
        this.sword = sword;
        this.lance = lance;
        this.magic = magic;
        this.experiencePoints = experiencePoints;
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

        if(this.health < 0 ){
            this.health = 0;
        }
    }


    // this method will allow a super person to fight another person
    public void fight(SuperPerson opponent){
        System.out.println(this.name + " is ready to fight" + opponent.getName());

    }
    // i want to create a method tht will be used for what weapon type is being used so axe, magic, sword or lance
    public void hasAxe(){

    }
    public void hasLance(){

    }
    public void hasSword(){

    }
    public void hasMagic(){

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

    public String getAxe() {
        return axe;
    }

    public void setAxe(String axe) {
        this.axe = axe;
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getLance() {
        return lance;
    }

    public void setLance(String lance) {
        this.lance = lance;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public int getDarkMage() {
        return darkMage;
    }

    public void setDarkMage(int darkMage) {
        this.darkMage = darkMage;
    }

    public int getDivinePriest() {
        return divinePriest;
    }

    public void setDivinePriest(int divinePriest) {
        this.divinePriest = divinePriest;
    }
}
