package com.qa.exercises;

public class Audi extends Car {

    private String model;
    private boolean isEVAvailable;

    public Audi(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear, String model, boolean isEVAvailable) {
        super(id, name, price, engineCC, fuelType, manufacturingYear);
        this.model = model;
        this.isEVAvailable = isEVAvailable;
    }

    public String getModel() {
        return model;
    }

    public boolean isEVAvailable() {
        return isEVAvailable;
    }

    @Override
    public String displayDetails() {
        String separator = ",";
        StringBuilder sb = new StringBuilder(super.displayDetails());
        sb.append(separator);
        sb.append(getModel()).append(separator);
        sb.append(isEVAvailable()).append(separator);
        return sb.toString();
    }
}
