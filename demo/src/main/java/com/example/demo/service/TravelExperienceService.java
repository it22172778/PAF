package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TravelExperienceDto;
import com.example.demo.model.TravelExperience;
import com.example.demo.repository.TravelExperienceRepository;

@Service
public class TravelExperienceService {
    
    @Autowired
    private TravelExperienceRepository repository;

    //Save a new Travel Experience
    public TravelExperience saveTravelExperience(TravelExperienceDto dto) {
        TravelExperience travelExperience = new TravelExperience();
        travelExperience.setTitle(dto.getTitle());
        travelExperience.setLocation(dto.getLocation());
        travelExperience.setDescription(dto.getDescription());
        travelExperience.setDateVisited(dto.getDateVisited());
        travelExperience.setMediaUrls(dto.getMediaUrls());
        travelExperience.setCulturalInsights(dto.getCulturalInsights());
        return repository.save(travelExperience);
    }

    //Get all Travel Experiences
    public List<TravelExperienceDto> getAllTravelExperiences() {
        return repository.findAll().stream().map(experience -> {
            return new TravelExperienceDto(
                experience.getTitle(),
                experience.getLocation(),
                experience.getDescription(),
                experience.getDateVisited(),
                experience.getMediaUrls(),
                experience.getCulturalInsights()
            );
        }).collect(Collectors.toList());
    }

    //Get a Travel Experience by ID
    public TravelExperienceDto getTravelExperienceById(String id) {
        TravelExperience experience = repository.findById(id).orElseThrow(() -> new RuntimeException("Experience not found"));
        return new TravelExperienceDto(
            experience.getTitle(),
            experience.getLocation(),
            experience.getDescription(),
            experience.getDateVisited(),
            experience.getMediaUrls(),
            experience.getCulturalInsights()
        );
    }

    //Delete a Travel Experience by ID
    public void deleteTravelExperience(String id) {
        repository.deleteById(id);
    }
}
