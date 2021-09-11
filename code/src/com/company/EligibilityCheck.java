package com.company;
import java.util.Scanner;
public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = in.nextInt();
        check (age);
    }
    static void check(int age){
        if(age>=18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
    }
}



