package com.Atif;

public class chp7_33_varargs {
//    static int sum(int a, int b){
//        return a + b;
//    }
//
//    static int sum(int a, int b, int d){
//        return a + b + d;
//    } for how long will you keep creating methods ?

    // best approach is using "varargs" if you dont want to keep making methods to sum for different amount of parameters
    //Syntax varargs -> int ... arr

    static int sum(int ... arr){
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = sum(45,5,0,50);
        System.out.println("The sum of the given integers is " + x);
    }
}
