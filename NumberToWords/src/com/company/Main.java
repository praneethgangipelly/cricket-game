package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       numbersToWords(100);

    }

    public static int Reverse(int number) {
        int reverse = 0;
        int lastDigit;
        int temp = number;
        while (temp > 0) {

            lastDigit = temp % 10;
            reverse = reverse * 10;
            reverse = lastDigit + reverse;
            temp = temp / 10;

        }

    return reverse;

    }

    public static int getDigitCount(int number)
    {

        int length =0;
        int temp = number;
        while (temp>0){
            temp =temp/10;
            length++;

     }
return length;

    }

    public static void numbersToWords(int number)

    {
     if (number<0)
     {
    System.out.println("Invalid Value");
                  }

int temp = Reverse(number);



    for (int i = 0; i < getDigitCount(Reverse(number)); i++) {


        int digit = temp % 10;

        switch (digit)

        {


            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;

            case 6:
                System.out.println("Six");
                break;

            case 7:
                System.out.println("Seven");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("invalid Value");
                break;
        }

        temp = temp / 10;

         }
        if (getDigitCount(number)!=getDigitCount(Reverse(number))) {

        int diffInDigitCount =getDigitCount(number)- Reverse(number);

        for (int i=0; i<diffInDigitCount;i++){
            System.out.println("zero");

        }
    }

       }
    }


