 package com.example.Traveler;

import com.example.Traveler.controller.TravelerController;
import com.example.Traveler.service.TravelerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TravelerControllerTestFromKarol {
    @Mock
    private TravelerService travelerService;

    @InjectMocks
    private TravelerController travelerController;

    @Test
    @MockitoSettings(strictness = Strictness.LENIENT)
    public void test() {
        //zachowanie serwisu
        when(travelerService.getData()).thenReturn("EqualsStrings");
        //wywołanie metody kontrolera
        String result = travelerController.getData();
        //sprawdzenie rezultatu
        assertEquals("EqualsStrings", result);


    }

}
