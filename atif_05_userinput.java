package com.Atif;
import java.util.Scanner;

public class atif_05_userinput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        int c = a + b;
//        System.out.println("The sum of the 2 numbers are " + c);
//        System.out.println(sc.hasNextInt());
        String str = sc.nextLine();
        System.out.println(str);
    }
}