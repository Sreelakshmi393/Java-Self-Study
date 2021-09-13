package com.company;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r = in.nextInt();
        float area = area(r);
        System.out.println("Area of the circle is " + area);
        float circumference = circumference(r);
        System.out.println("Circumference of the circle is " + circumference);
    }
    public static float area(int r){
        float ans;
        ans = (float) (3.14 * r * r);
        return ans;
    }
    static float circumference(int r){
        float res;
        res = (float) (2 * 3.14 * r);

        return res;
    }
}
