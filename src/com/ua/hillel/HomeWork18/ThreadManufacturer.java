package com.ua.hillel.HomeWork18;

import java.util.Queue;

public class ThreadManufacturer implements Runnable {

    private final int size;

    private final Queue<Double> queue;

    public ThreadManufacturer(int size, Queue<Double> queue) {
        this.size = size;
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                System.out.println(" Manufacture : " + manufacturer());
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }


    }

    private double manufacturer() throws InterruptedException {
        synchronized (queue) {
            if (queue.size() == size) {
                queue.wait();//бросает в ожидание поток!
            }
            double randomValue = Math.random();
            queue.add(randomValue);
            queue.notifyAll();// говорит что теперь есть доступ к екрану для других потоков (сообщает им об этом)

            return randomValue;
        }

    }
}
