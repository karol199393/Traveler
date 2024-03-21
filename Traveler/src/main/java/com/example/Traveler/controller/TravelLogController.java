
package com.example.Traveler.controller;

import com.example.Traveler.mapper.TravelerLogMapper;
import com.example.Traveler.model.dto.TravelLogDto;
import com.example.Traveler.model.entity.TravelLog;
import com.example.Traveler.model.entity.Traveler;
import com.example.Traveler.service.TravelLogService;
import com.example.Traveler.service.TravelLogServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/travelLog")
public class TravelLogController {

    TravelLogServiceImpl travelLogService;
    TravelerLogMapper travelLogMapper;

    public TravelLogController(TravelLogServiceImpl travelLogService) {
        this.travelLogService = travelLogService;
    }

    //Logika pobierania wszystkich logów podróży
    @GetMapping
    public List<Traveler> getAllTravelLogs() {
        return Collections.emptyList();
    }
    //Logika pobierania logu podróży po id
    @GetMapping("/{id}")
    public Optional<TravelLog> getTravelLogById(@PathVariable Long id) {
        return travelLogService.findById(id);
    }


    //Logika dodawania nowego logu podróży
    @PostMapping
    public TravelLogController createTravelLog(@RequestBody TravelLogController travelLog) {
        return travelLog;
    }
    //Logika aktualizacji logu podróży
    @PostMapping("/{id}")
    public TravelLogController updateTravelLog(@PathVariable Long id, @RequestBody TravelLogController travelerDetails) {
        return travelerDetails;
    }
    //Logika usuwania logu podróży
    @DeleteMapping("/{id}")
    public void deleteTravelLog(@PathVariable Long id) {
        travelLogService.delete(id);
    }
    //Logika częściowa aktualizacji logu podróży
    @PatchMapping("/{id}")
    public ResponseEntity<TravelLogController> partialUpdateTravelLog(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        TravelLogController updateTravelLog = new TravelLogController(travelLogService);
        return ResponseEntity.ok(updateTravelLog);
    }

}
