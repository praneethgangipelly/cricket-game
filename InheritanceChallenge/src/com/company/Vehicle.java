package com.company;

public class Vehicle {

    private String numberOfwheels ;
    private String seatingCapacity;
   private int speed;
   private int CurrentGear;
   private String Brand;

    public Vehicle(String numberOfwheels, String seatingCapacity, int speed, int currentGear, String Brand) {
        this.numberOfwheels = numberOfwheels;
        this.seatingCapacity = seatingCapacity;
        this.speed = 0;
        this.CurrentGear = 1;
        this.Brand = Brand;

    }

    public String getNumberOfwheels() {
        return numberOfwheels;
    }

    public String getSeatingCapacity() {
        return seatingCapacity;
    }





    public String getBrand() {
        return Brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCurrentGear() {
        return CurrentGear;
    }

    public void stop()
    {
     this.speed=0;
    }
}
