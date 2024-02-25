package com.example.Traveler.service;

import com.example.Traveler.entity.Trail;
import com.example.Traveler.exception.ResourceNotFoundException;
import com.example.Traveler.repository.TrailRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/trails")
public class TrailService {

    private final TrailRepository trailRepository;

    @Autowired
    public TrailService(TrailRepository trailRepository) {
        this.trailRepository = trailRepository;
    }
    //Logika pobierania nowych tras
    @GetMapping
    public List<Trail> findAllTrails() {
        return trailRepository.findAll();
    }

    //Logika pobierania trasy po id
    @GetMapping("/{id}")
    public Optional<Trail> findTrailById(Long id) {
        return Optional.ofNullable(trailRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Trail not found with id: " + id)));
    }
    //Logika zapamiętania nowej trasy
    @PostMapping
    public Trail saveTrail(@RequestBody Trail trail) {
        return trailRepository.save(trail);
    }
    //Logika usuwania trasy
    @DeleteMapping
    public void deleteTrail(@PathVariable Long id) {
        trailRepository.deleteById(id);
    }




}
