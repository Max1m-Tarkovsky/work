package com.ua.hillel.homeWork5;

import com.ua.hillel.homeWork6.LovePeople;

public class Home extends Animals implements LovePeople {

    private String name;
    private boolean vaccinated;

    public Home(int id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.vaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String voice() {
        return super.voice() + " my name is " + name + ".";
    }

    @Override
    public boolean lovePeople() {
        return true;
    }

}
