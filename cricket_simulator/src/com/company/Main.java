package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Cricket Game");
        Bowler bowler1 = new Bowler("bowler1");
        Batsman batsman1 = new Batsman("batsman1");
        GameSetUp gameSetUp = new GameSetUp();
        Match match1 = new Match(batsman1,bowler1,gameSetUp);
        match1.bowler.Bowl();
        match1.batsman.Bat();
        match1.gameSetUp.DisplayScore();


    }
}
