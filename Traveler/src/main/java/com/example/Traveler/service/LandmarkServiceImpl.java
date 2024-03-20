package com.example.Traveler.service;

import com.example.Traveler.model.entity.Landmark;
import com.example.Traveler.repository.LandmarkRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class LandmarkServiceImpl implements BaseCrudService<Landmark> {
    LandmarkRepository landmarkRepository;

    public LandmarkServiceImpl(LandmarkRepository landmarkRepository) {
        this.landmarkRepository = landmarkRepository;
    }


    @Override
    public List<Landmark> findAll() {
        return landmarkRepository.findAll();
    }


    @Override
    public Optional<Landmark> findById(Long id) {
        return landmarkRepository.findById(id);
    }

    @Override
    public Landmark save(Landmark object) {
        return landmarkRepository.save(object);
    }

    @Override
    public Landmark update(Long id, Landmark objectDetails) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    public String getLandmarkDescription() {
     return "Statue";
    }


    public Object getData() {
        return null;
    }
}
