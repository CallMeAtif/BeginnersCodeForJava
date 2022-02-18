package com.Atif;

public class chp6_28_multidimentional_arrays {
    public static void main(String[] args) {
        int [] marks; //A 1-D array
        int [][] flats;//A 2-D array

        flats = new int [2][3];
        flats [0][0] = 10;
        flats [0][1] = 20;
        flats [0][2] = 30;
        flats [1][0] = 40;
        flats [1][1] = 50;
        flats [1][2] = 60;

        System.out.println("Printing a 2-D Array using loops");

        for (int i = 0; i < flats.length ; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");

        }
    }
}
