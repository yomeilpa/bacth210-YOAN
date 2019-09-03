package com.xsis.day05;

public class SatuinLog1Ke1 {
    public static void main(String[] args) {

        SatuinLog1Ke1 logic1 = new SatuinLog1Ke1();

        logic1.No1(args);
        logic1.No2(args);
        logic1.No3(args);
        logic1.No5(args);
    }

    void No1(String[] args) {
        int a = 1;
        System.out.println("Soal No 1");

        for (int i = 1; i <= 7; i++) {

            System.out.print(a + "  ");

            a = a + 2;
        }
        System.out.println();
        System.out.println();

    }


    void No2 (String [] args) {
        System.out.println("Soal No 2");
        for (int i=2; i<15;i++){
            if (i%2==0) {
                System.out.print(i+"  ");
            }
        }
        System.out.println();
        System.out.println();
    }

    void No3 (String [] args){
        System.out.println("Soal No 3");
        int a = 1;

        for (int i=1; i<=7; i++) {

            System.out.print(a + "  ");

            a= a+3;
        }
        System.out.println();
        System.out.println();
    }

    void No5 (String [] args){
        System.out.println("Soal No 5");
        int a = 1;

        for (int i = 1; i <= 7; i++) {

            if (i % 3 == 0) {
                System.out.print("*  ");
            } else {
                System.out.print(a + "  ");
                a = a + 4;
            }
        }
        System.out.println();
        System.out.println();
    }
}
