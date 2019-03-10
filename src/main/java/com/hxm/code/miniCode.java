package com.hxm.code;

public class miniCode {
    public static String[] printFizzBuzzTwo() {
        String[] Sclo=new String[100];
        for (int i = 1; i <= 100; i++) {
            if (i%15 == 0) {
                String str =String.valueOf(i);
                if((str.contains("3"))||(str.contains("5"))){
                    Sclo[i-1]="FizzBuzz";
                    //System.out.println("FizzBuzz");
                }else{
                    Sclo[i-1]=String.valueOf(i);
                    // System.out.println(i);
                }
            } else if ((i%3 == 0)||(String.valueOf(i).contains("3"))) {
                Sclo[i-1]="Fizz";
                //System.out.println("Fizz");
            } else if((i%5 == 0)||(String.valueOf(i).contains("5"))){
                Sclo[i-1]="Buzz";
               // System.out.println("Buzz");
            } else {
                Sclo[i-1]=String.valueOf(i);
               // System.out.println(i);
            }
        }
        return Sclo;
    }


    public static String[] printFizzBuzzOne() {
        String[] Sclo=new String[100];
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                Sclo[i-1]="FizzBuzz";
               // System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                Sclo[i-1]="Fizz";
                //System.out.println("Fizz");
            } else if (i % 5 == 0) {
                Sclo[i-1]="Buzz";
                //System.out.println("Buzz");
            } else {
                Sclo[i-1]=String.valueOf(i);
                //System.out.println(i);
            }
        }
        return Sclo;
    }
    public static void main(String[] args) {
     printFizzBuzzTwo();
     for(String srt:printFizzBuzzTwo()){
         System.out.println(srt);
     }
    }
}
