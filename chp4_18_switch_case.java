package com.Atif;

public class chp4_18_switch_case {
    public static void main(String[] args) {
        String var = "Atif";

        switch(var){
            case "Atif" -> {
                System.out.println("You are going to become an adult");
                System.out.println("You are going to SPIT");
                System.out.println("Work hard!");
            }
            case "Parvez" -> System.out.println("You are going to get a job at GOOGLE");
            case "Arman" -> System.out.println("Dk about you what you are gonna do");
            default -> System.out.println("You should ENJOY you life");
        }

        /*
        byte age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextByte();

        switch(age){
            case 18:
                System.out.println("You are going to become an Adult");
                break;
            case 21:
                System.out.println("You are going to get an job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life\uD83E\uDD73");
        }
         */

    }
}
