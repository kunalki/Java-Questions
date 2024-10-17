package com.maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintDivisorsOptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check the divisor of : ");
        int n = sc.nextInt();
        List<Integer> integers = printDivisors(n);
        for(int i : integers ){
            System.out.print(i + " ");
        }


    }

    static List<Integer> printDivisors(int num ){
        List<Integer> list = new ArrayList<>();
           int sqrtN = (int) Math.sqrt(num);
        for (int i = 1; i <= sqrtN; i++) {
                if( num % i == 0 ){
                   list.add(i);

                if( num/i != i ){
                    list.add( num / i );
                }
                }
        }
        return list;
    }
}
