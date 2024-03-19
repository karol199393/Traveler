package com.example.Traveler.repository;

import com.example.Traveler.model.entity.Landmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandmarkRepository extends JpaRepository<Landmark, Long> {

}
