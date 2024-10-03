package com.array;


public class FindTheMaxInArray {
    public static void main(String[] args) {
       int[] array = {15, 63, 85, 96, 2, 10, -21};
        int maxVal = findMax(array);
        System.out.println(maxVal);
    }
    public static int findMax(int[] array){
       int max = array[0];
        for (int i = 0; i < array.length; i++) {
             if(array[i] > max){
                 max = array[i];
             }
        }
           return max;
    }
}
