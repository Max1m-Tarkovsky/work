package com.ua.hillel.HomeWork17;

public class ATM2 {


    private static int moneyATM = 1000;

    public synchronized static void putMethod(int money) {
        if (moneyATM > 1000000) {
            System.out.println(" Sorry ATM crowded");
        } else moneyATM = moneyATM + money;
        System.out.println("Пополнение " + money);
        System.out.println("Остаток в банкомате  " + moneyATM);
    }

    public synchronized static void takeMethod(int money) {
        if (moneyATM < money) {
            System.out.println(" Sorry ATM empty");
        } else moneyATM = moneyATM - money;
        System.out.println("Снятие " + money);
        System.out.println("Остаток в банкомате  " + moneyATM);


    }
}
