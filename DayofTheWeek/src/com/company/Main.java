package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        for (int i=1; i<6; i++)
        {

            System.out.println("interest rate for "+i +"% is"+calcInterest(1000,i));

         }

         int count = 0;

        for (int i=100; i>1; i--)
        {


         if(isprime(i)==true){
             System.out.println("the number"+i +"is prime" );
             count++;
             }
         if(count==3){
             System.out.println("exiting for loop");
             break;

         }

        }

        }

         public static double calcInterest(double amount, double interestRate){
         return (amount*(interestRate/100));

         }

    public static boolean isprime(int n){
        if (n==1){
            return false;
        }
        for(int i=2; i<=n/2;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
}
}
