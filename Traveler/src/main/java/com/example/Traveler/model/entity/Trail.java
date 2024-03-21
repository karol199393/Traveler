package com.example.Traveler.model.entity;

import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "trails")
@Entity
public class Trail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trail_seq_gen")
    @SequenceGenerator(name = "trail_seq_gen", sequenceName = "trail_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name", length = 64)
    private String name;

    @Column(name = "distance")
    private int distance;

    @Column(name = "difficulty", length = 16)
    private String difficulty;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "trail_id")
    private List<Landmark> landmarks;




}



