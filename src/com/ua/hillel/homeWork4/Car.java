package com.ua.hillel.homeWork4;

public class Car {

    double volumeOfTheTank = 63;
    double tankBalance = 0;
    double fuelConsumptionPer100km = 5.5;
    double addFullTank;
    double tankBalanceInTheWay;
    double addFuelOnTheRouteOdessaKiev;
    double costOfGasolineAdd;
    double fuelRemainingAtTheFinish;
    double fullTripCost;

    public double addFullTank() {

        if (tankBalance != volumeOfTheTank)
            addFullTank += volumeOfTheTank - tankBalance;

        return addFullTank;
    }


    public double tankBalanceInTheWay(double way) {

        tankBalanceInTheWay = (way * (fuelConsumptionPer100km / 100));
        return tankBalanceInTheWay;
    }


    public double addFuelOnTheRouteOdessaKiev() {
        addFuelOnTheRouteOdessaKiev += tankBalanceInTheWay(177.8) + tankBalanceInTheWay(152.4) + addFullTank();
        return addFuelOnTheRouteOdessaKiev;
    }


    public double costOfGasolineAdd(double cost) {
        costOfGasolineAdd = addFuelOnTheRouteOdessaKiev * cost;
        return costOfGasolineAdd;
    }

    public double fuelRemainingAtTheFinish() {
        fuelRemainingAtTheFinish += volumeOfTheTank - tankBalanceInTheWay(151.2);
        return fuelRemainingAtTheFinish;
    }

    public double fullTripCost(double costDiesel) {
        fullTripCost = (addFuelOnTheRouteOdessaKiev + (addFuelOnTheRouteOdessaKiev - fuelRemainingAtTheFinish)) * costDiesel;
        return fullTripCost;
    }

}