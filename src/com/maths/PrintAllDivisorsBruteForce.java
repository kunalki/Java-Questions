package com.maths;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAllDivisorsBruteForce {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check the divisor of : ");
        int n = sc.nextInt();
/*
        This is without the extra method.

        for (int i = 1; i <= num ; i++) {
            if( num % i == 0 ){
                System.out.println(i);
            }

        }
*/


        int[] divisorsArray = findDivisors(n);
        System.out.println(Arrays.toString(divisorsArray));
    }
    static int[] findDivisors(int num){
//         for the count of the divisors we declared a variable called count and initialised 0 in it.
           int count = 0;
        for (int i = 1; i <= num; i++) {
            if( num % i == 0 ){
                 count++;
            }
        }

//         Declaring an array of the size of the count ( total number of the divisors )
        int[] divisors = new int[count];

//         Declaring a variable called for the indexing of the array in the loop
        int index = 0;

        // second loop for to store all the divisors of the number.
        for (int i = 1; i <= num; i++) {
                 if( num % i == 0 ){
                     divisors[index++] = i;
                 }
        }
        return divisors;

    }

}
