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

    public Object getAllReview() {
        return reviewRepository.findAll();
    }
    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }
    public Review updateReview(Long id, Review reviewDetails) {
        return reviewRepository.save(reviewDetails);
    }

    public Object getData() {
        return "This is a data";
    }

    public void delete(Long id) {
        reviewRepository.deleteById(id);
    }



}
