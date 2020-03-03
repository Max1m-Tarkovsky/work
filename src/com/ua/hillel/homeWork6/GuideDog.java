package com.ua.hillel.homeWork6;



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
    public boolean lovePeople() {
        return super.lovePeople();
    }

    @Override
    public String voice() {
        return super.voice() + "I can take you home! ";
    }
}
