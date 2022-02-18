package com.Atif;

public class chp5_24_break_and_continue {
    public static void main(String[] args) {
        //break in different loops
/*

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is Great");
            if (i==2){
                System.out.println("Breaking the loop");
                break;
            }
        }

        int j = 0;
        while(j<5){
            System.out.println(j);
            System.out.println("Java is Great");
            if (j==2){
                System.out.println("Breaking the loop");
                break;
            }
            j++;
        }
        int k = 0;
        do {
            System.out.println(k);
            System.out.println("Java is Great");
            if (k==2){
                System.out.println("Breaking the loop");
                break;
            }
            k++;
        }while (k<5);
 */

        //Continue in different loops
/*

        for (int i = 0; i < 5; i++) {
            if (i==2){
                System.out.println("Breaking the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        }

        int j = 0;
        while(j<5)
        {
            j++;
            if (j==2){
                System.out.println("Breaking the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("Java is Great");

        }

        int k = 0;
        do {
            k++;
            if (k==2){
                System.out.println("Breaking the loop");
                continue;
            }
            System.out.println(k);
            System.out.println("Java is Great");
        }while (k<5);
 */

    }
}
