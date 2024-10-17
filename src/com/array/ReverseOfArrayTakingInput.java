package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArrayTakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array that you want to create: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the elements that you want to have in the array space separated: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int[] reverse = reverse(array);
//        System.out.println(Arrays.toString(reverse));
        for ( int elem : reverse ){
            System.out.print(elem + " ");
        }

    }
    static int[] reverse(int[] arr){
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length -1 - i];
        }
        return newArray;
    }
}

// 25 63 41 78 96
