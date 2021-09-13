package com.company;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String grade;
        System.out.println("Enter your mark out of 100");
        int  mark = in.nextInt();
        grade(mark);
    }
    static void grade(int mark){
        //String grade;

        if (mark>=91){
            System.out.println("Your grade is AA");
        }
        else if (mark>=81){
            System.out.println("Your grade is AB");
        }
        else if (mark>=71){
            System.out.println("Your grade is BB");
        }
        else if (mark>=61){
            System.out.println("Your grade is BC");
        }
        else if (mark>=51){
            System.out.println("Your grade is CD");
        }
        else if (mark>=41){
            System.out.println("Your grade is DD");
        }
        else if (mark<=40){
            System.out.println("Your are failed ");
        }

    }
}
