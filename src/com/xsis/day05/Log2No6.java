package com.xsis.day05;

public class Log2No6 {
    public static void main(String[] args) {
        String input = "Aku Sayang Kamu Tapi Kamu";
        char ch;
        int uppercase = 0, lowercase =0;
        for (int i = 0; i< input.length(); i++){
            ch = input.charAt(i);
            int asciivalue = (int)ch;
            if(asciivalue >=65 && asciivalue <=90){
                uppercase++;
            }
            else if(asciivalue >=97 && asciivalue <=122){
                lowercase++;
            }
        }
        System.out.println("No of lowercase letter : " + lowercase);
        System.out.println("No of uppercase letter : " + uppercase);
    }
}
