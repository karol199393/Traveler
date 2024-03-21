package com.example.Traveler.service;

import com.example.Traveler.model.entity.Trail;
import com.example.Traveler.repository.TrailRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TrailServiceImpl implements TrailService {
    TrailRepository trailRepository;

    public TrailServiceImpl(TrailRepository trailRepository) {
        this.trailRepository = trailRepository;
    }

    @Override
    public List<Trail> findAll() {
       return trailRepository.findAll();
    }

    @Override
    public Optional<Trail> findById(Long id) {

        return trailRepository.findById(id);
    }

    @Override
    public Trail save(Trail object) {
        return trailRepository.save(object);
    }

    @Override
    public Trail update(Long id, Trail objectDetails) {
        return trailRepository.save(objectDetails);
    }

    @Override
    public void delete(Long id) {
        trailRepository.deleteById(id);
    }

    @Override
    public Trail addTrail(Trail trail) {
        return trailRepository.save(trail);
    }
}
