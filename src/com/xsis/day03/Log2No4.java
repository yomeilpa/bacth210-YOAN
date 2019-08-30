package com.xsis.day03;

public class Log2No4 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6};
        int n2 = 5;
        for (int i=0; i< nums.length; i++){
            System.out.print(nums [i] +" ");
        }
        System.out.println(" ");

        for (int i=0; i< nums.length;i++){
            if (i%2==0 && i !=0) {
                System.out.print(nums[i]+" ");
            }
            System.out.print(n2*nums[i]+" ");
        }
        System.out.println(" ");
    }
}

