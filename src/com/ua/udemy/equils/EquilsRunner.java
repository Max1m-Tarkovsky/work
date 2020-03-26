package com.ua.udemy.equils;


import java.util.HashSet;
import java.util.Set;

public class EquilsRunner {
    public static void main(String[] args) {

        Set<CAR> sixCars = new HashSet<>();
        sixCars.add(new CAR("VW", "Golf", 45));
        sixCars.add(new CAR("Audi", "A3", 60));
        sixCars.add(new CAR("VW", "Polo", 25));
        sixCars.add(new CAR("BMW", "Z4", 120));
        sixCars.add(new CAR("BMW", "440i", 200));

        Set<CAR> europaCars = new HashSet<>();
        europaCars.add(new CAR("Toyota", "Auria", 40));
        europaCars.add(new CAR("Reno", "Clio", 30));
        europaCars.add(new CAR("Reno", "Megan", 50));
        europaCars.add(new CAR("VW", "Golf", 45));
        europaCars.add(new CAR("VW", "Polo", 35));

        Set<CAR> uniqueCars = new HashSet<>(sixCars);
        uniqueCars.addAll(europaCars);
        print(uniqueCars);



    }

    private static void print(Set<CAR> cars) {
        System.out.printf("%-20s %-20s %-20s \n", "Car  brand", "Model", "Price per day");
        for (CAR car : cars){

            System.out.printf("%-20s %-20s %-20s\n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }
}
