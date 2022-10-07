package com.qa.exercises;

public class Audi extends CarProperties implements Car {

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

    public String getCarDetails() {
        String separator = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(getId()).append(separator);
        sb.append(getName()).append(separator);
        sb.append(getPrice()).append(separator);
        sb.append(getEngineCC()).append(separator);
        sb.append(getFuelType()).append(separator);
        sb.append(getManufacturingYear()).append(separator);
        sb.append(getModel()).append(separator);
        sb.append(isEVAvailable());
        return sb.toString();
    }
}
