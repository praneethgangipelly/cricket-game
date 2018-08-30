package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("sum of the digits is"+sumDigits(1234));
    }
    public static int sumDigits(int number){

if (number<10){

    return -1;
}


    int sum =0;

    while (number>0){
//Extracting the least significant digit
        int digit =number%10;

        sum += digit;

        number=number/10;

    }
    return  sum;

   }
}
