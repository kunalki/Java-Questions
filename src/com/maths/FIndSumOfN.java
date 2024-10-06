package com.maths;

public class FIndSumOfN {
    public static void main(String[] args) {
      int num = 10;
        int res = findSum(num);
        System.out.println(res);

    }
    static int findSum(int n){
        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//        return sum;

        while ( n != 0 ){
           sum += n;
           n--;
        }
        return sum;
    }
}
