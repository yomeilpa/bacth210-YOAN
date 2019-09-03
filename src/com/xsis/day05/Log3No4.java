package com.xsis.day05;

public class Log3No4 {
    public static void main(String[] args) {
        int [][] nums = {{1 , 2, 3 ,},
                        {4 , 5 , 6},
                        {9 , 8 , 9}};
        for (int row = 0; row < nums.length ; row++){
            for (int coloum = 0; coloum < nums[row].length; coloum++){
                System.out.printf("%d",nums [row][coloum]);
            }
            System.out.println();
        }
        Log3No4 arr = new Log3No4();
    }
}
