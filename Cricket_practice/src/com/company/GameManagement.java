package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;



public class GameManagement {
}
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cricket_new;

        import java.util.InputMismatchException;
        import java.util.Random;
        import java.util.Scanner;
        import java.util.Vector;

public class GameManagement {
    Scanner input;
    Random rand;
    GameCondition begining;
    GameSummary ending;
    private int duration;
    private int target;
    private int flag;
    private int score;
    private int runs;
    private int extras;
    private int wickets;
    private int overs;
    private String how;
    private Vector<Batsman> bt;
    private Vector<Bowler> bl;

    public GameManagement() {
        this.input = new Scanner(System.in);
        this.rand = new Random();
        this.begining = new GameCondition();
        this.ending = new GameSummary();
        this.bt = new Vector();
        this.bl = new Vector();
    }

    public static void main(String[] var0) {
        GameManagement var1 = new GameManagement();
        var1.KeepGoing();
    }

    private void KeepGoing() {
        this.begining.showCredits();
        this.begining.showMenue();
        this.begining.showControlls();
        this.addPlayers();
        this.setBowlers(this.begining.getCountry());
        this.setTarget(this.begining.getType(), this.begining.getDifficulty());
        this.readyToPlay();
        this.playInning();
        this.getFinal();
        this.ending.getProfiles(this.target, this.duration, this.runs, this.extras, this.wickets, this.overs, this.bt, this.bl);
    }

    private void addPlayers() {
        int var1;
        for(var1 = 0; var1 < 10; ++var1) {
            this.bt.add(new Batsman(var1 + 1));
        }

        for(var1 = 0; var1 < 6; ++var1) {
            this.bl.add(new Bowler());
        }

    }

    private void setBowlers(int var1) {
        ((Bowler)this.bl.get(0)).setAction("Fast");
        ((Bowler)this.bl.get(0)).setIaction(0);
        ((Bowler)this.bl.get(1)).setAction("Fast");
        ((Bowler)this.bl.get(1)).setIaction(0);
        ((Bowler)this.bl.get(2)).setAction("Fast");
        ((Bowler)this.bl.get(2)).setIaction(0);
        ((Bowler)this.bl.get(3)).setAction("Fast");
        ((Bowler)this.bl.get(3)).setIaction(0);
        ((Bowler)this.bl.get(4)).setAction("Spin");
        ((Bowler)this.bl.get(4)).setIaction(1);
        ((Bowler)this.bl.get(5)).setAction("Spin");
        ((Bowler)this.bl.get(5)).setIaction(1);
        switch(var1) {
            case 1:
                ((Bowler)this.bl.get(0)).setName("Bret Lee");
                ((Bowler)this.bl.get(1)).setName("Michel Jhonson");
                ((Bowler)this.bl.get(2)).setName("Stuart Clarke");
                ((Bowler)this.bl.get(3)).setName("Shon Tait");
                ((Bowler)this.bl.get(4)).setName("Andrew Simond");
                ((Bowler)this.bl.get(5)).setName("Brad Hog");
                break;
            case 2:
                ((Bowler)this.bl.get(0)).setName("Chaminda Vass");
                ((Bowler)this.bl.get(1)).setName("Lasith Malinga");
                ((Bowler)this.bl.get(2)).setName("Dilhara Fernando");
                ((Bowler)this.bl.get(3)).setName("Fervees Maharoof");
                ((Bowler)this.bl.get(4)).setName("Muththaia Muralidaran");
                ((Bowler)this.bl.get(5)).setName("Ajantha Mendis");
                break;
            case 3:
                ((Bowler)this.bl.get(0)).setName("Zaheer Khan");
                ((Bowler)this.bl.get(1)).setName("Ishant Sharma");
                ((Bowler)this.bl.get(2)).setName("R.P. Sing");
                ((Bowler)this.bl.get(3)).setName("Munaf Patel");
                ((Bowler)this.bl.get(4)).setName("Harbajan Sing");
                ((Bowler)this.bl.get(5)).setName("Anil Kumble");
                break;
            case 4:
                ((Bowler)this.bl.get(0)).setName("Mohomad Aseef");
                ((Bowler)this.bl.get(1)).setName("Sohel Tanveer");
                ((Bowler)this.bl.get(2)).setName("Shoib Akthar");
                ((Bowler)this.bl.get(3)).setName("Umar Gull");
                ((Bowler)this.bl.get(4)).setName("Shaheed Afridi");
                ((Bowler)this.bl.get(0)).setName("Shoib Malik");
                break;
            case 5:
                ((Bowler)this.bl.get(0)).setName("Steve Harmison");
                ((Bowler)this.bl.get(1)).setName("James Anderson");
                ((Bowler)this.bl.get(2)).setName("Andrew Flintof");
                ((Bowler)this.bl.get(3)).setName("Rayon Sidebottom");
                ((Bowler)this.bl.get(4)).setName("Monti Panesar");
                ((Bowler)this.bl.get(5)).setName("Ashly Giles");
                break;
            case 6:
                ((Bowler)this.bl.get(0)).setName("Shane Bond");
                ((Bowler)this.bl.get(1)).setName("Jacob Oram");
                ((Bowler)this.bl.get(2)).setName("Darel Tuffy");
                ((Bowler)this.bl.get(3)).setName("James Franklin");
                ((Bowler)this.bl.get(4)).setName("Daniel Vitory");
                ((Bowler)this.bl.get(5)).setName("Jeetan Patel");
        }

    }

