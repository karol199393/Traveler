package com.example.Traveler;

import com.example.Traveler.model.entity.Review;
import com.example.Traveler.model.entity.Traveler;
import com.example.Traveler.repository.ReviewRepository;
import com.example.Traveler.service.ReviewService;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
public class ReviewServiceTest {
    @Mock
    private ReviewRepository reviewRepository;
    @InjectMocks
    private ReviewService reviewService;

    @Test
    public void shouldReturnEmptyListWhenNoReview() {
        when(reviewRepository.findAll()).thenReturn(Collections.emptyList());
        List<Review> reviews = (List<Review>) reviewService.getAllReview();
        assertTrue(reviews.isEmpty());
    }
    @Test
    public void shouldReturnNullWhenReviewNotExist() {
        int reviewId = 1;
        // Sprawdź, czy zwracana wartość nie jest pusta
        Review review = reviewService.getReviewById((long)reviewId);
        verify(reviewRepository).findById(2L);
        assertNull(review);
    }
    @Test
    public void shouldAddReview() {
        Traveler traveler = new Traveler(); // Załóżmy, że utworzyliśmy obiekt Traveler
        Review reviewToAdd = new Review("Great experience, highly recommended!", 5, "2024-03-25", "Amazing hotel stay", "New York", "Hotel", "https://example.com/image.jpg", traveler);
        //Symulacja zachowania repo
        when(reviewRepository.save(reviewToAdd)).thenReturn(reviewToAdd);
        //wywolanie metody z recenzja
        Review adedReview = reviewService.addReview(reviewToAdd);
        //Sprawdź, czy save zostało wywołane z odopowiednim argumentem
        verify(reviewRepository).save(reviewToAdd);
        assertEquals(reviewToAdd,adedReview);
    }
    @Test
    public void shouldUpdateReview() {
        Long reviewId = 1L;
        Traveler traveler = new Traveler(); // Załóżmy, że utworzyliśmy obiekt Traveler
        Review reviewToUpdate = new Review("Not recommended!", 1, "2024-03-25", "Amazing hotel stay", "New York", "Hotel", "https://example.com/image.jpg", traveler);
        //Symuacja zachowania repo
        when(reviewRepository.save(reviewToUpdate)).thenReturn(reviewToUpdate);
        //wywolanie metody z recenzją
        Review updatedReview = reviewService.updateReview(reviewId,reviewToUpdate);
        //Sprawdz , czy zostalo wywolano z odpowiednim argumentem
        verify(reviewRepository).save(reviewToUpdate);
        assertEquals(reviewToUpdate,updatedReview);
    }

    @Test
public void shouldDelete() {
        Long reviewId = 1L;
        //wywolanie metody z recenzją
        reviewService.delete(reviewId);
        //Sprawdz , czy zostalo wywolano z odpowiednim argumentem
        verify(reviewRepository).deleteById(reviewId);
    }
}


