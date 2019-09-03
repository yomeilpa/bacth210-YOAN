package com.xsis.day05;

public class Log3No2 {
    public static void main(String[] args) {
        int num[][] = new int[7][7];
        int i, j;
        int awal = 1;
        int akhir = 3;
        int a = 17;
        int b = 41;
        int c = 20;
        int x = 3;

        for (i = 6; i >= 0; i--) {
            for (j = 0; j <= num[i].length; j++) {
                //bagian diagonal
                if (i == j) {
                    if (awal <= akhir) {
                        System.out.print(a);
                        System.out.print(" ");

                        a -= 3;
                        awal++;
                    }
                    else {
                        System.out.print(x);
                        System.out.print(" ");

                        awal = 1;
                    }
                }

                //bagian horizontal
                else if (i==0){
                    if (j>=1 && j<=2){
                        System.out.print(b);
                        System.out.print(" ");
                        b -= 3;
                        x*=3;
                    }

                    else if (j>=4 && j<=6) {
                        System.out.print(b);
                        System.out.print(" ");
                        b -= 3;
                    }

                    else {
                        if (j==num.length){
                            break;
                        }

                        x*=3;
                        System.out.print(x);
                        System.out.print(" ");
                    }
                }
                //  Bagian vertikal
                else if (j==6) {
                    if (i==5) {
                        System.out.print(x*3);
                        System.out.print(" ");
                    }

                    else if (i>=2 && i<=4){
                        System.out.print(c);
                        System.out.print(" ");
                        c += 3;
                    }

                    else if (i==1) {
                        System.out.print(x*3*3);
                        System.out.print(" ");
                    }
                }

                else {
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}