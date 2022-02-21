package com.Atif;

class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails1(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary1(){
        return salary;
    }
}

public class chp8_38_custom_class_OOPS {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 atif = new Employee1(); // Instantiating a new Employee Object
        Employee1 parvez = new Employee1(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        atif.id = 12;
        atif.salary = 34;
        atif.name = "Atiful";

        // Setting Attributes for John
        parvez.id = 17;
        parvez.salary = 12;
        parvez.name = "Parvez";

        // Printing the Attributes
        atif.printDetails1();
        parvez.printDetails1();
        int salary = parvez.getSalary1();
        System.out.println(salary);
        // System.out.println(atif.id);
        // System.out.println(atif.name);
    }
}

