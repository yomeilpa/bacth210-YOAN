package com.xsis.day02;

public class LatNo10 {
    public static void main(String[] args) {

        int a=3;

        for (int i=1; i<=7; i++){

            if(i%4==0){
                System.out.print("xxx    ");
            } else {
                System.out.print(a+"   ");
            }
            a=a*3;
        }
    }
}
