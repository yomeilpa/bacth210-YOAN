package com.xsis.day04;

public class Lat2No3 {
    public static void main(String[] args) {
        int[] arr = new int[7];

        Lat2No3 logic = new Lat2No3();

        logic.No3(arr);
    }
        void No3 (int [] arr){
        int hasil = 2;
        for (int i =0; i<7; i++) {
            if (i == 1) {
                hasil = hasil * 3;
            }
            else if (i >= 1 && i <= 3) {
                hasil = hasil * 2;
            }
            else if (i >= 4 && i <= 5) {
                hasil = hasil / 2;
            }
            else if (i == 6) {
                hasil = hasil / 3;
            }
            System.out.print(hasil+"  ");
        }


    }
}

