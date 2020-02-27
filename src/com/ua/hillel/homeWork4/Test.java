package com.ua.hillel.homeWork4;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Add gasoline at a stop in crooked lake : " + car.tankBalanceInTheWay(177.8) + " L");
        System.out.println("Add gasoline at a stop in Zhashkov : " + car.tankBalanceInTheWay(152.4) + " L");
        System.out.println("add fuel on the route Odessa-Kiev : " + car.addFuelOnTheRouteOdessaKiev() + " L");
        System.out.println("The cost of gasoline that added : " + car.costOfGasolineAdd(26.99) + " UAN");
        System.out.println("fuel remaining at the finish : " + car.fuelRemainingAtTheFinish() + " L");
        System.out.println("Full trip cost : " + car.fullTripCost(26.99) + " UAN");
    }
}
