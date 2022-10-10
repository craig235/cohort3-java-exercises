package com.qa.exceptionhandling;

import com.qa.exercises.Product;

public class Util {
    public static void main(String[] args) {

        try {
            // Divide. Test case 1. Ok.
            System.out.println(div(2, 1));

            // Divide. Test case 2. Nok - divide by zero.
            System.out.println(div(1, 0));

        } catch (ArithmeticException ae) {
            System.out.println("Error trying to divide. Message: " + ae.getMessage());
        }


        // Product - display details.
        Product product = null;
        try {
            product.displayProductInfo();

        } catch (NullPointerException npe) {
            System.out.println("Product is null");
        }

        // Product - find product by id.
        try {
            product = getProductById(2);
            System.out.println("Product: " + product.displayProductInfo());
        } catch (ProductNotFoundException pnfe) {
            System.out.println(pnfe.getMessage());
        } finally {
            System.out.println("Finally executed");
        }
    }

    public static int div(int no1, int no2) {
        return no1 / no2;
    }

    public static void getProductDetails(Product product) {
        product.displayProductInfo();
    }

    public static Product getProductById(int id) throws ProductNotFoundException {

        Product product = null;
        Product[] productList = {
                new Product(123, "Carrot", 3.0f, "Veg", 7, 10.0f, true),
                new Product(456, "Apple", 3.0f, "Fruit", 6, 5.0f, true),
                new Product(789, "Banana", 3.0f, "Fruit", 8, 1.0f, true)};

        for (Product p : productList) {
            if (id == p.getId()) {
                product = p;
            }
        }
        if (product == null) {
            throw new ProductNotFoundException("No product found with this id.");
        } else {
            return product;
        }
    }
}
