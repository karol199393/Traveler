package com.example.Traveler.mapper;

import com.example.Traveler.model.dto.TravelerDto;
import com.example.Traveler.model.entity.Traveler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;



@RequiredArgsConstructor
@Component
public class TravelerMapper {

    private final TravelerLogMapper travelerLogMapper;

    public Traveler mapToTraveler(TravelerDto dto) {
        Traveler traveler = new Traveler();
        traveler.setId(dto.id());
        traveler.setUsername(dto.name());
        traveler.setEmail(dto.email());
        return new Traveler();
    }

    public TravelerDto mapToDto(Traveler traveler) {
        return new TravelerDto(traveler.getId(), traveler.getUsername(), traveler.getEmail(),
                travelerLogMapper.mapToDto(traveler.getTravelLogs()));
    }

}
