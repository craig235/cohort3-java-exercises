package com.qa.exercises;

public class CarService {

    // Main here so I don't have to create a class just to run the exercise.
    public static void main(String[] args) {
        // Manufacture cars
        BMW bmw = new BMW(1, "BMW", 25000f, 2500, "Petrol", 2015, 6, 300);
        Audi audi = new Audi(2, "Audi", 24000f, 2000, "Diesel", 2019, "R8", true);

        // Display car details - direct calls.
        System.out.println(bmw.getCarDetails());
        System.out.println(audi.getCarDetails());

        // Display car details - polymorphic calls.
        CarService.printCarDetails(bmw);
        CarService.printCarDetails(audi);

    }

    public static void printCarDetails(Car car) {
        System.out.println(car.getCarDetails());
    }
}
