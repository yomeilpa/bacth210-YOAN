package com.xsis.day02;

public class Array {
    public static void main(String[] args) {
        int [] nums = {1,5,4,43,-2,6,4,9};
        int search =4;
        for (int i= 0; i < nums.length; i++){
            if (nums [i] ==4){
                System.out.println("Found  " +search+ " at position  "  + i);
                //break;
            }
        }
    }
}
