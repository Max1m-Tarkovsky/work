package com.ua.hillel.homeWork3;

import java.util.Arrays;

public class DoubleArray {


    int n;
    int[] array;

    public DoubleArray(int n) {
        this.n = n;
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

    }

    public void print() {
        for (int i : array
        ) {
            System.out.print( i + " " );
        }
    }
        public void min(){
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
                minValue = array[i];
    }

        System.out.println("Min value array : " + minValue);
        }

    public void max(){
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue > array[i])
                maxValue = array[i];
        }
        System.out.println("Max value array : " + maxValue);
    }

    @Override
    public String toString() {
        return "DoubleArray{" +
                "n=" + n +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public void exponentiation (){
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value += array[i];
        }
        System.out.println("Arithmetic mean of the array = " + value / array.length);
    }
}
