package com.xsis.day04;

public class LAt2No2 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6};
        int n2 = 3;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "   ");
        }
        System.out.println(" ");

        for (int i = 0; i < nums.length; i++) {

            if (5 == nums [i]){

                /*double hasil = Math.pow(a , nums[i]);
                int hasil2 = (int) hasil;
                System.out.print(-hasil2);*/
                System.out.print((int) Math.pow(-n2, nums [i])+" ");
            }
            if (2 == nums[i]){
                System.out.print(-(int)Math.pow(n2,nums[i])+" ");
            }

            else {
                System.out.print((int) Math.pow(n2, nums[i]) + " ");
            }
            nums [i] = nums [i] + 1;
            System.out.print(" ");
        }
    }
}