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
    @GetMapping("/getAll")
    public List<Trail> getAllTrails() {
        return trailService.findAll();
    }
    //Logika pobierania trasy po id
    @GetMapping("/{id}")
    public Object getTrailById(@PathVariable Long id) {
        return trailService.findById(id);
    }
    //Logika dodawania nowej trasy
    @PostMapping("/create")
    public Trail createTrail(@RequestBody Trail trail) {
        return trailService.addTrail(trail);
    }
    //Logika aktualizacji trasy
    @PutMapping("update/{id}")
    public Trail updateTrail(@PathVariable Long id, @RequestBody Trail trailDetails)   {
        return trailService.update(id, trailDetails);
    }//Logika usuwania trasy
    @DeleteMapping("delete/{id}")
    public void deleteTrail(@PathVariable Long id) {
        trailService.delete(id);
    }
    //Logika częściowej aktualizacji trasy
    @PatchMapping("patch/{id}")
    public ResponseEntity<Trail> partialUpdateTrail(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        Trail updateTrail = new Trail();
        return ResponseEntity.ok(updateTrail);
    }

}
