package com.example.Traveler.model.dto;

import java.io.Serializable;

public record TravelLogDto(Long id, String date, String notes, String travelerName, String trailName) implements Serializable {

}