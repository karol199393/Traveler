package com.example.Traveler;

import com.example.Traveler.service.ExampleService;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExampleTest {
    @Mock
    private ExampleService exampleService;

    @Test
    void name() {
        when(exampleService.getName(true)).thenReturn("Hello");
        assertEquals("Hello", exampleService.getName(true));
    }
}
