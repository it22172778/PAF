package com.example.demo.controller;

import com.example.demo.dto.TravelChallengeSharingDto;
import com.example.demo.mapper.TravelChallengeSharingMapper;
import com.example.demo.model.TravelChallengeSharing;
import com.example.demo.service.TravelChallengeSharingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travel-challenges")
public class TravelChallengeSharingController {

    @Autowired
    private TravelChallengeSharingService service;

    // Create a new Travel Challenge
    @PostMapping
    public ResponseEntity<TravelChallengeSharingDto> createTravelChallenge(@RequestBody TravelChallengeSharingDto dto) {
        TravelChallengeSharing entity = service.saveTravelChallenge(dto);
        return ResponseEntity.ok(TravelChallengeSharingMapper.toDto(entity));
    }

    // Get all Travel Challenges
    @GetMapping
    public ResponseEntity<List<TravelChallengeSharingDto>> getAllTravelChallenges() {
        List<TravelChallengeSharingDto> challenges = service.getAllTravelChallenges();
        return ResponseEntity.ok(challenges);
    }

    // Get a Travel Challenge by ID
    @GetMapping("/{id}")
    public ResponseEntity<TravelChallengeSharingDto> getTravelChallengeById(@PathVariable String id) {
        TravelChallengeSharingDto dto = service.getTravelChallengeById(id);
        return ResponseEntity.ok(dto);
    }

    // Update a Travel Challenge by ID
    @PutMapping("/{id}")
    public ResponseEntity<TravelChallengeSharingDto> updateTravelChallenge(
            @PathVariable String id,
            @RequestBody TravelChallengeSharingDto dto) {
        TravelChallengeSharing updatedEntity = service.updateTravelChallenge(id, dto);
        return ResponseEntity.ok(TravelChallengeSharingMapper.toDto(updatedEntity));
    }

    // Delete a Travel Challenge by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTravelChallenge(@PathVariable String id) {
        service.deleteTravelChallenge(id);
        return ResponseEntity.noContent().build();
    }
}