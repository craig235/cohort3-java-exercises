package com.qa.arrays;

import com.qa.oop.Product;

public class Arrays {
    public static void main(String[] args) {

        // Arrays of primitives
        int[] numbers = new int[] {1,6,2,8,3,9,15,0};
        System.out.println("Sum: "+ ArrayUtils.arraySum(numbers));
        System.out.println("Min: "+ArrayUtils.arrayMinNumber(numbers));
        System.out.println("MAx: "+ArrayUtils.arrayMaxNumber(numbers));

        // Arrays of objects
        Product[] products = new Product[]{
        new Product(123, "Carrot", 3.0f, "Veg", 7, 10.0f, true),
        new Product(456, "Apple", 4.0f, "Fruit", 9, 5.0f, true),
        new Product(789, "Banana", 5.0f, "Fruit", 8, 1.0f, true),
        new Product(321, "Bread", 6.0f, "Bakery", 5, 1.0f, true),
        new Product(654, "Donuts", 7.0f, "Bakery", 8, 1.0f, true)};
        System.out.println("Lowest price: "+ArrayUtils.minPrice(products).displayProductInfo());
        System.out.println("Highest price: "+ArrayUtils.maxPrice(products).displayProductInfo());
        System.out.println("Highest rating: "+ArrayUtils.maxRating(products).displayProductInfo());
    }
}
