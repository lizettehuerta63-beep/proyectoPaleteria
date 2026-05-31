package com.example.demo.model;

public class Sale {
    private String id;
    private String date;
    private String product;
    private int quantity;
    private double total;

    public Sale(String id, String date, String product, int quantity, double total) {
        this.id = id; this.date = date; this.product = product;
        this.quantity = quantity; this.total = total;
    }
    // Getters
    public String getProduct() { return product; }
    public double getTotal() { return total; }
    public String getId() { return id; }
    public String getDate() { return date; }
    public int getQuantity() { return quantity; }
}
