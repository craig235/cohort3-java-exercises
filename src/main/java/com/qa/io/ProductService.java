package com.qa.io;

public class ProductService {

    public static float discountedPrice(Product product) {
        return product.getPrice() * (1 - (product.getDiscountedPercentage() / 100));
    }

    public static float discountAmount(Product product) {
        return product.getPrice() * product.getDiscountedPercentage() / 100;
    }

    public static String displayProductInfo(Product product) {
        String separator = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(product.getId()).append(separator);
        sb.append(product.getName()).append(separator);
        sb.append(product.getPrice()).append(separator);
        sb.append(product.getCategory()).append(separator);
        sb.append(product.getDiscountedPercentage()).append(separator);
        sb.append(product.isAvailable());
        return sb.toString();
    }
}
