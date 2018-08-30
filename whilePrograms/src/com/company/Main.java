package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 4;
        int finishnumber = 20;
        int i =0;
        while (number<=finishnumber)
        {

            number++;
            if(!isEven(number))
            {
                continue;
            }

                System.out.println("Even number is"+number);
                    i++;
                    if (i==5)
                    {
                        System.out.println("Total number of Even numbers found are"+i);
                        break;
                    }


        }
    }
    public static boolean isEven(int number){
        if (number%2==0){
            return true;
        }
        else
            return false;
    }
}
