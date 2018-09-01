package com.company;

public class GameSetUp {
    private static int totalOvers = 20;

    private static int oversPerBowler= 4;

    private static String[] bowlOutcomes = {"wide", "noBall", "legal"};

    private int gameScore =0;

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    public String getBowlOutcome(){
         return bowlOutcomes[(int)(Math.random() * 3)];
    }
}
