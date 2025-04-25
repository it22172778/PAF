package com.example.demo.model;
import lombok.Data;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tourist_recommendations")
public class TouristRecommendation {
    @Id
    private String id; // Unique identifier for the document
    private String destinationName; // Name of the destination
    private String description; // Description of the destination
    private String coordinates; // Coordinates (latitude, longitude)
    private List<String> recommendedRoutes; // Suggested routes to the destination
    private String bestTimeToVisit; // Best time to visit the destination
    private List<String> travelTips; // Travel tips for tourists
    private List<String> mediaUrls; // URLs for images or videos of the destination
    private String culturalInsights; // Cultural insights or advice for the destination
}
