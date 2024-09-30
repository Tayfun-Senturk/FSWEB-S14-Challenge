package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe Burger","Double",19.1,"Double Sandwich");
        cips="CURVY";
        drink="COKE";
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Name:"+getName());
        System.out.println("Meat:"+getMeat());
        System.out.println("BreadRollType:"+getBreadRollType());
        System.out.println("Price: "+getPrice());
        return getPrice();
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }
}
