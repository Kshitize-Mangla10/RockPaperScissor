package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Let's start the game Rock Paper Scissor .");
        System.out.println("There are 5 rounds.");
        System.out.println("Press 0 for Paper.");
        System.out.println("Press 1 for Rock.");
        System.out.println("Press 2 for Scissor.");
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int cw = 0;
        int pw = 0;
        while(i < 6){
            System.out.println("Round " + i + " :");
            System.out.println("Press 0 or 1 or 2");
            int x = sc.nextInt();
            while(x < 0 || x > 2){
                System.out.println("Please enter a valid number");
                x = sc.nextInt();
            }
            Random ran = new Random();
            int y = ran.nextInt(3);

            switch(x){
                case 0:
                    if(y == 1)
                        pw++;
                    else if(y == 2)
                        cw++;
                    break;
                case 1:
                    if(y == 0)
                        cw++;
                    else if(y == 2)
                        pw++;
                    break;
                case 2:
                    if(y == 0)
                        pw++;
                    else if(y ==1)
                        cw++;
                    break;
            }
            if(x == 0)
                System.out.println("You chooses 'Paper'");
            else if(x == 1)
                System.out.println("You chooses 'Rock'");
            else
                System.out.println("You chooses 'Scissor'");
            if(y == 0)
                System.out.println("Computer chooses 'Paper'");
            else if(y == 1)
                System.out.println("Computer chooses 'Rock'");
            else
                System.out.println("Computer chooses 'Scissor'");
            System.out.println("Your score : " + pw);
            System.out.println("Computer score : " + cw);
            i++;
        }
        if(pw > cw)
            System.out.println("! Congratulation you win !");
        else if(cw > pw)
            System.out.println("Better luck next time");
        else
            System.out.println("TIE" );
    }
}
