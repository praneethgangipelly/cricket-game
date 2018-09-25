package com.company;

public abstract class Account implements IBaseRate {

   private String name;
   private String sSN;
   private double balance;
   protected String accountNumber;
   protected double rate;
   private static  int index = 10000;

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public String setAccountNumber() {

        String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
        int uniqueId = index;
        int randomInteger = (int) (Math.random()* Math.pow(10,3));
        return lastTwoOfSSN + uniqueId+ randomInteger;
    }

    public void showInfo(){
        System.out.println("NAME : "+this.name
                          +"    ACCOUNT NUMBER:"+this.accountNumber
                          +"    BALANCE:"+ this.balance
                            +"  Rate:"+rate+"%"
        );
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawn amount: "+amount );
        printBalance();

    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited: "+amount );
        printBalance();
    }

    public void transfer(String whereto, double amount){
        balance = balance - amount;
        System.out.println("Transferring amount: " +amount +" to "+whereto);
        printBalance();
    }

    private void printBalance(){
        System.out.println("Balance:"+balance);
    }

    public void setRate() { }

    public void compound(){
        double accruedInterest = balance*(rate/100);
        System.out.println("Accrued Interest: "+accruedInterest);
    }
}
