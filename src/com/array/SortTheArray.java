package com.array;

public class SortTheArray {
    public static void main(String[] args) {
        int[] array = {85, 69, 23, 14, 33};
        int[] sortedArray = sortTheArray(array);
        System.out.print("Sorted Array: ");
        for( int i : sortedArray ){
            System.out.print(i + " ");
        }


    }
    static int[] sortTheArray( int[] arr ){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                 if( arr[i] > arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
            }
        }
        return arr;
    }
}
