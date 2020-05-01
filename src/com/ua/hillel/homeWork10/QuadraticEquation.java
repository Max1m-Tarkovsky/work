package com.ua.hillel.homeWork10;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {


        double a, b, c;
        double D;

        System.out.println("The program solves a quadratic equation of the form :");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Pleas Enter  a, b и c:");
        Scanner in = new Scanner(System.in);

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();


        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Root a quadratic : First  = " + x1 + ", Second  = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("The equation has a single root : x = " + x);
        }
        else {
            System.out.println("The equation don't has root! ");
        }
















   /* public static double equation(double x, int n, int k) {

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

        System.out.println(decision(2, 4));
    }
*/


    }


}