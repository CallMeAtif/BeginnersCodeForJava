package com.company;
import java.util.Scanner;

public class atif_06_exercise_1 {
    public static void main(String[] args) {
        float totalMarks;
        Scanner m1 = new Scanner(System.in);
        System.out.println("Enter English Marks: ");
        totalMarks = m1.nextFloat();
        System.out.println("Enter Science Marks: ");
        totalMarks += m1.nextFloat();
        System.out.println("Enter Maths Marks: ");
        totalMarks += m1.nextFloat();
        System.out.println("Enter Marathi Marks: ");
        totalMarks += m1.nextFloat();
        System.out.println("Enter Social Science Marks: ");
        totalMarks += m1.nextFloat();
        Float grandTotal = totalMarks/5.0F;
        System.out.println(grandTotal);
    }
}
