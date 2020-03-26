package com.ua.udemy.equils;

import java.util.Objects;

public class CAR {
    private final String carBrand;
    private final String model;
    private final Integer pricePerDay;

    public CAR(String carBrand, String model, int pricePerDay) {
        this.carBrand = carBrand;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getModel() {
        return model;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        CAR car = (CAR) obj;

        if (!this.carBrand.equals(((CAR) obj).getCarBrand())) {
            return false;
        }
        if (!this.model.equals(((CAR) obj).getModel())) {
            return false;
        }
        return this.pricePerDay.equals(((CAR) obj).getPricePerDay());
    }

    @Override
    public int hashCode() {
        int result = carBrand.hashCode();
        result = 31 * result+model.hashCode();
        result = 31 * result+pricePerDay.hashCode();
        return result;

    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CAR car = (CAR) o;
        return Objects.equals(carBrand, car.carBrand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(pricePerDay, car.pricePerDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, model, pricePerDay);
    }*/
}
