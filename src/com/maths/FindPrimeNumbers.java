package com.maths;

import javax.swing.plaf.IconUIResource;

public class FindPrimeNumbers {
    public static void main(String[] args) {
          /*


          int num = 12;
           int i = 1;
           int count = 0;
            while ( i <= num ){
                 if ( num % i == 0 ){
                     count++;
            }
                 i++;
        }
          if( count == 2 ){
              System.out.println("It is a prime number.");
          }else{
              System.out.println("noooooooooooooooo........");
          }

          */
        int count = 0;
        for (int i = 2; i < 20 ; i++) {
             if( checkPrime(i)){
//                count++;
                 System.out.println(i);
             }
        }
//        System.out.println(count);

    }

    public static boolean checkPrime( int num ){
        if ( num <= 1 ){
            return false;
        }
           int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
                   if( num % i == 0){
                       count++;

                       if( num / i != i){
                                count++;
                       }
                   }
        }
        return count == 2 ? true : false;
    }
}
