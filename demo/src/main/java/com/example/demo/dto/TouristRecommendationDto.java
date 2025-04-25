package com.example.demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class TouristRecommendationDto {
    private String destinationName; // Name of the destination
    private String description; // Description of the destination
    private String coordinates; // Coordinates (latitude, longitude)
    private List<String> recommendedRoutes; // Suggested routes to the destination
    private String bestTimeToVisit; // Best time to visit the destination
    private List<String> travelTips; // Travel tips for tourists
    private List<String> mediaUrls; // URLs for images or videos of the destination
    private String culturalInsights; // Cultural insights or advice for the destination
}