package com.ua.hillel.homeWork6;


public class Lion extends Wild {

    public Lion(int id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public boolean lovePeople() {
        return super.lovePeople();
    }

    @Override
    public String voice() {
        return super.voice() + " and i am angry ";
    }
}
