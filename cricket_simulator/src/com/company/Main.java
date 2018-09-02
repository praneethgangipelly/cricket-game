package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Cricket Game");
        Match match1 = new Match();
        Bowler bowler1 = new Bowler("bowler1",match1);
        Batsman batsman1 = new Batsman("batsman1",match1);

    while (!match1.IsGameOver()) {
        bowler1.Bowl();

        batsman1.Bat();


    }
        match1.DisplayScore();
    }
}
