package com.ua.hillel.homeWork6;


public class Wild extends Animals implements LovePeople {

    protected boolean predator;

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public boolean isPredator() {
        return predator;
    }

    public Wild(int id, double age, double weight, String color, boolean predator) {
        super(id, age, weight, color);
        this.predator = predator;
    }

    @Override
    public String voice() {
        return super.voice() + "i am a wild animal ";
    }


    @Override
    public boolean lovePeople() {
        return false;
    }
}
