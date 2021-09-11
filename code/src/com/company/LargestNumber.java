package com.company;
import  java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        System.out.println("Enter the third number");
        int num3 = in.nextInt();
        int largest = largest(num1, num2, num3);
        System.out.printf("Largest number is %d",largest);
        in.close();

    }
    public static int largest(int num1,int num2,int num3){
        int max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;

        }
        return max;

    }
}
