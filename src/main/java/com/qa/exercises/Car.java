package com.qa.exercises;

public class Car {

    private int id;
    private String name;
    private float price;
    private int engineCC;
    private String fuelType;
    private int manufacturingYear;

    public Car(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.engineCC = engineCC;
        this.fuelType = fuelType;
        this.manufacturingYear = manufacturingYear;
    }

    // Main here so I don't have to create a class just to run the exercise.
    public static void main(String[] args) {
        // Manufacture cars
        BMW bmw = new BMW(1, "BMW", 25000f, 2500, "Petrol", 2015, 6, 300);
        Audi audi = new Audi(2, "Audi", 24000f, 2000, "Diesel", 2019, "R8", true);

        // Display car details
        System.out.println(bmw.displayDetails());
        System.out.println(audi.displayDetails());
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

    public String displayDetails() {
        String separator = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(getId()).append(separator);
        sb.append(getName()).append(separator);
        sb.append(getPrice()).append(separator);
        sb.append(getEngineCC()).append(separator);
        sb.append(getFuelType()).append(separator);
        sb.append(getManufacturingYear());
        return sb.toString();
    }
}
