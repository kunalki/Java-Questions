package com.maths;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 12364;
        int i = reverseANum(num);
        System.out.println(i);
    }
    static int reverseANum(int n){
         int res = 0;
         int rem = 0;
         while ( n!= 0){
           rem = n % 10;
           res = res * 10 + rem;
           n /= 10;
         }
         return res;
    }
}
