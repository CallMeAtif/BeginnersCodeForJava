package com.Atif;
import java.util.Scanner;

public class chp5_21_whileloops {
    public static void main(String[] args) {
        System.out.println("Enter A Number: ");
        Scanner sc = new Scanner(System.in);
        byte i = 1;
        byte b = sc.nextByte();
        while(i<=10){
            byte a = (byte) (i*b);
            System.out.printf("%d X %d = %d",b,i,a);
            System.out.print("\n");
            i++;
        }
    }
}
