package com.example.Traveler.repository;


import com.example.Traveler.model.entity.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelerRepository extends JpaRepository<Traveler, Long> {

}


