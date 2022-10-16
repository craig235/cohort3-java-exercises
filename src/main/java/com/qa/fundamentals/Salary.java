package com.qa.fundamentals;

public class Salary {
    public static void main(String[] args) {
        final float percentage = 0.105f;
        final float salary = 30000f;
        float increment = salary * percentage;
        float new_salary = salary + increment;

        System.out.printf("Salary: %.2f%n", salary);
        System.out.printf("Increase: %.2f%n", increment);
        System.out.printf("New salary: %.2f%n", new_salary);
    }
}
