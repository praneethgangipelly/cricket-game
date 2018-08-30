package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       // BankAccount Praneeth = new BankAccount("Gangipelly", "Email@gmail.com", "55225145", 53252, 500);

//        System.out.println(Praneeth.getBalance());
//
//        Praneeth.WithdrawFunds(100);
//        Praneeth.DepositFunds(200);
//
//        Praneeth.WithdrawFunds(180);
//        Praneeth.WithdrawFunds(30);

        VipCustomer JohnDoe = new VipCustomer();
        System.out.println(JohnDoe.getName());

        VipCustomer JohnWick = new VipCustomer("johnwick","johnwick@email.com");
        System.out.println(JohnWick.getCreditlimit());
    }
}
