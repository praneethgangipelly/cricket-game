package com.company;

public class Hall {

    private furniture furniture1;

    private electronics electronics1;

    private Lights Light1;


    public Hall(furniture furniture1, electronics electronics1, Lights light1) {
        this.furniture1 = furniture1;
        this.electronics1 = electronics1;
        Light1 = light1;
    }

    public void turnonLight(){
        System.out.println("Light is On");

    }

    public electronics getElectronics1() {
        return electronics1;
    }
}
