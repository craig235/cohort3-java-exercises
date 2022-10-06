package com.qa.exercises;

public class BMW extends Car {

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

    @Override
    public String displayDetails() {
        String separator = ",";
        StringBuilder sb = new StringBuilder(super.displayDetails());
        sb.append(separator);
        sb.append(getNoOfCylinders()).append(separator);
        sb.append(getMaxTorque()).append(separator);
        return sb.toString();
    }
}
