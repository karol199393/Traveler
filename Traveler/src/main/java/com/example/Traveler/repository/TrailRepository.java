package com.example.Traveler.repository;

import com.example.Traveler.model.entity.Trail;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TrailRepository extends JpaRepository<Trail, Long> {
}
