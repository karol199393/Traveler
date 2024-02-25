package com.example.Traveler.entity;

import lombok.Data;

@Data
public class Landmark {
    private String id;
    private String name;
    private String description;
    private double latitude;
    private double longitude;

}
