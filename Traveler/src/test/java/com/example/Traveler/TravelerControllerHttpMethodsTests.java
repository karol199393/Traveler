package com.example.Traveler;

import com.example.Traveler.controller.TravelerController;
import com.example.Traveler.mapper.TravelerMapper;
import com.example.Traveler.model.dto.TravelerDto;
import com.example.Traveler.model.entity.Traveler;
import com.example.Traveler.service.TravelerServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TravelerController.class)
@SpringBootTest
public class TravelerControllerHttpMethodsTests {

    private static final String TEST_EMAIL = "test@email.com";
    private static final String TRAVELER_NAME = "John";
    @MockBean
    private TravelerServiceImpl travelerService;
    @MockBean
    private TravelerMapper travelerMapper;
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testGetRequest() throws Exception {
        given(travelerService.findById(1L))
                .willReturn(Optional.of(createTraveler()));
        given(travelerMapper.mapToDto(createTraveler()))
                .willReturn(createTravelerDto());

        mockMvc.perform(get("/travelers/1")
                        .contentType("application/json"))
                .andExpect(status().isOk());
    }

    private Traveler createTraveler() {
        Traveler traveler = new Traveler();
        traveler.setId(1L);
        traveler.setUsername(TRAVELER_NAME);
        traveler.setEmail(TEST_EMAIL);
        return traveler;
    }

    private TravelerDto createTravelerDto() {
        return new TravelerDto(1L, TRAVELER_NAME, TEST_EMAIL, Collections.emptyList());
    }



}
