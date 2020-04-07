package com.ua.hillel.homeWork10;

import java.util.Collection;
import java.util.HashSet;

public class QuadraticEquation {
    public static double equation(double x, int n, int k) {

        return Math.sin(Math.pow(x, n)) + Math.pow(x, k) * x - 13;

    }

    public static double decision(double value1, double value2) {
        if (value2 - value1 <= 0.00001) {
            return value1;
        }
        int n = 6;
        int k = 2;
        double x = value1 + (value2 - value1) / 2;

        if (equation(value1, n, k) * equation(x, n, k) > 0) {
            return decision(x, value2);
        } else {

            return decision(value1, x);
        }
    }

    public static void main(String[] args) {
        System.out.println(decision(5, 8));
    }




}

