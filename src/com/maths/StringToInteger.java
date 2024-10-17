package com.maths;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "15";
//        Integer i = Integer.parseInt(str);
//        System.out.println(i.getClass().getSimpleName());
        int num = Integer.valueOf(str);
        System.out.println(num);
    }
}
