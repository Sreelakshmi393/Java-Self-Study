package com.company;
import java.util.Scanner;
public class Adddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter second number");
        int num2 = in.nextInt();
        int sum = sum(num1,num2);
        System.out.printf("Sum of these two numbers is %d", sum);
    }
    static int sum(int num1, int num2){
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
}
