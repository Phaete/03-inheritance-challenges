package com.phaete;

import java.util.Objects;

public class Motorcycle extends Vehicle {
    private String typeOfMotorcycle;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String typeOfMotorcycle) {
        super(manufacturer, model, yearOfManufacture);
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return Objects.equals(typeOfMotorcycle, that.typeOfMotorcycle);
    }

    @Override
    public String toString() {
        return super.toString() + " It is a motorcycle of type " + typeOfMotorcycle + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMotorcycle);
    }
}
