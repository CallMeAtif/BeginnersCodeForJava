package com.Atif;

public class chp7_35_exercise_7 {

    static void mul_tab(int n){
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }

    static void print_stars(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int sum_recur(int n){
        if(n == 1){
            return n;
        }
        else{
            return n + sum_recur(n-1);
        }
    }
    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1


    static void print_stars_in_reverse(int n){
        for (int i = n; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int fibo(int n){
        if(n == 1 || n == 2){
            return n - 1;
        }
        else
            return fibo(n-1) + fibo(n-2);
    }

    static int average(int ... arr){
        int l = arr.length;
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        return sum/l;
    }

    static void print_stars_using_recurion(int n){
        if(n > 0){
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
            print_stars_using_recurion(n-1);
        }
    }

    static void print_stars_in_reverse_using_recurion(int n){
        if(n > 0){
            print_stars_in_reverse_using_recurion(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line


    static float cel_to_feh(float a){
        return a*(9/5.0f) + 32;
    }

    static int sum_recursive_iterative(int a){
        int sum = 0;
        for (int i = a; i > 0; i--) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Question 1
        //mul_tab(4);

        //Question 2
        //print_stars(4);

        //Question 3
        //System.out.println(sum_recur(3));

        //Question 4
        //print_stars_in_reverse(4);

        //Question 5
        //System.out.println(fibo(7));

        //Question 6
        //int b = average(50,50,50,50,50);
        //System.out.println(b);

        //Question 7
        //print_stars_using_recurion(4);

        //Question 8
        //print_stars_in_reverse_using_recurion(4);

        //Question 9
        //System.out.println(cel_to_feh(1));

        //Question 10
        System.out.println(sum_recursive_iterative(5));
    }
}

