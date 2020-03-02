package com.ua.hillel.homeWork5;

public class GuideDog extends Home {

    protected boolean isTrained;


    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public GuideDog(int id, double age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public String goHome() {
        return " Spend home ";
    }

    @Override
    public String voice() {
        return super.voice() + " i can take you home! ";
    }
}
