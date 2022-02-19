package com.Atif;

public class chp7_31_methods {
    static int logic (int x,int y){
        int z;
        if(x>y)
            z = x + y;
        else
            z = (x+y)*5;
        return z;
    }
    public static void main(String[] args) {

        //method invocation using object creation
//        chp7_31_methods obj = new chp7_31_methods();
//        int a = obj.logic(5,4);
        int a = logic(5,4);
        System.out.println(a);
    }
}
