package com.ua.hillel.homeWork6;


public class Home extends Animals implements LovePeople {

    private String name;
    private boolean Vaccinated;

    public Home(int id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.Vaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return Vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        Vaccinated = vaccinated;
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
