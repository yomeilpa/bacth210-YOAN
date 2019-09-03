package com.xsis.day04;

public class LatihanArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        LatihanArray logic = new LatihanArray();

        logic.kotak(arr);
    }
    void kotak (int [][] arr){
        int a = 0;
        for (int i = 0; i<5; i++){
            for (int j= 0; j<5; j++){
                if (i==j) {
                    System.out.printf("%d ",a);
                    a++;
                }
                else if (i<j){
                    System.out.printf("* ");
                }
                else if (i>j){
                    System.out.printf("0 ");
                }
            }
            System.out.println();
        }
    }
}
