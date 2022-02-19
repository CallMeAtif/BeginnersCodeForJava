package com.Atif;

public class chp7_32_method_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning "+ a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning "+ a + " bro!");
        System.out.println("Good Morning "+ b + " bro!");
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 28;
    }

    static void tellJoke(){
        System.out.println("I am the greatest programmer in the world\n" +
                "In my Dreams \uD83E\uDD23");
    }
    public static void main(String[] args) {
//        tellJoke();

        // trying to change Integer

//        int x = 78;
//        change(x);
//        System.out.println("The value of x after change is: "+ x);

        //trying to change array
//
//        int [] marks = {54,34,65,10,85};
//        change2(marks);
//        System.out.println(marks[0]);


        //Method Overloading

        foo();
        foo(3000);
        foo(3000, 4000);
        //Arguments are Actual!!
    }
}

