package com.company;

public class Batsman {
    private String name;
    private int runs;
    private int ballsFaced;
    private double strikeRate= ballsFaced/runs;

    public Batsman(String name) {
        this.name = name;
    }

    public int getRuns() {
        if (runs>=0)
            return runs;
        else
            return -1;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(int ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public double getStrikeRate() {
        return runs/ballsFaced;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }
}
