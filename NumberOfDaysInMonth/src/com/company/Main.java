package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isLeapYear(45));
        System.out.println(DaysInmonth(2001,2));
    }
    public static boolean isLeapYear(int year){
       if (year<1 || year>9999){
           return false;
       }

        if ( ((year%4==0) && (year % 100!=0)) || year%400==0 )
        {
            return true;
        }
           return false;
    }
public static int DaysInmonth(int year, int month){
        if (year <1 ||year >9999 || month<1 || month>12) {
            return -1;
        }
        switch ( month){
            case 1:
                return 31;

            case 2:
                if (isLeapYear(year))
                {
                    return 29;
                }
                else
                {
                    return 28;
                }

                case 3:

                    return 31;

            case 4:
                return 30;

            case 5:
                return 31;

            case 6:
                return 30;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 30;

            case 10:
                return 31;

            case 11:
                return 30;

            case 12:
                return 31;

default:
    return -1;
        }

}

}
