package com.xsis.day03;

public class Log2No1 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6};
        int n2 = 3;
        for (int i=0; i< nums.length; i++){
            System.out.print(nums [i] +" ");
            }
        System.out.println(" ");

        for (int i=0; i< nums.length;i++){
            System.out.print((int)Math.pow(n2,nums[i])+" ");
        }
        System.out.println(" ");
        }
    }