    private void setTarget(int var1, int var2) {
        switch(var1) {
            case 1:
                this.duration = 5;
                break;
            case 2:
                this.duration = 10;
                break;
            case 3:
                this.duration = 20;
        }

        switch(var2) {
            case 1:
                switch(this.duration) {
                    case 5:
                        this.target = this.duration * 6 + this.rand.nextInt(10);
                        return;
                    case 10:
                        this.target = this.duration * 5 + this.rand.nextInt(10);
                        return;
                    case 20:
                        this.target = this.duration * 4 + this.rand.nextInt(10);
                        return;
                    default:
                        return;
                }
            case 2:
                switch(this.duration) {
                    case 5:
                        this.target = this.duration * 8 + this.rand.nextInt(10);
                        return;
                    case 10:
                        this.target = this.duration * 7 + this.rand.nextInt(10);
                        return;
                    case 20:
                        this.target = this.duration * 6 + this.rand.nextInt(10);
                        return;
                    default:
                        return;
                }
            case 3:
                switch(this.duration) {
                    case 5:
                        this.target = this.duration * 10 + this.rand.nextInt(10);
                        break;
                    case 10:
                        this.target = this.duration * 9 + this.rand.nextInt(10);
                        break;
                    case 20:
                        this.target = this.duration * 8 + this.rand.nextInt(10);
                }
        }

    }

    private void readyToPlay() {
        System.out.println("\n\nTarget to be achieved: " + this.target);
        System.out.println("\nMaximum number of overs to be faced: " + this.duration);

        int var1;
        try {
            System.out.print("\n\nPress 9 to play  or  Press 7 to exit : ");
            var1 = this.input.nextInt();
        } catch (InputMismatchException var3) {
            var1 = 0;
        }

        if (var1 == 7) {
            System.exit(0);
        } else if (var1 == 9) {
            System.out.println("\n\nGet Ready! Game is about to begin.....\n");
        } else {
            this.readyToPlay();
        }

    }

