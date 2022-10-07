package com.qa.exercises;

public class BMW extends CarProperties implements Car {

    private int noOfCylinders;
    private int maxTorque;

    public BMW(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear, int noOfCylinders, int maxTorque) {
        super(id, name, price, engineCC, fuelType, manufacturingYear);
        this.noOfCylinders = noOfCylinders;
        this.maxTorque = maxTorque;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public int getMaxTorque() {
        return maxTorque;
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
        sb.append(getNoOfCylinders()).append(separator);
        sb.append(getMaxTorque());
        return sb.toString();
    }
}
