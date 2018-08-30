package com.company;

public class electronics {

  private String telivision;
  private String Refrigirator;
  private String microwave;

    public electronics(String telivision, String refrigirator, String microwave) {
        this.telivision = telivision;
        Refrigirator = refrigirator;
        this.microwave = microwave;
    }

    public String getTelivision() {
        return telivision;
    }

    public String getRefrigirator() {
        return Refrigirator;
    }

    public String getMicrowave() {
        return microwave;
    }

    public void TurnOn(String device)

    {
        System.out.println(device+" device is On");
    }
    public void TurnOff(String device)

    {
        System.out.println(device+" device is Off");
    }

}
