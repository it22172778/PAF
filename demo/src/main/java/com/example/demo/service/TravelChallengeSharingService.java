package com.example.demo.service;

import com.example.demo.dto.TravelChallengeSharingDto;
import com.example.demo.model.TravelChallengeSharing;
import com.example.demo.repository.TravelChallengeSharingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TravelChallengeSharingService {

    @Autowired
    private TravelChallengeSharingRepository repository;

    // Save a new Travel Challenge
    public TravelChallengeSharing saveTravelChallenge(TravelChallengeSharingDto dto) {
        TravelChallengeSharing travelChallenge = new TravelChallengeSharing();
        travelChallenge.setTravellerName(dto.getTravellerName());
        travelChallenge.setTravellerPhoneNo(dto.getTravellerPhoneNo());
        travelChallenge.setChallengeTitle(dto.getChallengeTitle());
        travelChallenge.setChallengeDescription(dto.getChallengeDescription());
        travelChallenge.setTravellerAdvice(dto.getTravellerAdvice());
        return repository.save(travelChallenge);
    }

    // Get all Travel Challenges
    public List<TravelChallengeSharingDto> getAllTravelChallenges() {
        return repository.findAll().stream().map(challenge -> {
            return new TravelChallengeSharingDto(
                challenge.getTravellerName(),
                challenge.getTravellerPhoneNo(),
                challenge.getChallengeTitle(),
                challenge.getChallengeDescription(),
                challenge.getTravellerAdvice()
            );
        }).collect(Collectors.toList());
    }

    // Get a Travel Challenge by ID
    public TravelChallengeSharingDto getTravelChallengeById(String id) {
        TravelChallengeSharing challenge = repository.findById(id).orElseThrow(() -> new RuntimeException("Challenge not found"));
        return new TravelChallengeSharingDto(
            challenge.getTravellerName(),
            challenge.getTravellerPhoneNo(),
            challenge.getChallengeTitle(),
            challenge.getChallengeDescription(),
            challenge.getTravellerAdvice()
        );
    }

    // Delete a Travel Challenge by ID
    public void deleteTravelChallenge(String id) {
        repository.deleteById(id);
    }
}
