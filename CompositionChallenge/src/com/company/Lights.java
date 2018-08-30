package com.company;

public class Lights {

    private String Tablelamp;
    private String Ceiling;
    private String UnderCabinet;

    public Lights(String  tablelamp, String ceiling, String underCabinet) {
        Tablelamp = tablelamp;
        Ceiling = ceiling;
        UnderCabinet = underCabinet;
    }

    public String getTablelamp() {
        return Tablelamp;
    }

    public String getCeiling() {
        return Ceiling;
    }

    public String getUnderCabinet() {
        return UnderCabinet;
    }

    public void LightsOn(String Light){
        System.out.println(Light+" Lights are on");

    }

public void LightsOff(String Light)

{
    System.out.println(Light+" Lights are off");

}
    }

