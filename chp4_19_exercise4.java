package com.company;
import java.util.Scanner;

public class chp4_19_exercise4 {
    public static void main(String[] args) {
        //Question 1
/*
        int a = 10;
        if(a == 11)
            System.out.println("You are 11");
        else
            System.out.println("You are not 11");
 */

        //Question 2
/*
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry");
        m2= sc.nextByte();

        System.out.println("Enter your marks in Mathematics");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }
 */

        //Question 3
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax += 0;
        }
        else if(income>2.5f && income <= 5f){
            tax += 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10.0f - 5f);
            tax += 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
 */

        //Question 4
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        byte day = sc.nextByte();

        if(day>=1 && day<=7){
            switch(day) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thusday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }
        else
            System.out.println("Please Enter a Number Between 1 to 7");
 */

        //Question 5
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A leap Year");
        int year = sc.nextInt();

        if(year%2==0)
            System.out.println("Leap Year!");
        else
            System.out.println("Not A Leap Year!");
 */

        //Question 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Website's url");
        String url = sc.nextLine();

        if(url.endsWith(".com"))
            System.out.println("This is an commercial website");
        else if(url.endsWith(".org"))
            System.out.println("This is an organization website");
        else if (url.endsWith(".in"))
            System.out.println("This is an Indian website");
        else
            System.out.println("Please enter another one");
    }
}
