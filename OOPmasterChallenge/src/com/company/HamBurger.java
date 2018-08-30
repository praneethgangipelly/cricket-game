package com.company;

public class HamBurger {
    private String BreadType;
    private String Meat;
    private String AddOn1;
    private double AddonPrice1;
    private String AddOn2;
    private double AddonPrice2;
    private String AddOn3;
    private double AddonPrice3;
    private String AddOn4;
    private double AddonPrice4;
    private String Name;
    private double price;

    public HamBurger(String breadType, String meat, String name) {
        BreadType = breadType;
        Meat = meat;
        Name = name;

    }

    public String getBreadType() {
        return BreadType;
    }

    public String getMeat() {
        return Meat;
    }

    public void AddonHamburger1(String Addonname,double price){
        Addonname = this.AddOn1;
        price=this.AddonPrice1;
    }
    public void AddonHamburger2(String Addonname,double price){
        Addonname = this.AddOn2;
        price=this.AddonPrice2;
    }
    public void AddonHamburger3(String Addonname,double price){
        Addonname = this.AddOn3;
        price=this.AddonPrice3;
    }
    public void AddonHamburger4(String Addonname,double price){
        Addonname = this.AddOn4;
        price=this.AddonPrice4;
    }

    public double AddHamburgerPrice(){

        double hamburgerPrice = price;

        if (AddOn1!=null){
            price += this.AddonPrice1;

        }
        if (AddOn2!=null){
            price += this.AddonPrice2;

        }
        if (AddOn3!=null){
            price += this.AddonPrice3;

        }
        if (AddOn4!=null){
            price += this.AddonPrice4;

        }
        return price;
    }





}
