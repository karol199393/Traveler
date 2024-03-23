package com.example.Traveler;

import com.example.Traveler.controller.ReviewController;
import com.example.Traveler.model.entity.Review;
import com.example.Traveler.repository.ReviewRepository;
import com.example.Traveler.service.ReviewService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReviewServiceTest {
    @Mock
    private ReviewRepository reviewRepository;
    @InjectMocks
    private ReviewService reviewService;

    private ReviewController reviewController;

    @Before
    public void setUp() {
        reviewRepository = mock(ReviewRepository.class);
        reviewService = new ReviewService(reviewRepository);
    }


    @Test
    public void testGetAllReviewNoReviews() {
        //Przetestuj metodę gdy AllReview nie zwraca żadnej wartości
        when(reviewRepository.findAll()).thenReturn(Collections.emptyList());
        List<Review> reviews = (List<Review>) reviewService.getAllReview();
        assertTrue(reviews.isEmpty());
    }
    @Test
    public void testGetReviewDescription() {

        // Utwórz obiekt ReviewService
        reviewService = new ReviewService(null);
        // Sprawdź, czy zwracana wartość nie jest pusta
        String description = reviewService.getReviewDescription();
        assertNotNull(description);
        // Sprawdź, czy zwracana wartość jest dokładnie taka sama jak oczekiwana
        assertEquals("This is a review", description);
    }

    @Test
    public void testGetReviewById() {
        // Utwórz obiekt ReviewService
        reviewService = new ReviewService(reviewRepository);
        // Sprawdź, czy zwracana wartość nie jest pusta
        Review review = reviewService.getReviewById(1L);
        assertNull(review);
    }

}


