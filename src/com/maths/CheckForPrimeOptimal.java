package com.maths;

import java.util.Scanner;

public class CheckForPrimeOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is prime: ");
        int number = sc.nextInt();
        if (checkPrime(number)){
            System.out.println("It is a prime number.");
        }else{
            System.out.println("it is not.");
        }
    }
    static boolean checkPrime( int num ){
        int sqrtN = (int) Math.sqrt(num);
        int count = 0;
        for (int i = 1; i <= sqrtN ; i++) {
              if ( num % i == 0 ){
                  count++;

                  if( num / i != i ){
                      count++;
                  }

              }
        }
          return count == 2 ? true : false;
    }
}
