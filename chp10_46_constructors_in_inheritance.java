package com.Atif;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor and value of x is: "+x );
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(1);
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived class and value of x is: "+x + " and value of y is: " +y  );
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am ChildOfDerived class");
    }
    ChildOfDerived(int x,int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived class and value of x is: "+x + " ,value of y is: " +y + " and value of z is: "+ z );
    }
}
public class chp10_46_constructors_in_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
        //Derived1 d = new Derived1();
//        Derived1 d = new Derived1(14,9);
        ChildOfDerived c = new ChildOfDerived(5,4,3);
    }
}
