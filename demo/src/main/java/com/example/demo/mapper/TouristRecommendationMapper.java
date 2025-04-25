package com.example.demo.mapper;

import com.example.demo.dto.TouristRecommendationDto;
import com.example.demo.model.TouristRecommendation;

public class TouristRecommendationMapper {

    // Convert DTO to Entity
    public static TouristRecommendation toEntity(TouristRecommendationDto dto) {
        TouristRecommendation entity = new TouristRecommendation();
        entity.setDestinationName(dto.getDestinationName());
        entity.setDescription(dto.getDescription());
        entity.setCoordinates(dto.getCoordinates());
        entity.setRecommendedRoutes(dto.getRecommendedRoutes());
        entity.setBestTimeToVisit(dto.getBestTimeToVisit());
        entity.setTravelTips(dto.getTravelTips());
        entity.setMediaUrls(dto.getMediaUrls());
        entity.setCulturalInsights(dto.getCulturalInsights());
        return entity;
    }

    // Convert Entity to DTO
    public static TouristRecommendationDto toDto(TouristRecommendation entity) {
        TouristRecommendationDto dto = new TouristRecommendationDto();
        dto.setDestinationName(entity.getDestinationName());
        dto.setDescription(entity.getDescription());
        dto.setCoordinates(entity.getCoordinates());
        dto.setRecommendedRoutes(entity.getRecommendedRoutes());
        dto.setBestTimeToVisit(entity.getBestTimeToVisit());
        dto.setTravelTips(entity.getTravelTips());
        dto.setMediaUrls(entity.getMediaUrls());
        dto.setCulturalInsights(entity.getCulturalInsights());
        return dto;
    }
}
