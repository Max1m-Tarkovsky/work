package com.ua.hillel.homeWork5;

public class Hamster extends Home {

    public Hamster(int id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String voice() {
        return super.voice() + " piy-piy ";
    }
}
