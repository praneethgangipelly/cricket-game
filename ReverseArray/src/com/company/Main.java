package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        int[] myIntegers = getIntegers(5);
	printArray(myIntegers);
        reverseArray(myIntegers);

    }
    public static Scanner scanner = new Scanner(System.in);

    public static  int[] getIntegers(int count){
        System.out.println("Enter " +count +"Integers");
        int[] array = new int[count];
        for (int i=0; i<array.length;i++)
        {
            int number= scanner.nextInt();
            scanner.nextLine();
            array[i]= number;
        }
        return array;
    }
    public static void printArray(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] array)
    {
        int MaxIndex = array.length-1;
        int halfLength = array.length/2;
        for (int i=0; i<halfLength; i++)
        {
            int temp= array[i];
            array[i] = array[MaxIndex-i];
            array[MaxIndex-i]= temp;



        }
        System.out.println(Arrays.toString(array));

    }
}
