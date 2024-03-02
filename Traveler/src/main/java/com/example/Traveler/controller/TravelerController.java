package com.example.Traveler.controller;
/*
import com.example.Traveler.mapper.TravelerMapper;
import com.example.Traveler.model.dto.TravelerDto;
import com.example.Traveler.model.entity.Traveler;
import com.example.Traveler.service.TravelerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/travelers")
public class TravelerController {


    private final TravelerMapper travelerMapper;
    private final TravelerService travelerService;

    // Logika pobierania wszystkich podróżnych
    @GetMapping
    public ResponseEntity<List<TravelerDto>> getAllTravelers() {
        List<Traveler> travelers = travelerService.findAll();
        return new ResponseEntity<>(travelers.stream().map(travelerMapper::mapToDto).toList(), HttpStatus.OK);
    }

    // Logika pobierania podróżnego po id
    @GetMapping("/{id}")
    public ResponseEntity<TravelerDto> getTravelerById(@PathVariable Long id) {
        Traveler traveler = travelerService.findById(id)
                .orElseThrow(() -> new RuntimeException("Traveler not found with id: " + id));
        return new ResponseEntity<>(travelerMapper.mapToDto(traveler), HttpStatus.OK);
    }




    // Logika dodawania nowego podróżnego
    @PostMapping
    public ResponseEntity<TravelerDto> createTraveler(@RequestBody Traveler traveler) {
        Traveler newTraveler = travelerService.save(traveler);
        return new ResponseEntity<>(travelerMapper.mapToDto(newTraveler), HttpStatus.CREATED);
    }

    // Logika aktualizacji podróżnego
    @PutMapping("/{id}")
    public ResponseEntity<TravelerDto> updateTraveler(@PathVariable Long id, @RequestBody Traveler travelerDetails) {
        Traveler updatedTraveler = travelerService.update(id, travelerDetails);
        return new ResponseEntity<>(travelerMapper.mapToDto(updatedTraveler), HttpStatus.OK);
    }

    // Logika usuwania podróżnego
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTraveler(@PathVariable Long id) {
        travelerService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
*/
