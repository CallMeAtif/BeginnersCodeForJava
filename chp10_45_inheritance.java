package com.Atif;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        System.out.println("I am Derived and setting y now");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class chp10_45_inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(4);
        System.out.println(d.getX());
    }
}
