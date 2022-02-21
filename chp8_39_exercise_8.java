package com.Atif;


class Employee{
    int salary;
    String name;

    public int getSalary (){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void vib(){
        System.out.println("Vibrating.....");
    }
    public void callFriend(){
        System.out.println("Calling Arman.....");
    }
}

class Square {
    int side;
    public int area_square(){
        return side*side;
    }
    public int perimeter(){
        return side * 4;
    }
}

class Rectangle {
    int l;
    int b;
    public void setL(int n){
        l = n;
    }
    public void setB(int m){
        b = m;
    }
    public int rec_area(){
        return l*b;
    }
    public int rec_perimeter(){
        return 2*(l+b);
    }
}

class TommyVercetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
}
public class chp8_39_exercise_8 {
    public static void main(String[] args) {

        //problem 1
        // Employee atif = new Employee();
//        atif.name = "Atiful";
//        System.out.println(atif.getName());
//        atif.setName("Atif rocks");
//        System.out.println(atif.getName());
////        System.out.println(nameChanged);
//        atif.salary = 45;
//        System.out.println(atif.getSalary());


        //problem 2

//        CellPhone nokia = new CellPhone();
//        nokia.ring();
//        nokia.vib();
//        nokia.callFriend();


        //problem 3

//        Square num = new Square();
//        num.side = 3;
//        System.out.println(num.area_square());
//        System.out.println(num.perimeter());


        //problem 4

//        Rectangle re = new Rectangle();
//        re.setL(4);
//        re.setB(2);
//        System.out.println(re.rec_area());
//        System.out.println(re.rec_perimeter());


        //problem 5

        TommyVercetti player = new TommyVercetti();
        player.fire();
        player.hit();
        player.run();
    }
}
