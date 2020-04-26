package com.ua.hillel.HomeWork17;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        ATM2 atm2 = new ATM2();
        Thread threadTh = new TreadTh("max");
        Thread threadRun = new Thread(new ThreadRun());

        threadTh.start();
        threadRun.start();
        System.out.println("Flow main --> Start  ");
        ATM2.putMethod(100);
        ATM2.takeMethod(400);
        System.out.println("Flow main --> Finish  ");
    }


}