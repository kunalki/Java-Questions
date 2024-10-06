package com.maths;

public class CountDigitsWithoutString {
    public static void main(String[] args) {
        int num = 1234;
        int i = countDigit(num);
        System.out.println(i);

    }
    static int countDigit( int n){
        int res = 0;
        int rem = 0;
        int count = 0;
        while ( n!= 0 ){
            rem = n % 10;
            n /= 10;
            count++;
        }
        return count;
    }
}
