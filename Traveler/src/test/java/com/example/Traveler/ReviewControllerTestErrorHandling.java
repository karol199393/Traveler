package com.example.Traveler;

import com.example.Traveler.model.entity.Review;
import com.example.Traveler.model.entity.Traveler;
import com.example.Traveler.service.ReviewService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ReviewControllerTestErrorHandling {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ReviewService reviewService;
/*
    @Test
    public void testAddReview_ErrorHandling() throws Exception {
        Traveler traveler = new Traveler();
        Review reviewToAdd = new Review("Great experience, highly recommended!", 5, "2024-03-25", "Amazing hotel stay", "New York", "Hotel", "https://example.com/image.jpg", traveler);
        //Mockowanie serwisu aby rzucal wyjatek
        when(reviewService.addReview(reviewToAdd)).thenThrow(new RuntimeException("Error adding review"));
        //Wywołanie POST
        String jsonContent = "{}";
        mockMvc.perform(post("/reviews")
                        .contentType(MediaType.APPLICATION_JSON)  // Poprawna specyfikacja typu danych
                        .content(jsonContent.getBytes()))
                // Oczekiwanie na kod błędu HTTP 500
                    .andExpect(status().isInternalServerError());

    }

 */

}
