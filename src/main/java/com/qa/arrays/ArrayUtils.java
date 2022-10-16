package com.qa.arrays;

import com.qa.oop.Product;

public class ArrayUtils {

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static int arrayMinNumber(int[] array) {

        if (array.length == 0) {
            System.out.println("Error, array is empty.");
            return -1;
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int arrayMaxNumber(int[] array) {

        if (array.length == 0) {
            System.out.println("Error, array is empty.");
            return -1;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static Product minPrice(Product[] products) {

        Product lowest = products[0];
        for (int i = 1; i<products.length;i++) {
            if (products[i].getPrice() < lowest.getPrice()) {
                lowest = products[i];
            }
        }
        return lowest;
    }


    public static Product maxPrice(Product[] products) {

        Product highest = products[0];
        for (int i = 1; i<products.length;i++) {
            if (products[i].getPrice() > highest.getPrice()) {
                highest = products[i];
            }
        }
        return highest;
    }

    public static Product maxRating(Product[] products) {

        Product highest = products[0];
        for (int i = 1; i<products.length;i++) {
            if (products[i].getRating() > highest.getRating()) {
                highest = products[i];
            }
        }
        return highest;
    }
}




