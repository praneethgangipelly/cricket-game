package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(1211));

    }
public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit ;
        int temp = number;
while(temp>0){

    lastDigit =temp % 10;
    reverse = reverse * 10;
    reverse = lastDigit + reverse;
    temp = temp/10;

}

if (number==reverse)
{
    return true;
}

else return false;
}

}
