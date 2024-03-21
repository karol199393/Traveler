package com.example.Traveler.service;

import com.example.Traveler.model.entity.TravelLog;
import com.example.Traveler.repository.TravelLogRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TravelLogServiceImpl implements TravelLogService {
    TravelLogRepository travelLogRepository;

    @Override
    public List<TravelLog> findAll() {
        return travelLogRepository.findAll();
    }
    @Override
    public Optional<TravelLog> findById(Long id) {
        return travelLogRepository.findById(id);
    }
    @Override
    public TravelLog save(TravelLog object) {
        return travelLogRepository.save(object);
    }
    @Override
    public TravelLog update(Long id, TravelLog objectDetails) {

        return travelLogRepository.save(objectDetails);
    }
    @Override
    public void delete(Long id) {
        travelLogRepository.deleteById(id);
    }
}
