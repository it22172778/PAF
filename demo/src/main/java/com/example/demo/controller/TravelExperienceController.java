package com.example.demo.controller;

import com.example.demo.dto.TravelExperienceDto;
import com.example.demo.mapper.TrvelExperienceMapper;
import com.example.demo.model.TravelExperience;
import com.example.demo.service.TravelExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travel-experiences")

public class TravelExperienceController {
    
    @Autowired
    private TravelExperienceService service;

    // Create a new travel experience
    @PostMapping
    public ResponseEntity<TravelExperienceDto> createTravelExperience(@RequestBody TravelExperienceDto dto) {
        TravelExperience entity = service.saveTravelExperience(dto);
        return ResponseEntity.ok(TrvelExperienceMapper.toDto(entity));
    }

    // Get all travel experiences
    @GetMapping
    public ResponseEntity<List<TravelExperienceDto>> getAllTravelExperiencesById() {
        List<TravelExperienceDto> experiences = service.getAllTravelExperiences();
        return ResponseEntity.ok(experiences);
    }

    //Get a travel experience by ID
    @GetMapping("/{id}")
    public ResponseEntity<TravelExperienceDto> getTravelExperienceById(@PathVariable String id) {
        TravelExperienceDto dto = service.getTravelExperienceById(id);
        return ResponseEntity.ok(dto);
    }

    //update a travel experience by ID
    @PutMapping("/{id}")
    public ResponseEntity<TravelExperienceDto> updateTravelExperience(
            @PathVariable String id,
            @RequestBody TravelExperienceDto dto) {
        TravelExperience updatedEntity = service.updateTravelExperience(id, dto);
        return ResponseEntity.ok(TrvelExperienceMapper.toDto(updatedEntity));
    }

    //delete a travel experience by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTravelExperience(@PathVariable String id) {
        service.deleteTravelExperience(id);
        return ResponseEntity.noContent().build();
    }
}