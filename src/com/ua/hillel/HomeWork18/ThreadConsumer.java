package com.ua.hillel.HomeWork18;

import java.util.Queue;

public class ThreadConsumer implements Runnable {
    private final Queue<Double> queue;

    public ThreadConsumer(Queue<Double> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true){
            try {
                System.out.println("Consumed : " + consume());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
    private Double consume() throws InterruptedException {
        synchronized (queue) {
            if (queue.isEmpty()) {//проверка на пустость!(если список пуст то тру)
                queue.wait();
            }
            Thread.sleep(500);
            queue.notifyAll();
            return queue.poll();//метод который вытаскивает елемент и удаляет его
        }
    }
}
