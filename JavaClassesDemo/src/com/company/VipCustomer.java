package com.company;

public class VipCustomer {

    private String Name ;
    private float Creditlimit ;
    private  String Emailadress;

    public VipCustomer(){

    this("abc",1000,"email1@email.com");
    System.out.println("Empty Constructor called");
    }

    public VipCustomer(String Name, String Emailadress){

        this(Name,2000,Emailadress );

        System.out.println("constructor with two parameters called");


    }
    public VipCustomer(String Name, float Creditlimit, String Emailadress){
        System.out.println("constructor with 3 parameters called");
        this.Name = Name;
        this.Creditlimit= Creditlimit;
        this.Emailadress = Emailadress;

    }

    public String getName() {
        return Name;
    }

    public float getCreditlimit() {
        return Creditlimit;
    }

    public String getEmailadress() {
        return Emailadress;
    }
}
