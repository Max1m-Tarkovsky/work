package com.ua.hillel.homeWork3;

public class ForOddNumbers {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i = i + 2) {
            System.out.println("Result odd numbers = " + i);
        }

        long n = 15;
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
            System.out.println("Result factorial = " + result);
        }

        int resultWhile  = 1;
        int i = 99;
        while (i > resultWhile) {
            resultWhile = resultWhile + 2;
            System.out.println("Result While odd numbers " + resultWhile);
        }

        long j = 1;
        long value  = 10;
        long result1= 1;
        while (j<value){
            result1 *= j;
            j++;
            System.out.println("Result While factorial = " + result1);
        }

        long k = 11;
        long valueDoWhile = 10;
        long resultDoWhileFactorial= 1;
        do {
            resultDoWhileFactorial *= k;
            k++;
            System.out.println("Result DO While factorial = " + resultDoWhileFactorial);
        }while (k<valueDoWhile );

        int resultDoWhileOdNumber = 105;
        int s = 99;
        do {
            resultDoWhileOdNumber = resultDoWhileOdNumber + 2;
            System.out.println("Result Do While odd numbers " + resultDoWhileOdNumber);
        } while (s > resultDoWhileOdNumber);
    }
}


