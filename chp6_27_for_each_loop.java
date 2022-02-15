package com.company;

public class chp6_27_for_each_loop {
    public static void main(String[] args) {
        /*
        float [] marks = {98.5f, 45.5f, 78.5f, 99.5f, 98.5f};
        String [] friends = {"Atiful", "Arman", "Soham","Shreyas","Manish","Piyush"};
        System.out.println(friends.length);
        System.out.println(friends[1]);
        System.out.println(marks.length);
        System.out.println(marks[2]);
         */


        int [] marks = {98, 45, 78, 99, 100};
//        System.out.println(marks.length);

        //Displaying the array (native way)
        System.out.println("Printing using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying the array (for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //Quick Quiz :Displaying the array in reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length-1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        //Displaying the array(for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
