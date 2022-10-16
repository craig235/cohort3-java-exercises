package com.qa.oop;

public class Product {

    // Product information.
    private final int id;
    private final String name;
    private final float price;
    private final String category;
    private final int rating;
    private final float discountedPercentage;
    private final boolean isAvailable;

    // Seller information.
    private static final String sellerName;
    private static final String sellerContactNo;
    private static final String sellerEmailAddress;

    static {
        sellerName = "Bob";
        sellerContactNo = "020 5555 5555";
        sellerEmailAddress = "bob@tesla.com";
    }

    // No-arg constructor
    public Product() {
        this.id = 123;
        this.name = "Carrot";
        this.price = 3.0f;
        this.category = "Veg";
        this.rating = 7;
        this.discountedPercentage = 10.0f;
        this.isAvailable = true;
    }

    // Argument constructor
    public Product(int id, String name, float price, String category, int rating, float discountedPercentage, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
        this.discountedPercentage = discountedPercentage;
        this.isAvailable = isAvailable;
    }

    public static String getSellerName() {
        return sellerName;
    }

    public static String getContactNo() {
        return sellerContactNo;
    }

    public static String getSellerEmailAddress() {
        return sellerEmailAddress;
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

    public String getDiscountDetailInfo() {
        return "Price: " + getPrice() + ", Discount: " + discountAmount() + ", Discounted Price: " + discountedPrice();
    }

    public float discountedPrice() {
        return getPrice() * (1 - (getDiscountedPercentage() / 100));
    }

    public float discountAmount() {
        return getPrice() * getDiscountedPercentage() / 100;
    }

    public static String displaySellerContactDetails() {
        String separator = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(getSellerName()).append(separator);
        sb.append(getContactNo()).append(separator);
        sb.append(getSellerEmailAddress());
        return sb.toString();
    }

    public String displayProductInfo() {
        String separator = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(getId()).append(separator);
        sb.append(getName()).append(separator);
        sb.append(getPrice()).append(separator);
        sb.append(getCategory()).append(separator);
        sb.append(getDiscountedPercentage()).append(separator);
        sb.append(isAvailable());
        return sb.toString();
    }
}