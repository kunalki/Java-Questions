package com.array;

import java.util.Scanner;

public class FindTheElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array that you want to create: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements in the array space separated: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element that you want to find in the array: ");
        int element = sc.nextInt();
          if(findElement(array, element)){
           System.out.println("Element found");
       }
       else{
           System.out.println("Not found");
       }
    }
    public static boolean findElement(int[] array, int element){
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
              if( array[i] == element){
                found = true;
                break;
              }
        }
        return found;
    }
}
