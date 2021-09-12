package com.company;
import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        int ans = product(num1,num2);
        System.out.printf("Product = %d",ans);
    }
    static int product(int num1,int num2){
        int result=0;
        result = num1*num2;
        return result;
    }
}