    private void getResult(int var1, int var2, int var3) {
        int var4;
        switch(var2) {
            case 1:
            case 2:
            case 3:
                switch(var1) {
                    case 0:
                        if (var3 == 2) {
                            this.flag = 0;
                            this.score = 0;
                            var4 = this.rand.nextInt(2);
                            switch(var4) {
                                case 0:
                                    this.how = "LBW";
                                    return;
                                case 1:
                                    this.how = "Bowled";
                            }
                        } else {
                            this.flag = 1;
                            this.score = 0;
                        }

                        return;
                    case 1:
                        this.flag = 1;
                        this.score = 0;
                        return;
                    case 2:
                        var4 = this.rand.nextInt(7);
                        switch(var4) {
                            case 0:
                                this.flag = 0;
                                this.score = 0;
                                this.how = "Caught";
                                return;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                this.flag = 1;
                                this.score = this.rand.nextInt(7);
                                if (this.score == 5) {
                                    this.score = 4;
                                }

                                return;
                            case 6:
                                this.flag = 0;
                                this.score = 1;
                                this.how = "Run Out";
                                return;
                            default:
                                return;
                        }
                    case 3:
                        this.flag = 1;
                        this.score = this.rand.nextInt(5);
                        return;
                    case 4:
                        var4 = this.rand.nextInt(8);
                        switch(var4) {
                            case 0:
                            case 1:
                                this.flag = 0;
                                this.score = 0;
                                this.how = "Caught";
                                return;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.flag = 1;
                                this.score = this.rand.nextInt(7);
                                if (this.score == 5) {
                                    this.score = 1;
                                }

                                return;
                            case 9:
                                this.flag = 0;
                                this.score = 2;
                                this.how = "Run Out";
                                return;
                            default:
                                return;
                        }
                    case 5:
                        var4 = this.rand.nextInt(5);
                        switch(var4) {
                            case 0:
                            case 1:
                                this.flag = 0;
                                this.score = 0;
                                this.how = "Caught";
                                return;
                            case 2:
                            case 3:
                            case 4:
                                this.flag = 1;
                                this.score = this.rand.nextInt(7);
                                if (this.score == 5) {
                                    this.score = 4;
                                }

                                return;
                            default:
                                return;
                        }
                    case 6:
                        var4 = this.rand.nextInt(10);
                        switch(var4) {
                            case 0:
                                this.flag = 0;
                                this.score = 0;
                                this.how = "Caught";
                                return;
                            case 1:
                                this.flag = 0;
                                this.score = 0;
                                this.how = "Bowled";
                                return;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                this.flag = 1;
                                this.score = this.rand.nextInt(7);
                                if (this.score == 5) {
                                    this.score = 2;
                                }

                                return;
                            case 8:
                            case 9:
                                int var5 = this.rand.nextInt(3);
                                switch(var5) {
                                    case 0:
                                    case 1:
                                        this.flag = 0;
                                        this.score = 0;
                                        this.how = "Stumped";
                                        return;
                                    case 2:
                                    default:
                                        return;
                                    case 3:
                                        this.flag = 0;
                                        this.score = 1;
                                        this.how = "Run Out";
                                        return;
                                }
                            default:
                                return;
                        }
                    default:
                        if (var3 == 2) {
                            this.flag = 0;
                            this.score = 0;
                            var4 = this.rand.nextInt(2);
                            switch(var4) {
                                case 0:
                                    this.how = "LBW";
                                    return;
                                case 1:
                                    this.how = "Bowled";
                            }
                        } else {
                            this.flag = 1;
                            this.score = 0;
                        }

                        return;
                }
            case 4:
                switch(var1) {
                    case 0:
                        this.flag = 1;
                        this.score = 0;
                        return;
                    case 1:
                        var4 = this.rand.nextInt(5);
                        switch(var4) {
                            case 0:
                                this.flag = 0;
                                this.score = 0;
                                this.how = "Caught";
                                return;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                this.flag = 1;
                                this.score = 0;
                                return;
                            default:
                                return;
                        }
                    case 2:
                    case 4:
                    case 5:
                        var4 = this.rand.nextInt(7);
                        switch(var4) {
                            case 0:
                            case 1:
                                this.flag = 0;
                                this.score = 0;
                                this.how = "Caught";
                                return;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                this.flag = 1;
                                this.score = this.rand.nextInt(7);
                                if (this.score == 5) {
                                    this.score = 4;
                                }

                                return;
                            case 6:
                                this.flag = 0;
                                this.score = 2;
                                this.how = "Run Out";
                                return;
                            default:
                                return;
                        }
                    case 3:
                    case 6:
                        this.flag = 0;
                        this.score = 0;
                        this.how = "Caught";
                        return;
                    default:
                        this.flag = 1;
                        this.score = 0;
                        return;
                }
            case 5:
                if (var3 == 2) {
                    switch(var1) {
                        case 1:
                            var4 = this.rand.nextInt(3);
                            switch(var4) {
                                case 0:
                                    this.flag = 1;
                                    this.score = 0;
                                    return;
                                case 1:
                                    this.flag = 0;
                                    this.score = 0;
                                    this.how = "Bowled";
                                    return;
                                case 2:
                                    this.flag = 0;
                                    this.score = 0;
                                    this.how = "LBW";
                                    return;
                                default:
                                    return;
                            }
                        default:
                            this.flag = 0;
                            this.score = 0;
                            var4 = this.rand.nextInt(2);
                            switch(var4) {
                                case 0:
                                    this.how = "Bowled";
                                    return;
                                case 1:
                                    this.how = "LBW";
                            }
                    }
                } else {
                    this.flag = 1;
                    this.score = 0;
                }
                break;
            case 6:
            case 7:
                switch(var1) {
                    case 0:
                        if (var3 == 2) {
                            this.flag = 0;
                            this.score = 0;
                            var4 = this.rand.nextInt(2);
                            switch(var4) {
                                case 0:
                                    this.how = "LBW";
                                    return;
                                case 1:
                                    this.how = "Bowled";
                            }
                        } else {
                            this.flag = 1;
                            this.score = 0;
                        }
                        break;
                    case 1:
                        var4 = this.rand.nextInt(6);
                        switch(var4) {
                            case 0:
                                this.flag = 0;
                                this.score = 0;
                                this.how = "Caught";
                                return;
                            case 1:
                                this.flag = 0;
                                this.score = 0;
                                this.how = "Stumped";
                                return;
                            default:
                                this.flag = 1;
                                this.score = 0;
                                return;
                        }
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        var4 = this.rand.nextInt(13);
                        if (var4 <= 6) {
                            this.flag = 1;
                            this.score = var4;
                            if (this.score == 5) {
                                this.score = 0;
                            }
                        } else {
                            this.flag = 1;
                            this.score = 0;
                            switch(var4) {
                                case 7:
                                case 8:
                                    this.how = "caught";
                                    return;
                                case 9:
                                case 10:
                                case 11:
                                    this.how = "Stumped";
                                    return;
                                case 12:
                                    this.how = "Run Out";
                            }
                        }
                        break;
                    default:
                        if (var3 == 2) {
                            this.flag = 0;
                            this.score = 0;
                            var4 = this.rand.nextInt(2);
                            switch(var4) {
                                case 0:
                                    this.how = "LBW";
                                    break;
                                case 1:
                                    this.how = "Bowled";
                            }
                        } else {
                            this.flag = 1;
                            this.score = 0;
                        }
                }
        }

    }

