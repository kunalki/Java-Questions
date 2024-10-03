package com.array;
import java.util.*;

public class SearchAnElementInArray {
    public static void main(String[] args) {
        int[] array = {15, 20, 96, 63, 14};
        Scanner sc = new Scanner(System.in);
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
              if(array[i] == element){
                  found = true;
                  break;
              }
        }
        return found;
    }
}
