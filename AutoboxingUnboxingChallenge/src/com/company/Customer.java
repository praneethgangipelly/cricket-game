package com.company;

import java.util.ArrayList;

public class Customer {
    private  String Name ;


    private ArrayList<Double> Transactions ;

    public Customer(String name, double InitialAmount) {
        this.Name = name;

        this.Transactions = new ArrayList<Double>();
        AddTransaction(InitialAmount);
    }

    public String getName() {
        return Name;
    }

    public ArrayList<Double> getTransactions() {
        return Transactions;
    }

    public void AddTransaction(double amount){
        Transactions.add(amount);
    }


}
