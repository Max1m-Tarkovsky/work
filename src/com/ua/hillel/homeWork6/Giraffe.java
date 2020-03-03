package com.ua.hillel.homeWork6;


public class Giraffe extends Wild {

    public Giraffe(int id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String voice() {
        return super.voice();
    }

    @Override
    public boolean lovePeople() {
        return true;
    }
}
