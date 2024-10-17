package com.array;

public class SumOfAllElementsOfArray {
    public static void main(String[] args) {
        int[] array = {45, 52, 96, 25, 10};
        int result = addElements(array);
        System.out.print("sum of all elements in the array is : ");
        System.out.println(result);
    }
      public static int addElements(int[] nums){

  /*
        using for loop
          int sum = 0;
          for (int i = 0; i < nums.length; i++) {
                  sum += nums[i];
          }
          return sum;
*/

          
//           using while loop

          int i = 0;
          int sum = 0;
          while ( i < nums.length ){
              sum += nums[i];
              i++;
          }
          return sum;
      }
}
