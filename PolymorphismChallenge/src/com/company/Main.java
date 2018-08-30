package com.company;

 class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders, int wheels, boolean engine) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String StartEngine(){
        return " Car Engine has started ";
    }
    public void accelerate(){
        System.out.println("You have accelerated");

    }

}
 class Dart extends Car {

     @Override
     public String StartEngine() {
         return "DodgeDart engine has started";
     }
     public Dart() {
        super("Dart", 4, 4, true);


    }
}
 class civic extends Car {
     public civic() {
         super("Civic", 6, 4, true);
     }

     @Override
     public String StartEngine() {
         return "HondaCivic Engine has started";
     }
 }

 class NiceCar extends Car{
     public NiceCar() {
         super("NiceCar", 8, 4, true);
     }

     @Override
     public String StartEngine() {
         return super.StartEngine();
     }
 }


public class Main {


    public static void main(String[] args) {

        Car car = new Car("a",4,4,true);
        System.out.println(car.StartEngine());
        Dart dart = new Dart();
        System.out.println(dart.StartEngine());
        civic civic = new civic();
        System.out.println(civic.StartEngine());
    }


}

