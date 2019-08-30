package com.xsis.day03;

public class Lat01ArrayKotak {
    public static void main(String[] args) {
        int n = 7;
        String[][] array = new String[n][n]; // 2-dimension array define...
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0 || (i == array.length - 1 || j == 0 || j == array.length - 1)) { // if top,left,right,bottom line then this
                    array[i][j] = ("*");
                } else { // if not border line then this...
                    array[i][j] = " ";

                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
