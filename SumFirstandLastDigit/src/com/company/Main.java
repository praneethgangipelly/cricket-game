package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum of first and last number is"+SumFirstandLast(36));

    }

    public static int SumFirstandLast(int number)
    {
        if (number<0){
            return -1;
        }
        int LastDigit = number%10; //Remainder from dividing by 10 gives the last digit

        int length = 1; // Inorder to find the first digit we have to find the length and then divide
                        // the number, the quotient is the first digit

        int temp = number; //creating a temporary variable, so that it wont manipulate original number.
        while (temp>0)
        {

         temp = temp/10;
         length= length*10;


        }
        int FirstDigit = number/(length/10); // dividing number with length to find the quotient.
        int sum = FirstDigit + LastDigit;

        return sum;

     }

    }
