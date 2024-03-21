package com.example.Traveler.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String review;
    private int rating;
    private String date;
    private String title;
    private String location;
    private String type;
    private String image;
    @ManyToOne
    private Traveler traveler;
}
