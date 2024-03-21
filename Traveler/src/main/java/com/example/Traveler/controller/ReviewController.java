package com.example.Traveler.controller;

import com.example.Traveler.model.entity.Review;
import com.example.Traveler.service.ReviewService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping("/getAllReview")
    public Object getAllReview() {
        return reviewService.getAllReview();
    }
    @GetMapping("/{id}")
    public Object getReviewById(@PathVariable Long id) {
        return reviewService.getReviewById(id);
    }
    @GetMapping("/create")
    public Review addReview(@RequestBody Review review){
        return reviewService.addReview(review);
    }
    @GetMapping("/description")
    public String getReviewDescription() {
        return reviewService.getReviewDescription();
    }
    @DeleteMapping("delete/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.delete(id);
    }
    @GetMapping("/data")
    public Object getData() {
        return reviewService.getData();
    }



}
