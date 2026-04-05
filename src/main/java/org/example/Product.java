package org.example;

public class Product {

    private String name;
    private int price;

    // Default constructor
    public Product() {
        this.name = "Apple"; // default name
        this.price = 100;    // default price
    }

    // Constructor with name and price
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Get the product name
    public String getName() {
        return name;
    }

    // Get the product price
    public int getPrice() {
        return price;
    }
}