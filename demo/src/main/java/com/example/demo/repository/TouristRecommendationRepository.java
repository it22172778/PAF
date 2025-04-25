package com.example.demo.repository;

import com.example.demo.model.TouristRecommendation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TouristRecommendationRepository extends MongoRepository<TouristRecommendation, String> {
    // Custom query to search by destination name (case-insensitive)
    List<TouristRecommendation> findByDestinationNameContainingIgnoreCase(String destinationName);
}