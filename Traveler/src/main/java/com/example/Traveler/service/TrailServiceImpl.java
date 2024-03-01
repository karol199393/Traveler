package com.example.Traveler.service;

import com.example.Traveler.model.entity.Trail;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TrailServiceImpl implements TrailService {

    @Override
    public List<Trail> findAll() {
        return null;
    }

    @Override
    public Optional<Trail> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Trail save(Trail object) {
        return null;
    }

    @Override
    public Trail update(Long id, Trail objectDetails) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
