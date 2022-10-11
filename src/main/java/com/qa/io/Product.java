package com.qa.io;

public class Product {

    private int id;
    private String name;
    private float price;
    private String category;
    private int rating;
    private float discountedPercentage;
    private boolean isAvailable;

    public Product(int id, String name, float price, String category, int rating, float discountedPercentage, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
        this.discountedPercentage = discountedPercentage;
        this.isAvailable = isAvailable;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getRating() {
        return rating;
    }

    public float getDiscountedPercentage() {
        return discountedPercentage;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setPrice(float price) {
        this.price = price;
        return this;
    }

    public Product setCategory(String category) {
        this.category = category;
        return this;
    }

    public Product setRating(int rating) {
        this.rating = rating;
        return this;
    }

    public Product setDiscountedPercentage(float discountedPercentage) {
        this.discountedPercentage = discountedPercentage;
        return this;
    }

    public Product setAvailable(boolean available) {
        isAvailable = available;
        return this;
    }

    @Override
    public String toString() {
        String separator = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(getId()).append(separator);
        sb.append(getName()).append(separator);
        sb.append(getPrice()).append(separator);
        sb.append(getCategory()).append(separator);
        sb.append(getRating()).append(separator);
        sb.append(getDiscountedPercentage()).append(separator);
        sb.append(isAvailable());
        return sb.toString();
    }
}

