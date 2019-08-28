package com.xsis.day01;

public class Gaya {
    public static void main(String[] args) {
        Gaya gaya = new Gaya();
        int f = gaya.getGaya(8, 10);
        System.out.println("Gaya: "+f+" N");

        Gaya massa = new Gaya();
        int m = massa.getMassa(80, 10);
        System.out.println("Massa: "+m+" Kg");

        Gaya percepatan = new Gaya();
        int a = percepatan.getPercepatan(80, 8);
        System.out.println("Percepatan: "+a+" m/s");

        System.out.println("Gaya yang dihasilkan dari massa "+m+" kg dan gaya "+a+" m/s adalah "+f+" N");
    }

    public int getGaya (int m, int a){
        return m * a;
    }

    public int getMassa (int f, int a){
        return f / a;
    }

    public int getPercepatan (int f, int m){
        return f / m;
    }

}
