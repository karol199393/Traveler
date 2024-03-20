package com.example.Traveler.service;

import com.example.Traveler.model.entity.Review;
import com.example.Traveler.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public String getReviewDescription() {
        return "This is a review";
    }

    public Review getData() {
        return null;
    }

    public void delete(Long id) {
    }

    public Review getReview() {
        return null;
    }


}
