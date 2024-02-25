package com.example.Traveler.entity;

import com.example.Traveler.entity.Landmark;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.util.List;

@Data
public class Trail {
    private String id;
    @NotBlank(message = "Name can't be blank.")
    private String name;
    @Positive(message = "Length must be positive.")
    private double length;
    private String difficulty;
    private List<Landmark> landmarks;


}
