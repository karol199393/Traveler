package com.example.Traveler.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "trail")
@Entity
public class Trail {
    private String id;
    @NotBlank(message = "Name can't be blank.")
    private String name;
    @Positive(message = "Length must be positive.")
    private double length;
    private String difficulty;
    private List<Landmark> landmarks;


}
