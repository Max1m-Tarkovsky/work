package com.ua.hillel.homeWork5;

public class Fish extends Home {

    public Fish(int id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String voice() {
        return super.voice() + ".......";

    }
}
