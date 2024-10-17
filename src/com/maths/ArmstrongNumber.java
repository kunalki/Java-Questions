package com.maths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is Armstrong number: ");
        int n = sc.nextInt();
        if (checkArmstrongNumber(n)){
            System.out.println(n +" is an Armstrong number.");
        }
        else{
            System.out.println("No, its not.");
        }

    }
    static boolean checkArmstrongNumber( int num ){
        int len = String.valueOf(num).length();
        int copyNum = num;

        int sum = 0;
        while( copyNum > 0){
           int lastDigit = copyNum % 10;
           sum += Math.pow(lastDigit, len);
            copyNum /= 10;

        }
        return sum == num ? true : false;

    }
}
