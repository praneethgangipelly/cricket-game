package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter the number of elements");
        int count = scanner.nextInt();
        scanner.nextLine();

int[] myIntegers = getIntegers(count);
int minimum = minValue(myIntegers);
        System.out.println("Min value is : "+minimum);

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
    public static int minValue(int[] array)
    {
//        int[] tempArray = Arrays.copyOf(array,array.length); //code for ascending order
//        boolean flag = true;
//        int temp;
//        while(flag) {
//            flag = false;
//
//            for (int i = 0; i < tempArray.length-1; i++)
//            {
//                if (tempArray[i] > tempArray[i + 1])
//                {
//                    temp = tempArray[i];
//
//                    tempArray[i] = tempArray[i+1];
//
//                    tempArray[i + 1] = temp;
//                    flag = true;
//                }
//            }
//
//        }
//        return tempArray[0]; // The first element is the minimum when rearranged in ascending

int min = Integer.MAX_VALUE;
for (int i=0; i<array.length;i++)
{
    int value = array[i];

    if(array[i]<min)
    {
        min = value;
    }
}

return min;
    }

    public static void printArray(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }

}
