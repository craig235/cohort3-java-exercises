package com.qa.fundamentals;

public class SuperMarket {
    public static void main(String[] args) {

        final float apple = 3.25f;
        final float chicken = 7.25f;
        final float banana = 1.25f;

        final float disc_apple = 0.1f;
        final float disc_chicken = 0.08f;
        final float disc_banana = 0.03f;

        System.out.printf("Apple: %.2f%n", apple * (1 - disc_apple));
        System.out.printf("Chicken: %.2f%n", chicken * (1 - disc_chicken));
        System.out.printf("Banana: %.2f%n", banana * (1 - disc_banana));
    }
}
