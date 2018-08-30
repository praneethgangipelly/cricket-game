package com.company;

public class Car extends Vehicle{


   private String CarType;
   private String YearOfManufacturing;
   private int CurrentMiles;



    public Car( int currentGear, String Brand, String carType, String yearOfManufacturing,  int currentMiles)
    {
        super("4", "4",0, 1, Brand);
        CarType = carType;
        YearOfManufacturing = yearOfManufacturing;
        CurrentMiles=currentMiles;

    }

    public String getCarType() {
        String Type1="sedan", Type2="Suv", Type3="pickup";
        if (CarType.equals(Type1)||CarType.equals(Type2)||CarType.equals(Type3)) {
            return CarType;
        }
        return null;
    }

    public String getYearOfManufacturing()
    {
        return YearOfManufacturing;
    }

    public int getCurrentMiles()
    {
        return CurrentMiles;
    }



    public int MilesTravelled(int distanceTravlled){
        distanceTravlled+= CurrentMiles;
        return distanceTravlled;
    }


}
