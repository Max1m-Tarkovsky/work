package com.ua.udemy.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTryCatchBlocHandlingMaint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true;
        do {

        try {
            System.out.println("Pleas enter numerator ");
            int numerator = scanner.nextInt();
            System.out.println("Pleas enter denominator ");
            int denominator = scanner.nextInt();
            System.out.println();
            System.out.println(divide(numerator, denominator));
            continueLoop = false;
        } catch (ArithmeticException e) {
            System.out.println("Exceptions :" + e);
            scanner.nextLine();
            System.out.println("Only non zero parameters ");

        } catch (InputMismatchException e) {
            System.out.println("Exception :" + e);
            scanner.nextLine();
            System.out.println("Only integer values  allowed ");
        }
            System.out.println("Try catch bloc finished ");
        }while (continueLoop);

    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
