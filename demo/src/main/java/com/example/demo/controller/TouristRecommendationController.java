package com.example.demo.controller;

import com.example.demo.dto.TouristRecommendationDto;
import com.example.demo.mapper.TouristRecommendationMapper;
import com.example.demo.model.TouristRecommendation;
import com.example.demo.service.TouristRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tourist-recommendations")
public class TouristRecommendationController {

    @Autowired
    private TouristRecommendationService service;

    // Create a new Tourist Recommendation
    @PostMapping
    public ResponseEntity<TouristRecommendationDto> createTouristRecommendation(@RequestBody TouristRecommendationDto dto) {
        TouristRecommendation entity = service.saveTouristRecommendation(TouristRecommendationMapper.toEntity(dto));
        return ResponseEntity.ok(TouristRecommendationMapper.toDto(entity));
    }

    // Get all Tourist Recommendations
    @GetMapping
    public ResponseEntity<List<TouristRecommendationDto>> getAllTouristRecommendations() {
        List<TouristRecommendation> recommendations = service.getAllTouristRecommendations();
        List<TouristRecommendationDto> dtos = recommendations.stream()
                .map(TouristRecommendationMapper::toDto)
                .toList();
        return ResponseEntity.ok(dtos);
    }

    // Get a Tourist Recommendation by ID
    @GetMapping("/{id}")
    public ResponseEntity<TouristRecommendationDto> getTouristRecommendationById(@PathVariable String id) {
        TouristRecommendation entity = service.getTouristRecommendationById(id);
        return ResponseEntity.ok(TouristRecommendationMapper.toDto(entity));
    }

    // Update a Tourist Recommendation by ID
    @PutMapping("/{id}")
    public ResponseEntity<TouristRecommendationDto> updateTouristRecommendation(
            @PathVariable String id,
            @RequestBody TouristRecommendationDto dto) {
        TouristRecommendation updatedEntity = service.updateTouristRecommendation(id, TouristRecommendationMapper.toEntity(dto));
        return ResponseEntity.ok(TouristRecommendationMapper.toDto(updatedEntity));
    }

    // Delete a Tourist Recommendation by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTouristRecommendation(@PathVariable String id) {
        service.deleteTouristRecommendation(id);
        return ResponseEntity.noContent().build();
    }
}