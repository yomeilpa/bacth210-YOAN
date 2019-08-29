package com.xsis.day02;

public class LatNo9 {
    public static void main(String[] args) {

        int a=4;

        for (int i=1; i<=7; i++){

            if (i%3==0){
                System.out.print("*   ");
            } else {
                System.out.print(a + "  ");
                a=a*4;
            }
        }
    }
}
