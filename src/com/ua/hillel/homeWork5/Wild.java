package com.ua.hillel.homeWork5;

public class Wild extends Animals {

    private boolean predator;

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public boolean isPredator() {
        return predator;
    }

    public Wild(int id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.predator = isPredator;
    }

    @Override
    public String voice() {
        return super.voice() + "i am a wild animal ";
    }


}
