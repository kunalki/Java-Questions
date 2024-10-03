package com.array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {5, 8, 3, 10, 15};
        int[] indices = findIndices(array, 25);
        System.out.println(Arrays.toString(indices));

    }
      public static int[] findIndices(int[] nums, int target){
        int n = nums.length;
          for (int i = 0; i < n - 1; i++) {
              for( int j = i + 1; j < n; j++){
                  if(nums[i] +  nums[j] == target){
                          return new int[]{i, j};
                  }
              }
          }
          return new int[]{}; // means no solution found
      }
}
