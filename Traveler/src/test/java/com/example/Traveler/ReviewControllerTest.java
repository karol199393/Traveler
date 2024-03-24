package com.example.Traveler;

import com.example.Traveler.controller.ReviewController;
import com.example.Traveler.model.entity.Review;
import com.example.Traveler.service.ReviewService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ReviewControllerTest {
    @Mock
    private ReviewController reviewController;
    @InjectMocks
    private ReviewService reviewService;

    //Testowanie kontrolera
    //Testowanie metody getAllReview
    @Test
    public void testGetAllReview() {
        reviewController.getAllReview();
    }


    @Test
    public void testGetReviewById() {
        reviewController.getReviewById(1L);
    }


    @Test
    public void testAddReview() {
        reviewController.addReview(new Review());
    }

    @Test
    public void testGetReviewDescription() {
        reviewController.getReviewDescription();
    }

    @Test
    public void testDeleteReview() {
        reviewController.deleteReview(1L);
    }

    @Test
    public void testGetData() {
        reviewController.getData();
    }

}
