package com.ua.hillel.homeWork5;

public class Wild extends Animals {

    protected boolean isPredator;

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public Wild(int id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public String voice() {
        return super.voice() + "i am a wild animal ";
    }
    /*  protected boolean killPeople(){

    }*/
}
