package com.ua.hillel.homeWork5;

public class Kat extends Home {

    public Kat(int id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String voice() {
        return super.voice() + " meow ";
    }
}
