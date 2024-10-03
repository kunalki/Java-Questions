package com.array;

public class FindTheMinInArray {
    public static void main(String[] args) {
        int[] array = {15, 52, 63, 85, 2};
//        int min = array[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
                if(array[i] < min){
                    min = array[i];
                }
        }
        System.out.println(min);
    }
}
