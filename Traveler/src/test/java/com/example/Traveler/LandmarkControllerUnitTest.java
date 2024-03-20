package com.example.Traveler;

import com.example.Traveler.controller.LandmarkController;
import com.example.Traveler.model.entity.Landmark;
import com.example.Traveler.service.LandmarkServiceImpl;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LandmarkControllerUnitTest {

    @Mock
    private LandmarkServiceImpl landmarkService;

    @InjectMocks
    private LandmarkController landmarkController;

    @Test
    public void testGetAllLandmarks() {
        //Mockowanie
        LandmarkServiceImpl landmarkService = mock(LandmarkServiceImpl.class);
        //Przygotowanie danych
        List<Landmark> landmarks = Collections.singletonList(new Landmark());
        //when
        when(landmarkService.findAll()).thenReturn(landmarks);
        //Inicjalizacja kontrolera
        LandmarkController landmarkController = new LandmarkController(landmarkService);
        //Wywołanie metody-invoke
        ResponseEntity<List<Landmark>> responseEntity = landmarkController.getAllLandmarks();
        //Sprawdzenie wyniku
        assertEquals(landmarks, responseEntity.getBody());



}


}
