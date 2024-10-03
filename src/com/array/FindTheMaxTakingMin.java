package com.array;


public class FindTheMaxTakingMin {
    public static void main(String[] args) {
        int[] array = {25, 96, 156, 85, 23};
        int maxVal = findMax(array);
        System.out.println(maxVal);

    }
    public static int findMax(int[] array){
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
               if(array[i] > max) max = array[i];
        }
           return max;
    }
}
