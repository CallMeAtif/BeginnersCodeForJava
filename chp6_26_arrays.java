package com.company;

public class chp6_26_arrays {
    public static void main(String[] args) {
        /*
        Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)

        */

        // There are three main ways to create an array in Java

        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Initialization
        //int [] marks = new int[5];
        //marks[0] = 95;
        //marks[1] = 98;
        //marks[2] = 99;
        //marks[3] = 100;
        //marks[4] = 97;
        //marks[5] = 100; - throws an error
        //System.out.println(marks[3]);

        // 3. Declaration, memory allocation and initialization together
        int [] marks = {98, 45, 79, 99, 80};
        // marks[5] = 96; - throws an error
        System.out.println(marks[4]);
    }
}
