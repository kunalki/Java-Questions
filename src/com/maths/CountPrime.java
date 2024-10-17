package com.maths;

import java.util.ArrayList;
import java.util.List;

public class CountPrime {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int num = 10;
        int count = 0;
        for (int i = 2; i < num; i++) {
//              int n = i;
            for (int j = 1; j < i; j++) { // j 1 i 2 true
                    if( i % j == 0 ){
                       count++;
                    }
                    if ( count == 2 ){
                        list.add(i);
                    }
            }
        }
        for( int i : list){
            System.out.println(i);
        }
    }
}
