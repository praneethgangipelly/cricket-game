package com.company;

public class savings extends Account {

    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    public savings(String name,String sSN,double initDeposit) {
        super(name,sSN,initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    public void setSafetyDepositBox(){
        safetyDepositBoxId = (int)(Math.random()*Math.pow(10,3));
        safetyDepositBoxKey= (int)(Math.random()*Math.pow(10,4));

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account type : Savings"+
                 "\n"+"SafetyBoxId: "+safetyDepositBoxId+
                 "\n"+"SafetyBoxKey: "+safetyDepositBoxKey);
    }

    @Override
    public void setRate() {
        rate = getBaseRate()-0.25;
    }
}
