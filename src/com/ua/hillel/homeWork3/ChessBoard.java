package com.ua.hillel.homeWork3;

public class ChessBoard {
    public static void main(String[] args) {

        int[][] array = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = (i + j) % 2;

            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = (i + j) % 2;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}