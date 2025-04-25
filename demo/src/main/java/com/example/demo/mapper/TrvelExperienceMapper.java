package com.example.demo.mapper;

import com.example.demo.dto.TravelExperienceDto;
import com.example.demo.model.TravelExperience;

public class TrvelExperienceMapper {
    
    // Convert DTO to Entity
    public static TravelExperience toEntity(TravelExperienceDto dto) {
        TravelExperience entity = new TravelExperience();
        entity.setTitle(dto.getTitle());
        entity.setLocation(dto.getLocation());
        entity.setDescription(dto.getDescription());
        entity.setDateVisited(dto.getDateVisited());
        entity.setMediaUrls(dto.getMediaUrls());
        entity.setCulturalInsights(dto.getCulturalInsights());
        return entity;
    }

    // Convert Entity to DTO
    public static TravelExperienceDto toDto(TravelExperience entity) {
        return new TravelExperienceDto(
            entity.getTitle(),
            entity.getLocation(),
            entity.getDescription(),
            entity.getDateVisited(),
            entity.getMediaUrls(),
            entity.getCulturalInsights()
        );
    }
}
