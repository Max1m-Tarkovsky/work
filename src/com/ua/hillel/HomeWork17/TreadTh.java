package com.ua.hillel.HomeWork17;

public class TreadTh extends Thread {
    BroughtATM broughtATM = new BroughtATM();


    public TreadTh(String mame) {
        super(mame);
    }

    @Override
    public void run() {
        System.out.println("Flow two --> Start  ");
        for (int i = 0; i <5 ; i++) {
            broughtATM.putMethod(300);
            broughtATM.takeMethod(600);

    }
        System.out.println("Flow two --> Finished ");
    }

}
