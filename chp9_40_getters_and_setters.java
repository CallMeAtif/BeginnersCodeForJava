package com.Atif;

class MyEmployee{
    private int id;
    private String name;

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
public class chp9_40_getters_and_setters {
    public static void main(String[] args) {
        MyEmployee atif = new MyEmployee();
//        atif.id = 12;
//        atif.name = "Atif"; --> throws an error due to private eccess modifier
        atif.setName("Atiful");
        System.out.println(atif.getName());
        atif.setId(45);
        System.out.println(atif.getId());
    }
}
