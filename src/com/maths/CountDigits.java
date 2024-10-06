package com.maths;

public class CountDigits {
    public static void main(String[] args) {
        int num = 1024;
        int res = countDigit(num);
        System.out.println(res);


    }
    static int countDigit(int n){
      /*
                 ==============first method======================
        String str = String.valueOf(n);
        int count = 0;
        int start = 0;
        int end = str.length()- 1;
        while( start <= end){
            count++;
            end--;
        }

        */

        // Second Method
        String str = String.valueOf(n);
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            count++;
        }
        return count;

    }
}
