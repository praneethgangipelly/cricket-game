package com.company;

public class checking extends Account {

    // List properties specific to checking account
    // List methods specific to checking account

    private int debitCardNumber;
    private int debitCardPin;

    public checking(String name, String sSN, double initDeposit) {
        super(name,sSN,initDeposit);
        accountNumber = "2"+ accountNumber;
        setDebitCard();
    }

    public void setDebitCard(){
        debitCardNumber = (int)(Math.random()*Math.pow(10,12));
        debitCardPin= (int)(Math.random()*Math.pow(10,4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account type : Checking "+
                        "\n"+"Debit card number: "+debitCardNumber+
                        "\n"+"Debit card pin: " +debitCardPin);
    }

    @Override
    public void setRate() {
        rate = getBaseRate() *0.15;
    }
}
