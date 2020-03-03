package com.ua.hillel.homeWork6;


public class Dog extends Home {


    public Dog(int id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String voice() {
        return super.voice() + " Woof ";
    }

    @Override
    public boolean lovePeople() {
        return super.lovePeople();
    }
}
