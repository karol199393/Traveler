package com.example.Traveler.mapper;

import com.example.Traveler.model.dto.TravelLogDto;
import com.example.Traveler.model.entity.TravelLog;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;

@RequiredArgsConstructor
@Component
public class TravelerLogMapper {

    public List<TravelLogDto> mapToDto(List<TravelLog> travelLogs) {
        return travelLogs.stream()
                .map(this::mapToDto)
                .toList();
    }
    public TravelLogDto mapToDto(TravelLog travelLog) {
        return new TravelLogDto(travelLog.getId(), travelLog.getDate().toString(), travelLog.getNotes(),
                travelLog.getTraveler().getUsername(), travelLog.getTrail().getName());
    }

}
