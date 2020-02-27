package com.ua.hillel.homeWork3;

public class Exponentiation {
    public static void main(String[] args) {
        int x = 5;
        int n = 3;
        int result = 1;
        System.out.println("Exponentiation");
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println(result);
        int sequence = 5;
        System.out.println(" Sequence ");
        for (int i = 0; i < 10; i++) {
            sequence += -5;
            System.out.println(sequence);
        }

        int value = 7;
        int table = 1;
        System.out.println("Multiplication table");
        for (int i = 0; i < 11; i++) {
            table = value * i;
            System.out.println(value + " * " + i + " = " + table);
        }
    }

}

