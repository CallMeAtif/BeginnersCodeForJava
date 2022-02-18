package com.Atif;

public class chp5_25_excercise_5 {
    public static void main(String[] args) {
        //Question 1

//        for (int i = 4; i > 0 ; i--) {
//            for (int j = 0; j < i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.printf("\n");
//        }


        //Question 2

//        byte sum = 0;
//        byte i = 0;
//        while(i<4){
//            sum += (2*i);
//            i++;
//        }
//        System.out.printf("The sum of even number is: %d",sum);
//        //First 4 even numbers are 0 2 4 6


        //Question 3

//        int a = 12;
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d X %d = %d\n",a,i,a*i);
//        }


        //Question 4

//        int a = 10;
//        for (int i = 10; i > 0 ; i--) {
//            System.out.printf("%d X %d = %d\n",a,i,a*i);
//        }


        //Question 5

//        int factorial = 10;
//        int sum = 1;
//        for (int i = 1; i < factorial; i++) {
//            sum *= (i);
//        }
//        System.out.println(sum);


        //Question 6

//        int n = 5;
//        int factorial = 1;
//        int i = 1;
//        while(i <= n) {
//            factorial *= (i);
//            i++;
//        }
//        System.out.println(factorial);


        //Question 7

//        int i = 4;
//        while (i>0){
//            int j =0;
//            while (j<i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.print("\n");
//            i--;
//        }


        //Question 9

//        int sum = 0;
//        int a = 8;
//        for (int i = 10; i > 0 ; i--) {
//            System.out.printf("%d X %d = %d\n",a,i,a*i);
//            sum += (a*i);
//        }
//        System.out.printf("The sum of the table %d: %d",a,sum);


        //Question 10

        byte sum = 0;
        int i = 0;
        while (i < 4) {
            sum += (2*i);
            i++;
        }
        System.out.printf("The sum of even number is: %d",sum);
        //First 4 even numbers are 0 2 4 6
    }
}