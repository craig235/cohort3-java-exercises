package com.qa.exercises;

public class Product {

    private static final String sellerName;
    private static final String sellerContactNo;
    private static final String sellerEmailAddress;

    static {
        sellerName = "Bob";
        sellerContactNo = "020 5555 5555";
        sellerEmailAddress = "bob@tesla.com";
    }

    private final int id;
    private final String name;
    private final float price;
    private final String category;
    private final int rating;
    private final float discountedPercentage;
    private final boolean isAvailable;

    public Product(int id, String name, float price, String category, int rating, float discountedPercentage, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
        this.discountedPercentage = discountedPercentage;
        this.isAvailable = isAvailable;
    }

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
        System.out.println(sellerContactDetails());

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

    public static String sellerContactDetails() {
        String separator = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(getSellerName()).append(separator);
        sb.append(getContactNo()).append(separator);
        sb.append(getSellerEmailAddress());
        return sb.toString();
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
