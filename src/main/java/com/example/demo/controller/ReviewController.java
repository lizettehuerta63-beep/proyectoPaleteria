package com.example.demo.controller;
import com.example.demo.model.Review;
import com.example.demo.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewRepository repository;

    @GetMapping
    public List<Review> getAllReviews() {
        return repository.findAll();
    }
}
