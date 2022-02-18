package com.Atif;

public class chp6_29_exercise_6 {
    public static void main(String[] args) {

        //Question 1

//        float [] marks = {23.5f,26.5f,25.5f,24.5f,100.0f};
//        float sum =0;
//
//        for(float element: marks){
//            sum += element;
//        }
//        System.out.println("The value of the sum is " + sum);


        //Question 2

//        byte [] marks = {34,23,65,93,1,28,0,8};
//        byte num = 34;
//        boolean isInArray = false;
//        for(float element: marks){
//            if(num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The element is present in the Array");
//        }
//        else
//            System.out.println("The element is present in the Not Array");


        //Question 3

//        float [] marks = {23.5f,26.5f,25.5f,24.5f,100.0f};
//        float sum =0;
//
//        for(float element: marks){
//            sum += element;
//        }
//        System.out.println("The value of the sum is " + sum/marks.length);


        //Question 4

//        int [][] mat1 = {{1,2,3},
//                         {4,5,6}};
//
//        int [][] mat2 = {{1,2,3},
//                         {4,5,6}};
//
//        int [][] result = {{0,0,0},
//                          {0,0,0}};
//
////        System.out.println(mat1[1].length);
//
//        for (int i = 0; i < mat1.length; i++) {//now number of times
//            for (int j = 0; j < mat1[i].length; j++) {//column number of times
//                result [i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.print(result [i][j]+ " ");
//                result [i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println("");
//        }


        //Question 5

//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//
//        for(int element: arr){
//            System.out.print(element + " ");
//        }


        //Question 6

//        int []arr={16,2,73,404,563,655};
//        int max = Integer.MIN_VALUE;
//        for(int e : arr){
//            if(e > max){
//                max=e;
//            }
//        }
//        System.out.println("The value of maximum element in this array is: "+max);


        //Question 7

//        int []arr={16,2,73,404,563,655};
//        int min=Integer.MAX_VALUE;
//        for(int e : arr){
//            if(e<min){
//                min = e;
//            }
//        }
//        System.out.println("The value of minimum element in this array is: "+min);


        //Question 8

//        int []arr={16,2,73,404,563,655};
//        int [] arr = {12,45,68,78,99,100};
//        boolean isSorted = true;
//        for (int i = 0; i < arr.length -1; i++) {
//            if(arr[i]>arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("This Array is Sorted");
//        }
//        else
//            System.out.println("This Array is NOT Sorted");

    }
}