    private void playInning() {
        int var1 = this.duration / 5;
        int var2 = 0;
        int[] var3 = new int[this.duration + 1];

        while(this.overs < this.duration && this.wickets < 10 && this.runs < this.target) {
            int var4 = this.rand.nextInt(6);
            if (((Bowler)this.bl.get(var4)).getOvers() < var1 & var3[this.overs] != var4) {
                ((Bowler)this.bl.get(var4)).setOvers(((Bowler)this.bl.get(var4)).getOvers() + 1);
                ((Bowler)this.bl.get(var4)).setHow("Bowled");
                ++this.overs;

                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException var10) {
                    System.out.println(var10);
                }

                System.out.println("\n\n\n**********************************");
                System.out.println("Starting the over no:" + this.overs + "\n\n");
                System.out.println("Overs remaining: " + (this.duration - this.overs + 1));
                System.out.println("Runs to be collected: " + (this.target - this.runs));
                System.out.println("Wickets in hand: " + (10 - this.wickets));
                System.out.println("**********************************\n");

                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException var9) {
                    System.out.println(var9);
                }

                int var5 = 1;

                while(var5 < 7) {
                    ((Bowler)this.bl.get(var4)).deliverBall();
                    if (((Bowler)this.bl.get(var4)).getFlag() == 0) {
                        ((Bowler)this.bl.get(var4)).setRuns(((Bowler)this.bl.get(var4)).getRuns() + 1);
                        ((Bowler)this.bl.get(var4)).setExtras(((Bowler)this.bl.get(var4)).getExtras() + 1);
                        ++this.extras;
                        ++this.runs;

                        try {
                            Thread.sleep(2000L);
                        } catch (InterruptedException var8) {
                            System.out.println(var8);
                        }

                        System.out.println("\n\n" + ((Bowler)this.bl.get(var4)).getName() + " " + ((Bowler)this.bl.get(var4)).getAction() + " " + "Bowler " + "Bowling: " + ((Bowler)this.bl.get(var4)).getExtra());
                        System.out.println("Total Number of extras: " + this.extras);
                        System.out.println("Total Score: " + this.runs);
                        if (this.runs >= this.target) {
                            break;
                        }
                    } else {
                        ++var5;
                        ((Batsman)this.bt.get(var2)).setBalls(((Batsman)this.bt.get(var2)).getBalls() + 1);

                        try {
                            Thread.sleep(2000L);
                        } catch (InterruptedException var7) {
                            System.out.println(var7);
                        }

                        System.out.print("\n\n" + ((Bowler)this.bl.get(var4)).getName() + " " + ((Bowler)this.bl.get(var4)).getAction() + " " + "Bowler " + "Bowling: " + ((Bowler)this.bl.get(var4)).getType() + " ball on " + ((Bowler)this.bl.get(var4)).getDirection());
                        ((Batsman)this.bt.get(var2)).payShot(((Bowler)this.bl.get(var4)).getIaction(), ((Bowler)this.bl.get(var4)).getItype(), ((Bowler)this.bl.get(var4)).getIdirection());
                        System.out.println("You " + ((Batsman)this.bt.get(var2)).getShot());
                        this.getResult(((Batsman)this.bt.get(var2)).getIshot(), ((Bowler)this.bl.get(var4)).getItype(), ((Bowler)this.bl.get(var4)).getIdirection());
                        this.runs += this.score;
                        ((Batsman)this.bt.get(var2)).setRuns(((Batsman)this.bt.get(var2)).getRuns() + this.score);
                        ((Bowler)this.bl.get(var4)).setRuns(((Bowler)this.bl.get(var4)).getRuns() + this.score);
                        if (this.flag == 0) {
                            System.out.println("Out!!!..How: " + this.how);
                            ++this.wickets;
                            ((Bowler)this.bl.get(var4)).setWickets(((Bowler)this.bl.get(var4)).getWickets() + 1);
                            ((Batsman)this.bt.get(var2)).setHow(this.how);
                            System.out.println("Wicket No: " + this.wickets);
                            System.out.println("Score for the previous ball: " + this.score);
                            System.out.println("Total Score: " + this.runs);
                            if (this.runs >= this.target || this.wickets >= 10) {
                                break;
                            }

                            ++var2;
                            ((Batsman)this.bt.get(var2)).setHow("Not out");
                        } else {
                            System.out.println("Score for the previous ball: " + this.score);
                            System.out.println("Total Score: " + this.runs);
                            if (this.runs >= this.target) {
                                break;
                            }
                        }
                    }
                }

                var3[this.overs] = var4;
            }
        }

    }

    private void getFinal() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException var2) {
            System.out.println(var2);
        }

        System.out.println("\n\n\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44\n");
        if (this.runs >= this.target) {
            System.out.println("\n\nCongratulation! You Won !");
        } else if (this.runs == this.target - 1) {
            System.out.println("\n\nScores are Level !");
        } else {
            System.out.println("\n\nSorry! You Lost !");
        }

    }
}


