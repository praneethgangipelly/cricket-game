package com.company;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
	List<Account> accounts = new LinkedList<>();

// read a csv file and create an account based on data

        String file = "C:\\NewBankAccounts.csv";

        List<String[]> newAccountHolders = Utilities.CSV.read(file);

        for (String[] accountHolder : newAccountHolders)
        {

            System.out.println("New Account Holders:");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit= Double.parseDouble(accountHolder[3]) ;

            System.out.println(name+ " "+sSN + " "
                    + accountType + " " +initDeposit);
            if (accountType.equals("Savings"))
            {
               accounts.add(new savings(name,sSN,initDeposit));
                 }

                 else  if (accountType.equals("Checking")){

                accounts.add(new checking(name,sSN,initDeposit));
            }

            else{
                System.out.println("Error reading the account");
            }

        }
     for (Account acc: accounts){

            System.out.println("***********************************");
            acc.showInfo();
     }
    }
}
