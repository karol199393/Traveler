package com.example.Traveler.repository;

import com.example.Traveler.model.entity.TravelLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelLogRepository extends JpaRepository<TravelLog, Long> {
}
