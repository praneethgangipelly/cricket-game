package com.company;

public class DeluxeBurger extends HamBurger {
    private String Addon1;
    private String Addon2;

    public DeluxeBurger(String breadType, String meat, String name, String addon1, String addon2) {
        super(breadType, meat, name);
        Addon1 = "Chips";
        Addon2 = "Drink";
    }


}
