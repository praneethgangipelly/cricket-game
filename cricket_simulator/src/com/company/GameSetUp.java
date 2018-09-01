package com.company;

public class GameSetUp {
    private static int totalOvers = 20;

    private static int oversPerBowler= 4;

    private static String[] bowlOutcomes = {"wide", "noBall", "legal"};

    private int gameScore =0;

    private static int totalWickets =10;

    private  int Wickets =0;
    private static String[] battingOutcomes = {"wicket","runs"};

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    public String getBowlOutcome(){
         return bowlOutcomes[(int)(Math.random() * 3)];
    }
    public String getBattingOutcome(){
        return battingOutcomes[(int)(Math.random() * 2)];
    }

    public int getWickets() {
        return Wickets;
    }

    public void setWickets(int wickets) {
        Wickets = wickets;
    }

    public void DisplayScore(){
        System.out.println(this.gameScore+"/"+this.Wickets);
    }
}
