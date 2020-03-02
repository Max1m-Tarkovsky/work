package com.ua.hillel.homeWork5;

public class Home extends Animals {

    protected String name;
    protected boolean isVaccinated;

    public Home(int id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String voice() {
        return super.voice() + " my name is " + name + ".";
    }

  /*protected boolean lovePeople(){

    }*/
}
