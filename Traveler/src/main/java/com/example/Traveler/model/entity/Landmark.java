package com.example.Traveler.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "landmarks")
@Entity
public class Landmark {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "landmark_sequ_gen")
    //@SequenceGenerators(name = "landmark_sequ_gen", sequenceName = "landmark_seq", allocationSize = 1)
    private Long id;
    @Column(name = "name",length = 64)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;

}
