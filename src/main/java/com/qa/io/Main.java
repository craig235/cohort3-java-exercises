package com.qa.io;

public class Main {

    public static void main(String[] args) {

        // Create
        Product[] products = ProductRepository.getProductsFromFile("src/main/java/com/qa/io/product_data.csv");

        // Print
        for (Product product : products) {
            System.out.println(ProductService.displayProductInfo(product));
        }
    }
}
