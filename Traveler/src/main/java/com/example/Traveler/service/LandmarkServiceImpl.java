package com.example.Traveler.service;

import com.example.Traveler.model.entity.Landmark;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class LandmarkServiceImpl implements LandmarkService {

    @Override
    public List<Landmark> findAll() {
        return null;
    }

    @Override
    public Optional<Landmark> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Landmark save(Landmark object) {
        return null;
    }

    @Override
    public Landmark update(Long id, Landmark objectDetails) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
