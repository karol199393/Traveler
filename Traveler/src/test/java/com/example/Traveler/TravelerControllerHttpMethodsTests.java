package com.example.Traveler;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TravelerControllerHttpMethodsTests {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testGetRequest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/travelers"))
                .andExpect(status().isOk());
    }

}
