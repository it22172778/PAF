package com.example.demo.service;

import com.example.demo.model.TouristRecommendation;
import com.example.demo.repository.TouristRecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristRecommendationService {

    @Autowired
    private TouristRecommendationRepository repository;

    // Save a new Tourist Recommendation
    public TouristRecommendation saveTouristRecommendation(TouristRecommendation recommendation) {
        return repository.save(recommendation);
    }

    // Get all Tourist Recommendations
    public List<TouristRecommendation> getAllTouristRecommendations() {
        return repository.findAll();
    }

    // Get a Tourist Recommendation by ID
    public TouristRecommendation getTouristRecommendationById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Recommendation not found"));
    }

    // Delete a Tourist Recommendation by ID
    public void deleteTouristRecommendation(String id) {
        repository.deleteById(id);
    }

    // Update a Tourist Recommendation by ID
    public TouristRecommendation updateTouristRecommendation(String id, TouristRecommendation updatedRecommendation) {
        return repository.findById(id).map(recommendation -> {
            recommendation.setDestinationName(updatedRecommendation.getDestinationName());
            recommendation.setDescription(updatedRecommendation.getDescription());
            recommendation.setCoordinates(updatedRecommendation.getCoordinates());
            recommendation.setRecommendedRoutes(updatedRecommendation.getRecommendedRoutes());
            recommendation.setBestTimeToVisit(updatedRecommendation.getBestTimeToVisit());
            recommendation.setTravelTips(updatedRecommendation.getTravelTips());
            recommendation.setMediaUrls(updatedRecommendation.getMediaUrls());
            recommendation.setCulturalInsights(updatedRecommendation.getCulturalInsights());
            return repository.save(recommendation);
        }).orElseThrow(() -> new RuntimeException("Recommendation not found"));
    }
}