package com.xsis.day02;

public class Array2 {
    public static void main(String[] args) {
        int [] [] nums = {{1,5,4,3},
                          {9,3,5,6},
                          {4,5,6,12}};
        for (int row = 0; row < nums.length ; row++){
            for (int coloum = 0; coloum < nums[row].length; coloum++){
                System.out.printf("%d",nums [row][coloum]);
            }
            System.out.println();
        }
        Array2 array2d = new Array2();
        array2d.seacrhNums (nums, 5);
    }

    public void seacrhNums(int [][] nums, int search){

        for (int row = 0; row < nums.length ; row++) {
            for (int coloum = 0; coloum < nums[row].length; coloum++) {
                if (nums[row][coloum] == search)
                System.out.println("Found : " + search + " at position :  ["+row+"] ["+coloum+"]");
            }
        }
    }
}
