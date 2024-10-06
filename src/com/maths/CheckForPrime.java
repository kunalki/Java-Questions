package com.maths;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if prime: ");
        int num = sc.nextInt();
        if(checkPrime(num)){
            System.out.println("The num is prime.");
        }else{
            System.out.println("The num is not prime.");
        }
    }
    static boolean checkPrime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if( n % i == 0 ){
                count++;
            }

        }
        if( count == 2 ){
            return true;
        }
        else{
            return false;
        }
    }
}
