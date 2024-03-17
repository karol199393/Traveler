package com.example.Traveler.controller;

import com.example.Traveler.model.entity.Trail;
import com.example.Traveler.service.TrailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections; //użycie klasy Collections
import java.util.List; //użycie klasy List
import java.util.Map; //użycie klasy Map

@RestController
@RequestMapping("/trails") //zapytanie o mapowanie
public class TrailController {
    private final TrailService trailService;
    @Autowired
    public TrailController(TrailService trailService) {
        this.trailService = trailService;
    }
    //Logika pobierania nowych tras
    @GetMapping
    public List<Trail> getAllTrails() {
        return Collections.emptyList();
    }
    //Logika pobierania trasy po id
    @GetMapping("/{id}")
    public Trail getTrailById(@PathVariable Long id) {
        return null;
    }
    //Logika dodawania nowej trasy
    @PostMapping
    /*public Trail createTrail(@Valid @RequestBody Trail trail) {
        return null;
    } */
    //Logika aktualizacji trasy
    @PutMapping("/{id}")
    public Trail updateTrail(@PathVariable Long id, @RequestBody Trail trailDetails) {
        return trailDetails;
    }
    //Logika usuwania trasy
    @DeleteMapping("/{id}")
    public void deleteTrail(@PathVariable Long id) {
    }

    //Logika częściowej aktualizacji trasy
    @PatchMapping("/{id}")
    public ResponseEntity<Trail> partialUpdateTrail(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        Trail updateTrail = new Trail();
        return ResponseEntity.ok(updateTrail);
    }



}
