/*
package com.example.Traveler;

import com.example.Traveler.model.entity.Trail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TrailIntegrationTest {

    @Autowired
    private TestRestTemplaterestTemplate;

    @Test
    public void shouldCreateTrail() {
        ResponseEntity<Trail> response = restTemplate.postForEntity("/api/trails", new Trail("New Trail"), Trail.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(response.getBody().getName()).isEqualTo("New Trail");
    }
}


 */

