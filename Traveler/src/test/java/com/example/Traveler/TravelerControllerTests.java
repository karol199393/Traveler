package com.example.Traveler;

import com.example.Traveler.model.dto.TravelerDto;
import com.example.Traveler.service.TravelerServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class TravelerControllerTests {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private TravelerServiceImpl travelerService;

    @Test
    public void whenInvalidUser_thenReturnBadRequest() throws Exception {
        // given
        TravelerDto travelerDto = new TravelerDto(2L, "doe", "doe@pl", null);
        String invalidUserJson = objectMapper.writeValueAsString(travelerDto);

        mockMvc.perform(post("/users")
                .contentType("application/json")
                .content(invalidUserJson))
                .andExpect(status().isBadRequest());
    }

}
