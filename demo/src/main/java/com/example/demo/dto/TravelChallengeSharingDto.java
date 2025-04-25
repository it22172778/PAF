package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TravelChallengeSharingDto {
    private String travellerName;
    private String travellerPhoneNo;
    private String challengeTitle;
    private String challengeDescription;
    private String travellerAdvice;
}