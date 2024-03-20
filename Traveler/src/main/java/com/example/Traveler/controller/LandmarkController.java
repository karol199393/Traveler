package com.example.Traveler.controller;

import com.example.Traveler.model.entity.Landmark;
import com.example.Traveler.service.LandmarkService;
import com.example.Traveler.service.LandmarkServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/landmarks")
public class LandmarkController {
    private final LandmarkServiceImpl landmarkService;
    public LandmarkController(LandmarkServiceImpl landmarkService) {
        this.landmarkService = landmarkService;
    }
    //Logika pobierania nowych tras
    @GetMapping("/getAll")
    public ResponseEntity<List<Landmark>> getAllLandmarks() {
        List<Landmark> landmarks = landmarkService.findAll();
        return ResponseEntity.ok(landmarks);
    }
    //Logika pobierania trasy po id
    @GetMapping("/{id}")
    public Landmark getLandmarkById(@PathVariable Long id) {
        return landmarkService.findById(id).orElse(null);
    }
    //Logika dodawania nowej trasy
    @PostMapping("/create")
    public Landmark createLandmark( @RequestBody Landmark landmark) {
        return landmarkService.save(landmark);
    }



}
