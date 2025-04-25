package com.example.demo.mapper;

import com.example.demo.dto.TravelChallengeSharingDto;
import com.example.demo.model.TravelChallengeSharing;

public class TravelChallengeSharingMapper {

    // Convert DTO to Entity
    public static TravelChallengeSharing toEntity(TravelChallengeSharingDto dto) {
        TravelChallengeSharing entity = new TravelChallengeSharing();
        entity.setTravellerName(dto.getTravellerName());
        entity.setTravellerPhoneNo(dto.getTravellerPhoneNo());
        entity.setChallengeTitle(dto.getChallengeTitle());
        entity.setChallengeDescription(dto.getChallengeDescription());
        entity.setTravellerAdvice(dto.getTravellerAdvice());
        return entity;
    }

    // Convert Entity to DTO
    public static TravelChallengeSharingDto toDto(TravelChallengeSharing entity) {
        return new TravelChallengeSharingDto(
            entity.getTravellerName(),
            entity.getTravellerPhoneNo(),
            entity.getChallengeTitle(),
            entity.getChallengeDescription(),
            entity.getTravellerAdvice()
        );
    }
}
