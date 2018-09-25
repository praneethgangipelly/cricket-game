package com.company;

public class Bowler {
    private String name;

    private Match match;
    private static String[] bowlOutcomes = {"wide", "noBall", "goodLength",
                                                 "yorker","short","fullToss"};

    public Bowler(String name,Match match) {
        this.name = name;
        this.match = match;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void Bowl(){
        String bowlOutcome= bowlOutcomes[(int)(Math.random() * 7)];
        if(bowlOutcome.equals("wide")||bowlOutcome.equals("noball"))
        {
            this.match.setGameScore(this.match.getGameScore()+1);
        }
        else {

            if (this.match.getBalls()>=5)
            {
                this.match.setOvers(this.match.getOvers()+1);
                this.match.setBalls(0);
            }
            else
            {
                this.match.setBalls(this.match.getBalls()+1);
            }


        }

    }
}
