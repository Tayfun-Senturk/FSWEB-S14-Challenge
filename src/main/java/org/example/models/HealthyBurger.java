package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name,double price){
        healthyExtra1Name=name;
        healthyExtra1Price=price;
    }
    public void addHealthyAddition2(String name,double price){
        healthyExtra2Name=name;
        healthyExtra2Price=price;
    }
    public double getPrice(){
        return healthyExtra2Price+healthyExtra1Price+getMainPrice();
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Name:"+getName());
        System.out.println("Meat:"+getMeat());
        System.out.println("BreadRollType:"+getBreadRollType());
        System.out.println("Price: "+getPrice());
        return healthyExtra2Price+healthyExtra1Price+getMainPrice();
    }
}
