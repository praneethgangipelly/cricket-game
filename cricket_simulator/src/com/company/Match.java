package com.company;

public class Match {


    private static int totalOvers = 20;

    private static int oversPerBowler= 4;

    private static int totalWickets =10;

    private int gameScore =0;

    private  int Wickets =0;
    private int overs=0;
    private int balls=0;


    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    public int getWickets() {
        return Wickets;
    }

    public void setWickets(int wickets) {
        Wickets = wickets;
    }

    public void DisplayScore(){
        System.out.println(this.gameScore+"/"+this.Wickets);
        System.out.println(this.getOvers()+"."+this.getBalls());
    }

   public boolean IsGameOver(){

        return this.overs>=20||this.Wickets>=10;
}
}
