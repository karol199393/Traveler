package com.example.Traveler.entity;

import lombok.Data;

import java.util.List;

@Data
public class Traveler {
    private Long id;
    private String username;
    private String email;
    private List<TravelLog> travelLogs;

}
