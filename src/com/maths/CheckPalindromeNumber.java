package com.maths;

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        if(checkPalindrome(num)){
            System.out.println("The given num is palindrome.");
        }
        else{
            System.out.println("The give number is not palindrome.");
        }
    }
    static boolean checkPalindrome(int n){
        if( n < 0){
            return false;
        }
        int ans = 0;
        int rem;
        int originalNum = n;
        while( n!= 0){
            rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        if( originalNum == ans ){
          return true;
        }
        return false;


//        boolean flag = false;
//        if(n < 0){
//            flag = true;
//        }
//        int rem;
//        int ans = 0;
//        int originalNumner = n;
//
//        while( n!= 0 ){
//            rem = n % 10;
//            ans = ans*10+rem;
//            n = n / 10;
//
//        }
//        if(flag){
//            return false;
//        }
//        return originalNumner == ans;

    }
}
