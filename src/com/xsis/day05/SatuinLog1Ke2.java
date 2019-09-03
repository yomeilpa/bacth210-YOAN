package com.xsis.day05;

public class SatuinLog1Ke2 {
    public static void main(String[] args) {

        SatuinLog1Ke2 logic1 = new SatuinLog1Ke2();

        logic1.No6 (args);
        logic1.No7 (args);
        logic1.No8 (args);
        logic1.No9 (args);
        logic1.No10 (args);
    }

    void No6(String[] args){
        System.out.println("Soal No 6");
        int a = 1;

        for (int i=1; i<=7; i++){

            if (a%3==0) {
                System.out.print("*  ");
            }
            else {
                System.out.print(a + "  ");
            }
            a=a+4;
        }
        System.out.println();
        System.out.println();
    }

    void No7(String[] args){
        System.out.println("Soal No 7");
        int a=2;

        for (int i=1; i<=7; i++){

            System.out.print(a +"  ");

            a=a*2;
        }
        System.out.println();
        System.out.println();
    }

    void No8(String[] args){
        System.out.println("Soal No 8");
        int a=3;

        for (int i=1; i<=7; i++){
            System.out.print(a+"  ");

            a=a*3;
        }
        System.out.println();
        System.out.println();
    }

    void No9 (String[] args){
        System.out.println("Soal No 9");
        int a=4;

        for (int i=1; i<=7; i++){

            if (i%3==0){
                System.out.print("*   ");
            } else {
                System.out.print(a + "  ");
                a=a*4;
            }
        }
        System.out.println();
        System.out.println();
    }

    void No10(String[]args){
        System.out.println("Soal No 10");
        int a=3;

        for (int i=1; i<=7; i++){

            if(i%4==0){
                System.out.print("xxx    ");
            } else {
                System.out.print(a+"   ");
            }
            a=a*3;
        }
        System.out.println();
        System.out.println();
    }
}
