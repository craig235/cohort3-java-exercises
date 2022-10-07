package com.qa.exercises;

public abstract class CarProperties {

    private int id;
    private String name;
    private float price;
    private int engineCC;
    private String fuelType;
    private int manufacturingYear;

    public CarProperties(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.engineCC = engineCC;
        this.fuelType = fuelType;
        this.manufacturingYear = manufacturingYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }
}
