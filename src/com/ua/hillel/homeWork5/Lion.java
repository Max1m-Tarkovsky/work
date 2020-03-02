package com.ua.hillel.homeWork5;

public class Lion extends Wild {

    public Lion(int id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String voice() {
        return super.voice() + " and i am angry ";
    }
}
