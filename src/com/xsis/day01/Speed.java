package com.xsis.day01;

public class Speed {

    public static void main(String[] args) {
       int s= getJarak (2, 50); // t dan v tidak perlu ditulis hanya angkanya saja
        System.out.println(s);

        /* int s = 110;
        int t = 2;
        int v = 0;

        v=s/t;
        System.out.println("Speed: "+v+" km/jam");*/
    }

    //method fungtion, return value
    public static int getJarak(int t, int v){
        return v * t;
    }
}
