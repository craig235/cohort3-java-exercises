package com.qa.io;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ProductRepository {

    public static Product[] getProductsFromFile(String filePath) {

        List<Product> products = new ArrayList<>();

        try (Scanner input = new Scanner(Paths.get(filePath))) {
            while (input.hasNext()) {
                String[] values = input.next().split(",");
                products.add(new Product()
                        .setId(Integer.parseInt(values[0]))
                        .setName(values[1])
                        .setPrice(Float.parseFloat(values[2]))
                        .setCategory(values[3])
                        .setRating(Integer.parseInt(values[4]))
                        .setDiscountedPercentage(Float.parseFloat(values[5]))
                        .setAvailable(Boolean.parseBoolean(values[6])));
            }

        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
        return products.toArray(new Product[0]);
    }
}
