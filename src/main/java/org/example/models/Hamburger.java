package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name ;
    private double addition4Price;

    public String getBreadRollType() {
        return breadRollType;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = meat;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getMainPrice() {
        return price;
    }
    public double getPrice() {
        return addition3Price+addition2Price+addition1Price+addition4Price+price;
    }


    public void addHamburgerAddition1(String name, double price){
        addition1Price=price;
        addition1Name=name;
    }
    public void addHamburgerAddition2(String name,double price){
        addition2Price=price;
        addition2Name=name;
    }
    public void addHamburgerAddition3(String name,double price){
        addition3Price=price;
        addition3Name=name;
    }
    public void addHamburgerAddition4(String name,double price){
        addition4Price=price;
        addition4Name=name;
    }
    public double itemizeHamburger(){
        System.out.println("Name:"+name);
        System.out.println("Meat:"+meat);
        System.out.println("BreadRollType:"+breadRollType);
        System.out.println("Addition1:"+addition1Name);
        System.out.println("Addition2:"+addition2Name);
        System.out.println("Addition3:"+addition3Name);
        System.out.println("Price:"+getPrice());
        return addition3Price+addition2Price+addition1Price+addition4Price+price;
    }
}
