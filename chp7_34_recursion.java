package com.Atif;

import java.sql.SQLOutput;

public class chp7_34_recursion {
    //factorial(0) = 1
    //factorial(n) = n * n-1 *...1
    //factorial(5) = 5 * 4 * 3 * 2 * 1
    //factorial(5) = n * factorial(n-1)
    static int factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

    static int factorial_iterative(int n){
        if(n == 0 || n == 1)
            return 1;
        else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    static int fibo(int n){
        if(n < 2){
            return n;
        }
        else
            return fibo(n-1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        int x = 7;
//        System.out.println("The value of factorial n is: "+ factorial(x));
//        System.out.println("The value of factorial n is: "+ factorial_iterative(x));

        System.out.println(fibo(x));
    }
}
