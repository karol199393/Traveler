package com.example.Traveler.model.entity;

import lombok.Data;

import java.util.List;

@Data
public class Traveler {
    private Long id;
    private String username;
    private String email;
    private List<TravelLog> travelLogs;

    public Traveler(Long id, String username, String email, List<TravelLog> travelLogs) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.travelLogs = travelLogs;
    }

    public Traveler() {
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<TravelLog> getTravelLogs() {
        return travelLogs;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTravelLogs(List<TravelLog> travelLogs) {
        this.travelLogs = travelLogs;
    }
}
