package com.ua.hillel.HomeWork18;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Double> queue = new LinkedList<>();
        Thread threadConsumer = new Thread(new ThreadConsumer(queue));
        Thread threadManufacturer = new Thread(new ThreadManufacturer(1, queue));

        threadConsumer.start();
        threadManufacturer.start();


    }
}
