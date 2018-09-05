package com.company;

public class Bowler {
    private  String Name;
    private int Overs;
    private int wickets;

    public Bowler(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getOvers() {
        return Overs;
    }

    public void setOvers(int overs) {
        Overs = overs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
}
