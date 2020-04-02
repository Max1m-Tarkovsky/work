package com.ua.udemy.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedUncheckedBlocMain {
    public static void main(String[] args) {
        try {
            doEverything();
        } catch (NullPointerException e) {
            System.out.println("NPE");
            e.printStackTrace();
        }

    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        PrintWriter writer = null;

        do {

            try {
                System.out.println("Pleas enter numerator ");
                int numerator = scanner.nextInt();
                System.out.println("Pleas enter denominator ");
                int denominator = scanner.nextInt();
                // System.out.println(divide(numerator, denominator));
                int intArray[] = new int[1];
                int i = intArray[2];

                if (continueLoop) {
                    throw new RuntimeException("Runtime Exception ");
                }
                writer = new PrintWriter(new FileWriter("out.txt"));
                writer.println("Result = " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exceptions :" + e);
                scanner.nextLine();
                System.out.println("Only integer  non zero parameters ");
            } catch (IOException e) {
                System.out.println("Unable to open file ");
                e.printStackTrace();
            } finally {
                System.out.println("Finally block called  ");
                if (writer != null) {
                    writer.close();
                }
            }
            System.out.println("Try catch bloc finished ");
        } while (continueLoop);
    }

    public static int divide(int numerator, int denominator) throws InputMismatchException, NullPointerException {
        return numerator / denominator;
    }

}
