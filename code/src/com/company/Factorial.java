package com.company;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial is " + fact);
    }
    public static int factorial(int n){
        int i;
        int fact = 1;
        for (i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}

