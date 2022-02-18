package com.Atif;
import java.util.Random;
import java.util.Scanner;

public class project2_20_RPS {
    public static void main(String[] args) {
        String a,b;
        byte c = 0,u = 0;
        System.out.println("\t\t*Rules*\nThere are 3 options: \nROCK | PAPER | SCISSOR |\n  0  |   1   |    2    |\n");

        for (int i = 0; i < 5; i++) {
            Random sc = new Random();
            int comp = sc.nextInt(3);

            if(comp==0)
                a = "rock";
            else if(comp==1)
                a = "paper";
            else
                a = "scissor";

            Scanner sc1 = new Scanner(System.in);
            System.out.println("rock(0) ,paper(1) and scissor(2)");
            byte user = sc1.nextByte();

            if(user<0 || user>=3){
                System.out.println("Enter A valid Option");
                break;
            }

            if(user==0)
                b = "rock";
            else if(user==1)
                b = "paper";
            else
                b = "scissor";

            System.out.println("computer chose: "+ a);
            System.out.println("You chose: "+ b);

            if(a == "rock" && b == "rock")
                System.out.println("Draw");
            else if(a == "rock" && b == "paper") {
                System.out.println("User Won!");
                u+=1;
            }
            else if(a == "rock" && b == "scissor") {
                System.out.println("Computer Won!");
                c+=1;
            }
            else if(a == "paper" && b == "rock") {
                System.out.println("Computer Won!");
                c+=1;
            }
            else if(a == "paper" && b == "paper")
                System.out.println("Draw");
            
            else if(a == "paper" && b == "scissor") {
                System.out.println("User Won!");
                u+=1;
            }
            else if(a == "scissor" && b == "rock") {
                System.out.println("User Won!");
                u+=1;
            }
            else if(a == "scissor" && b == "paper") {
                System.out.println("Computer Won!");
                c+=1;
            }
            else if(a == "scissor" && b == "scissor")
                System.out.println("Draw");
            
        }
        if(c>u) {
            System.out.printf("Computer Won %d games", c);
            System.out.println("\n");
            System.out.println("COMPUTER WON!");
        }
        else if(c<u) {
            System.out.printf("User Won %d games", u);
            System.out.println("\n");
            System.out.println("USER WON!");
        }
        else if(c==u)
            System.out.println("Draw");
    }
}
