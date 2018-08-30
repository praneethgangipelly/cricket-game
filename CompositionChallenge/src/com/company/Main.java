package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       furniture furniture1 = new furniture(2,4);
       Lights lights1 = new Lights("Classy", "crystal","shiny");
       electronics electronics1 = new electronics("plasma","LG","Philips");

Hall hall = new Hall(furniture1,electronics1,lights1);

hall.turnonLight();
hall.getElectronics1().TurnOn("Tv");



    }
}
