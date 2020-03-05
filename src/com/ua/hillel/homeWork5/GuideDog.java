package com.ua.hillel.homeWork5;

public class GuideDog extends Home {

    private boolean trained;


    public void setTrained(boolean trained) {
        trained = trained;
    }

    public GuideDog(int id, double age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.trained = isTrained;
    }

    public boolean isTrained() {
        return trained;
    }

    public String goHome() {
        return " Spend home ";
    }

    @Override
    public String voice() {
        return super.voice() + " i can take you home! ";
    }
}
