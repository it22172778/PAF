package com.example.demo.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "travel_experiences")
public class TravelExperience {
    @Id
    private String id; // Unique identifier for the document
    private String title;
    private String location;
    private String description;
    private LocalDate dateVisited;
    private List<String> mediaUrls;
    private String culturalInsights;
}
