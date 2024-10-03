package com.array;

public class FindTheElementIndex {
    public static void main(String[] args) {
        int[] array = {15, 85, 63, 96, 134, 20};
        int index = findElement(array, 15);
        System.out.println(index);
    }
    public static int findElement(int[] nums, int element){
          int inx = -1;
        for (int i = 0; i < nums.length; i++) {
                if(nums[i] == element){
                    inx = i;
                }
        }
           return inx;
    }
}
