package com.company;

public class healthyBurger extends HamBurger {

    private String Addon5;
    private String Addon6;

    public healthyBurger(String breadType, String meat, String name, String addon5, String addon6) {
        super("brownRyeBreadRoll", meat, "HealthyBurger");
        Addon5 = addon5;
        Addon6 = addon6;
    }

    public String getAddon5() {
        return Addon5;
    }

    public String getAddon6() {
        return Addon6;
    }
}
