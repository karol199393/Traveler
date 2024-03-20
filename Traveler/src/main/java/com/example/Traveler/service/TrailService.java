package com.example.Traveler.service;

import com.example.Traveler.model.entity.Trail;
import com.example.Traveler.service.BaseCrudService;

public interface TrailService extends BaseCrudService<Trail> {

    Trail addTrail(Trail trail);
}
