package com.qa.oop;

public class Main {

    public static void main(String[] args) {

        // Create
        Product product1 = new Product(123, "Carrot", 3.0f, "Veg", 7, 10.0f, true);
        Product product2 = new Product(456, "Apple", 3.0f, "Fruit", 6, 5.0f, true);
        Product product3 = new Product(789, "Banana", 3.0f, "Fruit", 8, 1.0f, true);

        // Print
        System.out.println(product1.displayProductInfo());
        System.out.println(product2.displayProductInfo());
        System.out.println(product3.displayProductInfo());

        // Discount
        System.out.println(product1.getDiscountDetailInfo());
        System.out.println(product2.getDiscountDetailInfo());
        System.out.println(product3.getDiscountDetailInfo());

        // Seller
        System.out.println(product1.displaySellerContactDetails());
    }
}
