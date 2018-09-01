package com.company;

public class Bowler extends GameSetUp {
    private String name;
    private int overs=0;
    private int balls=0;
    private int wickets=0;

    public Bowler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
    public void Bowl(){
        String bowlOutcome= this.getBowlOutcome();
        if(bowlOutcome.equals("wide")||bowlOutcome.equals("noball"))
        {
            this.setGameScore(this.getGameScore()+1);
        }
        else {

            if (this.balls>=5)
            {
                this.overs++;
                this.balls=0;
            }
            else
            {
                this.balls++;
            }


        }

    }
}
