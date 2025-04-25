package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "travel_challenges")
public class TravelChallengeSharing {
    @Id
    private String id; // Unique identifier for the document
    private String travellerName;
    private String travellerPhoneNo;
    private String challengeTitle;
    private String challengeDescription;
    private String travellerAdvice;
}