package com.company;

import java.util.Arrays;
public class arraychange {
    public static void main(String[] args) {
        int[] arr = {23,73,81,83,71};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[2] = 100;
    }

}
