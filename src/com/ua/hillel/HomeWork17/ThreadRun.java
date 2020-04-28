package com.ua.hillel.HomeWork17;

public class ThreadRun implements Runnable {
    BroughtATM broughtATM = new BroughtATM();


    @Override
    public void run() {
        System.out.println("Flow one  --> Start  ");
        for (int i = 0; i < 5; i++) {
            broughtATM.putMethod(400);
            broughtATM.takeMethod(700);
        }
        System.out.println("Flow one  --> Finished ");

    }
}
