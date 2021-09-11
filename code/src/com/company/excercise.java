package com.company;

import java.util.Scanner;
class Even_Odd1{
    public static void main (String args[]){

        Scanner scan=new Scanner(System.in);


        System.out.print("Enter the number for check odd or even: ");

        int num=scan.nextInt();

        find_Oddeven(num);
    }


    static void find_Oddeven(int num){//method definition
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}