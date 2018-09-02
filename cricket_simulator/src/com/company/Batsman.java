package com.company;

public class Batsman {

    private String Name;

    private int runsScored;

    private int ballsFaced;

    private Match match;

    private static String[] battingOutcomes = {"wicket","0","1","2","3","4","5","6"};

    public Batsman(String name,Match match) {
        this.Name = name;
        this.match = match;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(int ballsFaced) {
        this.ballsFaced = ballsFaced;
    }


    private double strikeRate(){
       return runsScored/ballsFaced;
    }

    public void Bat()
    {
        String battingOutcome = battingOutcomes[(int)(Math.random() *7 )];


        if (battingOutcome.equals("wicket")) {
            this.match.setWickets(this.match.getWickets()+1);
        }
        else
        {
            int runs= Integer.parseInt(battingOutcome);
            this.runsScored+=runs;
            this.match.setGameScore(this.match.getGameScore()+runs);
        }

    }

}
