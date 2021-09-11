package com.company;
import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        boolean check = check(num);
        //boolean ans = check(num);
        System.out.println("Number is even");
        System.out.println(check);
    }
    static boolean check(int num){
        int rem;
        rem = num%2;
        if(rem == 0){
            char even = 0;
            //char odd=0;
            return true;
        }
        //char odd = 0;
        return false;

    }
}
