package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
    @Id
    private String id;
    private String customer;
    private String product;
    private int rating;
    private String comment;

    // Getters y Setters
    public String getId() { return id; }
    public String getProduct() { return product; }
    public String getCustomer() { return customer; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
}
