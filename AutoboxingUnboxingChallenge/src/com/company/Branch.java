package com.company;

import java.util.ArrayList;


public class Branch {

   private String Branchname ;

   private ArrayList<Customer> customerArrayList ;

    public Branch(String branchname) {
        Branchname = branchname;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public String getBranchname() {
        return Branchname;
    }

    public boolean AddCustomer(String name, double amount){

      if (findCustomer(name)==null) {
      customerArrayList.add(new Customer(name, amount));
      return  true;

     }
        return false;
    }

    public boolean GenTransaction(String CustomerName,double amount){

            Customer existingCustomer = findCustomer(CustomerName);
            if (existingCustomer!=null) {

                existingCustomer.AddTransaction(amount);
            return true;
            }
            return  false;
        }
private Customer findCustomer(String CustomerName){
        for (int i=0;i<customerArrayList.size();i++){

            String existingCustomerName = customerArrayList.get(i).getName();
            if (existingCustomerName.equals(CustomerName))
            {
                return customerArrayList.get(i);
            }


        }
    return null;

}

}
