package com.ua.hillel.HomeWork17;

public class TreadTh extends Thread {
    ATM2 atm2 = new ATM2();

    public TreadTh(String mame) {
        super(mame);
    }

    @Override
    public void run() {
        System.out.println("Flow two --> Start  ");
        ATM2.putMethod(300);
        ATM2.takeMethod(200);
        System.out.println("Flow two --> Finished ");
    }


}
