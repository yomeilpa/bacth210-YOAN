package com.xsis.day03;

public class Coba {
    public static void main(String[] args) {
        int a = 2;
        int b = 44;


        for (int i = 1; i <= 7; i++) {
            if (i % 4 == 0) {
                System.out.print("  3  ");
            } else {
                System.out.print(a + "  ");
                a = a+3;
            }
        }
        System.out.println("  ");

        for (int i=1; i<=7; i++){
            if (i == 1){
                System.out.print("3  ");
            }if (i == 7) {
                System.out.print("  3");
                }else{
                System.out.print("   ");
            }
        }
        System.out.println("  ");

        for (int i=1; i<=7; i++){
            if (i == 1){
                System.out.print("53 ");
            }if (i == 7) {
                System.out.print(" 20");
            }else{
                System.out.print("   ");
            }
        }
        System.out.println("  ");

        for (int i=1; i<=7; i++){
            if (i == 1){
                System.out.print("50 ");
            }if (i == 7) {
                System.out.print(" 23");
            }else{
                System.out.print("   ");
            }
        }
        System.out.println("  ");

        for (int i=1; i<=7; i++){
            if (i == 1){
                System.out.print("47 ");
            }if (i == 7) {
                System.out.print(" 26");
            }else{
                System.out.print("   ");
            }
        }
        System.out.println("  ");

        for (int i=1; i<=7; i++){
            if (i == 1){
                System.out.print("3  ");
            }if (i == 7) {
                System.out.print("  3");
            }else{
                System.out.print("   ");
            }
        }
        System.out.println(" ");

        for (int i = 1; i <= 7; i++) {
            if (i % 4 == 0) {
                System.out.print("3 ");
            } else {
                System.out.print(b + "  ");
                b = b-3;
            }
        }

    }
}
