package com.company;
import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        //System.out.println("Enter the number ");
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        for (int i = 100; i<1000; i++){
            if (isAmstrong(i)) {
                System.out.println(i + " ");
            }
        }

    }
    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
