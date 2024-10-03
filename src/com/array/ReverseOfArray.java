package com.array;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] array = {45, 52, 96, 25, 10};
        for (int i = array.length - 1; i >=0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
