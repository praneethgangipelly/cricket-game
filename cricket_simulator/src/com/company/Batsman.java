package com.company;

public class Batsman extends GameSetUp{

    private String Name;

    private int runsScored;

    private int ballsFaced;

    public Batsman(String name) {
        Name = name;
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
        String battingOutcome = this.getBattingOutcome();
        System.out.println(battingOutcome);

        if (battingOutcome.equals("wicket")) {
            this.setWickets(this.getWickets()+1);
        }
        else
        {
            int runs= (int)(Math.random() * 7);
            this.runsScored+=runs;
            this.setGameScore(this.getGameScore()+runs);
        }

    }

}
