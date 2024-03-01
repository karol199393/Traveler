package com.example.Traveler.controller;

import com.example.Traveler.model.entity.Traveler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/travelLog")
public class TravelLog {
    //Logika pobierania wszystkich logów podróży
    @GetMapping
    public List<Traveler> getAllTravelLogs() {
        return Collections.emptyList();
    }
    //Logika pobierania logu podróży po id
    @GetMapping("/{id}")
    public Traveler getTravelLogById(@PathVariable Long id) {
        return null;
    }
    //Logika dodawania nowego logu podróży
    @PostMapping
    public TravelLog createTravelLog(@RequestBody TravelLog travelLog) {
        return travelLog;
    }
    //Logika aktualizacji logu podróży
    @PostMapping("/{id}")
    public TravelLog updateTravelLog(@PathVariable Long id,@RequestBody TravelLog travelerDetails) {
        return travelerDetails;
    }
    //Logika usuwania logu podróży
    @DeleteMapping("/{id}")
    public void deleteTravelLog(@PathVariable Long id) {
    }

    //Logika częściowa aktualizacji logu podróży
    @PatchMapping("/{id}")
    public ResponseEntity<TravelLog> partialUpdateTravelLog(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        TravelLog updateTravelLog = new TravelLog();
        return ResponseEntity.ok(updateTravelLog);
    }
    @GetMapping("/findByName")
    public TravelLog findByName(String name) {
        return null;
    }

}
