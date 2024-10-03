package com.array;

public class SumOfAllElementsOfArray {
    public static void main(String[] args) {
        int[] array = {45, 52, 96, 25, 10};
        int result = addElements(array);
        System.out.println(result);
    }
      public static int addElements(int[] nums){
          int sum = 0;
          for (int i = 0; i < nums.length; i++) {
                  sum += nums[i];
          }
          return sum;
      }
}
