package com.Atif;

class MyMainEmployee{
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName,int myId,int mySalary){
        id = myId;
        name = myName;
        salary = mySalary;
    }

    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}

public class chp9_42_constructors_and_overloading {
    public static void main(String[] args) {
        MyMainEmployee atif = new MyMainEmployee("Atif",16,4000);
//        MyMainEmployee atif = new MyMainEmployee("atif");
        System.out.println(atif.getName());
        System.out.println(atif.getId());
        System.out.println(atif.getSalary());
    }
}
