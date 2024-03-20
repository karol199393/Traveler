package com.example.Traveler.controller;

import com.example.Traveler.service.ReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/description")
    public String getReviewDescription() {
        return reviewService.getReviewDescription();
    }


    @GetMapping("/delete/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.delete(id);
    }

    @GetMapping("/data")
    public Object getData() {
        return reviewService.getData();
    }

}
