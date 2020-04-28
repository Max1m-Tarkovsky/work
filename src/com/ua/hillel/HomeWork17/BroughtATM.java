package com.ua.hillel.HomeWork17;

public class BroughtATM {
    public static void main(String[] args) {
       BroughtATM br = new BroughtATM();
        Thread threadTh = new TreadTh("max");
        Thread threadRun = new Thread(new ThreadRun());
        threadTh.start();
        threadRun.start();


    }

    private static int moneyATM = 1000;




    public void putMethod(int money) {
        if (moneyATM > 1000000) {
            System.out.println(" Sorry ATM crowded");
        } else moneyATM = moneyATM + money;
        System.out.println("Пополнение " + money);
        System.out.println("Остаток в банкомате  " + moneyATM);
    }

    public  void takeMethod(int money) {
        if (moneyATM < money) {
            System.out.println(" Sorry ATM empty");
        } else moneyATM = moneyATM - money;
        System.out.println("Снятие " + money);
        System.out.println("Остаток в банкомате  " + moneyATM);


    }
}
