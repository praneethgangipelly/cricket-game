package com.company;

public class BankAccount {


   private int Number ;

    private  String CustomerName, Emailadress, phoneNumber;

   private float Balance;

   public BankAccount(){
       System.out.println("Empty constructor called");

   }

public BankAccount(String CustomerName, String Emailadress, String phoneNumber, int Number, float Balance){
       this.CustomerName = CustomerName;
       this.Emailadress = Emailadress  ;
       this.phoneNumber = phoneNumber  ;
       this.Number      = Number       ;
       this.Balance     = Balance      ;


}
    public void DepositFunds(float depositamount) {
        this.Balance += depositamount ;
        System.out.println("Deposit of "+depositamount+ " is Made. " +"Current balance is:"+this.Balance);

    }

    public void WithdrawFunds(float withdrawamount) {
        if (this.Balance - withdrawamount<0) {
            System.out.println("Insufficient Funds Balance available: " + this.Balance);
        }
            else{
                this.Balance -= withdrawamount;
            System.out.println("Withdrawal Amount"+ withdrawamount+"processed"+ "Current Balance : " + this.Balance);
            }
        }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmailadress() {
        return Emailadress;
    }

    public void setEmailadress(String emailadress) {
        Emailadress = emailadress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }
}


