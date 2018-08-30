package com.company;

public class Dodge extends Car {

    private String Model;
    private String EngineType;

    public Dodge(int currentGear, String Brand, String carType, String yearOfManufacturing, int currentMiles, String model, String engineType) {
        super(currentGear, Brand, carType, yearOfManufacturing, currentMiles);
        Model = model;
        EngineType = engineType;
    }

    public String getModel() {
        return Model;
    }

    public String getEngineType() {
        return EngineType;
    }

    public void rate(int accelaration)
    {

        int newSpeed = getSpeed()+accelaration;

       if (newSpeed==0){
stop();
       }
       if (newSpeed>0&&newSpeed<=10)
       {

       }

    }
}
