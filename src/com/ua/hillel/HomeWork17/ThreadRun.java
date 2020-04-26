package com.ua.hillel.HomeWork17;

public class ThreadRun implements Runnable {
    ATM2 atm2 = new ATM2();
    @Override
    public void run() {
        System.out.println("Flow one  --> Start  ");
        ATM2.putMethod(400);
        ATM2.takeMethod(100);
        System.out.println("Flow one  --> Finished ");

    }
}
